-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 07-Out-2014 às 20:40
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
CREATE DATABASE IF NOT EXISTS `relatorios` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `relatorios`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `entrada`
--

DROP TABLE IF EXISTS `entrada`;
CREATE TABLE IF NOT EXISTS `entrada` (
  `EntCod` int(11) NOT NULL AUTO_INCREMENT,
  `EntTotal` varchar(30) NOT NULL,
  `EntData` date NOT NULL,
  `EntValor` decimal(9,2) NOT NULL,
  PRIMARY KEY (`EntCod`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Extraindo dados da tabela `entrada`
--

INSERT INTO `entrada` (`EntCod`, `EntTotal`, `EntData`, `EntValor`) VALUES
(1, 'Salário do Henri', '2014-10-05', '10000.00'),
(2, 'Casas aluguel do Henri', '2014-10-03', '5000.00'),
(3, 'Poupança do Henri', '2014-10-07', '900.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `principal`
--

DROP TABLE IF EXISTS `principal`;
CREATE TABLE IF NOT EXISTS `principal` (
  `PriCod` int(11) NOT NULL AUTO_INCREMENT,
  `PriMes` varchar(8) NOT NULL,
  `PriAno` char(4) NOT NULL,
  `PriEnt` int(11) DEFAULT NULL,
  `PriSai` int(11) DEFAULT NULL,
  PRIMARY KEY (`PriCod`),
  KEY `PriEnt` (`PriEnt`),
  KEY `PriSai` (`PriSai`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `principal`
--

INSERT INTO `principal` (`PriCod`, `PriMes`, `PriAno`, `PriEnt`, `PriSai`) VALUES
(1, 'outubro', '2014', 1, NULL),
(2, 'outubro', '2014', 2, NULL),
(3, 'outubro', '2014', 3, NULL),
(4, 'outubro', '2014', NULL, 1),
(5, 'outubro', '2014', NULL, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `saida`
--

DROP TABLE IF EXISTS `saida`;
CREATE TABLE IF NOT EXISTS `saida` (
  `SaiCod` int(11) NOT NULL AUTO_INCREMENT,
  `SaiTotal` varchar(30) NOT NULL,
  `SaiData` date NOT NULL,
  `SaiValor` decimal(9,2) NOT NULL,
  PRIMARY KEY (`SaiCod`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `saida`
--

INSERT INTO `saida` (`SaiCod`, `SaiTotal`, `SaiData`, `SaiValor`) VALUES
(1, 'Casa de massagem', '2014-10-01', '150.00'),
(2, 'Curso de Inglês', '2014-10-04', '350.00');

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `principal`
--
ALTER TABLE `principal`
  ADD CONSTRAINT `principal_ibfk_1` FOREIGN KEY (`PriEnt`) REFERENCES `entrada` (`EntCod`),
  ADD CONSTRAINT `principal_ibfk_2` FOREIGN KEY (`PriSai`) REFERENCES `saida` (`SaiCod`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
