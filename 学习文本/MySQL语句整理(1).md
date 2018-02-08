# 一,DDL语句整理

### 创建表:
```sql
create table 表名(列名1 列类型1,列名2 列类型2);
```

### 删除表:
```sql
drop table 表名;
```

## 修改公式:
```sql
alter table 表名 + 要做的事情;
```

### 修改表名:
```sql
alter table 表名 rename to 新表名;
```

### 修改列名:
```sql
alter table 表名 change 原列名 新列名 列类型;
```

### 修改列类型：
```sql
alter table 表名 modify 列名 列新的类型;
```

### 增添列:
```sql
alter table 表名 add(列名1 列类型1,列名2 列类型2);
```

### 删除列：
```sql
alter table 表名 drop 列名;
```

# 二,DML语句整理

### 插入数据
```sql
INSERT INTO 表名(列名1,列名2,列名3) VALUES(对应列名1的值1,对应列名2的值2,对应列名3的值3);

INSERT INTO 表名 VALUES(对应第一列的值1,对应第二列的值二,....,对应最后一列的值n);--表中一共有n列
```

### 修改数据
```sql
--下面写法会将所有数据的列名1这一列的数据,都修改为值1
UPDATE 表名 SET 列名=要修改的值;--如果类型为字符型,则需要用单引号:'要修改的值'
UPDATE 表名 SET 列名1='值1',列名2='值2';

--上述修改自然是很尴尬的,所以应该有选择的去修改数据
--为修改语句增加条件
UPDATE 表名 SET 列名3='值3' where id=2;--将id为2的那一行的数据的'列名3'这一列的数据修改为'值3'
```

### 删除数据
```sql
--下面写法会将表名1中的数据都删除
DELETE FROM 表名1;

--为上述语句增加条件
DELETE FROM 表名1 where id=2;--将id为2的那一行数据删除
```

# 三,DQL基础语句整理

### 公式:
```sql
select 查询哪些列
FROM 从哪些表中查
where 查询条件
GROUP BY 按照哪个列分组
having 分组后的条件
ORDER BY 根据哪一列排序

```

### 列运算相关:
```sql
--查询两列之间数据的加减乘除结果集
select 列名1+列名2, 列名3-列名4, 列名5*列名6, 列名7/列名8 from 表名
```

### 去重:
```sql
--关键字distinct可以将查询结果中完全相同的数据去除
select distinct 列名 from 表名;
```

### 模糊查询:

模糊查询的关键字为: **like**    

```sql
--字符短线:-  代表一个任意值的字符
--字符百分号:%  代表任意数量的任意值的字符
--字符星号:*  代表查询所有列
select * from 表名 where
name like '张%' --查询姓张的
or        --或
name like '___'; --查询名字由三个字符组成的
```
### 排序
```sql
根据id升序排序
ORDER BY id ASC;
根据id降序排序
ORDER BY id DESC;

根据列x升序排序,如果x相同则根据y降序排序
ORDER BY x ASC, y DESC;
```
### 关于null与0
1,任何与null做的运算(加减乘除等等)结果都为null.    
2,concat('hello',列n);列n的值如果为null,则该函数的结果也是null.    
3,如果将字符与数字做运算,那么字符会被当成0看待,无法转换成数字的都会被当成0.    
4,ifnull(列n,值m);如果列n的值为null,该函数可以将null替换成m使用(并不改变表中的数据).    

# 四,DQL聚合函数整理
聚合函数一共有五个:求数据总个数,求数据值的总和,求数据中的最大值\最小值,求数据的平均值

### count(列名)
```sql
--查询表中的数据总数(如果某一行的数据都为null,则不会计算)
select count(*) from 表;

--下面这句与上面那句的区别在于:如果第二行name列为null,而其他列有值,上一条语句会计算第二行,而这一条语句不会
select count(name) from 表;

```

### sum(列名)
```sql
--取x列数据的总和
select sum(x) from 表;
```

### max(列名)与min(列名)
```sql
--取x列的最大值和y列的最小值
select max(x),min(y) from 表;
```

### avg(列名)
```sql
--取age列的平均值
select avg(age) from 表;
```

# 五,SQL分组查询整理
一般见到每组,每班,每部门,每科室等词汇,基本就是要使用分组查询了.    
```sql
--以列名x列分组,查询该列信息及分组后的每组的数量
select 列名x,count(列名x) from 表名 GROUP BY 列名x;
```
**在分组之前的条件用where,分组之后的条件用having,看上方公式顺序**
