-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 19 Ara 2015, 02:18:59
-- Sunucu sürümü: 10.1.9-MariaDB
-- PHP Sürümü: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `ogrencisistemi`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `dersnot`
--

CREATE TABLE `dersnot` (
  `ogrno` int(11) NOT NULL,
  `dersad` varchar(20) NOT NULL,
  `vizenot` int(11) DEFAULT NULL,
  `finalnot` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hocaders`
--

CREATE TABLE `hocaders` (
  `hocaid` int(11) NOT NULL,
  `dersad` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hocak`
--

CREATE TABLE `hocak` (
  `hocaid` int(11) NOT NULL,
  `hocaisim` varchar(20) NOT NULL,
  `hocasoyisim` varchar(20) NOT NULL,
  `hocab` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ogrencik`
--

CREATE TABLE `ogrencik` (
  `ogrno` int(11) NOT NULL,
  `ograd` varchar(20) NOT NULL,
  `soyad` varchar(20) NOT NULL,
  `bolum` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `dersnot`
--
ALTER TABLE `dersnot`
  ADD UNIQUE KEY `uniq` (`ogrno`,`dersad`);

--
-- Tablo için indeksler `hocaders`
--
ALTER TABLE `hocaders`
  ADD UNIQUE KEY `uniq` (`hocaid`,`dersad`);

--
-- Tablo için indeksler `hocak`
--
ALTER TABLE `hocak`
  ADD PRIMARY KEY (`hocaid`),
  ADD UNIQUE KEY `uniq` (`hocaisim`,`hocasoyisim`) USING BTREE;

--
-- Tablo için indeksler `ogrencik`
--
ALTER TABLE `ogrencik`
  ADD PRIMARY KEY (`ogrno`),
  ADD UNIQUE KEY `uniq` (`ograd`,`soyad`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `hocak`
--
ALTER TABLE `hocak`
  MODIFY `hocaid` int(11) NOT NULL AUTO_INCREMENT;
--
-- Tablo için AUTO_INCREMENT değeri `ogrencik`
--
ALTER TABLE `ogrencik`
  MODIFY `ogrno` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
