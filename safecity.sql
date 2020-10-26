/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : safecity

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2020-10-23 10:22:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_bug
-- ----------------------------
DROP TABLE IF EXISTS `tb_bug`;
CREATE TABLE `tb_bug` (
  `bg_id` int(11) NOT NULL,
  `bg_name` varchar(15) NOT NULL,
  `bg_breed` varchar(30) NOT NULL,
  `bg_host` varchar(30) NOT NULL,
  `bg_enemy` varchar(30) NOT NULL,
  `bg_damage` varchar(30) NOT NULL,
  `bg_prevent` varchar(30) NOT NULL,
  `bg_img_s` varchar(60) NOT NULL,
  `bg_img_l` varchar(60) NOT NULL,
  PRIMARY KEY (`bg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='table for bug';

-- ----------------------------
-- Records of tb_bug
-- ----------------------------

-- ----------------------------
-- Table structure for tb_event
-- ----------------------------
DROP TABLE IF EXISTS `tb_event`;
CREATE TABLE `tb_event` (
  `ev_id` int(11) NOT NULL,
  `ev_name` varchar(15) NOT NULL,
  `ev_date` date NOT NULL,
  `ev_status` int(11) NOT NULL,
  `ev_img` varchar(60) NOT NULL,
  `ev_desc` varchar(60) NOT NULL,
  `ev_find` varchar(15) NOT NULL,
  `ev_type` varchar(15) NOT NULL,
  `ev_team` int(11) NOT NULL,
  `ev_loss` float NOT NULL,
  `ev_area` float NOT NULL,
  `ev_suggestion` varchar(60) NOT NULL,
  `ev_suggestion_p` varchar(60) NOT NULL,
  PRIMARY KEY (`ev_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_event
-- ----------------------------

-- ----------------------------
-- Table structure for tb_expert
-- ----------------------------
DROP TABLE IF EXISTS `tb_expert`;
CREATE TABLE `tb_expert` (
  `ex_id` int(11) NOT NULL,
  `ex_usrId` int(11) NOT NULL,
  `ex_name` varchar(12) NOT NULL,
  `ex_company` varchar(12) NOT NULL,
  `ex_expertise` varchar(12) NOT NULL,
  `ex_phone` varchar(20) NOT NULL,
  `ex_date` date DEFAULT NULL,
  `ex_sex` varchar(10) DEFAULT NULL,
  `ex_addr` varchar(20) DEFAULT NULL,
  `ex_email` varchar(20) DEFAULT NULL,
  `ex_img` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ex_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_expert
-- ----------------------------

-- ----------------------------
-- Table structure for tb_log
-- ----------------------------
DROP TABLE IF EXISTS `tb_log`;
CREATE TABLE `tb_log` (
  `lg_id` int(11) NOT NULL AUTO_INCREMENT,
  `lg_content` varchar(100) NOT NULL,
  `lg_time` date NOT NULL,
  PRIMARY KEY (`lg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='table for log';

-- ----------------------------
-- Records of tb_log
-- ----------------------------

-- ----------------------------
-- Table structure for tb_medicament
-- ----------------------------
DROP TABLE IF EXISTS `tb_medicament`;
CREATE TABLE `tb_medicament` (
  `med_id` int(11) NOT NULL,
  `med_name` varchar(12) NOT NULL,
  `med_ptype` varchar(12) NOT NULL,
  `med_type` varchar(12) NOT NULL,
  `med_purpose` varchar(50) NOT NULL,
  `med_count` int(11) NOT NULL,
  PRIMARY KEY (`med_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_medicament
-- ----------------------------

-- ----------------------------
-- Table structure for tb_mouse
-- ----------------------------
DROP TABLE IF EXISTS `tb_mouse`;
CREATE TABLE `tb_mouse` (
  `ms_id` int(11) NOT NULL,
  `ms_breed` varchar(15) NOT NULL,
  `ms_food` varchar(30) NOT NULL,
  `ms_enemy` varchar(30) NOT NULL,
  `ms_damage` varchar(30) NOT NULL,
  `ms_prevent` varchar(30) NOT NULL,
  `ms_img` varchar(30) NOT NULL,
  PRIMARY KEY (`ms_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_mouse
-- ----------------------------

-- ----------------------------
-- Table structure for tb_record
-- ----------------------------
DROP TABLE IF EXISTS `tb_record`;
CREATE TABLE `tb_record` (
  `rec_id` int(11) NOT NULL,
  `rec_date` date NOT NULL,
  `rec_person` varchar(12) NOT NULL,
  `rec_result` varchar(20) NOT NULL,
  PRIMARY KEY (`rec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_record
-- ----------------------------

-- ----------------------------
-- Table structure for tb_sickness
-- ----------------------------
DROP TABLE IF EXISTS `tb_sickness`;
CREATE TABLE `tb_sickness` (
  `sk_id` int(11) NOT NULL,
  `sk_name` varchar(30) NOT NULL,
  `sk_cause` varchar(30) NOT NULL,
  `sk_pattern` varchar(30) NOT NULL,
  `sk_damange` varchar(30) NOT NULL,
  `sk_treat` varchar(30) NOT NULL,
  PRIMARY KEY (`sk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_sickness
-- ----------------------------

-- ----------------------------
-- Table structure for tb_team
-- ----------------------------
DROP TABLE IF EXISTS `tb_team`;
CREATE TABLE `tb_team` (
  `tn_id` int(11) NOT NULL,
  `zo_id` int(11) DEFAULT NULL,
  `tn_name` varchar(15) NOT NULL,
  `tn_part` varchar(10) NOT NULL,
  `tn_num` int(11) NOT NULL,
  `tn_tel` varchar(15) NOT NULL,
  `tn_date` date NOT NULL,
  PRIMARY KEY (`tn_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_team
-- ----------------------------

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(12) NOT NULL,
  `u_password` varchar(12) NOT NULL,
  `u_level` varchar(12) NOT NULL,
  `u_realname` varchar(12) NOT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'superadmin', 'superadmin', 'cj', '张三');
INSERT INTO `tb_user` VALUES ('2', 'zladmin', '123456', 'zl', '李四');
INSERT INTO `tb_user` VALUES ('3', 'zqadmin', '123456', 'zq', '王五');
INSERT INTO `tb_user` VALUES ('4', 'zjadmin', '123456', 'zj', '周六');
INSERT INTO `tb_user` VALUES ('5', 'yjadmin', '123456', 'yj', '吴七');

-- ----------------------------
-- Table structure for tb_zone
-- ----------------------------
DROP TABLE IF EXISTS `tb_zone`;
CREATE TABLE `tb_zone` (
  `zo_id` int(11) NOT NULL,
  `tn_id` int(11) DEFAULT NULL,
  `zo_name` varchar(15) NOT NULL,
  `zo_ftype` varchar(15) NOT NULL,
  `zo_stype` varchar(15) NOT NULL,
  `zo_tree` varchar(15) NOT NULL,
  `zo_team` int(11) NOT NULL,
  PRIMARY KEY (`zo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_zone
-- ----------------------------

-- ----------------------------
-- Table structure for team_delivery
-- ----------------------------
DROP TABLE IF EXISTS `team_delivery`;
CREATE TABLE `team_delivery` (
  `tn_id` int(11) NOT NULL,
  `del_id` int(11) NOT NULL,
  PRIMARY KEY (`tn_id`,`del_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of team_delivery
-- ----------------------------
