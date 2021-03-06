-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 09-Nov-2014 às 01:04
-- Versão do servidor: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cosmeticos`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `endereco`
--

CREATE TABLE IF NOT EXISTS `endereco` (
  `EndCod` int(11) NOT NULL,
  `EndRua` varchar(25) DEFAULT NULL,
  `EndNum` char(5) DEFAULT NULL,
  `EndCompl` char(2) DEFAULT NULL,
  `EndCid` varchar(20) DEFAULT NULL,
  `EndEst` char(2) DEFAULT NULL,
  PRIMARY KEY (`EndCod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `endereco`
--

INSERT INTO `endereco` (`EndCod`, `EndRua`, `EndNum`, `EndCompl`, `EndCid`, `EndEst`) VALUES
(1, 'Cocolandia', '100', '1', 'São Paulo', 'SP'),
(2, 'Nobrega', '100', '1', 'Sao Paulo', 'SP'),
(3, 'Rua da Granja', '100', '1', 'Sao Paulo', 'SP'),
(4, 'Rua da Granja', '100', '1', 'Sao Paulo', 'SP');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fabricante`
--

CREATE TABLE IF NOT EXISTS `fabricante` (
  `FabCod` int(11) NOT NULL,
  `FabNome` varchar(30) DEFAULT NULL,
  `FabCNPJ` varchar(14) DEFAULT NULL,
  `FabObs` varchar(255) DEFAULT NULL,
  `FabTel` int(11) DEFAULT NULL,
  `FabEnd` int(11) DEFAULT NULL,
  PRIMARY KEY (`FabCod`),
  KEY `FabTel` (`FabTel`),
  KEY `FabEnd` (`FabEnd`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fabricante`
--

INSERT INTO `fabricante` (`FabCod`, `FabNome`, `FabCNPJ`, `FabObs`, `FabTel`, `FabEnd`) VALUES
(1, 'CocaColaTM', '12489650001', 'A marca é o bem mais valioso', 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE IF NOT EXISTS `funcionario` (
  `FunCod` int(11) NOT NULL,
  `FunNome` varchar(30) DEFAULT NULL,
  `FunRg` varchar(9) DEFAULT NULL,
  `FunCpf` varchar(11) DEFAULT NULL,
  `FunEnd` int(11) DEFAULT NULL,
  `FunTel` int(11) DEFAULT NULL,
  `FunLog` int(11) DEFAULT NULL,
  PRIMARY KEY (`FunCod`),
  KEY `FunEnd` (`FunEnd`),
  KEY `FunTel` (`FunTel`),
  KEY `FunLog` (`FunLog`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`FunCod`, `FunNome`, `FunRg`, `FunCpf`, `FunEnd`, `FunTel`, `FunLog`) VALUES
(2, 'admin', '698498168', '5614651651', 2, 2, 2),
(3, 'Kelvin Oliveira', '387363233', '4616123888', 3, 3, 3),
(4, 'Kelvin Oliveira', '387363233', '4616123888', 4, 4, 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `LogCod` int(11) NOT NULL,
  `LogUsu` varchar(20) DEFAULT NULL,
  `LogSenha` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`LogCod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`LogCod`, `LogUsu`, `LogSenha`) VALUES
(2, 'admiin', '123'),
(3, 'kelvin', '123'),
(4, 'Kelvin', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `ProCod` int(11) NOT NULL,
  `ProNome` varchar(20) DEFAULT NULL,
  `ProFab` int(11) DEFAULT NULL,
  `ProObs` varchar(255) DEFAULT NULL,
  `ProPreco` double DEFAULT NULL,
  `ProQuant` int(11) DEFAULT NULL,
  PRIMARY KEY (`ProCod`),
  KEY `ProFab` (`ProFab`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`ProCod`, `ProNome`, `ProFab`, `ProObs`, `ProPreco`, `ProQuant`) VALUES
(1, 'Coca Cola', 1, 'Produto caro d+++', 15, 10),
(2, 'Leite Azedo', 1, 'asdfasf', 12, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `telefone`
--

CREATE TABLE IF NOT EXISTS `telefone` (
  `TelCod` int(11) NOT NULL,
  `TelRes` char(10) DEFAULT NULL,
  `TelCel` char(11) DEFAULT NULL,
  PRIMARY KEY (`TelCod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `telefone`
--

INSERT INTO `telefone` (`TelCod`, `TelRes`, `TelCel`) VALUES
(1, '1156741895', '11987451872'),
(2, '1111111111', '11111111111'),
(3, '1156733819', '11961836974'),
(4, '1156733819', '11961836974');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE IF NOT EXISTS `vendas` (
  `VendCod` int(11) NOT NULL,
  `VendFun` int(11) DEFAULT NULL,
  `VendProd` int(11) DEFAULT NULL,
  `VendPreco` double DEFAULT NULL,
  `VendQuant` int(11) DEFAULT NULL,
  `VendObs` varchar(255) DEFAULT NULL,
  `VendData` date NOT NULL,
  PRIMARY KEY (`VendCod`),
  KEY `VendFun` (`VendFun`),
  KEY `VendProd` (`VendProd`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `vendas`
--

INSERT INTO `vendas` (`VendCod`, `VendFun`, `VendProd`, `VendPreco`, `VendQuant`, `VendObs`, `VendData`) VALUES
(1, 2, 2, 25.5, 5, 'ASDFSA', '2014-12-12'),
(2, 2, 1, 25.5, 5, 'ASDFSA', '2014-12-12');

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `fabricante`
--
ALTER TABLE `fabricante`
  ADD CONSTRAINT `fabricante_ibfk_1` FOREIGN KEY (`FabTel`) REFERENCES `telefone` (`TelCod`),
  ADD CONSTRAINT `fabricante_ibfk_2` FOREIGN KEY (`FabEnd`) REFERENCES `endereco` (`EndCod`);

--
-- Limitadores para a tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`FunEnd`) REFERENCES `endereco` (`EndCod`),
  ADD CONSTRAINT `funcionario_ibfk_2` FOREIGN KEY (`FunTel`) REFERENCES `telefone` (`TelCod`),
  ADD CONSTRAINT `funcionario_ibfk_3` FOREIGN KEY (`FunLog`) REFERENCES `login` (`LogCod`);

--
-- Limitadores para a tabela `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`ProFab`) REFERENCES `fabricante` (`FabCod`);

--
-- Limitadores para a tabela `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `vendas_ibfk_1` FOREIGN KEY (`VendFun`) REFERENCES `funcionario` (`FunCod`),
  ADD CONSTRAINT `vendas_ibfk_2` FOREIGN KEY (`VendProd`) REFERENCES `produto` (`ProCod`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
