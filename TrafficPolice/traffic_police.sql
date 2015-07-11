/*
SQLyog v10.2 
MySQL - 5.0.96-community-nt : Database - traffic_police
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`traffic_police` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `traffic_police`;

/*Table structure for table `admins` */

DROP TABLE IF EXISTS `admins`;

CREATE TABLE `admins` (
  `Id` int(11) NOT NULL auto_increment,
  `account` varchar(50) default NULL,
  `password` varchar(50) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `admins` */

insert  into `admins`(`Id`,`account`,`password`) values (1,'admin','123456'),(2,'gps','123456'),(3,'test','test');

/*Table structure for table `config` */

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `Id` int(11) NOT NULL auto_increment,
  `siteName` varchar(100) default NULL,
  `keywords` varchar(255) default NULL,
  `pdescription` varchar(255) default NULL,
  `address` varchar(100) default NULL,
  `code` varchar(20) default NULL,
  `telephone` varchar(20) default NULL,
  `telephoneSale` varchar(50) default NULL,
  `telephoneService` varchar(50) default NULL,
  `fax` varchar(50) default NULL,
  `email` varchar(50) default NULL,
  `homePage` varchar(50) default NULL,
  `qq1` varchar(50) default NULL,
  `qq2` varchar(50) default NULL,
  `msn1` varchar(50) default NULL,
  `msn2` varchar(50) default NULL,
  `addDateTime` datetime default NULL,
  `updateTime` datetime default NULL,
  `operid` bigint(20) default '0',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `config` */

insert  into `config`(`Id`,`siteName`,`keywords`,`pdescription`,`address`,`code`,`telephone`,`telephoneSale`,`telephoneService`,`fax`,`email`,`homePage`,`qq1`,`qq2`,`msn1`,`msn2`,`addDateTime`,`updateTime`,`operid`) values (1,'机动车网上交通安全宣传教育监管平台','教育 安全','网上宣传教育安全知识','','','','','','','','','','','','','2013-10-10 14:57:03','2013-10-10 14:57:03',NULL);

/*Table structure for table `lbstrack` */

DROP TABLE IF EXISTS `lbstrack`;

CREATE TABLE `lbstrack` (
  `deviceId` varchar(50) NOT NULL COMMENT '设备ID或手机号 ',
  `longitude` varchar(50) default NULL COMMENT '经度 ',
  `latitude` varchar(50) default NULL COMMENT '纬度 ',
  `speed` varchar(50) default NULL COMMENT '速度',
  `realtime` datetime default NULL,
  PRIMARY KEY  (`deviceId`),
  KEY `Index_LbsTrack_deviceId` (`deviceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `lbstrack` */

insert  into `lbstrack`(`deviceId`,`longitude`,`latitude`,`speed`,`realtime`) values ('03634129019','123456987','6543214','56','2013-10-22 10:11:22'),('23634129019','223456987','26543214','26','2013-10-22 10:11:22'),('33634129019','323456987','36543214','36','2013-10-22 10:11:22');

/*Table structure for table `lina_test` */

DROP TABLE IF EXISTS `lina_test`;

CREATE TABLE `lina_test` (
  `id` bigint(20) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `sex` tinyint(1) default NULL,
  `address` varchar(255) default NULL,
  `company` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `lina_test` */

insert  into `lina_test`(`id`,`name`,`sex`,`address`,`company`) values (1,'2',NULL,NULL,NULL),(2,'2',NULL,NULL,NULL),(3,'2',NULL,NULL,NULL),(4,'2',NULL,NULL,NULL),(5,'2',NULL,NULL,NULL),(6,'2',NULL,NULL,NULL),(7,'2',NULL,NULL,NULL),(8,'2',NULL,NULL,NULL),(9,'2',NULL,NULL,NULL);

/*Table structure for table `tb_media` */

DROP TABLE IF EXISTS `tb_media`;

CREATE TABLE `tb_media` (
  `id` bigint(20) NOT NULL auto_increment,
  `title` varchar(50) NOT NULL COMMENT '视频名称',
  `src` varchar(200) NOT NULL COMMENT '视频存放地址',
  `picture` varchar(200) NOT NULL default '视频截图',
  `descript` varchar(400) default NULL COMMENT '视频描述',
  `uptime` varchar(40) default NULL COMMENT '上传时间',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_media` */

/*Table structure for table `tp_basic_area` */

DROP TABLE IF EXISTS `tp_basic_area`;

CREATE TABLE `tp_basic_area` (
  `areaid` bigint(20) unsigned NOT NULL auto_increment COMMENT '序列',
  `areaname` varchar(1024) NOT NULL COMMENT '地区',
  `parentid` bigint(20) default NULL COMMENT '父类地区id',
  `description` varchar(1024) default NULL COMMENT '描述',
  `orderno` bigint(20) default NULL COMMENT '顺序',
  `mailcode` varchar(64) default NULL COMMENT '邮政编码',
  `callcode` varchar(64) default NULL COMMENT '电话区号',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`areaid`)
) ENGINE=InnoDB AUTO_INCREMENT=208 DEFAULT CHARSET=utf8 COMMENT='地域管理';

/*Data for the table `tp_basic_area` */

insert  into `tp_basic_area`(`areaid`,`areaname`,`parentid`,`description`,`orderno`,`mailcode`,`callcode`,`operid`,`opertime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`,`macaddr`) values (1,'中国',0,NULL,NULL,NULL,NULL,0,'2013-10-10 16:44:52',1,NULL,'2013-10-10 16:44:52',NULL,NULL,NULL),(100,'浙江省',1,'113',NULL,'1111111','111',100,'2013-11-06 10:51:59',1,'123456','2013-10-11 16:44:49',NULL,NULL,NULL),(150,'杭州市',100,NULL,NULL,NULL,NULL,0,'2013-10-12 16:44:52',1,NULL,'2013-10-12 16:44:52',NULL,NULL,NULL),(200,'西湖区',150,'0000',NULL,'3000315','0759',200,'2014-01-03 09:04:58',1,'','2013-10-13 16:44:52',NULL,NULL,NULL),(201,'下城区',150,'1',NULL,'1','1',201,'2013-10-11 09:12:08',1,'1','2013-10-14 16:44:52',NULL,NULL,NULL),(202,'湖南省',1,'000',NULL,'425300','0746',202,'2013-10-11 13:56:29',1,'','2013-10-11 11:01:58',0,NULL,NULL),(203,'江苏省',1,'111',NULL,'658923','0568',203,'2013-10-12 11:01:36',1,'111','2013-10-11 11:05:34',0,NULL,NULL),(205,'湖北省',1,'000',NULL,'125478','0746',205,'2013-11-06 10:53:16',1,'','2013-10-11 11:57:48',0,NULL,NULL),(207,'长沙市',202,'长沙市',NULL,'0751','0751',207,'2013-11-08 09:11:22',1,'','2013-10-11 14:47:06',0,NULL,NULL);

/*Table structure for table `tp_basic_branch` */

DROP TABLE IF EXISTS `tp_basic_branch`;

CREATE TABLE `tp_basic_branch` (
  `id` bigint(20) NOT NULL auto_increment COMMENT 'id主键',
  `branch_name` varchar(100) default NULL COMMENT '快速处理点',
  `branch_address` varchar(512) default NULL COMMENT '快速处理点地址',
  `lng` double default NULL COMMENT '处理点的经纬度',
  `lat` double default NULL COMMENT '经纬度',
  `branch_phone` varchar(50) default NULL,
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  `porgid` bigint(20) default NULL COMMENT '交警部门id',
  `updatetime` datetime default NULL COMMENT '更新时间',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='快速处理点';

/*Data for the table `tp_basic_branch` */

insert  into `tp_basic_branch`(`id`,`branch_name`,`branch_address`,`lng`,`lat`,`branch_phone`,`operid`,`opertime`,`state`,`remark`,`ipaddr`,`macaddr`,`porgid`,`updatetime`) values (3,'杭州绿健科技有限公司','杭州市上城区市民中心',NULL,NULL,'0571-88188828',0,'2013-09-02 17:08:10',1,'',NULL,NULL,NULL,'2013-09-15 14:52:55'),(4,'市民中心','杭州上城区',NULL,NULL,'0571-88178823',0,'2013-09-06 17:18:30',1,NULL,NULL,NULL,NULL,'2013-09-15 10:31:58'),(5,'两岸咖啡（文二店）','杭州西湖区两岸咖啡（文二店）',NULL,NULL,'0571-88128845',0,'2013-09-23 14:34:28',1,'',NULL,NULL,NULL,'2013-09-15 14:52:51'),(7,'杭州大厦','杭州市杭州大厦',NULL,NULL,'0571-88128845',0,'2013-09-15 14:53:26',1,'',NULL,NULL,NULL,'2013-09-15 14:53:26'),(11,'杭州市莫干山路处理点','杭州市莫干山路与天目山路交叉口',NULL,NULL,'0571-88188828',0,'2013-10-09 09:50:11',1,'',NULL,NULL,NULL,'2013-10-09 09:50:11'),(12,'事故多发地拱墅桥','杭州拱墅区古墩路与三墩路交叉口',NULL,NULL,'0571-88188828',0,'2013-11-08 13:14:52',1,'',NULL,NULL,NULL,'2013-11-08 13:14:52'),(13,'文辉大桥','浙江省杭州市下城区文辉大桥',NULL,NULL,'0571-88188828',0,'2013-11-08 13:15:57',1,'',NULL,NULL,NULL,'2013-11-08 13:15:57');

/*Table structure for table `tp_basic_car` */

DROP TABLE IF EXISTS `tp_basic_car`;

CREATE TABLE `tp_basic_car` (
  `carid` bigint(20) unsigned NOT NULL auto_increment COMMENT '车辆管理id',
  `DeviceID` varchar(20) default NULL COMMENT '设备号id',
  `SIMcard` varchar(20) default NULL COMMENT 'sim卡卡号',
  `BusOwnerCode` varchar(20) default NULL COMMENT '自编号',
  `BusLicPlate` varchar(20) default NULL COMMENT '车牌号',
  `comid` bigint(20) NOT NULL COMMENT '所属公司编号',
  `Driver1` varchar(50) default NULL COMMENT '常用驾驶员',
  `Phone1` varchar(20) default NULL COMMENT '驾驶员电话',
  `Driver2` varchar(50) default NULL COMMENT '常用副驾驶员',
  `Phone2` varchar(20) default NULL COMMENT '副驾驶员电话',
  `Maxton` int(11) default NULL COMMENT '标准吨量',
  `MaxOil` int(11) default NULL COMMENT '标准油量',
  `MaintainTime` date default NULL COMMENT '保养时间',
  `MaintainDay` int(11) default NULL COMMENT '保养时间周期',
  `MaintainMile` int(11) default NULL COMMENT '保养里程',
  `MaintainCMile` int(11) default NULL COMMENT '保养里程周期',
  `FactoryType` varchar(50) default NULL COMMENT '厂牌型号',
  `Manufacturer` varchar(50) default NULL COMMENT '生产厂家',
  `BusType` varchar(50) default NULL COMMENT '车辆类型 搅拌车；油罐车；货物运输车等等',
  `BusColor` varchar(20) default NULL COMMENT '车身颜色',
  `OperatingId` varchar(20) default NULL COMMENT '道路运证编号',
  `FuelLevel` varchar(20) default NULL COMMENT '燃油级别',
  `EngineSN` varchar(20) default NULL COMMENT '发动机号',
  `Chassis` varchar(20) default NULL COMMENT '底盘架号',
  `GoodsType` varchar(20) default NULL COMMENT '货品类型',
  `OilConsume` float(6,2) default NULL COMMENT '百公里油耗',
  `BusLen` float(6,2) default NULL COMMENT '车身长度 ',
  `OneWayDistance` int(11) default NULL COMMENT '单程运距',
  `StopTime` int(11) default NULL COMMENT '停留时间',
  `RegCode` varchar(100) NOT NULL default '' COMMENT '登记证书',
  `Registered` int(11) NOT NULL default '1' COMMENT '是否登记',
  `areaid` bigint(20) default NULL COMMENT '所属地区id',
  `RegStartTime` datetime default NULL COMMENT '起始时间',
  `RegEndTime` datetime default NULL COMMENT '结束时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  PRIMARY KEY  (`carid`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COMMENT='车辆管理';

/*Data for the table `tp_basic_car` */

insert  into `tp_basic_car`(`carid`,`DeviceID`,`SIMcard`,`BusOwnerCode`,`BusLicPlate`,`comid`,`Driver1`,`Phone1`,`Driver2`,`Phone2`,`Maxton`,`MaxOil`,`MaintainTime`,`MaintainDay`,`MaintainMile`,`MaintainCMile`,`FactoryType`,`Manufacturer`,`BusType`,`BusColor`,`OperatingId`,`FuelLevel`,`EngineSN`,`Chassis`,`GoodsType`,`OilConsume`,`BusLen`,`OneWayDistance`,`StopTime`,`RegCode`,`Registered`,`areaid`,`RegStartTime`,`RegEndTime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`,`macaddr`,`operid`,`opertime`) values (1,'1','1','1','浙A1362',200,'1','1','1','1',1,1,'2013-09-17',1,1,1,'1','1','油罐车','1','1','1','1','1','1',1.00,1.00,1,1,'1',11,1,'2013-09-18 14:09:55','2013-09-18 14:09:57',1,'','2013-09-17 12:03:23',0,'1','1',0,'2013-09-17 12:03:20'),(2,NULL,NULL,NULL,'浙B1546',206,'',NULL,NULL,NULL,NULL,NULL,'2013-09-24',NULL,NULL,NULL,'00','00','货物运输车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,150,'2013-09-24 16:38:10','2013-09-24 16:38:13',1,'','2013-09-24 16:23:06',0,NULL,NULL,0,'2013-09-24 16:23:06'),(3,NULL,NULL,NULL,'浙G1542',218,'',NULL,NULL,NULL,NULL,NULL,'2013-09-24',NULL,NULL,NULL,'00','00','搅拌车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,200,'2013-09-24 16:38:15','2013-09-24 16:38:18',1,'','2013-09-24 16:25:29',0,NULL,NULL,0,'2013-09-24 16:25:29'),(4,NULL,NULL,NULL,'浙G2432',205,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'333','33','货物运输车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,100,'2013-09-24 16:57:34','2013-09-24 16:57:34',1,'','2013-09-24 16:57:34',0,NULL,NULL,0,'2013-09-24 16:57:34'),(5,NULL,NULL,NULL,'浙G1598',217,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'','','搅拌车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,1,'2013-09-24 17:45:07','2013-09-24 17:45:07',1,'','2013-09-24 17:45:07',0,NULL,NULL,0,'2013-09-24 17:45:07'),(6,NULL,NULL,NULL,'浙A1658',205,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0000','0000','货物运输车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,150,'2013-09-25 08:45:22','2013-09-25 08:45:22',1,'','2013-09-25 08:45:22',0,NULL,NULL,0,'2013-09-25 08:45:22'),(7,NULL,NULL,NULL,'浙F1342',206,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1','11111','油罐车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,100,'2013-09-25 10:22:13','2013-09-25 10:22:13',1,'','2013-09-25 10:22:13',0,NULL,NULL,0,'2013-09-25 10:22:13'),(8,NULL,NULL,NULL,'浙F1342',218,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'11','11111','搅拌车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,1,'2013-09-25 10:44:48','2013-09-25 10:44:48',1,'','2013-09-25 10:44:48',0,NULL,NULL,0,'2013-09-25 10:44:48'),(9,NULL,NULL,NULL,'浙A1562',205,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'11','11','搅拌车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,150,'2013-09-25 10:45:10','2013-09-25 10:45:10',1,'','2013-09-25 10:45:10',0,NULL,NULL,0,'2013-09-25 10:45:10'),(10,NULL,NULL,NULL,'沪B8969',236,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'11111','','搅拌车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,200,'2013-09-26 13:45:23','2013-09-26 13:45:23',1,'','2013-09-26 13:45:23',0,NULL,NULL,0,'2013-09-26 13:45:23'),(11,NULL,NULL,NULL,'浙F1342',236,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'11','放放风','油罐车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,1,'2013-09-27 14:37:18','2013-09-27 14:37:18',1,'','2013-09-27 14:37:18',0,NULL,NULL,0,'2013-09-27 14:37:18'),(12,NULL,NULL,NULL,'浙B6742',236,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'','','油罐车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,1,'2013-09-27 14:37:26','2013-09-27 14:37:26',1,'','2013-09-27 14:37:26',0,NULL,NULL,0,'2013-09-27 14:37:26'),(13,NULL,NULL,NULL,'浙E0942',236,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'','','搅拌车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,1,'2013-09-27 14:37:41','2013-09-27 14:37:41',1,'','2013-09-27 14:37:41',0,NULL,NULL,0,'2013-09-27 14:37:41'),(14,NULL,NULL,NULL,'浙A1562',236,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'','','油罐车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,1,'2013-09-27 14:37:50','2013-09-27 14:37:50',1,'','2013-09-27 14:37:50',0,NULL,NULL,0,'2013-09-27 14:37:50'),(15,NULL,NULL,NULL,'浙D0032',235,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'','','油罐车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,1,'2013-09-27 14:37:58','2013-09-27 14:37:58',1,'','2013-09-27 14:37:58',0,NULL,NULL,0,'2013-09-27 14:37:58'),(16,NULL,NULL,NULL,'浙C2122',235,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'','','油罐车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,1,'2013-09-27 14:38:07','2013-09-27 14:38:07',1,'','2013-09-27 14:38:07',0,NULL,NULL,0,'2013-09-27 14:38:07'),(17,NULL,NULL,NULL,'赣A1232',235,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'','','货物运输车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,201,'2013-10-18 09:05:10','2013-10-18 09:05:10',1,'','2013-10-18 09:05:10',0,NULL,NULL,0,'2013-10-18 09:05:10'),(18,NULL,NULL,NULL,'浙A3303',235,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'','','货物运输车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,201,'2013-10-24 10:58:26','2013-10-24 10:58:26',1,'','2013-10-24 10:58:26',0,NULL,NULL,0,'2013-10-24 10:58:26'),(19,NULL,NULL,NULL,'浙A4532',235,'',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'','','货物运输车',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',1,201,'2013-10-28 12:56:33','2013-10-28 12:56:33',1,'','2013-10-28 12:56:33',0,NULL,NULL,0,'2013-10-28 12:56:33');

/*Table structure for table `tp_basic_car_driver` */

DROP TABLE IF EXISTS `tp_basic_car_driver`;

CREATE TABLE `tp_basic_car_driver` (
  `cdid` bigint(20) unsigned NOT NULL auto_increment COMMENT '车辆驾驶员id',
  `carid` bigint(20) default NULL COMMENT '车辆id',
  `driverid` bigint(20) default NULL COMMENT '驾驶员id',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`cdid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆驾驶员关系表';

/*Data for the table `tp_basic_car_driver` */

/*Table structure for table `tp_basic_company` */

DROP TABLE IF EXISTS `tp_basic_company`;

CREATE TABLE `tp_basic_company` (
  `comid` bigint(20) NOT NULL auto_increment COMMENT '企业id',
  `comname` varchar(1024) NOT NULL COMMENT '单位名称',
  `loginname` varchar(50) default NULL COMMENT '登录名',
  `password` varchar(50) default NULL COMMENT '登录密码',
  `typeid` bigint(20) NOT NULL default '3' COMMENT '对象类型id',
  `phone` varchar(16) default NULL COMMENT '固定电话',
  `mobile` varchar(16) default NULL COMMENT '手机',
  `linkname` varchar(64) default NULL COMMENT '联系人',
  `linkmobile` varchar(16) default NULL COMMENT '手机',
  `addres` varchar(1024) default NULL COMMENT '联系地址',
  `pid` bigint(20) default NULL COMMENT '所在父类公司id',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  `safenum` bigint(20) NOT NULL default '0' COMMENT '安全组个数',
  PRIMARY KEY  (`comid`)
) ENGINE=InnoDB AUTO_INCREMENT=237 DEFAULT CHARSET=utf8 COMMENT='企业管理';

/*Data for the table `tp_basic_company` */

insert  into `tp_basic_company`(`comid`,`comname`,`loginname`,`password`,`typeid`,`phone`,`mobile`,`linkname`,`linkmobile`,`addres`,`pid`,`operid`,`opertime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`,`macaddr`,`safenum`) values (235,'德邦物流','德邦物流','123456',3,'0571-85188528',NULL,'小刘',NULL,'',0,0,'2013-11-08 11:53:28',1,'','2013-11-01 13:19:19',0,NULL,NULL,0),(236,'顺丰快递','顺丰小何','123456',3,'0571-85188528',NULL,'小何',NULL,'',0,0,'2013-11-08 13:24:38',1,'','2013-11-08 13:24:38',0,NULL,NULL,0);

/*Table structure for table `tp_basic_driver` */

DROP TABLE IF EXISTS `tp_basic_driver`;

CREATE TABLE `tp_basic_driver` (
  `id` bigint(20) NOT NULL auto_increment COMMENT '驾驶员id',
  `dwid` bigint(20) NOT NULL default '0' COMMENT '所在单位id',
  `typeid` bigint(20) NOT NULL default '1' COMMENT '对象类型id',
  `loginname` varchar(50) default NULL COMMENT '登录账号',
  `password` varchar(50) default NULL COMMENT '登录密码',
  `telephone` varchar(16) default NULL COMMENT '电话',
  `name` varchar(64) default NULL COMMENT '姓名',
  `address` varchar(1024) default NULL COMMENT '地址',
  `areaid` bigint(20) default NULL COMMENT '籍贯',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  `cartype` varchar(512) default NULL COMMENT '准驾车型',
  `certificationtime` datetime default NULL COMMENT '年审日期',
  `validtime` datetime default NULL COMMENT '有效日期',
  `identitycard` varchar(50) default NULL COMMENT '身份证号码',
  `sex` varchar(10) default NULL COMMENT '性别',
  `age` int(10) default NULL,
  `licenseno` varchar(50) default NULL COMMENT '驾驶证号码',
  `updatetime` datetime default NULL COMMENT '更新时间',
  `learntime` varchar(20) default '0' COMMENT '安全教育学习时间',
  `cars` varchar(1024) default NULL COMMENT '管理的车辆',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=304 DEFAULT CHARSET=utf8 COMMENT='驾驶员';

/*Data for the table `tp_basic_driver` */

insert  into `tp_basic_driver`(`id`,`dwid`,`typeid`,`loginname`,`password`,`telephone`,`name`,`address`,`areaid`,`operid`,`opertime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`,`macaddr`,`cartype`,`certificationtime`,`validtime`,`identitycard`,`sex`,`age`,`licenseno`,`updatetime`,`learntime`,`cars`) values (295,235,1,'刘欢','123456','0571-85188528','刘欢','浙江杭州拱墅区',NULL,0,'2013-11-01 15:22:50',1,'',NULL,NULL,NULL,NULL,'B1','2013-11-01 15:22:50','2013-11-01 15:22:50','12132131313132','男',34,'wqw4665w54','2013-11-01 15:22:50','15','浙A3303;'),(297,235,1,'小刘','123456','0571-85188528','小刘','浙江杭州拱墅区',NULL,362,'2013-11-05 13:08:33',1,'',NULL,NULL,NULL,NULL,'B1','2013-11-05 13:08:33','2013-11-05 13:08:33','222222222222222222','男',22,'wqw4665w54','2013-11-05 13:08:33','16','浙D0032;'),(298,236,1,'张红','123456','010-88158825','张红','',NULL,NULL,'2013-11-08 13:25:50',1,'',NULL,NULL,NULL,NULL,'B1','2013-11-08 13:57:34','2013-11-08 13:57:34','9211011','女',33,'wqw4665w54','2013-11-08 13:57:34','0',NULL),(299,236,1,'张翰','123456','0571-85188528','张翰','',NULL,0,'2013-11-08 13:27:00',1,'',NULL,NULL,NULL,NULL,'A1','2013-11-08 13:27:00','2013-11-08 13:27:00','12132131313132','男',37,'wqw4665w54','2013-11-08 13:27:00','0',NULL),(300,236,1,'刘涛','123456','123456','刘涛','浙江杭州拱墅区',NULL,0,'2013-11-08 13:27:42',1,'',NULL,NULL,NULL,NULL,'C1','2013-11-08 13:27:42','2013-11-08 13:27:42','9211011','男',22,'wqw4665w54','2013-11-08 13:27:42','0',NULL),(301,236,1,'陈聪','123456','123456','陈聪','',NULL,0,'2013-11-08 13:28:30',1,'',NULL,NULL,NULL,NULL,'B1','2013-11-08 13:28:30','2013-11-08 13:28:30','9211011','男',32,'wqw4665w54','2013-11-08 13:28:30','0',NULL),(302,235,1,'谢峰','123456','0571-85188528','谢峰','',NULL,0,'2013-11-08 13:30:06',1,'',NULL,NULL,NULL,NULL,'C1','2013-11-08 13:30:06','2013-11-08 13:30:06','9211011','男',43,'wqw4665w54','2013-11-08 13:30:06','0',NULL),(303,236,1,'李兴','123456','123456','李兴','',NULL,0,'2013-11-08 13:31:23',1,'',NULL,NULL,NULL,NULL,'B1','2013-11-08 13:31:23','2013-11-08 13:31:23','9211011','男',27,'wqw4665w54','2013-11-08 13:31:23','0',NULL);

/*Table structure for table `tp_basic_police` */

DROP TABLE IF EXISTS `tp_basic_police`;

CREATE TABLE `tp_basic_police` (
  `id` bigint(20) NOT NULL auto_increment,
  `orgid` bigint(20) NOT NULL COMMENT '所属单位id',
  `typeid` bigint(20) NOT NULL COMMENT '对象类型id',
  `telephone` varchar(11) default NULL COMMENT '电话号码',
  `name` varchar(20) default NULL COMMENT '姓名',
  `addres` varchar(100) default NULL COMMENT '联系地址',
  `areaid` bigint(20) default NULL COMMENT '籍贯',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  `sex` varchar(10) default NULL COMMENT '性别',
  `pno` varchar(100) default NULL COMMENT '交警内部编号',
  `identitycard` varchar(50) default NULL COMMENT '身份证号码',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=327 DEFAULT CHARSET=utf8 COMMENT='交警';

/*Data for the table `tp_basic_police` */

insert  into `tp_basic_police`(`id`,`orgid`,`typeid`,`telephone`,`name`,`addres`,`areaid`,`operid`,`opertime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`,`macaddr`,`sex`,`pno`,`identitycard`) values (324,2,2,'','陈大','',200,0,'2013-10-22 13:49:35',1,'',NULL,NULL,NULL,NULL,'男','9211011','9211011'),(325,2,2,'','王黎源','',200,0,'2013-10-22 13:50:37',1,'',NULL,NULL,NULL,NULL,'男','9211011','921101111'),(326,3,2,'','沈一骏','',200,0,'2013-11-08 10:57:21',1,'',NULL,NULL,NULL,NULL,'男','2013','2013');

/*Table structure for table `tp_basic_policeorg` */

DROP TABLE IF EXISTS `tp_basic_policeorg`;

CREATE TABLE `tp_basic_policeorg` (
  `id` bigint(20) NOT NULL auto_increment,
  `orgname` varchar(1024) NOT NULL COMMENT '单位名称',
  `typeid` bigint(20) NOT NULL default '5' COMMENT '对象类型id',
  `phone` varchar(16) default NULL COMMENT '固定电话',
  `address` varchar(1024) default NULL COMMENT '联系地址',
  `areaid` bigint(20) default NULL COMMENT '所属区域',
  `pid` bigint(20) default NULL COMMENT '所在父类机构id',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='交警机构';

/*Data for the table `tp_basic_policeorg` */

insert  into `tp_basic_policeorg`(`id`,`orgname`,`typeid`,`phone`,`address`,`areaid`,`pid`,`operid`,`opertime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`,`macaddr`) values (1,'杭州市公安局交通警察支队',0,'0571-85188528','浙江杭州下城区',150,0,0,'2014-01-03 09:05:39',1,'','2013-10-02 17:17:36',NULL,NULL,NULL),(2,'下沙交警大队',0,'0571-85188528','浙江杭州下沙经济开发区',200,1,0,'2013-10-23 08:35:34',1,'','2013-10-02 17:17:43',NULL,NULL,NULL),(3,'白杨中队',0,'0571-85188528','浙江下沙经济开发区',200,2,0,'2013-10-21 15:30:18',1,'','2013-10-02 17:17:45',NULL,NULL,NULL),(4,'二号路快速处理点',0,'15117963215','浙江杭州',200,3,0,'2013-10-05 16:52:31',1,'','2013-10-02 17:17:49',NULL,NULL,NULL);

/*Table structure for table `tp_basic_porg_company` */

DROP TABLE IF EXISTS `tp_basic_porg_company`;

CREATE TABLE `tp_basic_porg_company` (
  `pcid` bigint(20) unsigned NOT NULL auto_increment COMMENT '交警部门与公司id',
  `orgid` bigint(20) default NULL COMMENT '交警部门id',
  `comid` bigint(20) default NULL COMMENT '货运公司id',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态，0表示该条记录已经被删除',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`pcid`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

/*Data for the table `tp_basic_porg_company` */

insert  into `tp_basic_porg_company`(`pcid`,`orgid`,`comid`,`operid`,`opertime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`,`macaddr`) values (1,3,200,0,'2013-10-23 09:06:38',1,'0000','2013-09-22 15:17:17',100,'127.0.0.1',NULL),(2,2,206,100,'2013-09-23 16:54:51',1,'11','2013-09-23 16:54:52',100,NULL,NULL),(3,2,1,100,'2013-09-23 17:19:03',1,'1','2013-09-23 17:19:03',100,NULL,NULL),(4,2,217,0,'2013-10-24 17:33:27',1,'为人民……','2013-09-23 17:25:02',100,NULL,NULL),(5,3,218,0,'2013-10-23 12:32:28',1,'0.011','2013-09-24 09:58:27',100,NULL,NULL),(6,3,205,100,'2013-09-24 10:08:33',1,'0000','2013-09-24 10:08:40',100,NULL,NULL),(7,3,219,100,'2013-09-24 13:43:30',1,'1','2013-09-24 13:43:16',100,NULL,NULL),(8,1,220,100,'2013-09-24 17:40:41',1,'','2013-09-24 17:40:41',100,NULL,NULL),(9,1,221,100,'2013-09-25 11:12:35',1,'','2013-09-25 11:12:35',100,NULL,NULL),(10,1,222,100,'2013-09-26 09:42:30',1,'','2013-09-26 09:42:30',100,NULL,NULL),(11,2,223,0,'2013-10-23 09:06:52',1,'','2013-09-26 10:59:43',100,NULL,NULL),(12,1,224,0,'2013-10-23 08:46:39',1,'','2013-09-26 13:20:08',100,NULL,NULL),(13,1,225,0,'2013-10-31 09:52:23',1,'','2013-09-26 13:26:40',100,NULL,NULL),(14,3,226,0,'2013-10-04 14:34:19',1,'','2013-10-04 14:34:19',0,NULL,NULL),(15,2,227,0,'2013-10-23 08:45:45',1,'','2013-10-15 16:34:41',0,NULL,NULL),(16,3,228,0,'2013-10-18 12:37:56',1,'','2013-10-18 12:37:56',0,NULL,NULL),(17,2,229,0,'2013-10-23 09:07:01',1,'','2013-10-23 08:47:56',0,NULL,NULL),(18,2,230,0,'2013-10-23 09:07:24',1,'','2013-10-23 09:07:24',0,NULL,NULL),(19,0,231,353,'2013-11-01 08:38:37',1,'','2013-11-01 08:38:37',353,NULL,NULL),(20,0,232,353,'2013-11-01 08:43:31',1,'','2013-11-01 08:43:31',353,NULL,NULL),(21,0,233,0,'2013-11-01 09:01:22',1,'','2013-11-01 08:55:59',353,NULL,NULL),(22,0,234,353,'2013-11-01 09:08:02',1,'','2013-11-01 09:08:02',353,NULL,NULL),(23,1,235,0,'2013-11-08 11:53:28',1,'','2013-11-01 13:19:19',0,NULL,NULL),(24,2,236,0,'2013-11-08 13:24:39',1,'','2013-11-08 13:24:39',0,NULL,NULL);

/*Table structure for table `tp_edu_publicity` */

DROP TABLE IF EXISTS `tp_edu_publicity`;

CREATE TABLE `tp_edu_publicity` (
  `id` bigint(20) unsigned NOT NULL auto_increment COMMENT '宣传教育id',
  `pub_type` int(4) default NULL COMMENT '宣传类型/ 宣传教育/法规教育',
  `pub_title` blob COMMENT '宣传标题',
  `pub_time` datetime default NULL COMMENT '宣传发布时间',
  `pub_content_url` varchar(100) default NULL COMMENT '宣传内容地址url',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='宣传教育';

/*Data for the table `tp_edu_publicity` */

/*Table structure for table `tp_edu_video` */

DROP TABLE IF EXISTS `tp_edu_video`;

CREATE TABLE `tp_edu_video` (
  `id` bigint(20) NOT NULL auto_increment COMMENT 'id主键',
  `video_type` int(4) default NULL COMMENT '视频类型',
  `video_title` varchar(100) default NULL COMMENT '宣传视频标题',
  `content` text COMMENT '视频简介',
  `video_release_time` datetime default NULL COMMENT '宣传视屏发布时间',
  `video_url` varchar(500) default NULL COMMENT '视频播放地址',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  `img` varchar(100) default NULL COMMENT '图文中的图片',
  `updatetime` datetime default NULL COMMENT '更新时间',
  `fileName` varchar(50) default NULL COMMENT '视频的实际名称',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10028 DEFAULT CHARSET=utf8 COMMENT='视频管理';

/*Data for the table `tp_edu_video` */

insert  into `tp_edu_video`(`id`,`video_type`,`video_title`,`content`,`video_release_time`,`video_url`,`operid`,`opertime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`,`macaddr`,`img`,`updatetime`,`fileName`) values (10021,NULL,'关注中小学安全','关注中小学安全','2013-10-09 10:08:10','/TrafficPolice/page/admin/video/media/1381298059871.mp4',0,'2013-10-09 10:08:10',1,'关注中小学安全','2013-10-09 10:08:10',NULL,NULL,NULL,'/TrafficPolice/page/admin/video/img/xueshengjpg.jpg','2013-10-09 10:08:10','关注中小学生安全安全教育进校园.mp4'),(10022,NULL,'交通安全教育','交通事故一直都是当今社会的一大难题，如何使得这个经济，政治文化快速发展的时代，交通事故不在成为威胁人类安全，交通安全教育刻不容缓','2013-10-09 10:20:58','/TrafficPolice/page/admin/video/media/1381538550346.mp4',0,'2013-10-09 10:20:58',1,'交通安全教育','2013-10-09 10:20:58',NULL,NULL,NULL,'/TrafficPolice/page/admin/video/img/anquan.jpg','2013-10-09 10:20:58','交通安全教育.mp4'),(10026,NULL,'机动车驾驶教育','机动车驾驶教育','2013-11-08 14:54:34','/TrafficPolice/page/admin/video/media/1383893666756.mp4',0,'2013-11-08 14:54:34',0,'','2013-11-08 14:54:34',NULL,NULL,NULL,'/TrafficPolice/page/admin/video/img/1383893666756.jpg','2013-11-08 14:54:34','jdc.mp4'),(10027,NULL,'11111','11111','2013-11-08 15:28:33','/TrafficPolice/page/admin/video/media/1383895710250.mp4',0,'2013-11-08 15:28:33',0,'','2013-11-08 15:28:33',NULL,NULL,NULL,'/TrafficPolice/page/admin/video/img/1383895710250.jpg','2013-11-08 15:28:33','1381538550346.mp4');

/*Table structure for table `tp_exp_event` */

DROP TABLE IF EXISTS `tp_exp_event`;

CREATE TABLE `tp_exp_event` (
  `id` bigint(20) NOT NULL auto_increment COMMENT 'id主键',
  `user_id` bigint(20) NOT NULL COMMENT '曝光者id',
  `exp_title` varchar(100) default NULL COMMENT '曝光标题',
  `exp_time` datetime default NULL COMMENT '曝光时间',
  `exp_describe` varchar(200) default NULL COMMENT '曝光事件描述',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='曝光台';

/*Data for the table `tp_exp_event` */

/*Table structure for table `tp_exp_picture_and_record` */

DROP TABLE IF EXISTS `tp_exp_picture_and_record`;

CREATE TABLE `tp_exp_picture_and_record` (
  `id` bigint(20) NOT NULL auto_increment,
  `type` int(4) default NULL COMMENT '照片/录音',
  `time` datetime default NULL COMMENT '拍照录音时间',
  `filename` varchar(100) default NULL COMMENT '照片/录音文件名称',
  `content` blob COMMENT '存取照片/录音的内容',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='现场拍照';

/*Data for the table `tp_exp_picture_and_record` */

/*Table structure for table `tp_f2f_message` */

DROP TABLE IF EXISTS `tp_f2f_message`;

CREATE TABLE `tp_f2f_message` (
  `id` bigint(20) NOT NULL auto_increment,
  `type` int(4) default NULL COMMENT '消息类型',
  `content` varchar(255) default NULL COMMENT '消息类型',
  `send_id` bigint(20) default NULL COMMENT '发送者ID',
  `receive_id` bigint(20) default NULL COMMENT '接受者ID',
  `send_time` datetime default NULL COMMENT '发送时间',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='面对面';

/*Data for the table `tp_f2f_message` */

/*Table structure for table `tp_global_acccontent` */

DROP TABLE IF EXISTS `tp_global_acccontent`;

CREATE TABLE `tp_global_acccontent` (
  `accconid` bigint(20) NOT NULL auto_increment COMMENT '附件内容id',
  `accconname` varchar(256) default NULL COMMENT '上传文件名称',
  `accpath` varchar(512) default NULL COMMENT '现在文件名称',
  `filecontent` blob COMMENT '文件内容',
  `accid` bigint(20) default NULL COMMENT '附件id（tp_global_accessory）',
  `filesize` varchar(128) default NULL COMMENT '文件大小（带单位）',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`accconid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_global_acccontent` */

/*Table structure for table `tp_global_accessory` */

DROP TABLE IF EXISTS `tp_global_accessory`;

CREATE TABLE `tp_global_accessory` (
  `accid` bigint(20) default NULL COMMENT '附件id',
  `accname` varchar(256) default NULL COMMENT '附件名称',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_global_accessory` */

/*Table structure for table `tp_global_type` */

DROP TABLE IF EXISTS `tp_global_type`;

CREATE TABLE `tp_global_type` (
  `typeid` bigint(20) NOT NULL auto_increment,
  `typename` varchar(1024) NOT NULL COMMENT '账号类型名称',
  `groupid` bigint(20) default NULL COMMENT '分组id',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`typeid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `tp_global_type` */

insert  into `tp_global_type`(`typeid`,`typename`,`groupid`,`operid`,`opertime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`,`macaddr`) values (1,'交警部门支队',NULL,100,'2013-10-11 13:31:31',1,'交警部门下面的一个支队','2013-09-26 09:08:38',NULL,NULL,NULL),(2,'交通警察',NULL,100,'2013-09-10 09:08:21',1,NULL,'2013-09-26 09:08:42',NULL,NULL,NULL),(3,'货运企业',NULL,100,'2013-10-11 13:36:41',1,'管理本货运公司内部所有人员，车辆信息，包括数据的增删改查','2013-09-26 09:08:44',NULL,NULL,NULL),(4,'交通协管员',NULL,100,'2013-09-26 09:08:27',1,NULL,'2013-09-26 09:08:47',NULL,NULL,NULL),(5,'交警部门总队',NULL,100,'2013-10-11 13:32:22',1,'杭州市公安局交警部门总队','2013-09-26 09:08:50',NULL,NULL,NULL),(6,'系统管理员',NULL,100,'2013-10-11 13:35:23',1,'对交警部门，货运企业中所有的数据进行查看，添加，修改，删除','2013-09-26 09:08:52',NULL,NULL,NULL),(7,'安全组组长',NULL,100,'2013-10-11 13:33:36',1,'各企业下安全组的组长，管理本组驾驶员，车辆的信息','2013-09-26 09:08:54',NULL,NULL,NULL),(10,'驾驶员',NULL,NULL,'2013-10-11 13:28:15',1,'企业下面的驾驶员','2013-10-04 11:48:57',NULL,NULL,NULL),(11,'驾驶员1',NULL,NULL,'2013-10-04 11:50:04',0,'','2013-10-04 11:50:04',NULL,NULL,NULL);

/*Table structure for table `tp_interchange_answer` */

DROP TABLE IF EXISTS `tp_interchange_answer`;

CREATE TABLE `tp_interchange_answer` (
  `aid` bigint(20) unsigned NOT NULL auto_increment COMMENT '问题回答id',
  `qid` bigint(20) default NULL COMMENT '问题id',
  `answer` varchar(1024) default NULL COMMENT '回答问题内容',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态位',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `tp_interchange_answer` */

insert  into `tp_interchange_answer`(`aid`,`qid`,`answer`,`operid`,`opertime`,`state`,`ipaddr`,`macaddr`) values (1,1,'最近秋高气爽，比较适合旅游',0,'2013-09-04 13:42:45',1,NULL,NULL),(2,2,'现在安全问题存在严重隐患,比较引起相关部门的高度重视!ffff',0,'2013-10-10 14:53:42',1,NULL,NULL),(3,1,'最近秋高气爽，比较适合旅游333333',0,'2013-09-17 11:17:14',1,NULL,NULL),(4,1,'sss',0,'2013-09-17 12:58:49',1,NULL,NULL),(5,1,'ffffff',0,'2013-09-17 13:06:26',1,NULL,NULL),(6,2,'eeeee历史的记录',0,'2013-09-17 14:28:52',0,NULL,NULL),(7,1,'今天天气好晴朗,处处好风光,好风光……………………',0,'2013-09-17 13:52:37',1,NULL,NULL),(8,2,'到达',0,'2013-09-29 10:50:18',0,NULL,NULL),(9,2,'ddd',0,'2013-10-10 14:53:49',1,NULL,NULL);

/*Table structure for table `tp_interchange_question` */

DROP TABLE IF EXISTS `tp_interchange_question`;

CREATE TABLE `tp_interchange_question` (
  `qid` bigint(20) unsigned NOT NULL auto_increment COMMENT '问题id',
  `question` varchar(512) default NULL COMMENT '问题',
  `opertime` datetime default NULL COMMENT '操作时间',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `state` tinyint(1) default '1' COMMENT '状态位',
  `remark` varchar(512) default NULL COMMENT '备注说明',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`qid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `tp_interchange_question` */

insert  into `tp_interchange_question`(`qid`,`question`,`opertime`,`operid`,`state`,`remark`,`ipaddr`,`macaddr`) values (1,'最近天气如何？','2013-09-04 13:41:30',0,1,NULL,NULL,NULL),(2,'为什么要进行安全教育','2013-09-05 11:38:20',0,1,NULL,NULL,NULL);

/*Table structure for table `tp_micro_micromessage` */

DROP TABLE IF EXISTS `tp_micro_micromessage`;

CREATE TABLE `tp_micro_micromessage` (
  `id` bigint(20) unsigned NOT NULL auto_increment COMMENT '微信id',
  `microid` bigint(20) default NULL COMMENT '微信发布者id',
  `microname` varchar(512) default NULL COMMENT '微信发布者名称',
  `content` varchar(1024) default NULL COMMENT '微信内容',
  `state` tinyint(1) default '1' COMMENT '状态位',
  `createtime` datetime default NULL COMMENT '微信发布时间',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `tp_micro_micromessage` */

insert  into `tp_micro_micromessage`(`id`,`microid`,`microname`,`content`,`state`,`createtime`,`ipaddr`,`macaddr`) values (1,1,'下沙交警大队','这是新开通的微信，欢迎大家进行交流？',1,'2013-09-09 15:14:23',NULL,NULL),(2,2,'访问用户1','呵呵，过来逛逛',1,'2013-09-09 15:14:56',NULL,NULL),(3,3,'访问用户2','我也来了',1,'2013-09-09 15:15:16',NULL,NULL);

/*Table structure for table `tp_onlineexam_exam` */

DROP TABLE IF EXISTS `tp_onlineexam_exam`;

CREATE TABLE `tp_onlineexam_exam` (
  `exam_id` bigint(20) NOT NULL auto_increment COMMENT '考试id',
  `exam_name` varchar(255) default NULL COMMENT '考试名称',
  `exam_start` datetime default NULL COMMENT '开考开始时间',
  `exam_end` datetime default NULL COMMENT '开考结束时间',
  `exam_time` int(11) default NULL COMMENT '考试时间(单位:秒)',
  `trainrecord_id` bigint(20) default NULL COMMENT '培训记录id',
  `type` int(11) default NULL COMMENT '1：纸质2：电子',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_onlineexam_exam` */

/*Table structure for table `tp_onlineexam_exam_answer` */

DROP TABLE IF EXISTS `tp_onlineexam_exam_answer`;

CREATE TABLE `tp_onlineexam_exam_answer` (
  `answer_id` bigint(20) NOT NULL auto_increment,
  `examresult_id` bigint(20) default NULL COMMENT '考试结果记录id',
  `question_id` bigint(20) default NULL COMMENT '问题id',
  `user_answer` varchar(255) default NULL COMMENT '考生答案',
  `user_point` varchar(255) default NULL COMMENT '考生得分',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`answer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_onlineexam_exam_answer` */

/*Table structure for table `tp_onlineexam_exam_config` */

DROP TABLE IF EXISTS `tp_onlineexam_exam_config`;

CREATE TABLE `tp_onlineexam_exam_config` (
  `examconfig_id` bigint(20) NOT NULL auto_increment COMMENT '记录id',
  `single_amount` int(11) default NULL COMMENT '单选题数量',
  `single_point` int(11) default NULL COMMENT '单选题分数',
  `multi_amount` int(11) default NULL COMMENT '多选题数量',
  `multi_point` int(11) default NULL COMMENT '多选题分数',
  `determine_amount` int(11) default NULL COMMENT '判断题数量',
  `determine_point` int(11) default NULL COMMENT '判断题分数',
  `total_point` int(11) default NULL COMMENT '总分',
  `pass_point` int(11) default NULL COMMENT '合格分',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`examconfig_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_onlineexam_exam_config` */

/*Table structure for table `tp_onlineexam_exam_result` */

DROP TABLE IF EXISTS `tp_onlineexam_exam_result`;

CREATE TABLE `tp_onlineexam_exam_result` (
  `examresult_id` bigint(20) NOT NULL auto_increment COMMENT '考试成绩id',
  `point` int(11) default NULL COMMENT '考试分数',
  `result` int(11) default NULL COMMENT '1:合格 0：未考试 2：不合格',
  `cardno` varchar(255) default NULL COMMENT '准考证编号',
  `exam_id` bigint(20) default NULL COMMENT '考试id',
  `trdid` bigint(20) default NULL COMMENT '培训人员id',
  `point_type` int(11) default NULL COMMENT '1：人工录入 2：系统录入',
  `point_time` datetime default NULL COMMENT '成绩录入时间',
  `card_password` varchar(255) default NULL COMMENT '准考证登录密码',
  `nonexpire` int(11) default NULL COMMENT '准考证是否可用',
  `driver_id` bigint(20) default NULL COMMENT '驾驶员id',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`examresult_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_onlineexam_exam_result` */

/*Table structure for table `tp_onlineexam_question_option` */

DROP TABLE IF EXISTS `tp_onlineexam_question_option`;

CREATE TABLE `tp_onlineexam_question_option` (
  `question_option_id` bigint(20) NOT NULL auto_increment COMMENT '题目选项id',
  `question_id` bigint(20) default NULL COMMENT '考试题id',
  `option_name` varchar(255) default NULL COMMENT '选项名称',
  `option_value` varchar(255) default NULL COMMENT '选项内容',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`question_option_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_onlineexam_question_option` */

/*Table structure for table `tp_onlineexam_question_type` */

DROP TABLE IF EXISTS `tp_onlineexam_question_type`;

CREATE TABLE `tp_onlineexam_question_type` (
  `questiontype_id` bigint(20) NOT NULL auto_increment COMMENT '试卷题目大类id',
  `type_name` varchar(255) default NULL COMMENT '试题类型名称',
  `type_index` int(11) default NULL COMMENT '试题类型的顺序',
  `option_value` varchar(255) default NULL COMMENT '选项内容',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`questiontype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_onlineexam_question_type` */

/*Table structure for table `tp_onlineexam_testpaper` */

DROP TABLE IF EXISTS `tp_onlineexam_testpaper`;

CREATE TABLE `tp_onlineexam_testpaper` (
  `testpaper_id` bigint(20) NOT NULL auto_increment COMMENT ' 试卷id',
  `testpaper_name` varchar(255) default NULL COMMENT '试卷名称',
  `exam_id` bigint(20) default NULL COMMENT '考试Id',
  `total_point` int(11) default NULL COMMENT '总分',
  `pass_point` int(11) default NULL COMMENT '合格分',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`testpaper_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10001 DEFAULT CHARSET=utf8;

/*Data for the table `tp_onlineexam_testpaper` */

insert  into `tp_onlineexam_testpaper`(`testpaper_id`,`testpaper_name`,`exam_id`,`total_point`,`pass_point`,`operid`,`opertime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`,`macaddr`) values (10000,'测试',10000,100,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `tp_onlineexam_testpaper_exam` */

DROP TABLE IF EXISTS `tp_onlineexam_testpaper_exam`;

CREATE TABLE `tp_onlineexam_testpaper_exam` (
  `teid` bigint(20) NOT NULL auto_increment COMMENT '记录id',
  `testpaper_id` bigint(20) default NULL COMMENT '试卷id',
  `exam_id` bigint(20) default NULL COMMENT '考试Id',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`teid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_onlineexam_testpaper_exam` */

/*Table structure for table `tp_onlineexam_testpaper_question` */

DROP TABLE IF EXISTS `tp_onlineexam_testpaper_question`;

CREATE TABLE `tp_onlineexam_testpaper_question` (
  `teid` bigint(20) NOT NULL auto_increment COMMENT '记录Id',
  `testpaper_id` bigint(20) default NULL COMMENT '试卷id',
  `question_id` bigint(20) default NULL COMMENT '考试题id',
  `question_point` int(11) default NULL COMMENT '分值',
  `question_index` int(11) default NULL COMMENT '试题顺序',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`teid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_onlineexam_testpaper_question` */

/*Table structure for table `tp_reprimand` */

DROP TABLE IF EXISTS `tp_reprimand`;

CREATE TABLE `tp_reprimand` (
  `id` bigint(10) NOT NULL auto_increment COMMENT '主键',
  `pid` bigint(10) default NULL COMMENT '对应父类的id',
  `dwid` bigint(10) default NULL COMMENT '被通报批评的单位',
  `loginname` varchar(20) default NULL COMMENT '通报批评者',
  `time` datetime default NULL COMMENT '通报批评时间',
  `content` varchar(1024) default NULL COMMENT '通报批评内容',
  `flag` tinyint(2) default '0' COMMENT '标注通报批评的类型',
  `state` tinyint(2) default '1',
  `driverid` bigint(20) default '0' COMMENT '驾驶员id',
  `type` tinyint(2) default '0' COMMENT '标识批评的类型',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8;

/*Data for the table `tp_reprimand` */

insert  into `tp_reprimand`(`id`,`pid`,`dwid`,`loginname`,`time`,`content`,`flag`,`state`,`driverid`,`type`) values (60,59,235,'德邦物流','2013-11-05 08:34:31','扣一分',0,0,295,0),(61,59,235,'德邦物流','2013-11-05 08:48:12','',0,1,295,0),(62,0,235,'admin','2013-11-05 09:33:06','张三没有完成任务扣一分',1,1,0,1),(63,62,235,'德邦物流','2013-11-05 09:33:22','扣一分',0,1,295,0),(64,0,235,'德邦物流','2013-11-06 10:25:24','2013年11月6号，刘欢韦完成安全教育学习',0,1,0,1),(76,64,235,'德邦物流','2013-11-06 11:15:34','扣2分',0,0,295,0);

/*Table structure for table `tp_rule_illegal` */

DROP TABLE IF EXISTS `tp_rule_illegal`;

CREATE TABLE `tp_rule_illegal` (
  `id` bigint(20) NOT NULL auto_increment COMMENT 'id主键',
  `illegal_title` varchar(100) default NULL COMMENT '违法标题',
  `illegal_insert_time` datetime default NULL COMMENT '违法上报时间',
  `illegal_content` varchar(512) default NULL COMMENT '违法内容',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  `updatetime` datetime default NULL COMMENT '更新时间',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='违法';

/*Data for the table `tp_rule_illegal` */

insert  into `tp_rule_illegal`(`id`,`illegal_title`,`illegal_insert_time`,`illegal_content`,`operid`,`opertime`,`state`,`remark`,`ipaddr`,`macaddr`,`updatetime`) values (1,'驾驶安全设施不全的车辆上道路行驶','2013-07-17 13:35:19','驾驶安全设施不全的车辆上道路行驶',NULL,'2013-09-10 13:53:53',1,'',NULL,NULL,'2013-09-30 08:56:52'),(2,'用国家管制的精神药品或麻醉药品后驾驶机动车','2013-07-17 13:35:52','用国家管制的精神药品或麻醉药品后驾驶机动车',0,'2013-09-02 13:53:57',1,'',NULL,NULL,'2013-09-29 18:35:26'),(3,'逆向行驶','2013-07-17 13:36:01','逆向行驶是一种违反交通法则的事情',0,'2013-08-29 13:54:01',1,'',NULL,NULL,'2013-09-29 18:26:51'),(4,'没有划分中心线和机非分道的道路上不按规定行驶','2013-07-17 13:36:13','没有划分中心线和机非分道的道路上不按规定行驶',0,'2013-09-03 13:54:06',1,'',NULL,NULL,'2013-09-29 18:29:04'),(5,'违反禁令标志、警告标志、禁止禁线、警告标线指示','2013-07-17 13:36:28','违反禁令标志、警告标志、禁止禁线、警告标线指示',0,'2013-09-10 13:54:11',1,'',NULL,NULL,'2013-09-29 18:22:55'),(6,'机动车通过无交通信号控制路口未减速让行','2013-07-17 13:36:40','机动车通过无交通信号控制路口未减速让行',0,'2013-08-26 13:54:16',1,'',NULL,NULL,'2013-09-29 18:22:13'),(7,'驾驶营运客车在高速公路车道内停车水水水水','2013-07-17 13:36:50','驾驶营运客车在高速公路车道内停车',0,'2013-08-31 13:54:19',1,'无千无万',NULL,NULL,'2013-10-05 15:25:50'),(8,'驾驶公路客运车辆载人超过核定人数20%以上','2013-09-04 16:36:46','大的地方的所发生的水水水水',0,'2013-09-02 16:37:20',1,'',NULL,NULL,'2013-10-03 10:59:57'),(12,'公共场合抽烟','2013-09-12 17:06:29','公共场合抽烟是一种道德的行为',0,'2013-09-12 17:06:29',1,'公共场合抽烟',NULL,NULL,'2013-09-30 08:56:46'),(13,'闯黄灯也是一种违法','2013-11-08 14:23:40','闯黄灯也是一种违法',0,'2013-11-08 14:23:40',NULL,'',NULL,NULL,'2013-11-08 14:23:40');

/*Table structure for table `tp_rule_info` */

DROP TABLE IF EXISTS `tp_rule_info`;

CREATE TABLE `tp_rule_info` (
  `id` bigint(20) NOT NULL auto_increment COMMENT 'id主键',
  `rule_type` int(4) default '0' COMMENT '法规类型',
  `rule_title` varchar(100) default NULL COMMENT '法规标题',
  `rule_insert_time` datetime default NULL COMMENT '法规入库时间',
  `rule_content` text COMMENT '法规内容',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  `rule_url` varchar(100) default NULL,
  `updatetime` datetime default NULL COMMENT '更新时间',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10030 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='法规';

/*Data for the table `tp_rule_info` */

insert  into `tp_rule_info`(`id`,`rule_type`,`rule_title`,`rule_insert_time`,`rule_content`,`operid`,`opertime`,`state`,`remark`,`ipaddr`,`macaddr`,`rule_url`,`updatetime`) values (10015,1,'闯红灯，记6分。罚100元。','2013-09-11 09:09:36','公安部10月8日公布了最新修订的《机动车驾驶证申领和使用规定》，新交通规则严格了对驾驶员的管理。最新交通法规扣分细则也更为严格，闯红灯交通违法记分将由3分提高到6分，不挂号牌或遮挡号牌的一次就将扣光12分。\r\n\r\n最新交通法规中关于校车驾驶人管理的内容自发布之日起施行，其他规定将于2013年1月1日起正式施行。2013新交通规则提高了违法成本，记分项也由38项增加至52项。',0,'2013-09-01 08:27:54',1,'安全教育\r\n',NULL,NULL,'','2013-09-11 09:09:36'),(10016,1,'酒驾，扣12分。根据驾驶车辆和是否出事故等情况','2013-09-11 08:59:06','酒驾，扣12分。根据驾驶车辆和是否出事故等情况\r\n\r\n做出5年内不得再申领驾照、10年内不得再申领驾照、终身不的申领驾照处罚。',0,'2013-09-11 08:40:52',1,'网上散播谣言是一种违法行为',NULL,NULL,'','2013-09-11 08:59:06'),(10017,1,'不系安全带，记2分，罚100元','2013-09-11 13:45:19','从2012年7月起，7种摄录违法(非现场处罚)罚款+记分：(是摄录罚款)\r\n\r\n1、闯红灯，罚款200元.。\r\n\r\n2、不按导向车道行驶，罚款200元。\r\n\r\n3、违反禁止标线行驶，罚款100元。\r\n\r\n4、超速行车，罚款200元。\r\n\r\n5、机动车走非机动车车道，罚款100元。\r\n\r\n6、逆行，罚款200元。\r\n\r\n7、违停车，罚款200元。',0,'2013-09-11 09:28:22',0,'wwd',NULL,NULL,'www.baidu.com','2013-09-11 09:28:22'),(10018,1,'副驾驶不系安全带的，5元以上20元以下罚款。','2013-09-11 13:50:14','从2012年7月起，7种摄录违法(非现场处罚)罚款+记分：(是摄录罚款)\r\n\r\n1、闯红灯，罚款200元.。\r\n\r\n2、不按导向车道行驶，罚款200元。\r\n\r\n3、违反禁止标线行驶，罚款100元。\r\n\r\n4、超速行车，罚款200元。\r\n\r\n5、机动车走非机动车车道，罚款100元。\r\n\r\n6、逆行，罚款200元。\r\n\r\n7、违停车，罚款200元。',0,'2013-09-03 13:51:25',0,'交通事故',NULL,NULL,'www.baidu.com','2013-09-11 13:51:49'),(10021,0,'行驶途中拨打手机，记2分','2013-09-17 15:43:13','从2012年7月起，7种摄录违法(非现场处罚)罚款+记分：(是摄录罚款)\r\n\r\n1、闯红灯，罚款200元.。\r\n\r\n2、不按导向车道行驶，罚款200元。\r\n\r\n3、违反禁止标线行驶，罚款100元。\r\n\r\n4、超速行车，罚款200元。\r\n\r\n5、机动车走非机动车车道，罚款100元。\r\n\r\n6、逆行，罚款200元。\r\n\r\n7、违停车，罚款200元。',0,'2013-09-17 15:43:33',1,NULL,NULL,NULL,NULL,'2013-10-02 15:43:44'),(10022,0,'有意遮挡号牌，记12分','2013-09-15 15:48:07','从2012年7月起，7种摄录违法(非现场处罚)罚款+记分：(是摄录罚款)\r\n\r\n1、闯红灯，罚款200元.。\r\n\r\n2、不按导向车道行驶，罚款200元。\r\n\r\n3、违反禁止标线行驶，罚款100元。\r\n\r\n4、超速行车，罚款200元。\r\n\r\n5、机动车走非机动车车道，罚款100元。\r\n\r\n6、逆行，罚款200元。\r\n\r\n7、违停车，罚款200元。',0,'2013-09-15 15:48:07',0,'安全教育反反复复',NULL,NULL,'','2013-09-15 15:48:07'),(10023,0,'超速驾驶，根据超速车辆、行驶道路、超速50%、超速20%等具体情况，分别记12分、6分、3分','2013-09-15 15:50:05','从2012年7月起，7种摄录违法(非现场处罚)罚款+记分：(是摄录罚款)\r\n\r\n1、闯红灯，罚款200元.。\r\n\r\n2、不按导向车道行驶，罚款200元。\r\n\r\n3、违反禁止标线行驶，罚款100元。\r\n\r\n4、超速行车，罚款200元。\r\n\r\n5、机动车走非机动车车道，罚款100元。\r\n\r\n6、逆行，罚款200元。\r\n\r\n7、违停车，罚款200元。',0,'2013-09-15 15:50:05',0,'禁毒教育',NULL,NULL,'','2013-09-15 15:50:05'),(10024,0,'机动车驾驶人有下列违法行为之一，一次记12分','2013-09-25 10:25:14','1、闯红灯，罚款200元.。\r\n\r\n2、不按导向车道行驶，罚款200元。\r\n\r\n3、违反禁止标线行驶，罚款100元。\r\n\r\n4、超速行车，罚款200元。\r\n\r\n5、机动车走非机动车车道，罚款100元。\r\n\r\n6、逆行，罚款200元。\r\n\r\n7、违停车，罚款200元。\r\n\r\n机动车驾驶人有下列违法行为之一，一次记12分：\r\n\r\n（一）驾驶与准驾车型不符的机动车的；\r\n\r\n（二）饮酒后驾驶机动车的；\r\n\r\n（三）驾驶营运客车（不包括公共汽车）、校车载人超过核定人数20％以上的；\r\n\r\n（四）造成交通事故后逃逸，尚不构成犯罪的；\r\n\r\n（五）上道路行驶的机动车未悬挂机动车号牌的，或者故意遮挡、污损、不按规定安装机动车号牌的；\r\n\r\n（六）使用伪造、变造的机动车号牌、行驶证、驾驶证、校车标牌或者使用其他机动车号牌、行驶证的；\r\n\r\n（七）驾驶机动车在高速公路上倒车、逆行、穿越中央分隔带掉头的；\r\n\r\n（八）驾驶营运客车在高速公路车道内停车的；\r\n\r\n（九）驾驶中型以上载客载货汽车、校车、危险物品运输车辆在高速公路、城市快速路上行驶超过规定时速20％以上或者在高速公路、城市快速路以外的道路上行驶超过规定时速50％以上，以及驾驶其他机动车行驶超过规定时速50%以上的；\r\n\r\n（十）连续驾驶中型以上载客汽车、危险物品运输车辆超过4小时未停车休息或者停车休息时间少于20分钟的；\r\n\r\n（十一）未取得校车驾驶资格驾驶校车的。',0,'2013-09-25 10:25:14',1,'',NULL,NULL,'','2013-09-25 10:25:14'),(10025,0,'下述非现场处罚交通违法记6分','2013-09-25 10:45:17','1、机动车行驶超过规定时速50%以上\r\n\r\n2、高速公路行车道停车\r\n\r\n3、机动车在高速公路或城市快速路遇交通拥堵占用应急车道行驶',0,'2013-09-25 10:45:17',1,'',NULL,NULL,'','2013-09-25 10:45:17'),(10026,0,'下述非现场处罚交通违法记3分','2013-09-30 15:00:25','每位同学必须牢记如下行走安全常识:\r\n指挥灯信号\r\n绿灯亮时,准许行人通行;黄灯亮时,不准行人通行,但已进入人行道的行人,可以继续通行;红灯亮时,不准行人通行;黄灯闪烁时,行人须在确保安全的原则下通行。\r\n人行横道信号灯\r\n绿灯亮时,准许行人通过人行横道;绿灯闪烁时,不准行人进入人行横道,但已进入人行横道的可以继续通行;红灯亮时,不准行人进入人行横道。\r\n行人必须遵守的规定\r\n行人须在人行道内行走,没有人行道靠右边行走;穿越马路须走人行横道;通过有交通信号控制的人行横道,须遵守信号的规定;通过没有交通信号控制的人行道,要左顾右盼,注意车辆来往,不准追逐,奔跑;没有人行横道的,须直行通过,不准在车辆临近时突然横穿;有人行过街天桥或地道的,须走人行过街天桥或地道;不准爬马路边和路中的护栏、隔离栏,不准在道路上推扒车、追车、强行拦车或抛物击车。\r\n行走时,哪些情况最危险呢?\r\n(1)横穿马路很容易出危险。\r\n(2)三五成群横着走在非人行道上,这样最容易发生交通事故。\r\n(3)上、下班高峰过后,马路上车辆稀少,因为路中车少人稀思想麻痹。麻痹加麻痹就等于危险。\r\n1、违反交通信号灯通行。\r\n\r\n2、机动车行驶超过规定时速未达50% 。\r\n\r\n3、高速公路上驾驶机动车低于规定最低时速。\r\n\r\n4、禁止驶入高速公路机动车进入高速公路。\r\n\r\n5、违反禁令标志和禁止标线指示。\r\n\r\n6、不按规定超车和让行、逆行。',0,'2013-09-30 15:00:25',1,'',NULL,NULL,'','2013-09-30 15:00:25'),(10027,0,'下列交通违法行为一次记2分：','2013-09-30 15:03:34','（一）驾驶机动车行经交叉路口不按规定行车或者停车的；\r\n\r\n（二）驾驶机动车有拨打、接听手持电话等妨碍安全驾驶的行为的；\r\n\r\n（三）驾驶二轮摩托车，不戴安全头盔的；\r\n\r\n（四）驾驶机动车在高速公路或者城市快速路上行驶时，驾驶人未按规定系安全带的；\r\n\r\n（五）驾驶机动车遇前方机动车停车排队或者缓慢行驶时，借道超车或者占用对面车道、穿插等候车辆的；\r\n\r\n（六）不按照规定为校车配备安全设备，或者不按照规定对校车进行安全维护的；\r\n\r\n（七）驾驶校车运载学生，不按照规定放置校车标牌、开启校车标志灯，或者不按照经审核确定的线路行驶的；\r\n\r\n（八）校车上下学生，不按照规定在校车停靠站点停靠的；\r\n\r\n（九）校车未运载学生上道路行驶，使用校车标牌、校车标志灯和停车指示标志的；\r\n\r\n（十）驾驶校车上道路行驶前，未对校车车况是否符合安全技术要求进行检查，或者驾驶存在安全隐患的校车上道路行驶的；\r\n\r\n（十一）在校车载有学生时给车辆加油，或者在校车发动机引擎熄灭前离开驾驶座位的',0,'2013-09-30 15:03:34',1,'',NULL,NULL,'','2013-09-30 15:03:34'),(10028,0,'下述非现场处罚交通违法记1分：','2013-09-30 15:03:49','1、行经交口不按规定行车或停车。\r\n\r\n2、遇前车停车排队或缓行时借道超车或占用对面车道穿插等候车。',0,'2013-09-30 15:03:49',0,'',NULL,NULL,'','2013-10-05 15:48:17'),(10029,0,'','2013-10-28 16:51:37','',0,'2013-10-28 16:51:37',0,NULL,NULL,NULL,'','2013-10-28 16:51:37');

/*Table structure for table `tp_safegroup_cardriver` */

DROP TABLE IF EXISTS `tp_safegroup_cardriver`;

CREATE TABLE `tp_safegroup_cardriver` (
  `id` bigint(20) unsigned NOT NULL auto_increment COMMENT '主键',
  `dwid` bigint(20) default NULL COMMENT '单位id',
  `groupid` bigint(20) default NULL COMMENT '安全组id',
  `zzid` bigint(20) default NULL COMMENT '组长id',
  `carid` bigint(20) default NULL COMMENT '车辆id',
  `driverid` bigint(20) default NULL COMMENT '驾驶员id',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='车辆驾驶员关系表';

/*Data for the table `tp_safegroup_cardriver` */

insert  into `tp_safegroup_cardriver`(`id`,`dwid`,`groupid`,`zzid`,`carid`,`driverid`,`operid`,`opertime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`,`macaddr`) values (8,229,44,286,18,286,0,'2013-10-24 16:53:59',1,'','2013-10-24 16:53:59',NULL,NULL,NULL),(9,229,42,284,18,284,0,'2013-10-24 16:55:11',1,'','2013-10-24 16:55:12',NULL,NULL,NULL),(10,229,43,284,18,284,0,'2013-10-24 16:56:52',1,'','2013-10-24 16:56:52',NULL,NULL,NULL),(11,225,45,277,10,277,0,'2013-10-25 08:25:59',1,'','2013-10-25 08:25:59',NULL,NULL,NULL),(12,225,45,277,10,277,0,'2013-10-25 08:26:15',1,'','2013-10-25 08:26:15',NULL,NULL,NULL);

/*Table structure for table `tp_safegroup_driver_car` */

DROP TABLE IF EXISTS `tp_safegroup_driver_car`;

CREATE TABLE `tp_safegroup_driver_car` (
  `id` bigint(20) NOT NULL auto_increment,
  `groupid` bigint(20) NOT NULL COMMENT '安全组id',
  `zzid` bigint(20) NOT NULL COMMENT '组长id',
  `num` bigint(10) default NULL COMMENT '组员人数',
  `dwid` bigint(10) NOT NULL COMMENT '单位id',
  `driverid` varchar(1024) default NULL COMMENT '安全组下人员的id拼接的字符串',
  `drivers` varchar(1024) default NULL COMMENT '下属人员信息',
  `carid` varchar(1024) default NULL COMMENT '安全组下所有车辆的id拼接的字符串',
  `cars` varchar(1024) default NULL COMMENT '下属车辆',
  `operid` bigint(10) NOT NULL COMMENT '操作人id',
  `opertime` datetime NOT NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(1024) default NULL COMMENT '备注',
  `regtime` datetime NOT NULL COMMENT '注册时间',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  `regid` bigint(2) default NULL,
  `flag` bigint(2) default '1' COMMENT '标记改组人员，车辆是否已经分配',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

/*Data for the table `tp_safegroup_driver_car` */

insert  into `tp_safegroup_driver_car`(`id`,`groupid`,`zzid`,`num`,`dwid`,`driverid`,`drivers`,`carid`,`cars`,`operid`,`opertime`,`state`,`remark`,`regtime`,`ipaddr`,`macaddr`,`regid`,`flag`) values (29,42,285,NULL,229,'285#','顺丰小张;','18#','浙A3303;',0,'2013-10-24 14:10:30',1,'','2013-10-24 14:10:30',NULL,NULL,NULL,1),(30,43,284,NULL,229,'284#','顺丰小李;','18#','浙A3303;',0,'2013-10-24 14:12:29',1,'','2013-10-24 14:12:29',NULL,NULL,NULL,1),(31,44,286,NULL,229,'286#','顺丰小胡;','18#','浙A3303;',0,'2013-10-24 16:27:30',1,'','2013-10-24 16:27:30',NULL,NULL,NULL,1),(32,45,277,NULL,225,'277#252#','张红;程亮;','10#11#','沪B8969;浙F1342;',0,'2013-10-25 08:25:43',1,'','2013-10-25 08:25:43',NULL,NULL,NULL,1);

/*Table structure for table `tp_safegrouplist` */

DROP TABLE IF EXISTS `tp_safegrouplist`;

CREATE TABLE `tp_safegrouplist` (
  `groupid` bigint(20) NOT NULL auto_increment COMMENT '安全组分组id',
  `groupname` varchar(20) NOT NULL COMMENT '安全组组名',
  `zzid` bigint(20) NOT NULL COMMENT '组长',
  `zzname` varchar(20) default NULL COMMENT '组长名字',
  `drivernum` bigint(10) default '0' COMMENT '安全组人数',
  `carnum` bigint(20) default NULL COMMENT '安全组车辆人数',
  `dwid` bigint(10) NOT NULL COMMENT '单位id',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(1024) default NULL COMMENT '备注',
  `operid` bigint(10) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '更新时间',
  `regtime` datetime default NULL COMMENT '添加时间',
  `regid` bigint(10) default NULL COMMENT '注册人id',
  `flag` bigint(2) default '1' COMMENT '标记改组是否已经进行人员，车辆的分配',
  PRIMARY KEY  (`groupid`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

/*Data for the table `tp_safegrouplist` */

insert  into `tp_safegrouplist`(`groupid`,`groupname`,`zzid`,`zzname`,`drivernum`,`carnum`,`dwid`,`state`,`remark`,`operid`,`opertime`,`regtime`,`regid`,`flag`) values (42,'顺丰快递A组',285,'顺丰小张',4,4,229,1,'',NULL,'2013-10-24 13:59:27','2013-10-24 13:59:27',NULL,0),(43,'顺丰快递B组',284,'顺丰小李',4,4,229,1,'',NULL,'2013-10-24 13:59:54','2013-10-24 13:59:54',NULL,0),(44,'顺丰安全组C组',286,'顺丰小胡',4,4,229,1,'',NULL,'2013-10-24 15:06:41','2013-10-24 15:06:41',NULL,0),(45,'企业组A组',277,'张红',1,2,225,1,'',NULL,'2013-10-25 08:24:17','2013-10-25 08:24:17',NULL,0);

/*Table structure for table `tp_safelearn` */

DROP TABLE IF EXISTS `tp_safelearn`;

CREATE TABLE `tp_safelearn` (
  `id` bigint(20) NOT NULL auto_increment,
  `videoid` bigint(20) default NULL COMMENT '视频id',
  `driverid` bigint(20) default NULL COMMENT '驾驶员id',
  `time` bigint(20) default NULL COMMENT '观看视频时间长度',
  `date` datetime default NULL COMMENT '观看视频的日期',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8;

/*Data for the table `tp_safelearn` */

insert  into `tp_safelearn`(`id`,`videoid`,`driverid`,`time`,`date`) values (103,10022,235,134,'2013-11-05 13:05:57'),(104,10022,297,16,'2013-11-05 13:09:25'),(105,10022,295,15,'2013-11-06 13:19:14');

/*Table structure for table `tp_sys_loginrecord` */

DROP TABLE IF EXISTS `tp_sys_loginrecord`;

CREATE TABLE `tp_sys_loginrecord` (
  `logsid` bigint(20) NOT NULL auto_increment,
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(2048) default NULL COMMENT '用户名称',
  `islogin` tinyint(1) default '0' COMMENT '是否登录',
  `loginname` varchar(1024) default NULL COMMENT '登录名称',
  `passwd` varchar(1024) default NULL COMMENT '登录密码',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`logsid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `tp_sys_loginrecord` */

insert  into `tp_sys_loginrecord`(`logsid`,`userid`,`username`,`islogin`,`loginname`,`passwd`,`operid`,`opertime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`,`macaddr`) values (1,100,'数据库管理员',1,'dbadmin','10470C3B4B1FED12C3BAAC014BE15FAC67C6E815',NULL,NULL,1,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `tp_sys_message` */

DROP TABLE IF EXISTS `tp_sys_message`;

CREATE TABLE `tp_sys_message` (
  `messid` bigint(20) NOT NULL auto_increment COMMENT '内部信息id',
  `titlename` varchar(128) NOT NULL COMMENT '标题',
  `content` blob COMMENT '信息内容',
  `ispublic` tinyint(1) default '0' COMMENT '是否发布',
  `messtype` varchar(64) NOT NULL COMMENT '信息类型',
  `senderid` bigint(20) NOT NULL COMMENT '发送者id(tp_sys_user)',
  `receiveerids` varchar(512) default NULL COMMENT '接收者ids',
  `sendtime` datetime default NULL COMMENT '送达时间',
  `accid` bigint(20) default NULL COMMENT '附件id(tp_global_accessory)',
  `receivernames` varchar(3072) default NULL COMMENT '接收者names',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`messid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_sys_message` */

/*Table structure for table `tp_sys_messagecontact` */

DROP TABLE IF EXISTS `tp_sys_messagecontact`;

CREATE TABLE `tp_sys_messagecontact` (
  `mcontactid` bigint(20) NOT NULL auto_increment COMMENT '信息来往id',
  `receiverid` bigint(20) default NULL COMMENT '接收者id（tp_sys_user）',
  `messid` bigint(20) default NULL COMMENT '信息id（tp_sys_message）',
  `receivedtype` bigint(20) default NULL COMMENT '接收者类型（0：接收者 1：抄送者）',
  `isread` bigint(20) default '0' COMMENT '是否已读 0：未读 1：已读',
  `readtime` datetime default NULL COMMENT '已读时间',
  `sendtime` datetime default NULL COMMENT '送达时间',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`mcontactid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_sys_messagecontact` */

/*Table structure for table `tp_sys_parameter` */

DROP TABLE IF EXISTS `tp_sys_parameter`;

CREATE TABLE `tp_sys_parameter` (
  `paraid` bigint(20) NOT NULL auto_increment,
  `paraname` varchar(512) NOT NULL COMMENT '参数名称',
  `paravalue` blob COMMENT '参数值',
  `isuse` tinyint(1) default '0' COMMENT '是否已经使用',
  `usecolor` varchar(64) default NULL COMMENT '使用颜色',
  `editflag` tinyint(1) default '0' COMMENT '是否能够修改',
  `deleteflag` tinyint(1) default '0' COMMENT '是否能够删除',
  `paratypename` varchar(512) NOT NULL COMMENT '参数类型名称',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT 'ip地址',
  `macaddr` varchar(512) default NULL COMMENT 'mac地址',
  PRIMARY KEY  (`paraid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_sys_parameter` */

/*Table structure for table `tp_sys_permission` */

DROP TABLE IF EXISTS `tp_sys_permission`;

CREATE TABLE `tp_sys_permission` (
  `perno` bigint(20) NOT NULL auto_increment COMMENT '权限主键',
  `pername` varchar(1024) NOT NULL COMMENT '权限名',
  `functions` varchar(1024) NOT NULL COMMENT '权限码',
  `parentid` bigint(20) default NULL COMMENT '父类权限',
  `operid` bigint(20) default NULL COMMENT '操作人id',
  `opertime` datetime default NULL COMMENT '操作时间',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(1024) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  `ipaddr` varchar(512) default NULL COMMENT '注册地址',
  PRIMARY KEY  (`perno`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

/*Data for the table `tp_sys_permission` */

insert  into `tp_sys_permission`(`perno`,`pername`,`functions`,`parentid`,`operid`,`opertime`,`state`,`remark`,`regtime`,`regid`,`ipaddr`) values (1,'权限分配','stationmanage',0,100,'2013-09-26 14:05:26',1,'权限分配','2013-09-26 10:22:30',NULL,NULL),(2,'参数配置','accountmanage',1,100,'2013-09-26 14:06:22',1,'参数配置','2013-09-26 10:23:08',NULL,NULL),(3,'网站信息','rolemanage',2,100,'2013-09-26 14:06:45',1,'网站信息','2013-09-26 10:26:08',NULL,NULL),(4,'系统管理','typenmanage',1,100,'2013-09-26 14:07:09',1,'系统管理','2013-09-26 10:37:49',NULL,NULL),(5,'角色管理','permisionmanage',4,100,'2013-09-26 14:07:44',1,'角色管理','2013-09-26 14:07:44',NULL,NULL),(6,'账号管理','rulenmanage',4,100,'2013-09-26 14:08:22',1,'账号管理','2013-09-26 14:08:22',NULL,NULL),(7,'权限管理','edunmanage',4,100,'2013-09-26 14:08:49',1,'权限管理','2013-09-26 14:08:49',NULL,NULL),(8,'地域管理','drivermanage',4,100,'2013-09-26 14:09:26',1,'地域管理','2013-09-26 14:09:26',NULL,NULL),(9,'机构管理','illegalmanage',4,100,'2013-09-26 14:10:07',1,'机构管理','2013-09-26 14:10:07',NULL,NULL),(10,'交通法规','branchmanage',1,100,'2013-09-26 14:10:36',1,'交通法规','2013-09-26 14:10:36',NULL,NULL),(11,'宣教中心','safenoticemanage',1,100,'2013-09-26 14:11:11',1,'宣教中心','2013-09-26 14:11:11',NULL,NULL),(12,'基本信息','meetnoticemanage',1,100,'2013-09-26 14:11:52',1,'基本信息','2013-09-26 14:11:52',NULL,NULL),(13,'交警部门','interchangemanage',12,100,'2013-09-26 14:12:50',1,'交警部门','2013-09-26 14:12:50',NULL,NULL),(14,'企业管理','micromessagemanage',12,100,'2013-09-26 14:13:22',1,'企业管理','2013-09-26 14:13:22',NULL,NULL),(15,'车辆管理','carmanage',12,100,'2013-09-26 14:14:15',1,'车辆管理','2013-09-26 14:14:15',NULL,NULL),(16,'驾驶员管理','companymanage',12,100,'2013-09-26 14:14:48',1,'驾驶员管理','2013-09-26 14:14:48',NULL,NULL),(17,'违法查询','areamanage',1,100,'2013-09-26 14:15:15',1,'违法查询','2013-09-26 14:15:15',NULL,NULL),(18,'快速点处理点','policemanage',1,100,'2013-09-26 14:15:55',1,'快速点处理点','2013-09-26 14:15:55',NULL,NULL),(19,'安全提醒','baseinfo',1,100,'2013-09-30 09:21:33',1,'安全提醒','2013-09-30 09:21:38',NULL,NULL),(20,'会议通知','editpassword',1,100,'2013-10-03 10:28:48',1,'会议通知','2013-10-03 10:29:10',NULL,NULL),(21,'问题互动','policeorgmanage',1,0,'2013-10-04 12:27:00',1,'问题互动','2013-10-03 10:32:20',NULL,NULL),(22,'微博互动','carlist',1,0,'2013-10-05 14:41:17',1,'微博互动','2013-10-03 10:37:36',NULL,NULL),(26,'车辆划归','safeGroupmanage',1,0,'2013-10-15 14:30:29',1,'车辆划归','2013-10-15 14:30:29',NULL,NULL),(27,'修改密码','policeorg',1,0,'2013-10-18 10:49:52',1,'修改密码','2013-10-18 10:50:03',NULL,NULL);

/*Table structure for table `tp_sys_user` */

DROP TABLE IF EXISTS `tp_sys_user`;

CREATE TABLE `tp_sys_user` (
  `userno` int(10) default NULL,
  `dwno` int(10) default NULL,
  `roleno` int(10) default NULL,
  `loginname` varchar(10) default NULL,
  `username` varchar(10) default NULL,
  `password` varchar(10) default NULL,
  `telephone` varchar(10) default NULL,
  `address` varchar(10) default NULL,
  `email` varchar(10) default NULL,
  `typeid` int(10) default NULL,
  `operid` int(10) default NULL,
  `opertime` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `remark` varchar(10) default NULL,
  `regtime` timestamp NOT NULL default '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_sys_user` */

/*Table structure for table `tp_traffic_notice` */

DROP TABLE IF EXISTS `tp_traffic_notice`;

CREATE TABLE `tp_traffic_notice` (
  `id` int(20) NOT NULL,
  `notice_type` int(2) NOT NULL,
  `notice_content` varchar(50) default NULL,
  `notice_title` varchar(10) default NULL,
  `notice_time` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `notice_content_url` varchar(50) default NULL,
  `operid` varchar(10) default NULL,
  `opertime` timestamp NOT NULL default '0000-00-00 00:00:00',
  `state` tinyint(1) default '1' COMMENT '状态',
  `remark` varchar(512) default NULL COMMENT '备注',
  `regtime` datetime default NULL COMMENT '注册时间',
  `regid` bigint(20) default NULL COMMENT '注册人id',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tp_traffic_notice` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
