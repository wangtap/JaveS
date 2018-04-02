/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50155
Source Host           : localhost:3306
Source Database       : wyj

Target Server Type    : MYSQL
Target Server Version : 50155
File Encoding         : 65001

Date: 2018-02-01 09:07:56
*/

use wyj;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `activity_type`
-- ----------------------------
DROP TABLE IF EXISTS `activity_type`;
CREATE TABLE `activity_type` (
  `type_id` int(24) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(20) DEFAULT NULL,
  `memo` varchar(100) DEFAULT NULL,
  `file_id` varchar(24) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `prepare1` int(11) DEFAULT NULL,
  `prepare2` varchar(100) DEFAULT NULL,
  `prepare3` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity_type
-- ----------------------------

-- ----------------------------
-- Table structure for `article`
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `goods_id` int(24) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(50) DEFAULT NULL,
  `goods_code` varchar(50) DEFAULT NULL,
  `goods_count` int(11) DEFAULT NULL,
  `file_id` varchar(100) DEFAULT NULL,
  `sponsor` varchar(50) DEFAULT NULL,
  `memo` varchar(100) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `discount` int(100) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('1', '德芙', '1', '20', 'http://192.168.11.232:8080/images/2.jpg', '玛氏食品公司', '德芙是世界最大宠物食品和休闲食品制造商美国跨国食品公司玛氏（Mars）公司在中国推出的系列产品，1989年进入中国。\r\n', '1', '99', '199', '1');
INSERT INTO `article` VALUES ('2', 'ysl', '2', '100', 'http://192.168.11.232:8080/images/1.jpg', '伊夫圣罗兰', 'YSL的简称，中文译名圣罗兰，是法国著名奢侈品牌，由1936年8月1日出生于法属北非阿尔及利亚的伊夫圣罗兰先生创立，主要有时装、护肤品，香水，箱包，眼镜，配饰等。', '2', '320', '500', '2');
INSERT INTO `article` VALUES ('3', '红焖羊肉', '3', '50', 'http://192.168.11.232:8080/images/hmyr.jpg', 'aaa', '红焖羊肉，以肉嫩、味鲜、汤醇、价廉深受各路食客的好评，很快便风靡牧野。', '3', '30', '50', '3');
INSERT INTO `article` VALUES ('4', '糖醋排骨', '4', '66', 'http://192.168.11.232:8080/images/tcpg.jpg', 'aaa', '糖醋排骨是糖醋菜中具有代表性的一道大众喜爱的传统菜，它选用新鲜猪子排作料，肉质鲜嫩，成莱色泽红亮油润，口味香脆酸甜，颇受江南一带食者的欢迎。', '4', '25', '45', '3');
INSERT INTO `article` VALUES ('5', '沸腾虾', '5', '88', 'http://192.168.11.232:8080/images/ftx.jpg', 'aaa', '香辣鲜美，色泽诱人', '5', '40', '60', '4');
INSERT INTO `article` VALUES ('6', '松鼠桂鱼', '6', '22', 'http://192.168.11.232:8080/images/ssgy.jpg', 'aaa', '这道菜成菜后，形如松鼠、外脆里嫩、色泽橘黄，酸甜适口，并有松红香味', '6', '35', '70', '4');
INSERT INTO `article` VALUES ('7', '好丽友', '7', '30', 'http://192.168.11.232:8080/images/3.jpg', 'aaa', '好丽友 aaaaa啊啊ad撒打算', '7', '19', '30', '5');
INSERT INTO `article` VALUES ('8', 'MAC ', '8', '20', 'http://192.168.11.232:8080/images/4.jpg', '雅诗兰黛集团', 'M·A·C彩妆是出自于加拿大的彩妆品牌，它以其耀眼光芒在品牌建立的初期吸引了雅诗兰黛集团的注意将其收入集团内。M·A·C的优异特质才得以被发掘、散播，从北美地区远扬至欧亚各国', '8', '230', '330', '2');
INSERT INTO `article` VALUES ('9', '迪奥', '9', '20', 'http://192.168.11.232:8080/images/6.jpg', '路威酩轩集团', '克里斯汀·迪奥（英语：Christian Dior），简称迪奥（Dior），是法国著名时尚消费品牌。亦为全球最大的高级时尚品牌控股公司', '9', '1000', '1500', '6');
INSERT INTO `article` VALUES ('10', '解忧杂货铺', '10', '30', 'http://192.168.11.232:8080/images/5.jpg', '东野圭吾', '《解忧杂货店》是日本作家东野圭吾写作的奇幻温情小说。2011年于《小说野性时代》连载', '10', '50', '70', '7');
INSERT INTO `article` VALUES ('11', '德芙巧克力', '1', '20', 'http://192.168.11.232:8080/images/10.jpg', '浪子', '德芙是世界最大宠物食品和休闲食品制造商美国跨国食品公司玛氏（Mars）公司在中国推出的系列产品，1989年进入中国。\r\n', '1', '99', '199', '1');
INSERT INTO `article` VALUES ('12', 'ysl', '2', '100', 'http://192.168.11.232:8080/images/11.jpg', '伊夫圣罗兰', 'YSL的简称，中文译名圣罗兰，是法国著名奢侈品牌，由1936年8月1日出生于法属北非阿尔及利亚的伊夫圣罗兰先生创立，主要有时装、护肤品，香水，箱包，眼镜，配饰等。', '2', '320', '500', '2');
INSERT INTO `article` VALUES ('13', '资生堂', '13', '30', 'http://192.168.11.232:8080/images/7.jpg', '日本', '日本进口资生堂洗颜专科珊珂洗面奶洁面乳120g三支装', '13', '110', '230', '8');
INSERT INTO `article` VALUES ('14', '士力架', '14', '100', 'http://192.168.11.232:8080/images/8.jpg', '玛氏食品公司', '补充能量 横扫饥饿 活力无限', '14', '50', '100', '5');

-- ----------------------------
-- Table structure for `awards`
-- ----------------------------
DROP TABLE IF EXISTS `awards`;
CREATE TABLE `awards` (
  `awards_id` int(24) NOT NULL,
  `awards_level` int(11) DEFAULT NULL,
  `awards_name` varchar(20) DEFAULT NULL,
  `awards_rate` varchar(10) DEFAULT NULL,
  `winners` varchar(500) DEFAULT NULL,
  `activity_id` varchar(24) DEFAULT NULL,
  `awards_count` int(11) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `prepare1` int(11) DEFAULT NULL,
  `prepare2` varchar(100) DEFAULT NULL,
  `prepare3` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`awards_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of awards
-- ----------------------------

-- ----------------------------
-- Table structure for `basic_authorities`
-- ----------------------------
DROP TABLE IF EXISTS `basic_authorities`;
CREATE TABLE `basic_authorities` (
  `authorities_id` int(11) NOT NULL DEFAULT '0',
  `function_id` int(11) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `order_list` int(11) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`authorities_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of basic_authorities
-- ----------------------------

-- ----------------------------
-- Table structure for `basic_functions`
-- ----------------------------
DROP TABLE IF EXISTS `basic_functions`;
CREATE TABLE `basic_functions` (
  `function_id` int(11) NOT NULL DEFAULT '0',
  `function_name` varchar(100) DEFAULT NULL,
  `module_id` int(11) DEFAULT NULL,
  `order_list` int(11) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`function_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of basic_functions
-- ----------------------------

-- ----------------------------
-- Table structure for `basic_modules`
-- ----------------------------
DROP TABLE IF EXISTS `basic_modules`;
CREATE TABLE `basic_modules` (
  `module_id` int(11) NOT NULL DEFAULT '0',
  `module_name` varchar(100) DEFAULT NULL,
  `super_module` int(11) DEFAULT NULL,
  `order_list` int(11) DEFAULT NULL,
  `is_leaf` int(11) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`module_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of basic_modules
-- ----------------------------

-- ----------------------------
-- Table structure for `basic_roles`
-- ----------------------------
DROP TABLE IF EXISTS `basic_roles`;
CREATE TABLE `basic_roles` (
  `role_id` int(11) NOT NULL DEFAULT '0',
  `role_name` varchar(100) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `order_list` int(11) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of basic_roles
-- ----------------------------

-- ----------------------------
-- Table structure for `basic_user`
-- ----------------------------
DROP TABLE IF EXISTS `basic_user`;
CREATE TABLE `basic_user` (
  `user_id` int(24) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `real_name` varchar(20) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `id_card` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `user_type` int(11) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `emailpw` varchar(50) DEFAULT NULL,
  `prepare1` int(11) DEFAULT NULL,
  `prepare2` varchar(50) DEFAULT NULL,
  `prepare3` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of basic_user
-- ----------------------------
INSERT INTO `basic_user` VALUES ('1', 'wangnima', '123456', '王尼玛', '1', '12306', '4328499', '深圳', '1', null, '112351@163.com', '123456', null, null, null);
INSERT INTO `basic_user` VALUES ('5', 'aaa', '654321', null, null, '123456', null, null, null, null, null, null, null, null, null);
INSERT INTO `basic_user` VALUES ('7', '孙铭哲', '123456', null, null, '13915685541', null, null, null, null, null, null, null, null, null);
INSERT INTO `basic_user` VALUES ('12', 'aaaa', '123456', null, null, '13715616542', null, null, null, null, null, null, null, null, null);
INSERT INTO `basic_user` VALUES ('13', 'smz', '123456', null, null, '15345298413', null, null, null, null, null, null, null, null, null);
INSERT INTO `basic_user` VALUES ('14', 'aaaad', '123456', null, null, '13715616544', null, null, null, null, null, null, null, null, null);
INSERT INTO `basic_user` VALUES ('15', 'aadadd', '123456', null, null, '13715616548', null, null, null, null, null, null, null, null, null);
INSERT INTO `basic_user` VALUES ('16', 'aads', '213123', null, null, '123124', null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `basic_user_attribute`
-- ----------------------------
DROP TABLE IF EXISTS `basic_user_attribute`;
CREATE TABLE `basic_user_attribute` (
  `attribute_id` int(11) NOT NULL DEFAULT '0',
  `user_id` int(11) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `use_flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`attribute_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of basic_user_attribute
-- ----------------------------

-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `author` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', null, null);
INSERT INTO `book` VALUES ('2', '\"aaa\"', '\"aaa\"');
INSERT INTO `book` VALUES ('3', '\"aaa\"', '\"aaa\"');

-- ----------------------------
-- Table structure for `file_upload`
-- ----------------------------
DROP TABLE IF EXISTS `file_upload`;
CREATE TABLE `file_upload` (
  `file_id` int(24) NOT NULL AUTO_INCREMENT,
  `file_src_name` varchar(100) DEFAULT NULL,
  `file_save_name` varchar(100) DEFAULT NULL,
  `file_url` varchar(200) DEFAULT NULL,
  `upload_time` varchar(19) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `memo` varchar(100) DEFAULT NULL,
  `prepare1` int(11) DEFAULT NULL,
  `prepare2` varchar(50) DEFAULT NULL,
  `prepare3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of file_upload
-- ----------------------------

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `log_id` int(24) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(24) DEFAULT NULL,
  `activity_id` varchar(24) DEFAULT NULL,
  `awards_id` varchar(24) DEFAULT NULL,
  `code` varchar(30) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `zj_flag` int(11) DEFAULT NULL,
  `lj_flag` int(11) DEFAULT NULL,
  `lj_time` varchar(20) DEFAULT NULL,
  `sq_flag` int(11) DEFAULT NULL,
  `sq_time` varchar(20) DEFAULT NULL,
  `sp_flag` int(11) DEFAULT NULL,
  `sp_time` varchar(20) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `sp_user` varchar(24) DEFAULT NULL,
  `goods_id` varchar(24) DEFAULT NULL,
  `prepare1` int(11) DEFAULT NULL,
  `prepare2` varchar(100) DEFAULT NULL,
  `prepare3` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------

-- ----------------------------
-- Table structure for `goods_attribute`
-- ----------------------------
DROP TABLE IF EXISTS `goods_attribute`;
CREATE TABLE `goods_attribute` (
  `attribute_id` int(24) NOT NULL AUTO_INCREMENT,
  `awards_id` varchar(24) DEFAULT NULL,
  `goods_id` varchar(24) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `curr_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`attribute_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods_attribute
-- ----------------------------

-- ----------------------------
-- Table structure for `goods_log`
-- ----------------------------
DROP TABLE IF EXISTS `goods_log`;
CREATE TABLE `goods_log` (
  `log_id` int(24) NOT NULL AUTO_INCREMENT,
  `goods_id` varchar(24) DEFAULT NULL,
  `user_id` varchar(24) DEFAULT NULL,
  `good_count` int(11) DEFAULT NULL,
  `activity_id` varchar(24) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL,
  `log_time` varchar(20) DEFAULT NULL,
  `prepare1` int(11) DEFAULT NULL,
  `prepare2` varchar(50) DEFAULT NULL,
  `prepare3` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods_log
-- ----------------------------

-- ----------------------------
-- Table structure for `login_session`
-- ----------------------------
DROP TABLE IF EXISTS `login_session`;
CREATE TABLE `login_session` (
  `s_id` int(24) NOT NULL AUTO_INCREMENT,
  `session_id` varchar(50) DEFAULT NULL,
  `user_id` varchar(50) DEFAULT NULL,
  `login_time` varchar(30) DEFAULT NULL,
  `login_ip` varchar(19) DEFAULT NULL,
  `last_login_time` varchar(30) DEFAULT NULL,
  `last_login_ip` varchar(19) DEFAULT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login_session
-- ----------------------------

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `oid` int(24) NOT NULL AUTO_INCREMENT,
  `aname` varchar(50) DEFAULT NULL,
  `acount` varchar(50) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `message` varchar(100) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('13', '解忧杂货铺', '30', '50', '7', null, '2');
INSERT INTO `order` VALUES ('14', '好丽友', '30', '19', '7', null, '3');
INSERT INTO `order` VALUES ('17', 'MAC ', '20', '230', '7', null, '1');
INSERT INTO `order` VALUES ('28', '德芙', '20', '99', '1', null, '4');
INSERT INTO `order` VALUES ('29', '德芙', '20', '99', '1', null, '2');
INSERT INTO `order` VALUES ('32', '解忧杂货铺', '30', '50', '0', null, '3');

-- ----------------------------
-- Table structure for `role_function_attribute`
-- ----------------------------
DROP TABLE IF EXISTS `role_function_attribute`;
CREATE TABLE `role_function_attribute` (
  `role_id` int(11) DEFAULT NULL,
  `function_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_function_attribute
-- ----------------------------

-- ----------------------------
-- Table structure for `score_mall`
-- ----------------------------
DROP TABLE IF EXISTS `score_mall`;
CREATE TABLE `score_mall` (
  `score_mall_id` int(24) NOT NULL AUTO_INCREMENT,
  `goods_id` varchar(24) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `start_time` varchar(30) DEFAULT NULL,
  `end_time` varchar(30) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `constraints` varchar(30) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `set_top_flag` int(11) DEFAULT NULL,
  `attention` int(11) DEFAULT NULL,
  `exchange_state` int(11) DEFAULT NULL,
  `most_count` int(11) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `bak1` int(11) DEFAULT NULL,
  `bak2` varchar(24) DEFAULT NULL,
  `bak3` varchar(24) DEFAULT NULL,
  PRIMARY KEY (`score_mall_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score_mall
-- ----------------------------

-- ----------------------------
-- Table structure for `score_record`
-- ----------------------------
DROP TABLE IF EXISTS `score_record`;
CREATE TABLE `score_record` (
  `score_record_id` int(24) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(24) DEFAULT NULL,
  `budget_flag` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `record_time` varchar(20) DEFAULT NULL,
  `budget_type` int(11) DEFAULT NULL,
  `budget_object` varchar(100) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `bak1` int(11) DEFAULT NULL,
  `bak2` varchar(24) DEFAULT NULL,
  `bak3` varchar(24) DEFAULT NULL,
  PRIMARY KEY (`score_record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score_record
-- ----------------------------

-- ----------------------------
-- Table structure for `store`
-- ----------------------------
DROP TABLE IF EXISTS `store`;
CREATE TABLE `store` (
  `store_id` int(24) NOT NULL AUTO_INCREMENT,
  `store_name` varchar(100) DEFAULT NULL,
  `type_circle_id` varchar(24) DEFAULT NULL,
  `phone_num` varchar(30) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `longitude` varchar(10) DEFAULT NULL,
  `latitude` varchar(10) DEFAULT NULL,
  `operate_content` varchar(250) DEFAULT NULL,
  `money_per` varchar(20) DEFAULT NULL,
  `if_huiyuan` int(11) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `order_list` int(11) DEFAULT NULL,
  `file_id` varchar(24) DEFAULT NULL,
  `web_url` varchar(1000) DEFAULT NULL,
  `store_character` varchar(100) DEFAULT NULL,
  `main_sell` varchar(100) DEFAULT NULL,
  `prepare1` varchar(50) DEFAULT NULL,
  `store_type` int(11) DEFAULT NULL,
  `create_time` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`store_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of store
-- ----------------------------

-- ----------------------------
-- Table structure for `store_comment`
-- ----------------------------
DROP TABLE IF EXISTS `store_comment`;
CREATE TABLE `store_comment` (
  `comment_id` int(24) NOT NULL AUTO_INCREMENT,
  `mark` int(11) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  `comment_user` varchar(24) DEFAULT NULL,
  `comment_time` varchar(20) DEFAULT NULL,
  `store_id` varchar(24) DEFAULT NULL,
  `tucao_mark` int(11) DEFAULT NULL,
  `prepare1` varchar(50) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of store_comment
-- ----------------------------
INSERT INTO `store_comment` VALUES ('1', null, '这款商品很实用', 'ssz', '2017-09-12', '1', null, null, null);
INSERT INTO `store_comment` VALUES ('2', null, '好吃', 'aad', '2017-09-17', '1', null, null, null);
INSERT INTO `store_comment` VALUES ('3', null, '很好', 'ccc', '2017-01-21', '1', null, null, null);
INSERT INTO `store_comment` VALUES ('4', null, '正品', '大大', '2017-12-20', '2', null, null, null);
INSERT INTO `store_comment` VALUES ('5', null, '色号很好', '张晓晨', '2017-12-25', '2', null, null, null);
INSERT INTO `store_comment` VALUES ('6', null, '漂亮', '奇瑞', '2017-12-25', '2', null, null, null);
INSERT INTO `store_comment` VALUES ('7', null, '好吃', 'ssz', '2016-05-16', '3', null, null, null);
INSERT INTO `store_comment` VALUES ('8', null, '不错', 'ssz', '2016-05-16', '4', null, null, null);
INSERT INTO `store_comment` VALUES ('9', null, '美味', 'ssz', '2016-05-16', '5', null, null, null);
INSERT INTO `store_comment` VALUES ('10', null, '美味', 'ssz', '2016-05-16', '6', null, null, null);
INSERT INTO `store_comment` VALUES ('11', null, '好吃', 'aad', '2017-09-17', '7', null, null, null);
INSERT INTO `store_comment` VALUES ('12', null, '正品', '阿斯达', '2016-05-16', '8', null, null, null);
INSERT INTO `store_comment` VALUES ('13', null, '色号很好', '丹甫', '2016-05-16', '8', null, null, null);
INSERT INTO `store_comment` VALUES ('14', null, '漂亮', '郭峰', '2016-05-16', '8', null, null, null);
INSERT INTO `store_comment` VALUES ('15', null, '手表好看', '陈半丁', '2015-12-09', '9', null, null, null);
INSERT INTO `store_comment` VALUES ('16', null, '手表好看', '阿斯达', '2015-12-09', '9', null, null, null);
INSERT INTO `store_comment` VALUES ('17', null, '正品', '阿斯风格', '2015-12-09', '9', null, null, null);
INSERT INTO `store_comment` VALUES ('18', null, '这本书很好看', '保时捷看', '2017-09-17', '10', null, null, null);
INSERT INTO `store_comment` VALUES ('19', null, '推荐', '从现在', '2016-05-16', '10', null, null, null);
INSERT INTO `store_comment` VALUES ('20', null, '好', '萨芬', '2016-05-16', '10', null, null, null);
INSERT INTO `store_comment` VALUES ('21', null, '好吃', 'aad', '2017-01-21', '11', null, null, null);
INSERT INTO `store_comment` VALUES ('22', null, '很好', 'ccc', '2017-01-21', '11', null, null, null);
INSERT INTO `store_comment` VALUES ('23', null, '美味', 'ssz', '2017-01-21', '11', null, null, null);
INSERT INTO `store_comment` VALUES ('24', null, '正品', '大大', '2017-12-20', '12', null, null, null);
INSERT INTO `store_comment` VALUES ('25', null, '色号很好', '张晓晨', '2017-12-25', '12', null, null, null);
INSERT INTO `store_comment` VALUES ('26', null, '好用', '未全额', '2016-05-16', '13', null, null, null);
INSERT INTO `store_comment` VALUES ('27', null, '效果好', '突然让他', '2017-01-21', '13', null, null, null);
INSERT INTO `store_comment` VALUES ('28', null, '不错', 'ssz', '2016-05-16', '14', null, null, null);
INSERT INTO `store_comment` VALUES ('29', null, '美味', 'ssz', '2017-09-17', '14', null, null, null);
INSERT INTO `store_comment` VALUES ('30', null, '好吃', 'ssz', '2016-05-16', '7', null, null, null);
INSERT INTO `store_comment` VALUES ('31', null, '好吃', 'ssz', '2016-05-16', '7', null, null, null);
INSERT INTO `store_comment` VALUES ('32', null, '好吃', 'ssz', '2016-05-16', '7', null, null, null);
INSERT INTO `store_comment` VALUES ('33', null, '好吃', 'ssz', '2016-05-16', '7', null, null, null);
INSERT INTO `store_comment` VALUES ('34', null, '好吃', 'ssz', '2016-05-16', '7', null, null, null);
INSERT INTO `store_comment` VALUES ('35', null, '好吃', 'ssz', '2016-05-16', '7', null, null, null);
INSERT INTO `store_comment` VALUES ('36', null, '这款商品很实用', 'ssz', '2017-09-12', '1', null, null, null);
INSERT INTO `store_comment` VALUES ('37', null, '好吃', 'aad', '2017-09-17', '1', null, null, null);
INSERT INTO `store_comment` VALUES ('38', null, '很好', 'ccc', '2017-01-21', '1', null, null, null);
INSERT INTO `store_comment` VALUES ('39', null, '正品', '大大', '2017-12-20', '2', null, null, null);
INSERT INTO `store_comment` VALUES ('40', null, '色号很好', '张晓晨', '2017-12-25', '2', null, null, null);
INSERT INTO `store_comment` VALUES ('41', null, '漂亮', '奇瑞', '2017-12-25', '2', null, null, null);
INSERT INTO `store_comment` VALUES ('42', null, '好吃', 'ssz', '2016-05-16', '3', null, null, null);
INSERT INTO `store_comment` VALUES ('43', null, '不错', 'ssz', '2016-05-16', '4', null, null, null);
INSERT INTO `store_comment` VALUES ('44', null, '美味', 'ssz', '2016-05-16', '5', null, null, null);
INSERT INTO `store_comment` VALUES ('45', null, '美味', 'ssz', '2016-05-16', '6', null, null, null);
INSERT INTO `store_comment` VALUES ('46', null, '好吃', 'aad', '2017-09-17', '7', null, null, null);
INSERT INTO `store_comment` VALUES ('47', null, '正品', '阿斯达', '2016-05-16', '8', null, null, null);
INSERT INTO `store_comment` VALUES ('48', null, '色号很好', '丹甫', '2016-05-16', '8', null, null, null);
INSERT INTO `store_comment` VALUES ('49', null, '漂亮', '郭峰', '2016-05-16', '8', null, null, null);
INSERT INTO `store_comment` VALUES ('50', null, '手表好看', '陈半丁', '2015-12-09', '9', null, null, null);
INSERT INTO `store_comment` VALUES ('51', null, '手表好看', '阿斯达', '2015-12-09', '9', null, null, null);
INSERT INTO `store_comment` VALUES ('52', null, '正品', '阿斯风格', '2015-12-09', '9', null, null, null);
INSERT INTO `store_comment` VALUES ('53', null, '这本书很好看', '保时捷看', '2017-09-17', '10', null, null, null);
INSERT INTO `store_comment` VALUES ('54', null, '推荐', '从现在', '2016-05-16', '10', null, null, null);
INSERT INTO `store_comment` VALUES ('55', null, '好', '萨芬', '2016-05-16', '10', null, null, null);
INSERT INTO `store_comment` VALUES ('56', null, '好吃', 'aad', '2017-01-21', '11', null, null, null);
INSERT INTO `store_comment` VALUES ('57', null, '很好', 'ccc', '2017-01-21', '11', null, null, null);
INSERT INTO `store_comment` VALUES ('58', null, '美味', 'ssz', '2017-01-21', '11', null, null, null);
INSERT INTO `store_comment` VALUES ('59', null, '正品', '大大', '2017-12-20', '12', null, null, null);
INSERT INTO `store_comment` VALUES ('60', null, '色号很好', '张晓晨', '2017-12-25', '12', null, null, null);
INSERT INTO `store_comment` VALUES ('61', null, '好用', '未全额', '2016-05-16', '13', null, null, null);
INSERT INTO `store_comment` VALUES ('62', null, '效果好', '突然让他', '2017-01-21', '13', null, null, null);
INSERT INTO `store_comment` VALUES ('63', null, '不错', 'ssz', '2016-05-16', '14', null, null, null);
INSERT INTO `store_comment` VALUES ('64', null, '美味', 'ssz', '2017-09-17', '14', null, null, null);
INSERT INTO `store_comment` VALUES ('65', null, '好吃', 'ssz', '2016-05-16', '7', null, null, null);
INSERT INTO `store_comment` VALUES ('66', null, '好吃', 'ssz', '2016-05-16', '7', null, null, null);
INSERT INTO `store_comment` VALUES ('67', null, '好吃', 'ssz', '2016-05-16', '7', null, null, null);
INSERT INTO `store_comment` VALUES ('68', null, '好吃', 'ssz', '2016-05-16', '7', null, null, null);
INSERT INTO `store_comment` VALUES ('69', null, '好吃', 'ssz', '2016-05-16', '7', null, null, null);

-- ----------------------------
-- Table structure for `store_fans`
-- ----------------------------
DROP TABLE IF EXISTS `store_fans`;
CREATE TABLE `store_fans` (
  `fans_id` int(24) NOT NULL AUTO_INCREMENT,
  `store_id` varchar(24) DEFAULT NULL,
  `favo_time` varchar(20) DEFAULT NULL,
  `fan_user` int(11) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `prepare1` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`fans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of store_fans
-- ----------------------------

-- ----------------------------
-- Table structure for `store_keyword`
-- ----------------------------
DROP TABLE IF EXISTS `store_keyword`;
CREATE TABLE `store_keyword` (
  `keyword_id` int(24) NOT NULL AUTO_INCREMENT,
  `keyword` varchar(200) DEFAULT NULL,
  `keyword_type` int(11) DEFAULT NULL,
  `comm_id` varchar(24) DEFAULT NULL,
  `prepare1` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`keyword_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of store_keyword
-- ----------------------------

-- ----------------------------
-- Table structure for `subject`
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `sub_id` int(32) NOT NULL AUTO_INCREMENT,
  `sub_tips` varchar(200) DEFAULT NULL,
  `sub_title` varchar(200) DEFAULT NULL,
  `sub_content` longtext,
  `sub_jianjie` varchar(200) DEFAULT NULL,
  `type_circles_id` varchar(32) DEFAULT NULL,
  `sub_time` varchar(32) DEFAULT NULL,
  `sub_last_time` varchar(32) DEFAULT NULL,
  `sub_auth` varchar(32) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `bak1` int(11) DEFAULT NULL,
  `bak2` varchar(200) DEFAULT NULL,
  `bak3` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subject
-- ----------------------------

-- ----------------------------
-- Table structure for `tags`
-- ----------------------------
DROP TABLE IF EXISTS `tags`;
CREATE TABLE `tags` (
  `tag_id` int(24) NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(100) DEFAULT NULL,
  `parent_id` varchar(24) DEFAULT NULL,
  `layer` int(11) DEFAULT NULL,
  `memo` varchar(200) DEFAULT NULL,
  `tag_type` int(11) DEFAULT NULL,
  `if_inte` int(11) DEFAULT NULL,
  `inte_url` varchar(200) DEFAULT NULL,
  `comm_tag_type` int(11) DEFAULT NULL,
  `pic_id` varchar(24) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tags
-- ----------------------------

-- ----------------------------
-- Table structure for `task`
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
  `task_id` int(24) NOT NULL AUTO_INCREMENT,
  `task_time` varchar(20) DEFAULT NULL,
  `activity_id` varchar(24) DEFAULT NULL,
  `score_mall_id` varchar(24) DEFAULT NULL,
  `activity_flag` int(11) DEFAULT NULL,
  `task_flag` int(11) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `prepare1` int(11) DEFAULT NULL,
  `prepare2` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `activity_id` int(24) NOT NULL AUTO_INCREMENT,
  `activity_name` varchar(50) DEFAULT NULL,
  `memo` varchar(500) DEFAULT NULL,
  `file_id` varchar(24) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  `activity_begin` varchar(20) DEFAULT NULL,
  `activity_end` varchar(20) DEFAULT NULL,
  `expiry_begin` varchar(20) DEFAULT NULL,
  `expiry_end` varchar(20) DEFAULT NULL,
  `expiry_status` int(11) DEFAULT NULL,
  `show_flag` int(11) DEFAULT NULL,
  `everyday_count` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `sponsor` varchar(50) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `prepare1` int(11) DEFAULT NULL,
  `prepare2` varchar(100) DEFAULT NULL,
  `prepare3` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`activity_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '哈哈哈哈哈哈', '三三四四', 'dasdasf', '1', '1', '10', '15', '33', '44', '1', '1', '1', '1', '1', '1', '11', '1', '1');
INSERT INTO `user` VALUES ('2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', null, '2');
INSERT INTO `user` VALUES ('3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');

-- ----------------------------
-- Table structure for `user_comment`
-- ----------------------------
DROP TABLE IF EXISTS `user_comment`;
CREATE TABLE `user_comment` (
  `comment_id` int(32) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(32) DEFAULT NULL,
  `sub_id` varchar(32) DEFAULT NULL,
  `point` int(11) DEFAULT NULL,
  `comment_conten` longtext,
  `comment_time` varchar(32) DEFAULT NULL,
  `tc_point` int(11) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `bak1` int(11) DEFAULT NULL,
  `bak2` varchar(200) DEFAULT NULL,
  `bak3` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `user_complain`
-- ----------------------------
DROP TABLE IF EXISTS `user_complain`;
CREATE TABLE `user_complain` (
  `comp_id` int(32) NOT NULL AUTO_INCREMENT,
  `comp_type` int(11) DEFAULT NULL,
  `store_id` varchar(32) DEFAULT NULL,
  `user_id` varchar(32) DEFAULT NULL,
  `comp_time` varchar(32) DEFAULT NULL,
  `comp_reason` varchar(200) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `bak1` int(11) DEFAULT NULL,
  `bak2` varchar(200) DEFAULT NULL,
  `bak3` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`comp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_complain
-- ----------------------------

-- ----------------------------
-- Table structure for `user_function_attribute`
-- ----------------------------
DROP TABLE IF EXISTS `user_function_attribute`;
CREATE TABLE `user_function_attribute` (
  `user_id` int(11) DEFAULT NULL,
  `function_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_function_attribute
-- ----------------------------

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(24) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) DEFAULT NULL,
  `user_psw` varchar(50) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `file_id` varchar(24) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `open_id` varchar(50) DEFAULT NULL,
  `Nick_name` varchar(100) DEFAULT NULL,
  `Img_url` varchar(300) DEFAULT NULL,
  `prepare1` int(11) DEFAULT NULL,
  `prepare2` varchar(100) DEFAULT NULL,
  `prepare3` varchar(100) DEFAULT NULL,
  `prepare4` int(11) DEFAULT NULL,
  `prepare5` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------

-- ----------------------------
-- Table structure for `user_like`
-- ----------------------------
DROP TABLE IF EXISTS `user_like`;
CREATE TABLE `user_like` (
  `like_id` int(32) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `sub_id` varchar(32) DEFAULT NULL,
  `like_time` varchar(32) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `bak1` int(11) DEFAULT NULL,
  `bak2` varchar(200) DEFAULT NULL,
  `bak3` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`like_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_like
-- ----------------------------

-- ----------------------------
-- Table structure for `user_recommend`
-- ----------------------------
DROP TABLE IF EXISTS `user_recommend`;
CREATE TABLE `user_recommend` (
  `rec_id` int(32) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(32) DEFAULT NULL,
  `type_circle_id` varchar(32) DEFAULT NULL,
  `rec_name` varchar(100) DEFAULT NULL,
  `rec_address` varchar(200) DEFAULT NULL,
  `rec_time` varchar(32) DEFAULT NULL,
  `rec_tese` varchar(200) DEFAULT NULL,
  `rec_reason` varchar(32) DEFAULT NULL,
  `rec_consume` int(11) DEFAULT NULL,
  `audi_user_id` varchar(32) DEFAULT NULL,
  `audi_result` int(11) DEFAULT NULL,
  `audi_reason` varchar(32) DEFAULT NULL,
  `audi_time` varchar(32) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `bak1` int(11) DEFAULT NULL,
  `bak2` varchar(24) DEFAULT NULL,
  `bak3` varchar(24) DEFAULT NULL,
  PRIMARY KEY (`rec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_recommend
-- ----------------------------

-- ----------------------------
-- Table structure for `wx_sc`
-- ----------------------------
DROP TABLE IF EXISTS `wx_sc`;
CREATE TABLE `wx_sc` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `sc_type` int(11) DEFAULT NULL,
  `sc_time` varchar(20) DEFAULT NULL,
  `sc_auth` varchar(50) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `bak1` int(11) DEFAULT NULL,
  `bak2` varchar(200) DEFAULT NULL,
  `bak3` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wx_sc
-- ----------------------------

-- ----------------------------
-- Table structure for `wx_scattr`
-- ----------------------------
DROP TABLE IF EXISTS `wx_scattr`;
CREATE TABLE `wx_scattr` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `sc_id` varchar(32) DEFAULT NULL,
  `sc_title` varchar(70) DEFAULT NULL,
  `sc_desc` varchar(10) DEFAULT NULL,
  `sc_url` varchar(200) DEFAULT NULL,
  `sc_picurl` varchar(200) DEFAULT NULL,
  `sc_content` longtext,
  `sc_index` int(11) DEFAULT NULL,
  `delete_flag` int(11) DEFAULT NULL,
  `bak1` int(11) DEFAULT NULL,
  `bak2` varchar(200) DEFAULT NULL,
  `bak3` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wx_scattr
-- ----------------------------
