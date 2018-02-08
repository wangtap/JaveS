# 一,备份数据库与恢复数据库
备份与恢复的都是数据库中的每个表,如果该数据库不存在需要先建立数据库.
```sql
--在登录之前,注意该语句后面不能写分号
--看箭头的方向,箭头的方向就代表数据的传输方向
--这句话就是在将数据库中的表信息传输到文件中存起来
--备份
mysqldump -u用户名 -p密码 数据库名>目标文件(绝对路径,文件后缀名为.sql)

--根据箭头的方向可以看出,这句话是将表信息从文件中传输到数据库中
--此语句后面也不能写分号
--恢复
--恢复数据时,如果对应数据库不存在,则需要先建立数据库
mysqldump -u用户名 -p密码 数据库名<目标文件(绝对路径)

--登录之后的恢复操作可以使用以下语句
--先进入要恢复数据的数据库
use 数据库名;
--在恢复数据
source 备份文件路径
```

# 二，一次性备份所有数据库
无需登录，直接输入以下语句即可，注意：语句后面没有分号
```sql
--将数据库信息备份成一个sql文件
mysqldump -u用户名 -p --all-databases>sqlfile.sql
```

将sql文件，恢复到数据库中，这句是有分号的
```sql
source 文件路径;
```


# 三,约束
在日常生活中,偶尔也会说一句,受他约束,也就是被他管着的意思.    
这里的约束,是作用在列上的,也就是去束缚着一列,管着这一列,让这一列的数据都满足我们给它加上的约束,那么被约束的列也就有了一定的特性.    
比如我约束你不让你吃饭,那你就什么都可以干就是不能吃饭.    
如果约束列a不能为null,那么列a也就可以为任何值但是不能为null.    

## 1,主键约束
被主键约束的列的特点:    
1)非空:列中的值不能为null    
2)唯一:这一列中,每一行的值不能重复.
3)被引用:可以通过引用主键的方式,引用改行的数据(主键就代表了这一行)

```sql
--添加主键的方法:
--在创建表时添加主键的两种方式

create table 表名(列名1 列类型1 primary key, 列名2 列类型2);

create table 表名(列名1 列类型1, 列名2 列类型2, primary key(列名1));

--创建表后,若要为某一列设置主键约束
ALTER table 表名 add primary key(列名);

--删除主键:
ALTER table 表名 drop primary key;
```    
**注:主键在一张表中最多存在一个,但是可以将多个列一起设为主键**    
所以说主键并不一定就表示一列.    
```sql
--设置多个列为主键
ALTER table 表名 add primary key(列名1,列名2,列名3);

--但是如果已经设置过主键了,在设置主键的话就会报错提示主键重复定义

-- 如果在建表的时候主键没有设置自增长,在建表完后,想要将主键设置为自增长,可用下面语句
ALTER TABLE 表名  MODIFY COLUMN 列名 int(11) NOT NULL AUTO_INCREMENT;
```

## 2,主键自增长约束
关键字:auto_increment    
**注:关键字auto_increment不能单独使用,必须与主键一同使用**    
若不指定主键的值,则自增长会生效.    
若删除了id为3这一行数据,再增添数据时,id会从4开始使用,不会再使用3.    
若id已经使用到4了,这时候添加了一个数据,指定id为7,再次添加数据id为null时,id会从8开始使用.    

## 3,非空约束
```sql
--not null 即为非空约束
create table 表名(id int primary key auto_increment,name char(50) not null);
```

## 4,唯一约束
```sql
--union 即为唯一约束
create table 表名(id int primary key,name char(50) unique);
```    
**注:即使设置某一列为非空,唯一,也不能在其他表中将该列作为外键引用**    

# 四,外键约束
## 1,多对一或一对多关系
当表1与表2有关联时,如果表1是从表,表2是主表时,可以通过外键约束,在表1中引用表2的主键.    
何时为主表何时为从表.    
多对一或一对多关系下,多的为从表,一的为主表.    
比如:有一个班级表,有一个学生表,多个学生对应一个班级,这时候班级表就是主表,学生表就是从表.    
比如:有一个部门表,有一个员工表,多个员工对应一个部门,这时候部门表就是主表,员工表就是从表.    

