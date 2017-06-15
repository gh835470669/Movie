/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50522
Source Host           : localhost:3306
Source Database       : hackvr

Target Server Type    : MYSQL
Target Server Version : 50522
File Encoding         : 65001

Date: 2016-08-05 12:44:46
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `article`
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
`article_id`  int(11) NOT NULL AUTO_INCREMENT ,
`title`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文章题目' ,
`create_time`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '文章发布时间' ,
`preinfo`  varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文章导语' ,
`content`  text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文章内容' ,
`preimage`  varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预览图' ,
`source`  varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源' ,
`author`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '编辑作者' ,
`label`  varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标签名，以 | 分割' ,
`type`  tinyint(3) NOT NULL COMMENT '1：时讯；2：观察；3：游戏；4：影视' ,
`click_num`  int(11) NOT NULL DEFAULT 11 COMMENT '阅读量' ,
`flag`  tinyint(2) NOT NULL DEFAULT 1 COMMENT '0：无效；1：已发布；2：未发布' ,
`sort`  int(11) NULL DEFAULT NULL ,
`like_num`  int(11) NULL DEFAULT 11 ,
`unlike_num`  int(11) NULL DEFAULT 0 ,
`qrcode_url`  varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二维码路径' ,
PRIMARY KEY (`article_id`)
)

;

-- ----------------------------
-- Table structure for `display_device`
-- ----------------------------
DROP TABLE IF EXISTS `display_device`;
CREATE TABLE `display_device` (
`display_device_id`  int(11) NOT NULL AUTO_INCREMENT ,
`display_decive_name`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '显示设备名' ,
`flag`  tinyint(2) NOT NULL DEFAULT 1 ,
PRIMARY KEY (`display_device_id`)
)

;

-- ----------------------------
-- Table structure for `display_device_map`
-- ----------------------------
DROP TABLE IF EXISTS `display_device_map`;
CREATE TABLE `display_device_map` (
`display_device_mapper_id`  int(11) NOT NULL AUTO_INCREMENT ,
`display_device_id`  int(11) NOT NULL ,
`game_id`  int(11) NOT NULL ,
`flag`  tinyint(2) NOT NULL DEFAULT 1 ,
PRIMARY KEY (`display_device_mapper_id`)
)

;

-- ----------------------------
-- Table structure for `game`
-- ----------------------------
DROP TABLE IF EXISTS `game`;
CREATE TABLE `game` (
`game_id`  int(11) NOT NULL AUTO_INCREMENT ,
`title`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '游戏名字' ,
`create_time`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '游戏发布时间' ,
`company`  int(11) NULL DEFAULT NULL COMMENT '发行公司' ,
`preinfo`  varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '游戏简介' ,
`content`  text CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '游戏介绍' ,
`preimage`  varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预览图' ,
`type`  varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '游戏类型， 用‘|’隔开' ,
`system`  int(5) NULL DEFAULT NULL COMMENT '0：PC；1：安卓；2：IOS；3：playstation' ,
`display_device`  varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '显示设备，用‘|’隔开' ,
`control_device`  varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '控制外设，用‘|’隔开' ,
`download_url`  varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下载链接' ,
`download_num`  int(11) NULL DEFAULT 0 COMMENT '下载数目' ,
`installation_size`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '安装包大小' ,
`score`  decimal(3,2) NULL DEFAULT 5.00 COMMENT '评分' ,
`author`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '编辑作者' ,
`source`  varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源' ,
`sort`  int(11) NULL DEFAULT NULL ,
`flag`  tinyint(2) NOT NULL DEFAULT 1 COMMENT '0：无效；1：已发布；2：未发布' ,
PRIMARY KEY (`game_id`)
)

;

-- ----------------------------
-- Table structure for `game_type`
-- ----------------------------
DROP TABLE IF EXISTS `game_type`;
CREATE TABLE `game_type` (
`game_type_id`  int(11) NOT NULL AUTO_INCREMENT ,
`game_type_name`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '游戏类型名' ,
`flag`  tinyint(2) NOT NULL DEFAULT 1 ,
PRIMARY KEY (`game_type_id`)
)

;

-- ----------------------------
-- Table structure for `game_type_map`
-- ----------------------------
DROP TABLE IF EXISTS `game_type_map`;
CREATE TABLE `game_type_map` (
`game_type_mapper_id`  int(11) NOT NULL AUTO_INCREMENT ,
`game_type_id`  int(11) NOT NULL ,
`game_id`  int(11) NOT NULL ,
`flag`  tinyint(2) NOT NULL DEFAULT 1 ,
PRIMARY KEY (`game_type_mapper_id`)
)

;

