-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Erstellungszeit: 13. Jan 2014 um 02:58
-- Server Version: 5.5.34
-- PHP-Version: 5.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Datenbank: `cdcol`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `cds`
--

CREATE TABLE IF NOT EXISTS `cds` (
  `titel` varchar(200) COLLATE latin1_general_ci DEFAULT NULL,
  `interpret` varchar(200) COLLATE latin1_general_ci DEFAULT NULL,
  `jahr` int(11) DEFAULT NULL,
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=7 ;

--
-- Daten für Tabelle `cds`
--

INSERT INTO `cds` (`titel`, `interpret`, `jahr`, `id`) VALUES
('Beauty', 'Ryuichi Sakamoto', 1990, 1),
('Goodbye Country (Hello Nightclub)', 'Groove Armada', 2001, 4),
('Glee', 'Bran Van 3000', 1997, 5);
--
-- Datenbank: `mydb`
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
-- Tabellenstruktur für Tabelle `lehrer`
--

CREATE TABLE IF NOT EXISTS `lehrer` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `lehrer`
--

INSERT INTO `lehrer` (`id`, `name`) VALUES
(1, 'updatedhello'),
(3, 'hello3');

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
(25, 20, 1, 4),
(21, 20, 1, 3),
(22, 20, 1, 2),
(23, 20, 1, 1),
(24, 20, 0, 4),
(23, 20, 0, 3),
(22, 20, 0, 2),
(21, 20, 0, 1),
(20, 20, 0, 0),
(24, 20, 1, 0);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `richtungschlangenbewegung`
--

CREATE TABLE IF NOT EXISTS `richtungschlangenbewegung` (
  `id` int(11) DEFAULT NULL,
  `direktion` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
--
-- Datenbank: `phpmyadmin`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pma_bookmark`
--

CREATE TABLE IF NOT EXISTS `pma_bookmark` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dbase` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `user` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `label` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `query` text COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Bookmarks' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pma_column_info`
--

CREATE TABLE IF NOT EXISTS `pma_column_info` (
  `id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `column_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `mimetype` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `db_name` (`db_name`,`table_name`,`column_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Column information for phpMyAdmin' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pma_designer_coords`
--

CREATE TABLE IF NOT EXISTS `pma_designer_coords` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `x` int(11) DEFAULT NULL,
  `y` int(11) DEFAULT NULL,
  `v` tinyint(4) DEFAULT NULL,
  `h` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`db_name`,`table_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table coordinates for Designer';

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pma_history`
--

CREATE TABLE IF NOT EXISTS `pma_history` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `timevalue` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `sqlquery` text COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `username` (`username`,`db`,`table`,`timevalue`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='SQL history for phpMyAdmin' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pma_pdf_pages`
--

CREATE TABLE IF NOT EXISTS `pma_pdf_pages` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `page_nr` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `page_descr` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT '',
  PRIMARY KEY (`page_nr`),
  KEY `db_name` (`db_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='PDF relation pages for phpMyAdmin' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pma_recent`
--

CREATE TABLE IF NOT EXISTS `pma_recent` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Recently accessed tables';

--
-- Daten für Tabelle `pma_recent`
--

INSERT INTO `pma_recent` (`username`, `tables`) VALUES
('root', '[{"db":"mydb","table":"positionschlange"},{"db":"phpmyadmin","table":"pma_column_info"},{"db":"phpmyadmin","table":"pma_designer_coords"},{"db":"phpmyadmin","table":"pma_history"},{"db":"phpmyadmin","table":"pma_pdf_pages"},{"db":"phpmyadmin","table":"pma_recent"},{"db":"phpmyadmin","table":"pma_relation"},{"db":"cdcol","table":"cds"},{"db":"mysql","table":"user"},{"db":"mysql","table":"help_relation"}]');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pma_relation`
--

CREATE TABLE IF NOT EXISTS `pma_relation` (
  `master_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  PRIMARY KEY (`master_db`,`master_table`,`master_field`),
  KEY `foreign_field` (`foreign_db`,`foreign_table`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Relation table';

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pma_table_coords`
--

CREATE TABLE IF NOT EXISTS `pma_table_coords` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `pdf_page_number` int(11) NOT NULL DEFAULT '0',
  `x` float unsigned NOT NULL DEFAULT '0',
  `y` float unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`db_name`,`table_name`,`pdf_page_number`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table coordinates for phpMyAdmin PDF output';

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pma_table_info`
--

CREATE TABLE IF NOT EXISTS `pma_table_info` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `display_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  PRIMARY KEY (`db_name`,`table_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pma_table_uiprefs`
--

CREATE TABLE IF NOT EXISTS `pma_table_uiprefs` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `prefs` text COLLATE utf8_bin NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`username`,`db_name`,`table_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tables'' UI preferences';

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pma_tracking`
--

CREATE TABLE IF NOT EXISTS `pma_tracking` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `version` int(10) unsigned NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `schema_snapshot` text COLLATE utf8_bin NOT NULL,
  `schema_sql` text COLLATE utf8_bin,
  `data_sql` longtext COLLATE utf8_bin,
  `tracking` set('UPDATE','REPLACE','INSERT','DELETE','TRUNCATE','CREATE DATABASE','ALTER DATABASE','DROP DATABASE','CREATE TABLE','ALTER TABLE','RENAME TABLE','DROP TABLE','CREATE INDEX','DROP INDEX','CREATE VIEW','ALTER VIEW','DROP VIEW') COLLATE utf8_bin DEFAULT NULL,
  `tracking_active` int(1) unsigned NOT NULL DEFAULT '1',
  PRIMARY KEY (`db_name`,`table_name`,`version`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT COMMENT='Database changes tracking for phpMyAdmin';

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `pma_userconfig`
--

CREATE TABLE IF NOT EXISTS `pma_userconfig` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `timevalue` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `config_data` text COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User preferences storage for phpMyAdmin';

--
-- Daten für Tabelle `pma_userconfig`
--

INSERT INTO `pma_userconfig` (`username`, `timevalue`, `config_data`) VALUES
('root', '2014-01-12 19:22:18', '{"lang":"de"}');
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

--
-- Daten für Tabelle `logdata`
--

INSERT INTO `logdata` (`data`) VALUES
('Sun Jan 12 23:45:56 CET 2014'),
('Sun Jan 12 23:45:57 CET 2014'),
('Sun Jan 12 23:45:58 CET 2014'),
('Sun Jan 12 23:45:59 CET 2014'),
('Sun Jan 12 23:46:00 CET 2014'),
('Sun Jan 12 23:46:01 CET 2014'),
('Sun Jan 12 23:46:02 CET 2014'),
('Sun Jan 12 23:46:03 CET 2014'),
('Sun Jan 12 23:46:04 CET 2014'),
('Sun Jan 12 23:46:05 CET 2014'),
('Sun Jan 12 23:46:06 CET 2014'),
('Sun Jan 12 23:46:07 CET 2014'),
('Sun Jan 12 23:46:08 CET 2014'),
('Sun Jan 12 23:46:09 CET 2014'),
('Sun Jan 12 23:46:10 CET 2014'),
('Sun Jan 12 23:46:11 CET 2014'),
('Sun Jan 12 23:46:12 CET 2014'),
('Sun Jan 12 23:46:13 CET 2014'),
('Sun Jan 12 23:46:14 CET 2014'),
('Sun Jan 12 23:46:15 CET 2014'),
('Sun Jan 12 23:46:16 CET 2014'),
('Sun Jan 12 23:46:17 CET 2014'),
('Sun Jan 12 23:46:18 CET 2014'),
('Sun Jan 12 23:46:19 CET 2014'),
('Sun Jan 12 23:46:20 CET 2014'),
('Sun Jan 12 23:46:21 CET 2014'),
('Sun Jan 12 23:46:22 CET 2014'),
('Sun Jan 12 23:46:23 CET 2014'),
('Sun Jan 12 23:46:24 CET 2014'),
('Sun Jan 12 23:46:25 CET 2014'),
('Sun Jan 12 23:46:26 CET 2014'),
('Sun Jan 12 23:46:27 CET 2014'),
('Sun Jan 12 23:46:28 CET 2014'),
('Sun Jan 12 23:46:29 CET 2014'),
('Sun Jan 12 23:46:30 CET 2014'),
('Sun Jan 12 23:46:31 CET 2014'),
('Sun Jan 12 23:46:32 CET 2014'),
('Sun Jan 12 23:46:33 CET 2014'),
('Sun Jan 12 23:46:34 CET 2014'),
('Sun Jan 12 23:46:35 CET 2014'),
('Sun Jan 12 23:46:36 CET 2014'),
('Sun Jan 12 23:46:37 CET 2014'),
('Sun Jan 12 23:46:38 CET 2014'),
('Sun Jan 12 23:46:39 CET 2014'),
('Sun Jan 12 23:46:40 CET 2014'),
('Sun Jan 12 23:46:41 CET 2014'),
('Sun Jan 12 23:46:42 CET 2014'),
('Sun Jan 12 23:46:43 CET 2014'),
('Sun Jan 12 23:46:44 CET 2014'),
('Sun Jan 12 23:46:45 CET 2014'),
('Sun Jan 12 23:46:46 CET 2014'),
('Sun Jan 12 23:46:47 CET 2014'),
('Sun Jan 12 23:46:48 CET 2014'),
('Sun Jan 12 23:46:49 CET 2014'),
('Sun Jan 12 23:46:50 CET 2014'),
('Sun Jan 12 23:46:51 CET 2014'),
('Sun Jan 12 23:46:52 CET 2014'),
('Sun Jan 12 23:46:53 CET 2014'),
('Sun Jan 12 23:46:54 CET 2014'),
('Sun Jan 12 23:46:55 CET 2014'),
('Sun Jan 12 23:46:56 CET 2014'),
('Sun Jan 12 23:46:57 CET 2014'),
('Sun Jan 12 23:46:58 CET 2014'),
('Sun Jan 12 23:46:59 CET 2014'),
('Sun Jan 12 23:47:00 CET 2014'),
('Sun Jan 12 23:47:01 CET 2014'),
('Sun Jan 12 23:47:02 CET 2014'),
('Sun Jan 12 23:47:03 CET 2014'),
('Sun Jan 12 23:47:04 CET 2014'),
('Sun Jan 12 23:47:05 CET 2014'),
('Sun Jan 12 23:47:06 CET 2014'),
('Sun Jan 12 23:47:07 CET 2014'),
('Sun Jan 12 23:47:08 CET 2014'),
('Sun Jan 12 23:47:09 CET 2014'),
('Sun Jan 12 23:47:10 CET 2014'),
('Sun Jan 12 23:47:11 CET 2014'),
('Sun Jan 12 23:47:12 CET 2014'),
('Sun Jan 12 23:47:13 CET 2014'),
('Sun Jan 12 23:47:14 CET 2014'),
('Sun Jan 12 23:47:15 CET 2014'),
('Sun Jan 12 23:47:16 CET 2014'),
('Sun Jan 12 23:47:17 CET 2014'),
('Sun Jan 12 23:47:18 CET 2014'),
('Sun Jan 12 23:47:19 CET 2014'),
('Sun Jan 12 23:47:20 CET 2014'),
('Sun Jan 12 23:47:21 CET 2014'),
('Sun Jan 12 23:47:22 CET 2014'),
('Sun Jan 12 23:47:23 CET 2014'),
('Sun Jan 12 23:47:24 CET 2014'),
('Sun Jan 12 23:47:25 CET 2014'),
('Sun Jan 12 23:47:26 CET 2014'),
('Sun Jan 12 23:47:27 CET 2014'),
('Sun Jan 12 23:47:28 CET 2014'),
('Sun Jan 12 23:47:29 CET 2014'),
('Sun Jan 12 23:47:30 CET 2014'),
('Sun Jan 12 23:47:31 CET 2014'),
('Sun Jan 12 23:47:32 CET 2014'),
('Sun Jan 12 23:47:33 CET 2014'),
('Sun Jan 12 23:47:34 CET 2014'),
('Sun Jan 12 23:47:35 CET 2014'),
('Sun Jan 12 23:47:36 CET 2014'),
('Sun Jan 12 23:47:37 CET 2014'),
('Sun Jan 12 23:47:38 CET 2014'),
('Sun Jan 12 23:47:39 CET 2014'),
('Sun Jan 12 23:47:40 CET 2014'),
('Sun Jan 12 23:47:41 CET 2014'),
('Sun Jan 12 23:47:42 CET 2014'),
('Sun Jan 12 23:47:43 CET 2014'),
('Sun Jan 12 23:47:44 CET 2014'),
('Sun Jan 12 23:47:45 CET 2014'),
('Sun Jan 12 23:47:46 CET 2014'),
('Sun Jan 12 23:47:47 CET 2014'),
('Sun Jan 12 23:47:48 CET 2014'),
('Sun Jan 12 23:47:49 CET 2014'),
('Sun Jan 12 23:47:50 CET 2014'),
('Sun Jan 12 23:47:51 CET 2014'),
('Sun Jan 12 23:47:52 CET 2014'),
('Sun Jan 12 23:47:53 CET 2014'),
('Sun Jan 12 23:47:54 CET 2014'),
('Sun Jan 12 23:47:55 CET 2014'),
('Sun Jan 12 23:47:56 CET 2014'),
('Sun Jan 12 23:47:57 CET 2014'),
('Sun Jan 12 23:47:58 CET 2014'),
('Sun Jan 12 23:47:59 CET 2014'),
('Sun Jan 12 23:48:00 CET 2014'),
('Sun Jan 12 23:48:01 CET 2014'),
('Sun Jan 12 23:48:02 CET 2014'),
('Sun Jan 12 23:48:03 CET 2014'),
('Sun Jan 12 23:48:04 CET 2014'),
('Sun Jan 12 23:48:05 CET 2014'),
('Sun Jan 12 23:48:06 CET 2014'),
('Sun Jan 12 23:48:07 CET 2014'),
('Sun Jan 12 23:48:08 CET 2014'),
('Sun Jan 12 23:48:09 CET 2014'),
('Sun Jan 12 23:48:10 CET 2014'),
('Sun Jan 12 23:48:11 CET 2014'),
('Sun Jan 12 23:48:12 CET 2014'),
('Sun Jan 12 23:48:13 CET 2014'),
('Sun Jan 12 23:48:14 CET 2014'),
('Sun Jan 12 23:48:15 CET 2014'),
('Sun Jan 12 23:48:16 CET 2014'),
('Sun Jan 12 23:48:17 CET 2014'),
('Sun Jan 12 23:48:18 CET 2014'),
('Sun Jan 12 23:48:19 CET 2014'),
('Sun Jan 12 23:48:20 CET 2014'),
('Sun Jan 12 23:48:21 CET 2014'),
('Sun Jan 12 23:48:22 CET 2014'),
('Sun Jan 12 23:48:23 CET 2014'),
('Sun Jan 12 23:48:24 CET 2014'),
('Sun Jan 12 23:48:25 CET 2014'),
('Sun Jan 12 23:48:26 CET 2014'),
('Sun Jan 12 23:48:27 CET 2014'),
('Sun Jan 12 23:48:28 CET 2014'),
('Sun Jan 12 23:48:29 CET 2014'),
('Sun Jan 12 23:48:30 CET 2014'),
('Sun Jan 12 23:48:31 CET 2014'),
('Sun Jan 12 23:48:32 CET 2014'),
('Sun Jan 12 23:48:33 CET 2014'),
('Sun Jan 12 23:48:34 CET 2014'),
('Sun Jan 12 23:48:35 CET 2014'),
('Sun Jan 12 23:48:36 CET 2014'),
('Sun Jan 12 23:48:37 CET 2014'),
('Sun Jan 12 23:48:38 CET 2014'),
('Sun Jan 12 23:48:39 CET 2014'),
('Sun Jan 12 23:48:40 CET 2014'),
('Sun Jan 12 23:48:41 CET 2014'),
('Sun Jan 12 23:48:42 CET 2014'),
('Sun Jan 12 23:48:43 CET 2014'),
('Sun Jan 12 23:48:44 CET 2014'),
('Sun Jan 12 23:48:45 CET 2014'),
('Sun Jan 12 23:48:46 CET 2014'),
('Sun Jan 12 23:48:47 CET 2014'),
('Sun Jan 12 23:48:48 CET 2014'),
('Sun Jan 12 23:48:49 CET 2014'),
('Sun Jan 12 23:48:50 CET 2014'),
('Sun Jan 12 23:48:51 CET 2014'),
('Sun Jan 12 23:48:52 CET 2014'),
('Sun Jan 12 23:48:53 CET 2014'),
('Sun Jan 12 23:48:54 CET 2014'),
('Sun Jan 12 23:48:55 CET 2014'),
('Sun Jan 12 23:48:56 CET 2014'),
('Sun Jan 12 23:48:57 CET 2014'),
('Sun Jan 12 23:48:58 CET 2014'),
('Sun Jan 12 23:48:59 CET 2014'),
('Sun Jan 12 23:49:00 CET 2014'),
('Sun Jan 12 23:49:01 CET 2014'),
('Sun Jan 12 23:49:02 CET 2014'),
('Sun Jan 12 23:49:03 CET 2014'),
('Sun Jan 12 23:49:04 CET 2014'),
('Sun Jan 12 23:49:05 CET 2014'),
('Sun Jan 12 23:49:06 CET 2014'),
('Sun Jan 12 23:49:07 CET 2014'),
('Sun Jan 12 23:49:08 CET 2014'),
('Sun Jan 12 23:49:09 CET 2014'),
('Sun Jan 12 23:49:10 CET 2014'),
('Sun Jan 12 23:49:11 CET 2014'),
('Sun Jan 12 23:49:12 CET 2014'),
('Sun Jan 12 23:49:13 CET 2014'),
('Sun Jan 12 23:49:14 CET 2014'),
('Sun Jan 12 23:49:15 CET 2014'),
('Sun Jan 12 23:49:16 CET 2014'),
('Sun Jan 12 23:49:17 CET 2014'),
('Sun Jan 12 23:49:18 CET 2014'),
('Sun Jan 12 23:49:19 CET 2014'),
('Sun Jan 12 23:49:20 CET 2014'),
('Sun Jan 12 23:49:21 CET 2014'),
('Sun Jan 12 23:49:22 CET 2014'),
('Sun Jan 12 23:49:23 CET 2014'),
('Sun Jan 12 23:49:24 CET 2014'),
('Sun Jan 12 23:49:25 CET 2014'),
('Sun Jan 12 23:49:26 CET 2014'),
('Sun Jan 12 23:49:27 CET 2014'),
('Sun Jan 12 23:49:28 CET 2014'),
('Sun Jan 12 23:49:29 CET 2014'),
('Sun Jan 12 23:49:30 CET 2014'),
('Sun Jan 12 23:49:31 CET 2014'),
('Sun Jan 12 23:49:32 CET 2014'),
('Sun Jan 12 23:49:33 CET 2014'),
('Sun Jan 12 23:49:34 CET 2014'),
('Sun Jan 12 23:49:35 CET 2014'),
('Sun Jan 12 23:49:36 CET 2014'),
('Sun Jan 12 23:49:37 CET 2014'),
('Sun Jan 12 23:49:38 CET 2014'),
('Sun Jan 12 23:49:39 CET 2014'),
('Sun Jan 12 23:49:40 CET 2014'),
('Sun Jan 12 23:49:41 CET 2014'),
('Sun Jan 12 23:49:42 CET 2014'),
('Sun Jan 12 23:49:43 CET 2014'),
('Sun Jan 12 23:49:44 CET 2014'),
('Sun Jan 12 23:49:45 CET 2014'),
('Sun Jan 12 23:49:46 CET 2014'),
('Sun Jan 12 23:49:47 CET 2014'),
('Sun Jan 12 23:49:48 CET 2014'),
('Sun Jan 12 23:49:49 CET 2014'),
('Sun Jan 12 23:49:50 CET 2014'),
('Sun Jan 12 23:49:51 CET 2014'),
('Sun Jan 12 23:49:52 CET 2014'),
('Sun Jan 12 23:49:53 CET 2014'),
('Sun Jan 12 23:49:54 CET 2014'),
('Sun Jan 12 23:49:55 CET 2014'),
('Sun Jan 12 23:49:56 CET 2014'),
('Sun Jan 12 23:49:57 CET 2014'),
('Sun Jan 12 23:49:58 CET 2014'),
('Sun Jan 12 23:49:59 CET 2014'),
('Sun Jan 12 23:50:00 CET 2014'),
('Sun Jan 12 23:50:01 CET 2014'),
('Sun Jan 12 23:50:02 CET 2014'),
('Sun Jan 12 23:50:03 CET 2014'),
('Sun Jan 12 23:50:04 CET 2014'),
('Sun Jan 12 23:50:05 CET 2014'),
('Sun Jan 12 23:50:06 CET 2014'),
('Sun Jan 12 23:50:07 CET 2014'),
('Sun Jan 12 23:50:08 CET 2014'),
('Sun Jan 12 23:50:09 CET 2014'),
('Sun Jan 12 23:50:10 CET 2014'),
('Sun Jan 12 23:50:11 CET 2014'),
('Sun Jan 12 23:50:12 CET 2014'),
('Sun Jan 12 23:50:13 CET 2014'),
('Sun Jan 12 23:50:14 CET 2014'),
('Sun Jan 12 23:50:15 CET 2014'),
('Sun Jan 12 23:50:16 CET 2014'),
('Sun Jan 12 23:50:17 CET 2014'),
('Sun Jan 12 23:50:18 CET 2014'),
('Sun Jan 12 23:50:19 CET 2014'),
('Sun Jan 12 23:50:20 CET 2014'),
('Sun Jan 12 23:50:21 CET 2014'),
('Sun Jan 12 23:50:22 CET 2014'),
('Sun Jan 12 23:50:23 CET 2014'),
('Sun Jan 12 23:50:24 CET 2014'),
('Sun Jan 12 23:50:25 CET 2014'),
('Sun Jan 12 23:50:26 CET 2014'),
('Sun Jan 12 23:50:27 CET 2014'),
('Sun Jan 12 23:50:28 CET 2014'),
('Sun Jan 12 23:50:29 CET 2014'),
('Sun Jan 12 23:50:30 CET 2014'),
('Sun Jan 12 23:50:31 CET 2014'),
('Sun Jan 12 23:50:32 CET 2014'),
('Sun Jan 12 23:50:33 CET 2014'),
('Sun Jan 12 23:50:34 CET 2014'),
('Sun Jan 12 23:50:35 CET 2014'),
('Sun Jan 12 23:50:36 CET 2014'),
('Sun Jan 12 23:50:37 CET 2014'),
('Sun Jan 12 23:50:38 CET 2014'),
('Sun Jan 12 23:50:39 CET 2014'),
('Sun Jan 12 23:50:40 CET 2014'),
('Sun Jan 12 23:50:41 CET 2014'),
('Sun Jan 12 23:50:42 CET 2014'),
('Sun Jan 12 23:50:43 CET 2014'),
('Sun Jan 12 23:50:44 CET 2014'),
('Sun Jan 12 23:50:45 CET 2014'),
('Sun Jan 12 23:50:46 CET 2014'),
('Sun Jan 12 23:50:47 CET 2014'),
('Sun Jan 12 23:50:48 CET 2014'),
('Sun Jan 12 23:50:49 CET 2014'),
('Sun Jan 12 23:50:50 CET 2014'),
('Sun Jan 12 23:50:51 CET 2014'),
('Sun Jan 12 23:50:52 CET 2014'),
('Sun Jan 12 23:50:53 CET 2014'),
('Sun Jan 12 23:50:54 CET 2014'),
('Sun Jan 12 23:50:55 CET 2014'),
('Sun Jan 12 23:50:56 CET 2014'),
('Sun Jan 12 23:50:57 CET 2014'),
('Sun Jan 12 23:50:58 CET 2014'),
('Sun Jan 12 23:50:59 CET 2014'),
('Sun Jan 12 23:51:00 CET 2014'),
('Sun Jan 12 23:51:01 CET 2014'),
('Sun Jan 12 23:51:02 CET 2014'),
('Sun Jan 12 23:51:03 CET 2014'),
('Sun Jan 12 23:51:04 CET 2014'),
('Sun Jan 12 23:51:05 CET 2014'),
('Sun Jan 12 23:51:06 CET 2014'),
('Sun Jan 12 23:51:07 CET 2014'),
('Sun Jan 12 23:51:08 CET 2014'),
('Sun Jan 12 23:51:09 CET 2014'),
('Sun Jan 12 23:51:10 CET 2014'),
('Sun Jan 12 23:51:11 CET 2014'),
('Sun Jan 12 23:51:12 CET 2014'),
('Sun Jan 12 23:51:13 CET 2014'),
('Sun Jan 12 23:51:14 CET 2014'),
('Sun Jan 12 23:51:15 CET 2014'),
('Sun Jan 12 23:51:16 CET 2014'),
('Sun Jan 12 23:51:17 CET 2014'),
('Sun Jan 12 23:51:18 CET 2014'),
('Sun Jan 12 23:51:19 CET 2014'),
('Sun Jan 12 23:51:20 CET 2014'),
('Sun Jan 12 23:51:21 CET 2014'),
('Sun Jan 12 23:51:22 CET 2014'),
('Sun Jan 12 23:51:23 CET 2014'),
('Sun Jan 12 23:51:24 CET 2014'),
('Sun Jan 12 23:51:25 CET 2014'),
('Sun Jan 12 23:51:26 CET 2014'),
('Sun Jan 12 23:51:27 CET 2014'),
(''),
('Sun Jan 12 23:51:28 CET 2014'),
('Sun Jan 12 23:51:29 CET 2014'),
('Sun Jan 12 23:51:30 CET 2014'),
('Sun Jan 12 23:51:31 CET 2014'),
('Sun Jan 12 23:51:32 CET 2014'),
('Sun Jan 12 23:51:33 CET 2014'),
('Sun Jan 12 23:51:34 CET 2014'),
('Sun Jan 12 23:51:35 CET 2014'),
('Sun Jan 12 23:51:36 CET 2014'),
('Sun Jan 12 23:51:37 CET 2014'),
('Sun Jan 12 23:51:38 CET 2014'),
('Sun Jan 12 23:51:39 CET 2014'),
('Sun Jan 12 23:51:40 CET 2014'),
('Sun Jan 12 23:51:41 CET 2014'),
('Sun Jan 12 23:51:42 CET 2014'),
('Sun Jan 12 23:51:43 CET 2014'),
('Sun Jan 12 23:51:44 CET 2014'),
('Sun Jan 12 23:51:45 CET 2014'),
('Sun Jan 12 23:51:46 CET 2014'),
('Sun Jan 12 23:51:47 CET 2014'),
('Sun Jan 12 23:51:48 CET 2014'),
('Sun Jan 12 23:51:49 CET 2014'),
('Sun Jan 12 23:51:50 CET 2014'),
('Sun Jan 12 23:51:51 CET 2014'),
('Sun Jan 12 23:51:52 CET 2014'),
('Sun Jan 12 23:51:53 CET 2014'),
('Sun Jan 12 23:51:54 CET 2014'),
('Sun Jan 12 23:51:55 CET 2014'),
('Sun Jan 12 23:51:56 CET 2014'),
('Sun Jan 12 23:51:57 CET 2014'),
('Sun Jan 12 23:51:58 CET 2014'),
('Sun Jan 12 23:51:59 CET 2014'),
('Sun Jan 12 23:52:00 CET 2014'),
('Sun Jan 12 23:52:01 CET 2014'),
('Sun Jan 12 23:52:02 CET 2014'),
('Sun Jan 12 23:52:03 CET 2014'),
('Sun Jan 12 23:52:04 CET 2014'),
('Sun Jan 12 23:52:05 CET 2014'),
('Sun Jan 12 23:52:06 CET 2014'),
('Sun Jan 12 23:52:07 CET 2014'),
('Sun Jan 12 23:52:08 CET 2014'),
('Sun Jan 12 23:52:09 CET 2014'),
('Sun Jan 12 23:52:10 CET 2014'),
('Sun Jan 12 23:52:11 CET 2014'),
('Sun Jan 12 23:52:12 CET 2014'),
('Sun Jan 12 23:52:13 CET 2014'),
('Sun Jan 12 23:52:14 CET 2014'),
('Sun Jan 12 23:52:15 CET 2014'),
('Sun Jan 12 23:52:16 CET 2014'),
('Sun Jan 12 23:52:17 CET 2014'),
('Sun Jan 12 23:52:18 CET 2014'),
('Sun Jan 12 23:52:19 CET 2014'),
('Sun Jan 12 23:52:20 CET 2014'),
('Sun Jan 12 23:52:21 CET 2014'),
('Sun Jan 12 23:52:22 CET 2014'),
('Sun Jan 12 23:52:23 CET 2014'),
('Sun Jan 12 23:52:24 CET 2014'),
('Sun Jan 12 23:52:25 CET 2014'),
('Sun Jan 12 23:52:26 CET 2014'),
('Sun Jan 12 23:52:27 CET 2014'),
('Sun Jan 12 23:52:28 CET 2014'),
('Sun Jan 12 23:52:29 CET 2014'),
('Sun Jan 12 23:52:30 CET 2014'),
('Sun Jan 12 23:52:31 CET 2014'),
('Sun Jan 12 23:52:32 CET 2014'),
('Sun Jan 12 23:52:33 CET 2014'),
('Sun Jan 12 23:52:34 CET 2014'),
('Sun Jan 12 23:52:35 CET 2014'),
('Sun Jan 12 23:52:36 CET 2014'),
('Sun Jan 12 23:52:37 CET 2014'),
('Sun Jan 12 23:52:38 CET 2014'),
('Sun Jan 12 23:52:39 CET 2014'),
('Sun Jan 12 23:52:40 CET 2014'),
('Sun Jan 12 23:52:41 CET 2014'),
('Sun Jan 12 23:52:42 CET 2014'),
('Sun Jan 12 23:52:43 CET 2014'),
('Sun Jan 12 23:52:44 CET 2014'),
('Sun Jan 12 23:52:45 CET 2014'),
('Sun Jan 12 23:52:46 CET 2014'),
('Sun Jan 12 23:52:47 CET 2014'),
('Sun Jan 12 23:52:48 CET 2014'),
('Sun Jan 12 23:52:49 CET 2014'),
('Sun Jan 12 23:52:50 CET 2014'),
('Sun Jan 12 23:52:51 CET 2014'),
('Sun Jan 12 23:52:52 CET 2014'),
('Sun Jan 12 23:52:53 CET 2014'),
('Sun Jan 12 23:52:54 CET 2014'),
('Sun Jan 12 23:52:55 CET 2014'),
('Sun Jan 12 23:52:56 CET 2014'),
('Sun Jan 12 23:52:57 CET 2014'),
('Sun Jan 12 23:52:58 CET 2014'),
('Sun Jan 12 23:52:59 CET 2014'),
('Sun Jan 12 23:53:00 CET 2014'),
('Sun Jan 12 23:53:01 CET 2014'),
('Sun Jan 12 23:53:02 CET 2014'),
('Sun Jan 12 23:53:03 CET 2014'),
('Sun Jan 12 23:53:04 CET 2014'),
('Sun Jan 12 23:53:05 CET 2014'),
('Sun Jan 12 23:53:06 CET 2014'),
('Sun Jan 12 23:53:07 CET 2014'),
('Sun Jan 12 23:53:08 CET 2014'),
('Sun Jan 12 23:53:09 CET 2014'),
('Sun Jan 12 23:53:10 CET 2014'),
('Sun Jan 12 23:53:11 CET 2014'),
('Sun Jan 12 23:53:12 CET 2014'),
('Sun Jan 12 23:53:13 CET 2014'),
('Sun Jan 12 23:53:14 CET 2014'),
('Sun Jan 12 23:53:15 CET 2014'),
('Sun Jan 12 23:53:16 CET 2014'),
('Sun Jan 12 23:53:17 CET 2014'),
('Sun Jan 12 23:53:18 CET 2014'),
('Sun Jan 12 23:53:19 CET 2014'),
('Sun Jan 12 23:53:20 CET 2014'),
('Sun Jan 12 23:53:21 CET 2014'),
('Sun Jan 12 23:53:22 CET 2014'),
('Sun Jan 12 23:53:23 CET 2014'),
('Sun Jan 12 23:53:24 CET 2014'),
('Sun Jan 12 23:53:25 CET 2014'),
('Sun Jan 12 23:53:26 CET 2014'),
('Sun Jan 12 23:53:27 CET 2014'),
('Sun Jan 12 23:53:28 CET 2014'),
('Sun Jan 12 23:53:29 CET 2014'),
('Sun Jan 12 23:53:30 CET 2014'),
('Sun Jan 12 23:53:31 CET 2014'),
('Sun Jan 12 23:53:32 CET 2014'),
('Sun Jan 12 23:53:33 CET 2014'),
('Sun Jan 12 23:53:34 CET 2014'),
('Sun Jan 12 23:53:35 CET 2014'),
('Sun Jan 12 23:53:36 CET 2014'),
('Sun Jan 12 23:53:37 CET 2014'),
('Sun Jan 12 23:53:38 CET 2014'),
(''),
('Sun Jan 12 23:53:39 CET 2014'),
('Sun Jan 12 23:53:40 CET 2014'),
('Sun Jan 12 23:53:41 CET 2014'),
('Sun Jan 12 23:53:42 CET 2014'),
('Sun Jan 12 23:53:43 CET 2014'),
('Sun Jan 12 23:53:44 CET 2014'),
('Sun Jan 12 23:53:45 CET 2014'),
('Sun Jan 12 23:53:46 CET 2014'),
('Sun Jan 12 23:53:47 CET 2014'),
('Sun Jan 12 23:53:48 CET 2014'),
('Sun Jan 12 23:53:49 CET 2014'),
('Sun Jan 12 23:53:50 CET 2014'),
('Sun Jan 12 23:53:51 CET 2014'),
('Sun Jan 12 23:53:52 CET 2014'),
('Sun Jan 12 23:53:53 CET 2014'),
('Sun Jan 12 23:53:54 CET 2014'),
('Sun Jan 12 23:53:55 CET 2014'),
('Sun Jan 12 23:53:56 CET 2014'),
('Sun Jan 12 23:53:57 CET 2014'),
('Sun Jan 12 23:53:58 CET 2014'),
('Sun Jan 12 23:53:59 CET 2014'),
('Sun Jan 12 23:54:00 CET 2014'),
('Sun Jan 12 23:54:01 CET 2014'),
('Sun Jan 12 23:54:02 CET 2014'),
('Sun Jan 12 23:54:03 CET 2014'),
('Sun Jan 12 23:54:04 CET 2014'),
('Sun Jan 12 23:54:05 CET 2014'),
('Sun Jan 12 23:54:06 CET 2014'),
('Sun Jan 12 23:54:07 CET 2014'),
('Sun Jan 12 23:54:08 CET 2014'),
('Sun Jan 12 23:54:09 CET 2014'),
('Sun Jan 12 23:54:10 CET 2014'),
('Sun Jan 12 23:54:11 CET 2014'),
('Sun Jan 12 23:54:12 CET 2014'),
('Sun Jan 12 23:54:13 CET 2014'),
('Sun Jan 12 23:54:14 CET 2014'),
('Sun Jan 12 23:54:15 CET 2014'),
('Sun Jan 12 23:54:16 CET 2014'),
('Sun Jan 12 23:54:17 CET 2014'),
('Sun Jan 12 23:54:18 CET 2014'),
('Sun Jan 12 23:54:19 CET 2014'),
('Sun Jan 12 23:54:20 CET 2014'),
('Sun Jan 12 23:54:21 CET 2014'),
('Sun Jan 12 23:54:22 CET 2014'),
('Sun Jan 12 23:54:23 CET 2014'),
('Sun Jan 12 23:54:24 CET 2014'),
('Sun Jan 12 23:54:25 CET 2014'),
('Sun Jan 12 23:54:26 CET 2014'),
('Sun Jan 12 23:54:27 CET 2014'),
('Sun Jan 12 23:54:28 CET 2014'),
('Sun Jan 12 23:54:29 CET 2014'),
('Sun Jan 12 23:54:30 CET 2014'),
('Sun Jan 12 23:54:31 CET 2014'),
('Sun Jan 12 23:54:32 CET 2014'),
('Sun Jan 12 23:54:33 CET 2014'),
('Sun Jan 12 23:54:34 CET 2014'),
('Sun Jan 12 23:54:35 CET 2014'),
('Sun Jan 12 23:54:36 CET 2014'),
('Sun Jan 12 23:54:37 CET 2014'),
('Sun Jan 12 23:54:38 CET 2014'),
('Sun Jan 12 23:54:39 CET 2014'),
('Sun Jan 12 23:54:40 CET 2014'),
('Sun Jan 12 23:54:41 CET 2014'),
('Sun Jan 12 23:54:42 CET 2014'),
('Sun Jan 12 23:54:43 CET 2014'),
('Sun Jan 12 23:54:44 CET 2014'),
('Sun Jan 12 23:54:45 CET 2014'),
('Sun Jan 12 23:54:46 CET 2014'),
('Sun Jan 12 23:54:47 CET 2014'),
('Sun Jan 12 23:54:48 CET 2014'),
('Sun Jan 12 23:54:49 CET 2014'),
('Sun Jan 12 23:54:50 CET 2014'),
('Sun Jan 12 23:54:51 CET 2014'),
('Sun Jan 12 23:54:52 CET 2014'),
('Sun Jan 12 23:54:53 CET 2014'),
('Sun Jan 12 23:54:54 CET 2014'),
('Sun Jan 12 23:54:55 CET 2014'),
('Sun Jan 12 23:54:56 CET 2014'),
('Sun Jan 12 23:54:57 CET 2014'),
('Sun Jan 12 23:54:58 CET 2014'),
('Sun Jan 12 23:54:59 CET 2014'),
('Sun Jan 12 23:55:00 CET 2014'),
('Sun Jan 12 23:55:01 CET 2014'),
('Sun Jan 12 23:55:02 CET 2014'),
('Sun Jan 12 23:55:03 CET 2014'),
('Sun Jan 12 23:55:04 CET 2014'),
('Sun Jan 12 23:55:05 CET 2014'),
('Sun Jan 12 23:55:06 CET 2014'),
('Sun Jan 12 23:55:07 CET 2014'),
('Sun Jan 12 23:55:08 CET 2014'),
('Sun Jan 12 23:55:09 CET 2014'),
('Sun Jan 12 23:55:10 CET 2014'),
('Sun Jan 12 23:55:11 CET 2014'),
('Sun Jan 12 23:55:12 CET 2014'),
('Sun Jan 12 23:55:13 CET 2014'),
('Sun Jan 12 23:55:14 CET 2014'),
('Sun Jan 12 23:55:15 CET 2014'),
('Sun Jan 12 23:55:16 CET 2014'),
('Sun Jan 12 23:55:17 CET 2014'),
('Sun Jan 12 23:55:18 CET 2014'),
('Sun Jan 12 23:55:19 CET 2014'),
('Sun Jan 12 23:55:20 CET 2014'),
('Sun Jan 12 23:55:21 CET 2014'),
('Sun Jan 12 23:55:22 CET 2014'),
('Sun Jan 12 23:55:23 CET 2014'),
('Sun Jan 12 23:55:24 CET 2014'),
('Sun Jan 12 23:55:25 CET 2014'),
('Sun Jan 12 23:55:26 CET 2014'),
('Sun Jan 12 23:55:27 CET 2014'),
('Sun Jan 12 23:55:28 CET 2014'),
('Sun Jan 12 23:55:29 CET 2014'),
('Sun Jan 12 23:55:30 CET 2014'),
('Sun Jan 12 23:55:31 CET 2014'),
('Sun Jan 12 23:55:32 CET 2014'),
('Sun Jan 12 23:55:33 CET 2014'),
('Sun Jan 12 23:55:34 CET 2014'),
('Sun Jan 12 23:55:35 CET 2014'),
('Sun Jan 12 23:55:36 CET 2014'),
('Sun Jan 12 23:55:37 CET 2014'),
('Sun Jan 12 23:55:38 CET 2014'),
('Sun Jan 12 23:55:39 CET 2014'),
('Sun Jan 12 23:55:40 CET 2014'),
('Sun Jan 12 23:55:41 CET 2014'),
('Sun Jan 12 23:55:42 CET 2014'),
('Sun Jan 12 23:55:43 CET 2014'),
('Sun Jan 12 23:55:44 CET 2014'),
('Sun Jan 12 23:55:45 CET 2014'),
('Sun Jan 12 23:55:46 CET 2014'),
('Sun Jan 12 23:55:47 CET 2014'),
('Sun Jan 12 23:55:48 CET 2014'),
('Sun Jan 12 23:55:49 CET 2014'),
('Sun Jan 12 23:55:50 CET 2014'),
('Sun Jan 12 23:55:51 CET 2014'),
('Sun Jan 12 23:55:52 CET 2014'),
('Sun Jan 12 23:55:53 CET 2014'),
('Sun Jan 12 23:55:54 CET 2014'),
('Sun Jan 12 23:55:55 CET 2014'),
('Sun Jan 12 23:55:56 CET 2014'),
('Sun Jan 12 23:55:56 CET 2014'),
('Sun Jan 12 23:55:57 CET 2014'),
('Sun Jan 12 23:55:57 CET 2014'),
('Sun Jan 12 23:55:58 CET 2014'),
('Sun Jan 12 23:55:58 CET 2014'),
('Sun Jan 12 23:56:00 CET 2014'),
('Sun Jan 12 23:56:01 CET 2014'),
('Sun Jan 12 23:56:02 CET 2014'),
('Sun Jan 12 23:56:03 CET 2014'),
('Sun Jan 12 23:56:04 CET 2014'),
('Sun Jan 12 23:56:05 CET 2014'),
('Sun Jan 12 23:56:06 CET 2014'),
('Sun Jan 12 23:56:07 CET 2014'),
('Sun Jan 12 23:56:08 CET 2014'),
('Sun Jan 12 23:56:08 CET 2014'),
('Sun Jan 12 23:56:09 CET 2014'),
('Sun Jan 12 23:56:09 CET 2014'),
('Sun Jan 12 23:56:10 CET 2014'),
('Sun Jan 12 23:56:11 CET 2014'),
('Sun Jan 12 23:56:12 CET 2014'),
('Sun Jan 12 23:56:13 CET 2014'),
('Sun Jan 12 23:56:14 CET 2014'),
('Sun Jan 12 23:56:15 CET 2014'),
('Sun Jan 12 23:56:16 CET 2014'),
('Sun Jan 12 23:56:17 CET 2014'),
('Sun Jan 12 23:56:18 CET 2014'),
('Sun Jan 12 23:56:19 CET 2014'),
('Sun Jan 12 23:56:20 CET 2014'),
('Sun Jan 12 23:56:21 CET 2014'),
('Sun Jan 12 23:56:22 CET 2014'),
('Sun Jan 12 23:56:23 CET 2014'),
('Sun Jan 12 23:56:24 CET 2014'),
('Sun Jan 12 23:56:25 CET 2014'),
('Sun Jan 12 23:56:26 CET 2014'),
('Sun Jan 12 23:56:27 CET 2014'),
('Sun Jan 12 23:56:28 CET 2014'),
('Sun Jan 12 23:56:29 CET 2014'),
('Sun Jan 12 23:56:30 CET 2014'),
('Sun Jan 12 23:56:31 CET 2014'),
('Sun Jan 12 23:56:32 CET 2014'),
('Sun Jan 12 23:56:33 CET 2014'),
('Sun Jan 12 23:56:34 CET 2014'),
('Sun Jan 12 23:56:35 CET 2014'),
('Sun Jan 12 23:56:36 CET 2014'),
('Sun Jan 12 23:56:37 CET 2014'),
('Sun Jan 12 23:56:38 CET 2014'),
('Sun Jan 12 23:56:39 CET 2014'),
('Sun Jan 12 23:56:40 CET 2014'),
('Sun Jan 12 23:56:41 CET 2014'),
('Sun Jan 12 23:56:42 CET 2014'),
('Sun Jan 12 23:56:43 CET 2014'),
('Sun Jan 12 23:56:44 CET 2014'),
('Sun Jan 12 23:56:45 CET 2014'),
('Sun Jan 12 23:56:46 CET 2014'),
('Sun Jan 12 23:56:47 CET 2014'),
('Sun Jan 12 23:56:48 CET 2014'),
('Sun Jan 12 23:56:49 CET 2014'),
('Sun Jan 12 23:56:50 CET 2014'),
('Sun Jan 12 23:56:51 CET 2014'),
('Sun Jan 12 23:56:52 CET 2014'),
('Sun Jan 12 23:56:53 CET 2014'),
('Sun Jan 12 23:56:54 CET 2014'),
('Sun Jan 12 23:56:55 CET 2014'),
('Sun Jan 12 23:56:56 CET 2014'),
('Sun Jan 12 23:56:57 CET 2014'),
('Sun Jan 12 23:56:58 CET 2014'),
('Sun Jan 12 23:56:59 CET 2014'),
('Sun Jan 12 23:57:00 CET 2014'),
('Sun Jan 12 23:57:01 CET 2014'),
('Sun Jan 12 23:57:02 CET 2014'),
('Sun Jan 12 23:57:03 CET 2014'),
('Sun Jan 12 23:57:04 CET 2014'),
('Sun Jan 12 23:57:05 CET 2014'),
('Sun Jan 12 23:57:06 CET 2014'),
('Sun Jan 12 23:57:07 CET 2014'),
('Sun Jan 12 23:57:08 CET 2014'),
('Sun Jan 12 23:57:09 CET 2014'),
('Sun Jan 12 23:57:10 CET 2014'),
('Sun Jan 12 23:57:11 CET 2014'),
('Sun Jan 12 23:57:12 CET 2014'),
('Sun Jan 12 23:57:13 CET 2014'),
('Sun Jan 12 23:57:14 CET 2014'),
('Sun Jan 12 23:57:15 CET 2014'),
('Sun Jan 12 23:57:16 CET 2014'),
('Sun Jan 12 23:57:17 CET 2014'),
('Sun Jan 12 23:57:18 CET 2014'),
('Sun Jan 12 23:57:19 CET 2014'),
('Sun Jan 12 23:57:20 CET 2014'),
('Sun Jan 12 23:57:21 CET 2014'),
('Sun Jan 12 23:57:22 CET 2014'),
('Sun Jan 12 23:57:23 CET 2014'),
('Sun Jan 12 23:57:24 CET 2014'),
('Sun Jan 12 23:57:25 CET 2014'),
('Sun Jan 12 23:57:26 CET 2014'),
('Sun Jan 12 23:57:27 CET 2014'),
('Sun Jan 12 23:57:28 CET 2014'),
('Sun Jan 12 23:57:29 CET 2014'),
('Sun Jan 12 23:57:30 CET 2014'),
('Sun Jan 12 23:57:31 CET 2014'),
('Sun Jan 12 23:57:32 CET 2014'),
('Sun Jan 12 23:57:33 CET 2014'),
('Sun Jan 12 23:57:34 CET 2014'),
('Sun Jan 12 23:57:35 CET 2014'),
('Sun Jan 12 23:57:36 CET 2014'),
('Sun Jan 12 23:57:37 CET 2014'),
('Sun Jan 12 23:57:38 CET 2014'),
('Sun Jan 12 23:57:39 CET 2014'),
('Sun Jan 12 23:57:40 CET 2014'),
('Sun Jan 12 23:57:41 CET 2014'),
('Sun Jan 12 23:57:42 CET 2014'),
('Sun Jan 12 23:57:43 CET 2014'),
('Sun Jan 12 23:57:43 CET 2014'),
('Sun Jan 12 23:57:44 CET 2014'),
('Sun Jan 12 23:57:44 CET 2014'),
('Sun Jan 12 23:57:45 CET 2014'),
('Sun Jan 12 23:57:45 CET 2014'),
('Sun Jan 12 23:57:46 CET 2014'),
('Sun Jan 12 23:57:46 CET 2014'),
('Sun Jan 12 23:57:47 CET 2014'),
('Sun Jan 12 23:57:47 CET 2014'),
('Sun Jan 12 23:57:48 CET 2014'),
('Sun Jan 12 23:57:48 CET 2014'),
('Sun Jan 12 23:57:49 CET 2014'),
('Sun Jan 12 23:57:49 CET 2014'),
('Sun Jan 12 23:57:50 CET 2014'),
('Sun Jan 12 23:57:50 CET 2014'),
('Sun Jan 12 23:57:51 CET 2014'),
('Sun Jan 12 23:57:51 CET 2014'),
('Sun Jan 12 23:57:52 CET 2014'),
('Sun Jan 12 23:57:52 CET 2014'),
('Sun Jan 12 23:57:53 CET 2014'),
('Sun Jan 12 23:57:54 CET 2014'),
('Sun Jan 12 23:57:55 CET 2014'),
('Sun Jan 12 23:57:56 CET 2014'),
('Sun Jan 12 23:57:57 CET 2014'),
('Sun Jan 12 23:57:58 CET 2014'),
('Sun Jan 12 23:57:59 CET 2014'),
('Sun Jan 12 23:58:00 CET 2014'),
('Sun Jan 12 23:58:01 CET 2014'),
('Sun Jan 12 23:58:02 CET 2014'),
('Sun Jan 12 23:58:03 CET 2014'),
('Sun Jan 12 23:58:04 CET 2014'),
('Sun Jan 12 23:58:05 CET 2014'),
('Sun Jan 12 23:58:06 CET 2014'),
('Sun Jan 12 23:58:07 CET 2014'),
('Sun Jan 12 23:58:08 CET 2014'),
('Sun Jan 12 23:58:09 CET 2014'),
('Sun Jan 12 23:58:10 CET 2014'),
('Sun Jan 12 23:58:11 CET 2014'),
('Sun Jan 12 23:58:12 CET 2014'),
('Sun Jan 12 23:58:13 CET 2014'),
('Sun Jan 12 23:58:14 CET 2014'),
('Sun Jan 12 23:58:15 CET 2014'),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
('rechts'),
('rechts'),
('rechts'),
('rechts'),
('rechts'),
('rechts'),
('rechts'),
('rechts'),
('rechts'),
('rechts'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten'),
('unten');

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
(23, 20, 1, 79),
(22, 20, 1, 78),
(21, 20, 1, 77),
(20, 20, 1, 76),
(20, 21, 1, 75),
(20, 22, 1, 74),
(20, 23, 1, 73),
(20, 24, 1, 72),
(20, 25, 1, 71),
(20, 26, 1, 70),
(20, 27, 1, 69),
(20, 28, 1, 68),
(20, 29, 1, 67),
(20, 30, 1, 66),
(20, 31, 1, 65),
(20, 32, 1, 64),
(20, 33, 1, 63),
(20, 34, 1, 62),
(20, 35, 1, 61),
(20, 36, 1, 60),
(20, 37, 1, 59),
(20, 38, 1, 58),
(20, 39, 1, 57),
(20, 40, 1, 56),
(20, 41, 1, 55),
(20, 42, 1, 54),
(20, 43, 1, 53),
(20, 44, 1, 52),
(20, 45, 1, 51),
(20, 46, 1, 50),
(20, 47, 1, 49),
(20, 48, 1, 48),
(20, 49, 1, 47),
(20, 50, 1, 46),
(20, 51, 1, 45),
(20, 52, 1, 44),
(20, 53, 1, 43),
(20, 54, 1, 42),
(20, 55, 1, 41),
(20, 56, 1, 40),
(20, 57, 1, 39),
(20, 58, 1, 38),
(20, 59, 1, 37),
(20, 60, 1, 36),
(20, 61, 1, 35),
(20, 62, 1, 34),
(20, 63, 1, 33),
(20, 64, 1, 32),
(20, 65, 1, 31),
(20, 66, 1, 30),
(20, 67, 1, 29),
(20, 68, 1, 28),
(20, 69, 1, 27),
(20, 70, 1, 26),
(20, 71, 1, 25),
(20, 72, 1, 24),
(20, 73, 1, 23),
(20, 74, 1, 22),
(20, 75, 1, 21),
(20, 76, 1, 20),
(20, 77, 1, 19),
(20, 78, 1, 18),
(20, 79, 1, 17),
(20, 80, 1, 16),
(20, 81, 1, 15),
(20, 82, 1, 14),
(20, 83, 1, 13),
(20, 84, 1, 12),
(20, 85, 1, 11),
(20, 86, 1, 10),
(20, 87, 1, 9),
(20, 88, 1, 8),
(20, 89, 1, 7),
(20, 90, 1, 6),
(20, 91, 1, 5),
(20, 92, 1, 4),
(20, 93, 1, 3),
(20, 94, 1, 2),
(20, 95, 1, 1);

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
(1, 75);

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
--
-- Datenbank: `test`
--

DELIMITER $$
--
-- Prozeduren
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `test_multi_sets`()
    DETERMINISTIC
begin
        select user() as first_col;
        select user() as first_col, now() as second_col;
        select user() as first_col, now() as second_col, now() as third_col;
        end$$

DELIMITER ;
--
-- Datenbank: `webauth`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `user_pwd`
--

CREATE TABLE IF NOT EXISTS `user_pwd` (
  `name` char(30) COLLATE latin1_general_ci NOT NULL DEFAULT '',
  `pass` char(32) COLLATE latin1_general_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Daten für Tabelle `user_pwd`
--

INSERT INTO `user_pwd` (`name`, `pass`) VALUES
('xampp', 'wampp');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
