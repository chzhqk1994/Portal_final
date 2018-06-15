-- MySQL dump 10.13  Distrib 5.7.21, for osx10.13 (x86_64)
--
-- Host: 127.0.0.1    Database: spring_db
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_board`
--

DROP TABLE IF EXISTS `tbl_board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_board` (
  `bno` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `price` varchar(200) DEFAULT NULL,
  `contact` varchar(200) DEFAULT NULL,
  `content` text NOT NULL,
  `writer` varchar(50) NOT NULL,
  `regdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `viewcnt` int(11) DEFAULT '0',
  `status` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`bno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_board`
--

LOCK TABLES `tbl_board` WRITE;
/*!40000 ALTER TABLE `tbl_board` DISABLE KEYS */;
INSERT INTO `tbl_board` VALUES (1,'제목입니다...','100$','0101234','내용입니다...','user00','2018-06-15 05:41:13',0,1),(2,'Macbook air 13 inch 2015 early','800$','010-1234-1234','cpu - i5 6200\r\nram - 4G x 2\r\nssd - 128 G','dump','2018-06-15 05:43:38',2,0),(3,'Garage sales!!','100$','010-0000-1111','Visit my Garage sale!\r\n\r\naddress - NSW 100, bunn st 16-30','asdf','2018-06-15 05:44:35',0,0),(4,'sales!!','10$','010-6543-8578','cloth','asdf','2018-06-15 05:44:57',0,0),(5,'Xbox','300$','010-7568-5134','newenwenw','asdf','2018-06-15 05:45:32',6,1);
/*!40000 ALTER TABLE `tbl_board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_user`
--

DROP TABLE IF EXISTS `tbl_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_user` (
  `uid` varchar(50) NOT NULL,
  `upw` varchar(50) NOT NULL,
  `uname` varchar(50) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_user`
--

LOCK TABLES `tbl_user` WRITE;
/*!40000 ALTER TABLE `tbl_user` DISABLE KEYS */;
INSERT INTO `tbl_user` VALUES ('asdf','asdf','asdf'),('dump','dump','hellena'),('fdsa','fdsa','fdsa'),('son','asdf','asdf');
/*!40000 ALTER TABLE `tbl_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-15 14:47:23
