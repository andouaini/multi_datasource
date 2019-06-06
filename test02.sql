/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : test02

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-06-06 00:46:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_user2
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user2`;
CREATE TABLE `tbl_user2` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user2
-- ----------------------------
INSERT INTO `tbl_user2` VALUES ('41', 'worinimamaipi22ccshiwu', 'gunduzi22cchsiuw');
INSERT INTO `tbl_user2` VALUES ('42', 'worinimamaipi22ccshiwu', 'gunduzi22cchsiuw');
