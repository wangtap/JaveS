-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: netctoss
-- ------------------------------------------------------
-- Server version	5.7.17
USE ssm;
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `account_id` int(11) NOT NULL,
  `recommender_id` int(11) DEFAULT NULL,
  `login_name` varchar(30) NOT NULL,
  `status` char(1) DEFAULT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `pause_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `close_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `real_name` varchar(20) NOT NULL,
  `idcard_no` char(18) NOT NULL,
  `birthdate` date DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `occupation` varchar(50) DEFAULT NULL,
  `telephone` varchar(15) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `emailaddress` varchar(200) DEFAULT NULL,
  `zipcode` char(6) DEFAULT NULL,
  `qq` varchar(15) DEFAULT NULL,
  `last_login_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `last_login_ip` varchar(15) DEFAULT NULL,
  `login_passwd` varchar(30) NOT NULL,
  `column_21` int(11) DEFAULT NULL,
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账务信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1005,NULL,'taiji001','1','2008-03-14 16:00:00','2018-02-06 02:37:55','2018-02-06 02:37:55','zhangsanfeng','410381194302256528','1943-02-25',NULL,NULL,'13669351234',NULL,NULL,NULL,NULL,'2018-02-06 02:38:19',NULL,'256528',NULL),(1010,NULL,'xl18z60','1','2009-01-09 16:00:00','2018-02-06 02:37:55','2018-02-06 02:37:55','guojing','330682196903190613','1969-03-19',NULL,NULL,'13338924567',NULL,NULL,NULL,NULL,'2018-02-06 02:38:19',NULL,'190613',NULL),(1011,1010,'dgbf70','1','2009-02-28 16:00:00','2018-02-06 02:37:55','2018-02-06 02:37:55','huangrong','330902197108270429','1971-08-27',NULL,NULL,'13637811357',NULL,NULL,NULL,NULL,'2018-02-06 02:38:19',NULL,'270429',NULL),(1015,1005,'mjjzh64','1','2010-03-11 16:00:00','2018-02-06 02:37:55','2018-02-06 02:37:55','zhangwuji','610121198906041115','1989-06-04',NULL,NULL,'13572952468',NULL,NULL,NULL,NULL,'2018-02-06 02:38:19',NULL,'041115',NULL),(1018,1011,'jmdxj00','1','2010-12-31 16:00:00','2018-02-06 02:37:55','2018-02-06 02:37:55','guofurong','350581200201010322','1996-01-01',NULL,NULL,'18617832562',NULL,NULL,NULL,NULL,'2018-02-06 02:38:19',NULL,'010322',NULL),(1019,1011,'ljxj90','1','2012-01-31 16:00:00','2018-02-06 02:37:55','2018-02-06 02:37:55','luwushuang','320211199307310346','1993-07-31',NULL,NULL,'13186454984',NULL,NULL,NULL,NULL,'2018-02-06 02:38:19',NULL,'310346',NULL),(1020,NULL,'kxhxd20','1','2012-02-19 16:00:00','2018-02-06 02:37:55','2018-02-06 02:37:55','weixiaobao','321022200010012115','2000-10-01',NULL,NULL,'13953410078',NULL,NULL,NULL,NULL,'2018-02-06 02:38:19',NULL,'012115',NULL),(1021,NULL,'kxhxd21','1','2012-02-19 16:00:00','2018-02-06 02:37:55','2018-02-06 02:37:55','zhangsan','321022200010012116','2000-10-02',NULL,NULL,'13953410079',NULL,NULL,NULL,NULL,'2018-02-06 02:38:19',NULL,'012116',NULL),(1022,NULL,'kxhxd22','1','2012-02-19 16:00:00','2018-02-06 02:37:55','2018-02-06 02:37:55','lisi','321022200010012117','2000-10-03',NULL,NULL,'13953410080',NULL,NULL,NULL,NULL,'2018-02-06 02:38:19',NULL,'012117',NULL),(1023,NULL,'kxhxd23','1','2012-02-19 16:00:00','2018-02-06 02:37:55','2018-02-06 02:37:55','wangwu','321022200010012118','2000-10-04',NULL,NULL,'13953410081',NULL,NULL,NULL,NULL,'2018-02-06 02:38:19',NULL,'012118',NULL),(1024,NULL,'kxhxd24','1','2012-02-19 16:00:00','2018-02-06 02:37:55','2018-02-06 02:37:55','zhouliu','321022200010012119','2000-10-05',NULL,NULL,'13953410082',NULL,NULL,NULL,NULL,'2018-02-06 02:38:19',NULL,'012119',NULL),(1025,NULL,'kxhxd25','1','2012-02-19 16:00:00','2018-02-06 02:37:55','2018-02-06 02:37:55','maqi','321022200010012120','2000-10-06',NULL,NULL,'13953410083',NULL,NULL,NULL,NULL,'2018-02-06 02:38:19',NULL,'012120',NULL);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_info`
--