当表1引用表2的主键时,表1该列下的数据必须是表2主键列中已存在的数据.    
**注:** 表1引用表2添加约束时的列名与表2的主键列名不是一定要一致的.
注意这里引用的都是主键,而不是一行记录.    
```sql
--指定外键的两种方式
--如果表1想指定表2的主键为外键,需要先存在表2
create table 表2(表2id int primary key auto_increment,表2name varchar(50));

--方式一:在创建表时指定外键
--fk_表2id是约束的名字,fk表示:foreign key 也就是外键
create table 表名(
  id int primary key auto_increment,
  name char(50),
  ddd int,
  constraint fk_表2id foreign key(ddd) references 表2(表2id)
);

--方式二:在创建表后,通过修改ddl语句添加外键约束
alter table 表名 add constraint fk_表2id foreign key(ddd) references 表2(表2id);
```  
## 2,一对一关系
给表1的主键,加上表2的外键约束.    
这样表1的主键(一般为id)与表2的主键(一般为id)就会被约束,结果就是表1中有的id在表2中一定有,表2中没有的id,是不能添加进表1中的.    
例子:一夫一妻制    
```sql
--建立丈夫表:husband
create table husband(
  hid int primary key auto_increment,
  hname varchar(50)
);

--建立妻子表:wife,并且给妻子表的主键指定丈夫表的外键约束
create table wife(
  wid int primary key auto_increment,
  wname varchar(50),
  constraint fk_wife_husband foreign key(wid) references husband(hid)
);

```    
## 3,多对多关系
一个老师可以教很多学生,一个学生也可以有很多老师,这就是多对多关系.    
多对多关系需要使用到中间表.    
有几张表,就要在中间表中建立几个外键.    

# 五,多表查询
### 合并结果集
结果集,就是通过select..from...查询出来的数据,查出来的数据实际也是一张表,也就是说结果集也就是一张表.    
```sql
--两个select语句中间通过关键字:union连接即可
select a,b from 表1  --语句1
union -- ALL  如果加上all,则不会去重
select c,d from 表2; --语句2
--如果语句1查询出的结果集(就是查出的那个数据表)的结构(列的数量,列的类型)与语句2查询出的结果集一样,那么上述语句会执行成功.
--结果会将表1的结果集与表2的结果集纵向拼接
```    
### 连接查询
有一个概念叫笛卡尔积,在多表查询时,都会去除笛卡尔积.    
[笛卡尔积概念](http://baike.baidu.com/link?url=BKBz2mPQVBWkHqjbBz0fI0PifVUDlAEpofLDqjj6HCIf6ZUZE2uplgAZYAHw7uShY3f68yFESw_i93REJi95wPUDGt0yWcynrIsibe01EGLy27el44zJgoYPCBojGbZa28Yso3reLf1qlHsF16FjcK)    
去除的方法是在多表查询时加上一个条件:从表.外键列=主表.主键列    
#### 内连接
```sql
--mysql的方言:
select * from 表名1 别名1,表名2 别名2 where 别名1.xx=别名2.yy;
--如果表名1为从表,则xx为外键约束的列名,yy为主键列名

--sql标准写法:
select * from 表名1 别名1 inner join 表名2 别名2 on 别名1.xx=别名2.yy;

--自然连接:(这种格式的名称要自然....)
--自然连接会自动找到两表中列名相同的列做比较(也就是说,外键约束的列名一定要与主键的列名一样了)
--一般很少用,可读性也低,知道有就得了,记录一下
select * from 表名1 别名1 natural join 表名2 别名2;

```
内连接不会取出不符合条件的数据,比如表名1中某一行外键约束下的列的内容为null的话,则该行不会满足条件,内连接就不会取出它;    
如果想取出,请使用外链接.

#### 外链接
外链接分为左外和右外    
左外,就是不管左面表的数据是否满足条件(就是on后面的条件),都查出来    
右外,与左外同理,只不过是右面的表
```sql
--左外:
select * from 表名1 别名1 left outer join 表名2 别名2 on 别名1.xx=别名2.yy;

--右外:
select * from 表名1 别名1 right outer join 表名2 别名2 on 别名1.xx=别名2.yy;

--如果左右都想要,有一个叫全外的东西,不过mysql不支持
--但是可以将上两个语句,通过union连接,合并结果集的方式实现.
```
### 子查询
在一条SQL语句中有多个select的就是子查询.    
子查询的本质就是,先查询出一个表(结果集),再在这张表上进行后续的查询操作.    
标准中有两种写法:    
写在from后面    
写在where后面    
```sql
--如果查询出的是单行单列的结果集,那么可以直接将该结果集作为判断条件
--id=1,会确定一行数据,age确定了一列,所以查出的是单行单列的数据,可以用这种方式作为where后面的判断条件
select * from 表名1 where 列名1>(select age from 表名1 where id=1);

--如果查询出的是多行多列的结果集,呢么可以直接将该结果集作为目标表来查询
select * from (select name,age from 表名2);

--如果查询出的是多行单列的结果集,那么可以将该结果集看成集合
-- 关键字all:表示大于该集合中所有的数据
select * from 表名1 where age >= all (select age from 表名1);


--in表示在集合中存在即可

--如果查询出的是单行多列的结果集,那么可以将该结果集看出一个对象(仅仅是看成,可以看出一个对象的多个属性)
--子查询可以查询名字为张三这一行的列1,列2的数据
--然后查询表名1中所有列1列2数据与张三的结果集相同的数据
select * from 表名1 where (列1,列2) in (select 列1,列2 from 表名1 where name='张三');
```


