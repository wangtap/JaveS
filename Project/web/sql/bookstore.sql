CREATE DATABASE bookstore;

use bookstore;

CREATE TABLE USER(
  uid CHAR(32) PRIMARY KEY,
  username VARCHAR(50) NOT NULL,
  PASSWORD VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  code CHAR(64) NOT NULL,
  state BOOLEAN
);

INSERT  INTO USER VALUES ('1','zhangSan','123','123@qq.com','1','1');
INSERT  INTO USER VALUES ('2','liSi','123','123@qq.com','1','1');
INSERT  INTO USER VALUES ('3','wangWu','123','123@qq.com','1','1');

SELECT * FROM USER;


CREATE TABLE category (
  cid CHAR(32) PRIMARY KEY,
  cname VARCHAR(100) NOT NULL
);

INSERT  INTO category(cid,cname) VALUES ('1','JavaSE');
INSERT  INTO category(cid,cname) VALUES ('2','JavaEE');
INSERT  INTO category(cid,cname) VALUES ('3','Javascript');

SELECT * FROM category;



CREATE TABLE book (
  bid CHAR(32) PRIMARY KEY,
  bname VARCHAR(100),
  price DECIMAL(5,1),
  author VARCHAR(20),
  image VARCHAR(200),
  cid CHAR(32),
  FOREIGN KEY (cid) REFERENCES category(cid)
);

INSERT  INTO book VALUES ('1','Java编程思想（第4版）','75.6','qdmmy6','book_img/9317290-1_l.jpg','1');
INSERT  INTO book VALUES ('2','Java核心技术卷1','68.5','qdmmy6','book_img/20285763-1_l.jpg','1');
INSERT  INTO book VALUES ('3','Java就业培训教程','39.9','盖伦','book_img/8758723-1_l.jpg','1');
INSERT  INTO book VALUES ('4','Head First java','47.5','（美）塞若','book_img/9265169-1_l.jpg','1');
INSERT  INTO book VALUES ('5','JavaWeb开发详解','83.3','孙鑫','book_img/22788412-1_l.jpg','2');
INSERT  INTO book VALUES ('6','Struts2深入详解','63.2','孙鑫','book_img/20385925-1_l.jpg','2');
INSERT  INTO book VALUES ('7','精通Hibernate','30.0','孙卫琴','book_img/8991366-1_l.jpg','2');
INSERT  INTO book VALUES ('8','精通Spring2.x','63.2','陈华雄','book_img/20029394-1_l.jpg','2');
INSERT  INTO book VALUES ('9','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('10','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('11','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('12','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('13','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('14','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('15','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('16','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('17','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('18','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('19','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('20','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('21','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('22','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('23','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('24','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('25','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('26','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('27','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('28','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('29','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('30','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('31','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('32','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('33','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('34','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('35','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('36','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('37','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('38','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('39','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('40','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('41','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('42','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('43','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('44','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('45','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('46','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('47','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('48','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('49','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('50','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('51','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('52','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('53','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('54','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('55','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('56','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('57','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('58','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('59','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('60','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('61','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('62','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('63','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('64','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('65','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('66','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('67','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('68','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('69','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('70','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('71','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('72','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('73','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('74','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('75','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('76','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('77','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('78','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('79','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('80','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('81','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('82','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('83','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('84','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('85','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('86','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('87','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('88','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('89','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('90','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('91','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('92','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('93','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('94','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('95','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('96','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('97','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('98','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('99','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('100','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('101','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('102','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('103','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('104','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('105','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('106','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('107','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('108','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('109','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('110','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('111','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('112','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('113','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('114','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('115','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('116','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('117','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('118','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('119','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');
INSERT  INTO book VALUES ('120','Javascript权威指南','93.6','（美）弗兰纳根','book_img/22722790-1_l.jpg','3');

SELECT * FROM book;


CREATE TABLE orders (
  oid CHAR(32) PRIMARY KEY,
  orderTime DATETIME,
  price DECIMAL(10,0),
  state SMALLINT(1),
  uid CHAR(32),
  address VARCHAR(200),
  FOREIGN KEY (uid) REFERENCES USER (uid)
);

SELECT * FROM orders;

CREATE TABLE orderitem (
  iid CHAR(32) PRIMARY KEY,
  COUNT INT,
  subtotal DECIMAL(10,0),
  oid CHAR(32),
  bid CHAR(32),
  FOREIGN KEY (oid) REFERENCES orders (oid),
  FOREIGN KEY (bid) REFERENCES book (bid)
);

SELECT * FROM orderitem;