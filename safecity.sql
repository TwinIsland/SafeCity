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
  `lg_time` date NOT NULL,
  PRIMARY KEY (`lg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='table for log';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_log`
--

LOCK TABLES `tb_log` WRITE;
/*!40000 ALTER TABLE `tb_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_medicament`
--

DROP TABLE IF EXISTS `tb_medicament`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_medicament` (
  `med_id` int NOT NULL,
  `med_name` varchar(12) NOT NULL,
  `med_ptype` varchar(12) NOT NULL,
  `med_type` varchar(12) NOT NULL,
  `med_purpose` varchar(50) NOT NULL,
  `med_count` int NOT NULL,
  PRIMARY KEY (`med_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_medicament`
--

LOCK TABLES `tb_medicament` WRITE;
/*!40000 ALTER TABLE `tb_medicament` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_user`
--

LOCK TABLES `tb_user` WRITE;
/*!40000 ALTER TABLE `tb_user` DISABLE KEYS */;
INSERT INTO `tb_user` VALUES (1,'superadmin','943463a9f302f4fecccfc1d4ed2117f0','cj','张三'),(2,'zladmin','0828775892945249cdd5265c1a913c89','zl','李四'),(3,'zqadmin','0828775892945249cdd5265c1a913c89','zq','王五'),(4,'zjadmin','0828775892945249cdd5265c1a913c89','zj','周六'),(5,'yjadmin','0828775892945249cdd5265c1a913c89','yj','吴七');
/*!40000 ALTER TABLE `tb_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_zone`
--

DROP TABLE IF EXISTS `tb_zone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_zone` (
  `zo_id` int NOT NULL,
  `tn_id` int DEFAULT NULL,
  `zo_name` varchar(15) NOT NULL,
  `zo_ftype` varchar(15) NOT NULL,
  `zo_stype` varchar(15) NOT NULL,
  `zo_tree` varchar(15) NOT NULL,
  `zo_team` int NOT NULL,
  PRIMARY KEY (`zo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_zone`
--

LOCK TABLES `tb_zone` WRITE;
/*!40000 ALTER TABLE `tb_zone` DISABLE KEYS */;
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

-- Dump completed on 2020-10-27 11:07:59
