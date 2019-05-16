-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2019 at 12:35 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
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
  `password` varchar(30) NOT NULL,
  `repassword` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`nama_depan`, `nama_belakang`, `alamat`, `jenis_kelamin`, `email`, `telepon`, `username`, `password`, `repassword`) VALUES
('Senora', 'Ria Pardede', 'Korpri', 'Perempuan', 'senorariapardede24@gmail.com', '082298778966', 'admin.senora', '14117115', '14117115'),
('Yosi', 'Mardianti', 'Korpri', 'Perempuan', 'yorermrd@gmail.com', '082267887688', 'admin.yosi', '14117096', '14117096'),
('Alya', 'Khoirunnisa R', 'Bandar Lampung', 'Perempuan', 'alya@gmail.com', '081546557788', 'alya', 'Rizkita', 'Rizkita'),
('Putri', 'Maulidya Yasshiro', 'Ryacudu', 'Perempuan', 'putriyasshiro@gmail.com', '081543345676', 'putri', '14117022', '14117022'),
('Raras', 'Franita', 'Pahoman', 'Perempuan', 'rarasfrnta@gmail.com', '088256453422', 'raras', '14117063', '14117063'),
('Reza', 'Octaviany', 'Antasari', 'Perempuan', 'rezaoctaviany@gmail.com', '092278554354', 'rezaoc', '14117062', '14117062');

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
