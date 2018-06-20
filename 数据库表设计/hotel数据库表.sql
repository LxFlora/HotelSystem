/*
SQLyog Ultimate v8.32 
MySQL - 5.5.56 : Database - hotel
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hotel` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hotel`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `aId` int(10) NOT NULL AUTO_INCREMENT COMMENT '管理员ID',
  `aName` varchar(10) DEFAULT NULL COMMENT '姓名',
  `aPwd` varchar(10) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`aId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

insert  into `admin`(`aId`,`aName`,`aPwd`) values (1,'李进','123456');

/*Table structure for table `comm` */

DROP TABLE IF EXISTS `comm`;

CREATE TABLE `comm` (
  `commId` int(10) NOT NULL AUTO_INCREMENT COMMENT '评论ID',
  `roomId` int(10) NOT NULL COMMENT '客房ID',
  `uId` int(10) NOT NULL COMMENT '客户ID',
  `commText` varchar(500) DEFAULT NULL COMMENT '评论内容',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`commId`),
  KEY `FK_comm_room` (`roomId`),
  KEY `FK_comm_user` (`uId`),
  CONSTRAINT `FK_comm_user` FOREIGN KEY (`uId`) REFERENCES `user` (`uid`),
  CONSTRAINT `FK_comm_room` FOREIGN KEY (`roomId`) REFERENCES `room` (`roomId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `comm` */

insert  into `comm`(`commId`,`roomId`,`uId`,`commText`,`remark`) values (1,6,1,'房间环境非常好',NULL),(2,2,3,'舒适',NULL);

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `orderId` int(10) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `roomId` int(10) NOT NULL COMMENT '客房ID',
  `uId` int(10) NOT NULL COMMENT '客户ID',
  `orderstate` varchar(10) NOT NULL COMMENT '订单状态',
  `Deposit` int(7) DEFAULT NULL COMMENT '定金',
  `price` int(7) DEFAULT NULL COMMENT '价格',
  `ordertime` date NOT NULL COMMENT '下单时间',
  `personNum` int(1) NOT NULL COMMENT '人数',
  `inTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '入住时间',
  `outTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '离开时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`orderId`),
  KEY `FK_orders_room` (`roomId`),
  KEY `FK_orders_user` (`uId`),
  CONSTRAINT `FK_orders_user` FOREIGN KEY (`uId`) REFERENCES `user` (`uid`),
  CONSTRAINT `FK_orders_room` FOREIGN KEY (`roomId`) REFERENCES `room` (`roomId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `orders` */

insert  into `orders`(`orderId`,`roomId`,`uId`,`orderstate`,`Deposit`,`price`,`ordertime`,`personNum`,`inTime`,`outTime`,`remark`) values (1,6,1,'已入住',300,499,'2017-06-13',2,'2017-07-15 17:13:01','2017-07-16 16:01:41',NULL),(2,2,3,'已入住',1500,2500,'2017-08-12',2,'2017-08-15 17:19:33','2017-08-18 16:01:41',NULL),(3,3,2,'已入住',1200,2000,'2017-08-14',3,'2017-08-15 17:19:43','2017-08-17 13:03:47',NULL),(4,4,5,'已取消',1200,1800,'2017-12-02',2,'0000-00-00 00:00:00','0000-00-00 00:00:00',NULL);

/*Table structure for table `room` */

DROP TABLE IF EXISTS `room`;

CREATE TABLE `room` (
  `roomId` int(10) NOT NULL AUTO_INCREMENT COMMENT '客房ID',
  `rtypeId` int(10) DEFAULT NULL COMMENT '客房类型ID',
  `price` int(7) DEFAULT NULL COMMENT '价格',
  `liveNum` int(1) DEFAULT NULL COMMENT '居住人数',
  `facility` varchar(100) DEFAULT NULL COMMENT '基础设施',
  `resMoney` int(7) DEFAULT NULL COMMENT '预定金额',
  `isRes` int(1) DEFAULT NULL COMMENT '是否可预定',
  `isNet` int(1) DEFAULT NULL COMMENT '是否有宽带',
  `isFoot` int(1) DEFAULT NULL COMMENT '是否提供早餐',
  `defImg` varchar(20) DEFAULT NULL COMMENT '默认图片url',
  `rSize` varchar(20) DEFAULT NULL COMMENT '客房大小',
  `bed` varchar(20) DEFAULT NULL COMMENT '床信息',
  `state` varchar(20) DEFAULT NULL COMMENT '状态',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`roomId`),
  KEY `FK_room_rtype` (`rtypeId`),
  CONSTRAINT `FK_room_rtype` FOREIGN KEY (`rtypeId`) REFERENCES `rtype` (`rtypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `room` */

insert  into `room`(`roomId`,`rtypeId`,`price`,`liveNum`,`facility`,`resMoney`,`isRes`,`isNet`,`isFoot`,`defImg`,`rSize`,`bed`,`state`,`remark`) values (1,1,2800,3,'大屏彩电、冰箱、空调',1500,0,0,0,NULL,'50平方米左右','2张1.3米宽单人床/1张2.5米宽双人','可预订',NULL),(2,1,2500,2,'大屏彩电、冰箱、空调',1500,0,0,0,NULL,'35平方米左右','1张1.3米宽单人床/1张2.2米宽双人','可预订',NULL),(3,2,2000,3,'大屏彩电、冰箱、空调',1200,0,0,0,NULL,'40平方米左右','1张1.3米宽单人床/1张2.5米宽双人','可预订',NULL),(4,2,1800,2,'中屏彩电、冰箱、空调',1200,0,0,0,NULL,'30平方米左右','1张1.1米宽单人床/1张2.2米宽双人','可预订',NULL),(5,3,1500,2,'中屏彩电冰箱、空调',900,0,0,0,NULL,'25平方米左右','1张2.5米宽双人','可预订',NULL),(6,3,1350,2,'彩电、冰箱、空调',900,0,0,0,NULL,'25平方米左右','2张1.3米宽单人床','可预订',NULL),(7,4,1350,3,'彩电、小冰箱、空调',500,0,0,0,NULL,'27平方米左右','3张1.3米宽单人床','可预订',NULL),(8,4,1100,2,'彩电、小冰箱、空调',500,0,0,1,NULL,'25平方米左右','2张1.1米宽单人床','可预订',NULL),(9,5,1599,2,'大屏彩电、冰箱、空调',999,0,0,0,NULL,'30平方米左右','1张2.5米宽双人','可预订',NULL),(10,5,1399,2,'中屏彩电、冰箱、空调',999,0,0,0,NULL,'30平方米左右','1张2.2米宽双人','可预订',NULL),(11,6,499,2,'空调',300,0,0,0,NULL,'18平方米左右','2张1.1米宽单人床','可预订','预定时长为8小时或12小时'),(12,6,459,2,'空调',300,0,0,1,NULL,'18平方米左右','2张1.1米宽单人床','可预订','预定时长为8小时或12小时');

/*Table structure for table `rtype` */

DROP TABLE IF EXISTS `rtype`;

CREATE TABLE `rtype` (
  `rtypeId` int(10) NOT NULL AUTO_INCREMENT COMMENT '客房类型ID',
  `rtypeName` varchar(50) DEFAULT NULL COMMENT '客房类型名',
  `liveNum` int(1) DEFAULT NULL COMMENT '客房居住人数',
  `facility` varchar(100) DEFAULT NULL COMMENT '基础设施',
  `resMoney` int(7) DEFAULT NULL COMMENT '预定金额',
  `isRes` int(1) DEFAULT NULL COMMENT '是否可预定',
  `isNet` int(1) DEFAULT NULL COMMENT '是否有宽带',
  `isFoot` int(1) DEFAULT NULL COMMENT '是否提供早餐',
  `imgUrl` varchar(100) DEFAULT NULL COMMENT '宣传图片',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`rtypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `rtype` */

insert  into `rtype`(`rtypeId`,`rtypeName`,`liveNum`,`facility`,`resMoney`,`isRes`,`isNet`,`isFoot`,`imgUrl`,`remark`) values (1,'总统套房',3,'电视、冰箱、空调',1500,0,0,0,NULL,NULL),(2,'特大豪华房',3,'电视、冰箱、空调',1200,0,0,0,NULL,NULL),(3,'豪华房',2,'电视、冰箱、空调',900,0,0,0,NULL,NULL),(4,'商务房',2,'电视、小冰箱、空调',500,0,0,0,NULL,NULL),(5,'情侣房',2,'电视、冰箱、空调',999,0,0,0,NULL,NULL),(6,'钟点房',2,'空调',300,0,0,0,NULL,NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uid` int(10) NOT NULL AUTO_INCREMENT COMMENT '客户ID',
  `uNum` varchar(20) NOT NULL COMMENT '客户账号',
  `uName` varchar(20) NOT NULL COMMENT '客户姓名',
  `uPhone` varchar(13) NOT NULL COMMENT '手机',
  `uPwd` varchar(32) NOT NULL COMMENT '密码',
  `uSex` varchar(2) NOT NULL COMMENT '性别',
  `IDCard` varchar(18) NOT NULL COMMENT '身份证号',
  `uEmail` varchar(50) NOT NULL COMMENT '邮箱',
  `regisdate` datetime NOT NULL COMMENT '注册时间',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`uid`,`uNum`,`uName`,`uPhone`,`uPwd`,`uSex`,`IDCard`,`uEmail`,`regisdate`) values (1,'1000021','金汉斯','18976649547','123456','男','495860385839592458','123@qq.com','2017-05-06 00:00:00'),(2,'1000022','董小姐','27583658346','dxj123','女','475869699595940440','dxj@ddd.com','2017-06-21 00:00:00'),(3,'1000023','福南','36586938692','0987','男','375869237582143586','funan@na.com','2017-07-15 00:00:00'),(4,'1000024','京东方','74839399327','4637','女','573833931034880249','234@qq.com','2017-09-28 00:00:00'),(5,'1000025','Tom','36586475892','0987355','男','375869257482143586','Tom@na.com','2017-10-15 00:00:00'),(6,'1000026','LiLY','58688938695','lily','女','274869237582143586','Lily@na.com','2017-12-15 00:00:00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
