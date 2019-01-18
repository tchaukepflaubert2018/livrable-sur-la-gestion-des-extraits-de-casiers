/*
SQLyog Ultimate v11.5 (64 bit)
MySQL - 5.6.25 : Database - bdextrait
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bdextrait` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bdextrait`;

/*Table structure for table `personne` */

DROP TABLE IF EXISTS `personne`;

CREATE TABLE `personne` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `age` int(6) DEFAULT NULL,
  `lieudenaissance` varchar(20) DEFAULT NULL,
  `statutmatrimoniale` varchar(20) DEFAULT NULL,
  `profession` varchar(20) DEFAULT NULL,
  `sexe` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

/*Data for the table `personne` */

insert  into `personne`(`id`,`nom`,`prenom`,`age`,`lieudenaissance`,`statutmatrimoniale`,`profession`,`sexe`) values (1,'tchaukep','flaubert',30,'bandjoun','celibataire','etudiant',NULL),(11,'DJOMO','MARTINE',22,'BANGANGTE','CELIBATAIRE','ETUDIANTE','F'),(12,'TCHAMO','DUCLAIR',17,'BANGANGTE','CELIBATAIRE','ELEVE','MASCULIN'),(13,'MESSI','LEONEL',45,'YAOUNDE','CELIBATAIRE','FOOTBALLEUR','M'),(14,'NGATCHOU','CHANTALE',54,'DOUALA','VEUVE','ENSIEGNANTE','F'),(15,'NONO','ANGELLA',4,'YD2','CEL','ELEVE','F'),(16,' nono','manuella',2,'ydé','cel','eleve','feminin'),(17,'nkwangang','mirielle',35,'bgté','marié','menagère','femele'),(18,'nono ','archange',0,'ydé','cel','ras','m'),(19,'chuindjang','estelle',17,'dla','cel','eleve','feminin'),(20,'test','test',12,'yaounde','s','i','m'),(21,'maman','leonie',58,'dla','celibataire','enseignate','femele');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