DROP TABLE IF EXISTS `admin_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin_info` (
  `admin_id` int(8) NOT NULL,
  `admin_code` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `telephone` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `enrolldate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_info`
--

LOCK TABLES `admin_info` WRITE;
/*!40000 ALTER TABLE `admin_info` DISABLE KEYS */;
INSERT INTO `admin_info` VALUES (2000,'admin','123','ADMIN','123456789','admin@tarena.com.cn','2018-02-06 02:57:32'),(3000,'zhangfei','123','ZhangFei','123456789','zhangfei@tarena.com.cn','2018-02-06 02:57:32'),(4000,'liubei','123','LiuBei','123456789','liubei@tarena.com.cn','2018-02-06 02:57:32'),(5000,'caocao','123','CaoCao','123456789','caocao@tarena.com.cn','2018-02-06 02:57:32'),(6000,'aaa','123','AAA','123456789','aaa@tarena.com.cn','2018-02-06 02:57:32'),(7000,'bbb','123','BBB','123456789','bbb@tarena.com.cn','2018-02-06 02:57:32');
/*!40000 ALTER TABLE `admin_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_role`
--

DROP TABLE IF EXISTS `admin_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin_role` (
  `admin_id` int(8) DEFAULT NULL,
  `role_id` int(4) DEFAULT NULL,
  KEY `admin_role_admin_fk` (`admin_id`),
  KEY `admin_role_role_fk` (`role_id`),
  CONSTRAINT `admin_role_admin_fk` FOREIGN KEY (`admin_id`) REFERENCES `admin_info` (`admin_id`),
  CONSTRAINT `admin_role_role_fk` FOREIGN KEY (`role_id`) REFERENCES `role_info` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员角色表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_role`
--

LOCK TABLES `admin_role` WRITE;
/*!40000 ALTER TABLE `admin_role` DISABLE KEYS */;
INSERT INTO `admin_role` VALUES (2000,100),(3000,200),(4000,300),(5000,100),(5000,200),(5000,300);
/*!40000 ALTER TABLE `admin_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cost`
--

DROP TABLE IF EXISTS `cost`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cost` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `base_duration` int(11) DEFAULT NULL,
  `base_cost` int(11) DEFAULT NULL,
  `unit_cost` int(11) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `descr` varchar(100) DEFAULT NULL,
  `creatime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `startime` datetime DEFAULT NULL,
  `cost_type` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资费信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cost`
--

LOCK TABLES `cost` WRITE;
/*!40000 ALTER TABLE `cost` DISABLE KEYS */;
INSERT INTO `cost` VALUES (1,'5.9元套餐',20,6,0,'0','5.9元20小时/月,超出部分0.4元/时','2018-02-06 02:35:53',NULL,NULL),(2,'6.9元套餐',40,7,0,'0','6.9元40小时/月,超出部分0.3元/时','2018-02-06 02:35:53',NULL,NULL),(3,'8.5元套餐',100,9,0,'0','8.5元100小时/月,超出部分0.2元/时','2018-02-06 02:36:41',NULL,NULL),(4,'10.5元套餐',200,11,0,'0','10.5元200小时/月,超出部分0.1元/时','2018-02-06 02:35:53',NULL,NULL),(5,'计时收费',NULL,NULL,1,'0','0.5元/时,不使用不收费','2018-02-06 02:35:53',NULL,NULL),(6,'包月',NULL,20,NULL,'0','每月20元,不限制使用时间','2018-02-06 02:35:53',NULL,NULL);
/*!40000 ALTER TABLE `cost` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `module_info`
--

DROP TABLE IF EXISTS `module_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `module_info` (
  `module_id` int(4) NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`module_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模块表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `module_info`
--

LOCK TABLES `module_info` WRITE;
/*!40000 ALTER TABLE `module_info` DISABLE KEYS */;
INSERT INTO `module_info` VALUES (1,'角色管理'),(2,'管理员'),(3,'资费管理'),(4,'账务账号'),(5,'业务账号'),(6,'账单管理'),(7,'报表');
/*!40000 ALTER TABLE `module_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_info`
--

DROP TABLE IF EXISTS `role_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_info` (
  `role_id` int(4) NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_info`
--

LOCK TABLES `role_info` WRITE;
/*!40000 ALTER TABLE `role_info` DISABLE KEYS */;
INSERT INTO `role_info` VALUES (100,'管理员'),(200,'营业员'),(300,'经理'),(400,'aaa'),(500,'bbb'),(600,'ccc');
/*!40000 ALTER TABLE `role_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_module`
--

DROP TABLE IF EXISTS `role_module`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_module` (
  `role_id` int(4) NOT NULL,
  `module_id` int(4) NOT NULL,
  KEY `role_module_role_fk` (`role_id`),
  KEY `role_module_module_fk` (`module_id`),
  CONSTRAINT `role_module_module_fk` FOREIGN KEY (`module_id`) REFERENCES `module_info` (`module_id`),
  CONSTRAINT `role_module_role_fk` FOREIGN KEY (`role_id`) REFERENCES `role_info` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色模块表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_module`
--

LOCK TABLES `role_module` WRITE;
/*!40000 ALTER TABLE `role_module` DISABLE KEYS */;
INSERT INTO `role_module` VALUES (100,1),(100,2),(200,3),(200,4),(200,5),(200,6),(300,7);
/*!40000 ALTER TABLE `role_module` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service` (
  `service_id` int(11) NOT NULL,
  `account_id` int(11) NOT NULL,
  `unix_host` varchar(15) NOT NULL,
  `os_username` varchar(8) NOT NULL,
  `login_passwd` varchar(30) NOT NULL,
  `status` char(1) DEFAULT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `pause_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `close_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `cost_id` int(4) NOT NULL,
  PRIMARY KEY (`service_id`),
  KEY `service_cost_fk` (`cost_id`),
  KEY `service_account_fk` (`account_id`),
  CONSTRAINT `service_account_fk` FOREIGN KEY (`account_id`) REFERENCES `account` (`account_id`),
  CONSTRAINT `service_cost_fk` FOREIGN KEY (`cost_id`) REFERENCES `cost` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='业务信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES (2001,1010,'192.168.0.26','guojing','guo1234','0','2018-02-06 02:44:08','2018-02-06 02:44:08','2018-02-06 02:44:08',1),(2002,1011,'192.168.0.26','huangr','huang234','0','2018-02-06 02:44:59','2018-02-06 02:44:59','2018-02-06 02:44:59',1),(2003,1011,'192.168.0.20','huangr','huang234','0','2018-02-06 02:44:59','2018-02-06 02:44:59','2018-02-06 02:44:59',3),(2004,1011,'192.168.0.23','huangr','huang234','0','2018-02-06 02:44:59','2018-02-06 02:44:59','2018-02-06 02:44:59',6),(2005,1019,'192.168.0.26','luwsh','luwu2345','0','2018-02-06 02:44:59','2018-02-06 02:44:59','2018-02-06 02:44:59',4),(2006,1019,'192.168.0.20','luwsh','luwu2345','0','2018-02-06 02:44:59','2018-02-06 02:44:59','2018-02-06 02:44:59',5),(2007,1020,'192.168.0.20','weixb','wei12345','0','2018-02-06 02:44:59','2018-02-06 02:44:59','2018-02-06 02:44:59',6),(2008,1010,'192.168.0.20','guojing','guo09876','0','2018-02-06 02:44:59','2018-02-06 02:44:59','2018-02-06 02:44:59',6);
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_update_bak`
--

DROP TABLE IF EXISTS `service_update_bak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service_update_bak` (
  `id` int(10) NOT NULL,
  `service_id` int(9) DEFAULT NULL,
  `cost_id` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `service_update_bak_service_fk` (`service_id`),
  KEY `service_update_bak_cost_fk` (`cost_id`),
  CONSTRAINT `service_update_bak_cost_fk` FOREIGN KEY (`cost_id`) REFERENCES `cost` (`id`),
  CONSTRAINT `service_update_bak_service_fk` FOREIGN KEY (`service_id`) REFERENCES `service` (`service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='业务资费更新备份表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_update_bak`
--

LOCK TABLES `service_update_bak` WRITE;
/*!40000 ALTER TABLE `service_update_bak` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_update_bak` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-06 11:03:31
