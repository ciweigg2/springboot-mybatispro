/*
 Navicat Premium Data Transfer

 Source Server         : 本地Sql
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : test_1

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 19/10/2018 22:19:26
*/
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test_1` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `test_1`;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_test
-- ----------------------------
DROP TABLE IF EXISTS `t_test`;
CREATE TABLE `t_test` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(20) NOT NULL COMMENT '用户名',
  `deft` varchar(20) NOT NULL COMMENT '用户数据',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10082 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_test
-- ----------------------------
BEGIN;
INSERT INTO `t_test` VALUES (1, 'a', '');
INSERT INTO `t_test` VALUES (2, '3', '');
INSERT INTO `t_test` VALUES (4, '5', '');
INSERT INTO `t_test` VALUES (5, '6', '');
INSERT INTO `t_test` VALUES (6, '7', '');
INSERT INTO `t_test` VALUES (7, '8', '');
INSERT INTO `t_test` VALUES (8, '9', '');
INSERT INTO `t_test` VALUES (9, '10', '');
INSERT INTO `t_test` VALUES (10, 'b', '');
INSERT INTO `t_test` VALUES (11, 'adwed', '');
INSERT INTO `t_test` VALUES (12, 'ewfwefewf', '');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
