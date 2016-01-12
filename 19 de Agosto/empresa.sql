-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 20-Ago-2014 às 01:02
-- Versão do servidor: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `empresa`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `endereco`
--

CREATE TABLE IF NOT EXISTS `endereco` (
  `EndCod` int(11) NOT NULL AUTO_INCREMENT,
  `EndLog` varchar(30) NOT NULL,
  `EndNum` varchar(5) NOT NULL,
  `EndCom` varchar(10) DEFAULT NULL,
  `EndBai` varchar(20) NOT NULL,
  `EndCid` varchar(20) NOT NULL,
  `EndEst` varchar(2) NOT NULL,
  `EndCep` varchar(8) NOT NULL,
  PRIMARY KEY (`EndCod`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `endereco`
--

INSERT INTO `endereco` (`EndCod`, `EndLog`, `EndNum`, `EndCom`, `EndBai`, `EndCid`, `EndEst`, `EndCep`) VALUES
(1, 'Rua sei lá', '100', '1', 'Bairro do Desc', 'Diadema', 'SP', '04457894'),
(2, 'Rua Só sei que nada sei', '60', '', 'Bairro Socratiano', 'Atenas', 'GR', '04152754'),
(3, 'Rua Penso, Logo existo', '75', '40', 'Bairro Cartesiano', 'Paris', 'FR', '04122754'),
(4, 'Rua O objetivo é ser feliz', '87', '503', 'Bairro Caminho da Vi', 'Guacuri', 'SP', '04122864');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE IF NOT EXISTS `funcionario` (
  `FunCod` int(11) NOT NULL AUTO_INCREMENT,
  `FunNome` varchar(30) NOT NULL,
  `FunRg` varchar(9) NOT NULL,
  `FunCpf` varchar(11) NOT NULL,
  `FunEnd` int(11) DEFAULT NULL,
  `FunTel` int(11) DEFAULT NULL,
  PRIMARY KEY (`FunCod`),
  KEY `FunEnd` (`FunEnd`),
  KEY `FunTel` (`FunTel`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`FunCod`, `FunNome`, `FunRg`, `FunCpf`, `FunEnd`, `FunTel`) VALUES
(1, 'Rene Decartes', '386547214', '98765169465', 1, 1),
(2, 'Henri Azedo', '386557249', '48785961465', 2, 2),
(3, 'Anderson Araujo', '219547115', '42768165472', 3, 3),
(4, 'Kelvin Oliveira', '871545125', '62468169457', 4, 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `telefone`
--

CREATE TABLE IF NOT EXISTS `telefone` (
  `TelCod` int(11) NOT NULL AUTO_INCREMENT,
  `TelRes` varchar(10) NOT NULL,
  `TelCel` varchar(11) NOT NULL,
  PRIMARY KEY (`TelCod`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `telefone`
--

INSERT INTO `telefone` (`TelCod`, `TelRes`, `TelCel`) VALUES
(1, '1156741039', '11956465464'),
(2, '1154564565', '11978978946'),
(3, '1151655656', '11961613689'),
(4, '1151456666', '11961614569');

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`FunEnd`) REFERENCES `endereco` (`EndCod`),
  ADD CONSTRAINT `funcionario_ibfk_2` FOREIGN KEY (`FunTel`) REFERENCES `telefone` (`TelCod`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
