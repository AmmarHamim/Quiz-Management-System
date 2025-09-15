-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: qems
-- ------------------------------------------------------
-- Server version	8.0.41

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
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question` (
  `ID` varchar(11) NOT NULL,
  `Name` varchar(550) DEFAULT NULL,
  `Opt1` varchar(500) DEFAULT NULL,
  `Opt2` varchar(500) DEFAULT NULL,
  `Opt3` varchar(500) DEFAULT NULL,
  `Opt4` varchar(500) DEFAULT NULL,
  `Answer` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES ('1','What is the default access modifier for members in a Java class?','public','private','protected','default','default'),('2','What does the \"super\" keyword do in Java?','calls a method from the current class','calls a constructor of the superclass','initialize','declares a method','calls a constructor of the superclass'),('3','What does a destructor do in OOP?','initializes an object','destroyes an object','calls the parent class constructor','creates a new object','destroyes an object'),('4','Which of these is NOT a type of inheritance in OOP?','Single Inheritance','Multiple Inheritance','Hybrid Inheritance','Sequential Inheritance','Sequential Inheritance'),('5','What is the term for hiding the implementation details of a class?','Abstraction','Encapsulation','Polymorphism','Inheritance','Abstraction'),('6','Which method is automatically called when an object is created in a class?','Constructor','Destructor','Main','Function','Constructor');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `RollNo` varchar(11) NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `Gender` varchar(100) DEFAULT NULL,
  `ContactNo` varchar(11) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `CollegeName` varchar(200) DEFAULT NULL,
  `Marks` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('1','Hamim','Male','022','hm@gmail.com','JU',6),('5','Tanvir','Male','01334443344','th@gmail.com','AMC',1),('23','Ham','Male','12221','ham@gmail.com','DU',3),('999','Sadia','Female','123456789','sd@gmail.com','TU',0),('44','Noor','Male','0174534333','n@gmail.com','JU',0),('45','Sabbir','Male','10232323','sb@gmail.com','MIST',2),('1995','Tahrima Afrin','Female','01794567934','tahrima@gmail.com','Jahangirnagar University',1),('2009','sumi','Female','01987654341','sumu@gmail.com','JU',5),('6','maru','Male','01764660141','maru@gmail.com','JU',2),('34','Hamim','Male','01640785594','am@gmail.com','JU',1);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'qems'
--

--
-- Dumping routines for database 'qems'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-09-15 15:42:13
