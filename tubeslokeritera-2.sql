-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: May 17, 2019 at 06:15 AM
-- Server version: 5.7.25
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubeslokeritera`
--

-- --------------------------------------------------------

--
-- Table structure for table `ambil`
--

CREATE TABLE `ambil` (
  `id` int(11) NOT NULL,
  `waktu_ambil` date DEFAULT NULL,
  `harga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ambil`
--

INSERT INTO `ambil` (`id`, `waktu_ambil`, `harga`) VALUES
(123, '2019-05-17', 5000);

--
-- Triggers `ambil`
--
DELIMITER $$
CREATE TRIGGER `masukkan ke loker harga` AFTER INSERT ON `ambil` FOR EACH ROW insert into loker set harga = new.harga
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `masukkan ke loker waktu_ambil` AFTER INSERT ON `ambil` FOR EACH ROW insert into loker set waktu_ambil = new.waktu_ambil
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `loker`
--

CREATE TABLE `loker` (
  `no_loker` int(11) NOT NULL,
  `id` int(11) DEFAULT NULL,
  `waktu_akses` date DEFAULT NULL,
  `waktu_ambil` date DEFAULT NULL,
  `harga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `nama_depan` varchar(30) NOT NULL,
  `nama_belakang` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `telepon` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`nama_depan`, `nama_belakang`, `alamat`, `jenis_kelamin`, `email`, `telepon`, `username`, `password`) VALUES
('Angelica', 'Kirana', 'Jl. Saku Raju', 'Perempuan', 'angelicakirana@icloud.com', '082114910946', 'angelica', 'anjing123'),
('muhammad', 'auziqni', 'jl. kapten abdul haq', 'Laki-laki', 'auziqni@gmail.com', '082210030650', 'auziq', 'anakayam');

-- --------------------------------------------------------

--
-- Table structure for table `sewa`
--

CREATE TABLE `sewa` (
  `id` int(11) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `waktu_akses` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sewa`
--

INSERT INTO `sewa` (`id`, `password`, `waktu_akses`) VALUES
(123, 'anak', '2019-05-17');

--
-- Triggers `sewa`
--
DELIMITER $$
CREATE TRIGGER `masukkan ke loker id` AFTER INSERT ON `sewa` FOR EACH ROW insert into loker set id = new.id
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `masukkan ke loker waktu akses` BEFORE INSERT ON `sewa` FOR EACH ROW insert into loker 
set waktu_akses = new.waktu_akses
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ambil`
--
ALTER TABLE `ambil`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `loker`
--
ALTER TABLE `loker`
  ADD PRIMARY KEY (`no_loker`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `sewa`
--
ALTER TABLE `sewa`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `loker`
--
ALTER TABLE `loker`
  ADD CONSTRAINT `loker_ibfk_1` FOREIGN KEY (`id`) REFERENCES `sewa` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