-- ----------------------------
-- Table structure for `kuaixun`
-- ----------------------------
DROP TABLE IF EXISTS `kuaixun`;
CREATE TABLE `kuaixun` (
`kuaixun_id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '快讯id' ,
`title`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '快讯标题' ,
`create_time`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '快讯时间' ,
`preinfo`  varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '快讯导语' ,
`link`  varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '快讯链接' ,
`flag`  tinyint(2) NOT NULL DEFAULT 1 COMMENT '1：有效；0：无效' ,
PRIMARY KEY (`kuaixun_id`)
)

;

-- ----------------------------
-- Table structure for `label`
-- ----------------------------
DROP TABLE IF EXISTS `label`;
CREATE TABLE `label` (
`label_id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '标签id' ,
`label_name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标签名' ,
`flag`  tinyint(2) NOT NULL DEFAULT 1 COMMENT '0：无效；1：有效' ,
PRIMARY KEY (`label_id`)
)

;

-- ----------------------------
-- Table structure for `label_map`
-- ----------------------------
DROP TABLE IF EXISTS `label_map`;
CREATE TABLE `label_map` (
`mapper_id`  int(11) NOT NULL AUTO_INCREMENT COMMENT 'label与article对应的id' ,
`label_id`  int(11) NOT NULL ,
`article_id`  int(11) NOT NULL ,
`flag`  tinyint(2) NOT NULL DEFAULT 1 COMMENT '0：无效；1：有效' ,
PRIMARY KEY (`mapper_id`)
)

;

-- ----------------------------
-- Table structure for `toutiao`
-- ----------------------------
DROP TABLE IF EXISTS `toutiao`;
CREATE TABLE `toutiao` (
`toutiao_id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '头条id' ,
`article_id`  int(11) NOT NULL ,
`type`  tinyint(3) NOT NULL COMMENT '0：首页头条；1：时讯头条；2：观察头条；3：游戏头条；4：影视头条；5:资讯轮播；6：视频轮播' ,
`flag`  tinyint(2) NOT NULL DEFAULT 1 COMMENT '0：无效；1：有效' ,
`sort`  int(11) NULL DEFAULT NULL COMMENT '排行' ,
`img_url`  varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头条图片url' ,
PRIMARY KEY (`toutiao_id`)
)

;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
`user_id`  int(11) NOT NULL AUTO_INCREMENT ,
`user_name`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`passwd`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`flag`  int(2) NOT NULL COMMENT '是否可用，1表示可以，0表示不可以' ,
`role`  int(2) NOT NULL DEFAULT 1 COMMENT '角色，0表示超级管理员，1表示普通用户' ,
PRIMARY KEY (`user_id`)
)

;

-- ----------------------------
-- Table structure for `video`
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
`video_id`  int(11) NOT NULL AUTO_INCREMENT ,
`title`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文章题目' ,
`create_time`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '文章发布时间' ,
`preinfo`  varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文章导语' ,
`video_url`  varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '视频链接' ,
`preimage`  varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预览图' ,
`source`  varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源' ,
`author`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '编辑作者' ,
`label`  varchar(600) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标签名，以 | 分割' ,
`type`  int(11) NOT NULL ,
`click_num`  int(11) NOT NULL DEFAULT 0 COMMENT '阅读量' ,
`flag`  tinyint(2) NOT NULL DEFAULT 1 COMMENT '0：无效；1：有效' ,
`sort`  int(11) NULL DEFAULT NULL ,
`like_num`  int(11) NULL DEFAULT NULL ,
`unlike_num`  int(11) NULL DEFAULT NULL ,
`qrcode_url`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二维码路径' ,
`video_length`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '视频长度' ,
`video_clarity`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '视频清晰度' ,
PRIMARY KEY (`video_id`)
)

;

-- ----------------------------
-- Auto increment value for `article`
-- ----------------------------
ALTER TABLE `article` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `display_device`
-- ----------------------------
ALTER TABLE `display_device` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `display_device_map`
-- ----------------------------
ALTER TABLE `display_device_map` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `game`
-- ----------------------------
ALTER TABLE `game` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `game_type`
-- ----------------------------
ALTER TABLE `game_type` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `game_type_map`
-- ----------------------------
ALTER TABLE `game_type_map` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `kuaixun`
-- ----------------------------
ALTER TABLE `kuaixun` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `label`
-- ----------------------------
ALTER TABLE `label` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `label_map`
-- ----------------------------
ALTER TABLE `label_map` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `toutiao`
-- ----------------------------
ALTER TABLE `toutiao` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `user`
-- ----------------------------
ALTER TABLE `user` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `video`
-- ----------------------------
ALTER TABLE `video` AUTO_INCREMENT=1;
