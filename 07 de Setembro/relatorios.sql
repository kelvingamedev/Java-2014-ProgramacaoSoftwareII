-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 07-Out-2014 às 19:47
-- Versão do servidor: 5.5.34
-- versão do PHP: 5.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `relatorios`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `entrada`
--

CREATE TABLE IF NOT EXISTS `entrada` (
  `EntCod` int(11) NOT NULL AUTO_INCREMENT,
  `EntTotal` varchar(30) NOT NULL,
  `EntData` date NOT NULL,
  `EntValor` decimal(9,2) DEFAULT NULL,
  PRIMARY KEY (`EntCod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `principal`
--

CREATE TABLE IF NOT EXISTS `principal` (
  `PriCod` int(11) NOT NULL AUTO_INCREMENT,
  `PriMes` varchar(8) NOT NULL,
  `PriAno` char(4) NOT NULL,
  `PriData` date NOT NULL,
  `PriValor` decimal(9,2) DEFAULT NULL,
  `PriEnt` int(11) DEFAULT NULL,
  `PriSai` int(11) DEFAULT NULL,
  PRIMARY KEY (`PriCod`),
  KEY `PriSai` (`PriSai`),
  KEY `PriEnt` (`PriEnt`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `saida`
--

CREATE TABLE IF NOT EXISTS `saida` (
  `SaiCod` int(11) NOT NULL AUTO_INCREMENT,
  `SaiTotal` varchar(30) NOT NULL,
  `SaiData` date NOT NULL,
  `SaiValor` decimal(9,2) DEFAULT NULL,
  PRIMARY KEY (`SaiCod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `principal`
--
ALTER TABLE `principal`
  ADD CONSTRAINT `principal_ibfk_2` FOREIGN KEY (`PriEnt`) REFERENCES `entrada` (`EntCod`),
  ADD CONSTRAINT `principal_ibfk_1` FOREIGN KEY (`PriSai`) REFERENCES `saida` (`SaiCod`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
