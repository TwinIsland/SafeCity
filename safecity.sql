-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: safecity
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_bug`
--

DROP TABLE IF EXISTS `tb_bug`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_bug` (
  `bg_id` int NOT NULL,
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_bug`
--

LOCK TABLES `tb_bug` WRITE;
/*!40000 ALTER TABLE `tb_bug` DISABLE KEYS */;
INSERT INTO `tb_bug` VALUES (0,'蚊子','1天','人','人','Saks的离开','拉萨凯迪拉克','城门口经常看见','阿斯顿考虑考虑');
/*!40000 ALTER TABLE `tb_bug` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_event`
--

DROP TABLE IF EXISTS `tb_event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_event` (
  `ev_id` int NOT NULL,
  `ev_name` varchar(15) NOT NULL,
  `ev_date` date NOT NULL,
  `ev_status` int NOT NULL,
  `ev_img` varchar(60) NOT NULL,
  `ev_desc` varchar(60) NOT NULL,
  `ev_find` varchar(15) NOT NULL,
  `ev_type` varchar(15) NOT NULL,
  `ev_team` int NOT NULL,
  `ev_loss` float NOT NULL,
  `ev_area` float NOT NULL,
  `ev_suggestion` varchar(60) NOT NULL,
  `ev_suggestion_p` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ev_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_event`
--

LOCK TABLES `tb_event` WRITE;
/*!40000 ALTER TABLE `tb_event` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_expert`
--

DROP TABLE IF EXISTS `tb_expert`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_expert` (
  `ex_id` int NOT NULL,
  `ex_usrId` int NOT NULL,
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_expert`
--

LOCK TABLES `tb_expert` WRITE;
/*!40000 ALTER TABLE `tb_expert` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_expert` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_log`
--

DROP TABLE IF EXISTS `tb_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_log` (
  `lg_id` int NOT NULL AUTO_INCREMENT,
  `lg_content` varchar(100) NOT NULL,
  `lg_time` varchar(10) NOT NULL,
  PRIMARY KEY (`lg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8 COMMENT='table for log';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_log`
--

LOCK TABLES `tb_log` WRITE;
/*!40000 ALTER TABLE `tb_log` DISABLE KEYS */;
INSERT INTO `tb_log` VALUES (9,'登录账号：superadmin 【状态：成功】','2010271835'),(10,'登录账号：superadmin 【状态：成功】','2010271837'),(11,'登录账号：superadmin 【状态：成功】','2010271845'),(12,'登录账号：superadmin 【状态：成功】','2010271848'),(13,'登录账号：superadmin 【状态：成功】','2010271850'),(14,'登录账号：superadmin 【状态：成功】','2010271851'),(15,'登录账号：huang 【状态：失败】','2010271853'),(16,'登录账号：superadmin 【状态：成功】','2010271853'),(17,'登录账号：superadmin 【状态：成功】','2010271855'),(18,'登录账号：superadmin 【状态：成功】','2010271856'),(19,'登录账号：superadmin 【状态：成功】','2010271900'),(20,'登录账号：superadmin 【状态：成功】','2010271903'),(21,'登录账号：superadmin 【状态：成功】','2010271923'),(22,'登录账号：superadmin 【状态：成功】','2010271926'),(23,'登录账号：superadmin 【状态：成功】','2010271927'),(24,'登录账号：superadmi 【状态：失败】','2010280045'),(25,'登录账号： 【状态：失败】','2010280045'),(26,'登录账号：superadmin 【状态：成功】','2010280045'),(27,'注册账号：superadmin 【状态：失败】','2010280050'),(28,'注册账号：aa 【状态：成功】','2010280050'),(29,'登录账号：superadmin 【状态：成功】','2010280051'),(30,'注册账号：hty233 【状态：成功】','2010280052'),(31,'注册账号：hty114514 【状态：成功】','2010280055'),(32,'登录账号：superadmin 【状态：成功】','2010280100'),(33,'登录账号：superadmin 【状态：成功】','2010280101'),(34,'登录账号：superadmin 【状态：成功】','2010280247'),(35,'插入区域数据：null插入area：卡罗拉【状态：成功】','2010280301'),(36,'登录账号：superadmin 【状态：成功】','2010280302'),(37,'插入区域数据：zone22【状态：成功】','2010280303'),(38,'登录账号：superadmin 【状态：成功】','2010280304'),(39,'登录账号：superadmin 【状态：成功】','2010280305'),(40,'登录账号：superadmin 【状态：成功】','2010280309'),(41,'登录账号：superadmin 【状态：成功】','2010280311'),(42,'登录账号：superadmin 【状态：成功】','2010280313'),(43,'登录账号：superadmin 【状态：成功】','2010280314'),(44,'登录账号：superadmin 【状态：成功】','2010280322'),(45,'插入区域数据：【状态：失败】','2010280322'),(46,'登录账号：superadmin 【状态：成功】','2010280326'),(47,'登录账号：superadmin 【状态：成功】','2010281248'),(48,'登录账号：superadmin 【状态：成功】','2010281307'),(49,'登录账号：superadmin 【状态：成功】','2010281308'),(50,'登录账号：superadmin 【状态：成功】','2010281309'),(51,'登录账号：superadmin 【状态：成功】','2010281311'),(52,'登录账号：superadmin 【状态：成功】','2010281317');
/*!40000 ALTER TABLE `tb_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_medicament`
--

DROP TABLE IF EXISTS `tb_medicament`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_medicament` (
  `med_id` int NOT NULL AUTO_INCREMENT,
  `med_name` varchar(12) NOT NULL,
  `med_ptype` varchar(12) NOT NULL,
  `med_type` varchar(12) NOT NULL,
  `med_purpose` varchar(50) NOT NULL,
  `med_count` int NOT NULL,
  PRIMARY KEY (`med_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_medicament`
--

LOCK TABLES `tb_medicament` WRITE;
/*!40000 ALTER TABLE `tb_medicament` DISABLE KEYS */;
INSERT INTO `tb_medicament` VALUES (2,'阿莫西林','虫害','药剂','杀虫',100),(3,'滑石粉','鼠害','药剂','杀鼠',10),(8,'敌敌畏','鼠害','药剂','杀灭老鼠',50);
/*!40000 ALTER TABLE `tb_medicament` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_mouse`
--

DROP TABLE IF EXISTS `tb_mouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_mouse` (
  `ms_id` int NOT NULL,
  `ms_breed` varchar(15) NOT NULL,
  `ms_food` varchar(30) NOT NULL,
  `ms_enemy` varchar(30) NOT NULL,
  `ms_damage` varchar(30) NOT NULL,
  `ms_prevent` varchar(30) NOT NULL,
  `ms_img` varchar(30) NOT NULL,
  PRIMARY KEY (`ms_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_mouse`
--

LOCK TABLES `tb_mouse` WRITE;
/*!40000 ALTER TABLE `tb_mouse` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_mouse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_record`
--

DROP TABLE IF EXISTS `tb_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_record` (
  `rec_id` int NOT NULL,
  `rec_date` date NOT NULL,
  `rec_person` varchar(12) NOT NULL,
  `rec_result` varchar(20) NOT NULL,
  PRIMARY KEY (`rec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_record`
--

LOCK TABLES `tb_record` WRITE;
/*!40000 ALTER TABLE `tb_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_sickness`
--

DROP TABLE IF EXISTS `tb_sickness`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_sickness` (
  `sk_id` int NOT NULL,
  `sk_name` varchar(30) NOT NULL,
  `sk_cause` varchar(30) NOT NULL,
  `sk_pattern` varchar(30) NOT NULL,
  `sk_damange` varchar(30) NOT NULL,
  `sk_treat` varchar(30) NOT NULL,
  PRIMARY KEY (`sk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_sickness`
--

LOCK TABLES `tb_sickness` WRITE;
/*!40000 ALTER TABLE `tb_sickness` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_sickness` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_takelist`
--

DROP TABLE IF EXISTS `tb_takelist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_takelist` (
  `take_id` int NOT NULL AUTO_INCREMENT,
  `take_name` varchar(255) NOT NULL,
  `take_type` varchar(255) NOT NULL,
  `take_dtype` varchar(255) NOT NULL,
  `take_count` int NOT NULL,
  PRIMARY KEY (`take_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_takelist`
--

LOCK TABLES `tb_takelist` WRITE;
/*!40000 ALTER TABLE `tb_takelist` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_takelist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_team`
--

DROP TABLE IF EXISTS `tb_team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_team` (
  `tn_id` int NOT NULL,
  `zo_id` int DEFAULT NULL,
  `tn_name` varchar(15) NOT NULL,
  `tn_part` varchar(10) NOT NULL,
  `tn_num` int NOT NULL,
  `tn_tel` varchar(15) NOT NULL,
  `tn_date` date NOT NULL,
  PRIMARY KEY (`tn_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_team`
--

LOCK TABLES `tb_team` WRITE;
/*!40000 ALTER TABLE `tb_team` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_user`
--

DROP TABLE IF EXISTS `tb_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_user` (
  `u_id` int NOT NULL AUTO_INCREMENT,
  `u_name` varchar(12) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_level` varchar(12) DEFAULT NULL,
  `u_realname` varchar(12) NOT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_user`
--

LOCK TABLES `tb_user` WRITE;
/*!40000 ALTER TABLE `tb_user` DISABLE KEYS */;
INSERT INTO `tb_user` VALUES (1,'superadmin','943463a9f302f4fecccfc1d4ed2117f0','cj','张三'),(2,'zladmin','0828775892945249cdd5265c1a913c89','zl','李四'),(3,'zqadmin','0828775892945249cdd5265c1a913c89','zq','王五'),(4,'zjadmin','0828775892945249cdd5265c1a913c89','zj','周六'),(5,'yjadmin','0828775892945249cdd5265c1a913c89','yj','吴七'),(9,'HUANG3','da0e8e11ea2551f949b3fbf00a9a2d23',NULL,'HTY'),(10,'hty222','da0e8e11ea2551f949b3fbf00a9a2d23',NULL,'HTY'),(11,'aa','d1b8d375409e11a40b85fea20845e7de',NULL,'HTY'),(12,'hty233','f49f869cdb172bb15b1fa6b740e8dedd',NULL,'HTY'),(13,'hty114514','4e6679358164898d44e48c882154aa7e',NULL,'HTY114');
/*!40000 ALTER TABLE `tb_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_wareout`
--

DROP TABLE IF EXISTS `tb_wareout`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_wareout` (
  `out_id` int NOT NULL AUTO_INCREMENT,
  `out_date` date NOT NULL,
  `out_class` varchar(255) NOT NULL,
  `out_person` varchar(255) NOT NULL,
  PRIMARY KEY (`out_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_wareout`
--

LOCK TABLES `tb_wareout` WRITE;
/*!40000 ALTER TABLE `tb_wareout` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_wareout` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_zone`
--

DROP TABLE IF EXISTS `tb_zone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_zone` (
  `zo_id` int NOT NULL AUTO_INCREMENT,
  `zo_area` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `zo_ftype` varchar(15) NOT NULL,
  `zo_stype` varchar(15) NOT NULL,
  `zo_tree` varchar(15) NOT NULL,
  `zo_team` varchar(10) NOT NULL,
  PRIMARY KEY (`zo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_zone`
--

LOCK TABLES `tb_zone` WRITE;
/*!40000 ALTER TABLE `tb_zone` DISABLE KEYS */;
INSERT INTO `tb_zone` VALUES (1,'华强北','乔木林','林地','柏树','雅安一队'),(2,'拉拉land','jojo林','湿地','红木','成都二队'),(3,'拉吉岛','安安林','山地','松柏','乐山一队'),(4,'卡罗拉','安安','教程','案例','啊啊啊'),(5,'zone22','aaskd','klaksdl','xxx','llk');
/*!40000 ALTER TABLE `tb_zone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team_delivery`
--

DROP TABLE IF EXISTS `team_delivery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `team_delivery` (
  `tn_id` int NOT NULL,
  `del_id` int NOT NULL,
  PRIMARY KEY (`tn_id`,`del_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team_delivery`
--

LOCK TABLES `team_delivery` WRITE;
/*!40000 ALTER TABLE `team_delivery` DISABLE KEYS */;
/*!40000 ALTER TABLE `team_delivery` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-28 13:19:19
