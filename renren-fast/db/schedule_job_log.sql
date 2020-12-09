/*
Navicat MySQL Data Transfer

Source Server         : tempLink
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : renren_fast

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-10-21 13:20:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `schedule_job_log`
-- ----------------------------
DROP TABLE IF EXISTS `schedule_job_log`;
CREATE TABLE `schedule_job_log` (
  `log_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务日志id',
  `job_id` bigint(20) NOT NULL COMMENT '任务id',
  `bean_name` varchar(200) DEFAULT NULL COMMENT 'spring bean名称',
  `params` varchar(2000) DEFAULT NULL COMMENT '参数',
  `status` tinyint(4) NOT NULL COMMENT '任务状态    0：成功    1：失败',
  `error` varchar(2000) DEFAULT NULL COMMENT '失败信息',
  `times` int(11) NOT NULL COMMENT '耗时(单位：毫秒)',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`log_id`),
  KEY `job_id` (`job_id`)
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=utf8mb4 COMMENT='定时任务日志';

-- ----------------------------
-- Records of schedule_job_log
-- ----------------------------
INSERT INTO `schedule_job_log` VALUES ('1', '1', 'testTask', 'renren', '0', null, '0', '2020-10-20 17:36:51');
INSERT INTO `schedule_job_log` VALUES ('2', '1', 'testTask', 'renren', '0', null, '1', '2020-10-20 17:36:55');
INSERT INTO `schedule_job_log` VALUES ('3', '1', 'testTask', 'renren', '0', null, '0', '2020-10-20 17:37:10');
INSERT INTO `schedule_job_log` VALUES ('4', '1', 'testTask', 'renren', '0', null, '0', '2020-10-20 17:39:05');
INSERT INTO `schedule_job_log` VALUES ('5', '1', 'testTask', 'renren', '0', null, '0', '2020-10-20 17:40:05');
INSERT INTO `schedule_job_log` VALUES ('6', '1', 'testTask', 'renren', '0', null, '1', '2020-10-20 17:41:05');
INSERT INTO `schedule_job_log` VALUES ('7', '1', 'testTask', 'renren', '0', null, '0', '2020-10-20 17:42:05');
INSERT INTO `schedule_job_log` VALUES ('8', '1', 'testTask', 'renren', '0', null, '1', '2020-10-20 17:43:05');
INSERT INTO `schedule_job_log` VALUES ('9', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:43:50');
INSERT INTO `schedule_job_log` VALUES ('10', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:43:52');
INSERT INTO `schedule_job_log` VALUES ('11', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:43:54');
INSERT INTO `schedule_job_log` VALUES ('12', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:43:56');
INSERT INTO `schedule_job_log` VALUES ('13', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:43:58');
INSERT INTO `schedule_job_log` VALUES ('14', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:00');
INSERT INTO `schedule_job_log` VALUES ('15', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:02');
INSERT INTO `schedule_job_log` VALUES ('16', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:04');
INSERT INTO `schedule_job_log` VALUES ('17', '1', 'testTask', 'renren', '0', null, '0', '2020-10-20 17:44:05');
INSERT INTO `schedule_job_log` VALUES ('18', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:44:06');
INSERT INTO `schedule_job_log` VALUES ('19', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:44:08');
INSERT INTO `schedule_job_log` VALUES ('20', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:10');
INSERT INTO `schedule_job_log` VALUES ('21', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:12');
INSERT INTO `schedule_job_log` VALUES ('22', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:44:14');
INSERT INTO `schedule_job_log` VALUES ('23', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:16');
INSERT INTO `schedule_job_log` VALUES ('24', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:44:18');
INSERT INTO `schedule_job_log` VALUES ('25', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:20');
INSERT INTO `schedule_job_log` VALUES ('26', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:44:22');
INSERT INTO `schedule_job_log` VALUES ('27', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:24');
INSERT INTO `schedule_job_log` VALUES ('28', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:26');
INSERT INTO `schedule_job_log` VALUES ('29', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:28');
INSERT INTO `schedule_job_log` VALUES ('30', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:44:30');
INSERT INTO `schedule_job_log` VALUES ('31', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:44:32');
INSERT INTO `schedule_job_log` VALUES ('32', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:34');
INSERT INTO `schedule_job_log` VALUES ('33', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:36');
INSERT INTO `schedule_job_log` VALUES ('34', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:44:38');
INSERT INTO `schedule_job_log` VALUES ('35', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:40');
INSERT INTO `schedule_job_log` VALUES ('36', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:44:42');
INSERT INTO `schedule_job_log` VALUES ('37', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:44:44');
INSERT INTO `schedule_job_log` VALUES ('38', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:44:46');
INSERT INTO `schedule_job_log` VALUES ('39', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:48');
INSERT INTO `schedule_job_log` VALUES ('40', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:50');
INSERT INTO `schedule_job_log` VALUES ('41', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:52');
INSERT INTO `schedule_job_log` VALUES ('42', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:44:54');
INSERT INTO `schedule_job_log` VALUES ('43', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:44:56');
INSERT INTO `schedule_job_log` VALUES ('44', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:44:58');
INSERT INTO `schedule_job_log` VALUES ('45', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:45:00');
INSERT INTO `schedule_job_log` VALUES ('46', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:02');
INSERT INTO `schedule_job_log` VALUES ('47', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:45:04');
INSERT INTO `schedule_job_log` VALUES ('48', '1', 'testTask', 'renren', '0', null, '1', '2020-10-20 17:45:05');
INSERT INTO `schedule_job_log` VALUES ('49', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:06');
INSERT INTO `schedule_job_log` VALUES ('50', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:08');
INSERT INTO `schedule_job_log` VALUES ('51', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:10');
INSERT INTO `schedule_job_log` VALUES ('52', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:45:12');
INSERT INTO `schedule_job_log` VALUES ('53', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:14');
INSERT INTO `schedule_job_log` VALUES ('54', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:16');
INSERT INTO `schedule_job_log` VALUES ('55', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:18');
INSERT INTO `schedule_job_log` VALUES ('56', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:45:20');
INSERT INTO `schedule_job_log` VALUES ('57', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:22');
INSERT INTO `schedule_job_log` VALUES ('58', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:24');
INSERT INTO `schedule_job_log` VALUES ('59', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:26');
INSERT INTO `schedule_job_log` VALUES ('60', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:28');
INSERT INTO `schedule_job_log` VALUES ('61', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:45:30');
INSERT INTO `schedule_job_log` VALUES ('62', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:32');
INSERT INTO `schedule_job_log` VALUES ('63', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:34');
INSERT INTO `schedule_job_log` VALUES ('64', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:45:36');
INSERT INTO `schedule_job_log` VALUES ('65', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:38');
INSERT INTO `schedule_job_log` VALUES ('66', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:40');
INSERT INTO `schedule_job_log` VALUES ('67', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:45:42');
INSERT INTO `schedule_job_log` VALUES ('68', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:45:44');
INSERT INTO `schedule_job_log` VALUES ('69', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:45:46');
INSERT INTO `schedule_job_log` VALUES ('70', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:48');
INSERT INTO `schedule_job_log` VALUES ('71', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:50');
INSERT INTO `schedule_job_log` VALUES ('72', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:52');
INSERT INTO `schedule_job_log` VALUES ('73', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:54');
INSERT INTO `schedule_job_log` VALUES ('74', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:56');
INSERT INTO `schedule_job_log` VALUES ('75', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:45:58');
INSERT INTO `schedule_job_log` VALUES ('76', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:46:00');
INSERT INTO `schedule_job_log` VALUES ('77', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:46:02');
INSERT INTO `schedule_job_log` VALUES ('78', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:46:04');
INSERT INTO `schedule_job_log` VALUES ('79', '1', 'testTask', 'renren', '0', null, '0', '2020-10-20 17:46:05');
INSERT INTO `schedule_job_log` VALUES ('80', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:46:06');
INSERT INTO `schedule_job_log` VALUES ('81', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:46:08');
INSERT INTO `schedule_job_log` VALUES ('82', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '0', '2020-10-20 17:46:10');
INSERT INTO `schedule_job_log` VALUES ('83', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:46:12');
INSERT INTO `schedule_job_log` VALUES ('84', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:46:14');
INSERT INTO `schedule_job_log` VALUES ('85', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:46:16');
INSERT INTO `schedule_job_log` VALUES ('86', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:46:18');
INSERT INTO `schedule_job_log` VALUES ('87', '1', 'testTask', 'renren', '0', null, '10', '2020-10-20 17:57:28');
INSERT INTO `schedule_job_log` VALUES ('88', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '6', '2020-10-20 17:57:28');
INSERT INTO `schedule_job_log` VALUES ('89', '1', 'testTask', 'renren', '0', null, '5', '2020-10-20 17:57:30');
INSERT INTO `schedule_job_log` VALUES ('90', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '6', '2020-10-20 17:57:30');
INSERT INTO `schedule_job_log` VALUES ('91', '1', 'testTask', 'renren', '0', null, '5', '2020-10-20 17:57:32');
INSERT INTO `schedule_job_log` VALUES ('92', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '4', '2020-10-20 17:57:32');
INSERT INTO `schedule_job_log` VALUES ('93', '1', 'testTask', 'renren', '0', null, '4', '2020-10-20 17:57:34');
INSERT INTO `schedule_job_log` VALUES ('94', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '3', '2020-10-20 17:57:34');
INSERT INTO `schedule_job_log` VALUES ('95', '1', 'testTask', 'renren', '0', null, '4', '2020-10-20 17:57:36');
INSERT INTO `schedule_job_log` VALUES ('96', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '3', '2020-10-20 17:57:36');
INSERT INTO `schedule_job_log` VALUES ('97', '1', 'testTask', 'renren', '0', null, '3', '2020-10-20 17:57:38');
INSERT INTO `schedule_job_log` VALUES ('98', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '3', '2020-10-20 17:57:38');
INSERT INTO `schedule_job_log` VALUES ('99', '1', 'testTask', 'renren', '0', null, '3', '2020-10-20 17:57:40');
INSERT INTO `schedule_job_log` VALUES ('100', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '4', '2020-10-20 17:57:40');
INSERT INTO `schedule_job_log` VALUES ('101', '1', 'testTask', 'renren', '0', null, '4', '2020-10-20 17:57:42');
INSERT INTO `schedule_job_log` VALUES ('102', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:57:42');
INSERT INTO `schedule_job_log` VALUES ('103', '1', 'testTask', 'renren', '0', null, '2', '2020-10-20 17:57:44');
INSERT INTO `schedule_job_log` VALUES ('104', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '4', '2020-10-20 17:57:44');
INSERT INTO `schedule_job_log` VALUES ('105', '1', 'testTask', 'renren', '0', null, '4', '2020-10-20 17:57:46');
INSERT INTO `schedule_job_log` VALUES ('106', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:57:46');
INSERT INTO `schedule_job_log` VALUES ('107', '1', 'testTask', 'renren', '0', null, '6', '2020-10-20 17:57:48');
INSERT INTO `schedule_job_log` VALUES ('108', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '4', '2020-10-20 17:57:48');
INSERT INTO `schedule_job_log` VALUES ('109', '1', 'testTask', 'renren', '0', null, '3', '2020-10-20 17:57:50');
INSERT INTO `schedule_job_log` VALUES ('110', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '5', '2020-10-20 17:57:50');
INSERT INTO `schedule_job_log` VALUES ('111', '1', 'testTask', 'renren', '0', null, '3', '2020-10-20 17:57:52');
INSERT INTO `schedule_job_log` VALUES ('112', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:57:52');
INSERT INTO `schedule_job_log` VALUES ('113', '1', 'testTask', 'renren', '0', null, '3', '2020-10-20 17:57:54');
INSERT INTO `schedule_job_log` VALUES ('114', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:57:54');
INSERT INTO `schedule_job_log` VALUES ('115', '1', 'testTask', 'renren', '0', null, '4', '2020-10-20 17:57:56');
INSERT INTO `schedule_job_log` VALUES ('116', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:57:56');
INSERT INTO `schedule_job_log` VALUES ('117', '1', 'testTask', 'renren', '0', null, '4', '2020-10-20 17:57:58');
INSERT INTO `schedule_job_log` VALUES ('118', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '3', '2020-10-20 17:57:58');
INSERT INTO `schedule_job_log` VALUES ('119', '1', 'testTask', 'renren', '0', null, '4', '2020-10-20 17:58:00');
INSERT INTO `schedule_job_log` VALUES ('120', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:58:00');
INSERT INTO `schedule_job_log` VALUES ('121', '1', 'testTask', 'renren', '0', null, '2', '2020-10-20 17:58:02');
INSERT INTO `schedule_job_log` VALUES ('122', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:58:02');
INSERT INTO `schedule_job_log` VALUES ('123', '1', 'testTask', 'renren', '0', null, '2', '2020-10-20 17:58:04');
INSERT INTO `schedule_job_log` VALUES ('124', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:58:04');
INSERT INTO `schedule_job_log` VALUES ('125', '1', 'testTask', 'renren', '0', null, '3', '2020-10-20 17:58:06');
INSERT INTO `schedule_job_log` VALUES ('126', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:58:06');
INSERT INTO `schedule_job_log` VALUES ('127', '1', 'testTask', 'renren', '0', null, '2', '2020-10-20 17:58:08');
INSERT INTO `schedule_job_log` VALUES ('128', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:58:08');
INSERT INTO `schedule_job_log` VALUES ('129', '1', 'testTask', 'renren', '0', null, '3', '2020-10-20 17:58:10');
INSERT INTO `schedule_job_log` VALUES ('130', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:58:10');
INSERT INTO `schedule_job_log` VALUES ('131', '1', 'testTask', 'renren', '0', null, '3', '2020-10-20 17:58:12');
INSERT INTO `schedule_job_log` VALUES ('132', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:58:12');
INSERT INTO `schedule_job_log` VALUES ('133', '1', 'testTask', 'renren', '0', null, '18', '2020-10-20 17:58:14');
INSERT INTO `schedule_job_log` VALUES ('134', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:58:14');
INSERT INTO `schedule_job_log` VALUES ('135', '1', 'testTask', 'renren', '0', null, '5', '2020-10-20 17:58:16');
INSERT INTO `schedule_job_log` VALUES ('136', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:58:16');
INSERT INTO `schedule_job_log` VALUES ('137', '1', 'testTask', 'renren', '0', null, '3', '2020-10-20 17:58:18');
INSERT INTO `schedule_job_log` VALUES ('138', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '1', '2020-10-20 17:58:18');
INSERT INTO `schedule_job_log` VALUES ('139', '1', 'testTask', 'renren', '0', null, '4', '2020-10-20 17:58:20');
INSERT INTO `schedule_job_log` VALUES ('140', '2', 'testTask', 'wfgewfrfvdfi三个月', '0', null, '2', '2020-10-20 17:58:20');
