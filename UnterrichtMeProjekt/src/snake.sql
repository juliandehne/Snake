-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Erstellungszeit: 13. Jan 2014 um 03:16
-- Server Version: 5.5.16
-- PHP-Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Datenbank: `snake`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `gea`
--

CREATE TABLE IF NOT EXISTS `gea` (
  `Weihnachten` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `klcf`
--

CREATE TABLE IF NOT EXISTS `klcf` (
  `id` int(11) DEFAULT NULL,
  `fw` varchar(100) DEFAULT NULL,
  `fw2` varchar(100) DEFAULT NULL,
  `fw3` varchar(100) DEFAULT NULL,
  `fw4` varchar(100) DEFAULT NULL,
  `fw5` varchar(100) DEFAULT NULL,
  `fw6` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `logdata`
--

CREATE TABLE IF NOT EXISTS `logdata` (
  `data` text
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `playinggroundlog`
--

CREATE TABLE IF NOT EXISTS `playinggroundlog` (
  `type` int(11) DEFAULT NULL,
  `x` int(11) DEFAULT NULL,
  `y` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `positionschlange`
--

CREATE TABLE IF NOT EXISTS `positionschlange` (
  `x` int(11) DEFAULT NULL,
  `y` int(11) DEFAULT NULL,
  `id` int(11) DEFAULT NULL,
  `indexPos` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `positionschlange`
--

INSERT INTO `positionschlange` (`x`, `y`, `id`, `indexPos`) VALUES
(23, 20, 1, 58),
(22, 20, 1, 57),
(21, 20, 1, 56),
(20, 20, 1, 55),
(20, 21, 1, 54),
(20, 22, 1, 53),
(20, 23, 1, 52),
(20, 24, 1, 51),
(20, 25, 1, 50),
(20, 26, 1, 49),
(20, 27, 1, 48),
(20, 28, 1, 47),
(20, 29, 1, 46),
(20, 30, 1, 45),
(20, 31, 1, 44),
(20, 32, 1, 43),
(20, 33, 1, 42),
(20, 34, 1, 41),
(20, 35, 1, 40),
(20, 36, 1, 39),
(20, 37, 1, 38),
(20, 38, 1, 37),
(20, 39, 1, 36),
(20, 40, 1, 35),
(20, 41, 1, 34),
(20, 42, 1, 33),
(20, 43, 1, 32),
(20, 44, 1, 31),
(20, 45, 1, 30),
(20, 46, 1, 29),
(20, 47, 1, 28),
(20, 48, 1, 27),
(20, 49, 1, 26),
(20, 50, 1, 25),
(20, 51, 1, 24),
(20, 52, 1, 23),
(20, 53, 1, 22),
(20, 54, 1, 21),
(20, 55, 1, 20),
(20, 56, 1, 19),
(20, 57, 1, 18),
(20, 58, 1, 17),
(20, 59, 1, 16),
(20, 60, 1, 15),
(20, 61, 1, 14),
(20, 62, 1, 13),
(20, 63, 1, 12),
(20, 64, 1, 11),
(20, 65, 1, 10),
(20, 66, 1, 9),
(20, 67, 1, 8),
(20, 68, 1, 7),
(20, 69, 1, 6),
(20, 70, 1, 5),
(20, 71, 1, 4),
(20, 72, 1, 3),
(20, 73, 1, 2),
(20, 74, 1, 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `richtungschlangenbewegung`
--

CREATE TABLE IF NOT EXISTS `richtungschlangenbewegung` (
  `id` int(11) DEFAULT NULL,
  `direktion` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `richtungschlangenbewegung`
--

INSERT INTO `richtungschlangenbewegung` (`id`, `direktion`) VALUES
(1, 'rechts');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `rnuh`
--

CREATE TABLE IF NOT EXISTS `rnuh` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `schlangezustand`
--

CREATE TABLE IF NOT EXISTS `schlangezustand` (
  `id` int(11) DEFAULT NULL,
  `laenge` int(11) DEFAULT NULL,
  `geschwindigkeit` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `score`
--

CREATE TABLE IF NOT EXISTS `score` (
  `id` int(11) DEFAULT NULL,
  `punkte` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `score`
--

INSERT INTO `score` (`id`, `punkte`) VALUES
(1, 54);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `spieler`
--

CREATE TABLE IF NOT EXISTS `spieler` (
  `username` varchar(50) DEFAULT NULL,
  `uservorname` varchar(50) DEFAULT NULL,
  `id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `spielfeld`
--

CREATE TABLE IF NOT EXISTS `spielfeld` (
  `id` int(11) DEFAULT NULL,
  `xkoordinate` tinyint(1) DEFAULT NULL,
  `ykoordinate` tinyint(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
