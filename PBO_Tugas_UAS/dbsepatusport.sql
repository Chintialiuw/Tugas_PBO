-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2023 at 06:49 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbsepatusport`
--

-- --------------------------------------------------------

--
-- Table structure for table `datalogin`
--

CREATE TABLE `datalogin` (
  `nama` varchar(50) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datalogin`
--

INSERT INTO `datalogin` (`nama`, `username`, `password`) VALUES
('Chintia Liu Wintin', 'Chintialiuw', '008');

-- --------------------------------------------------------

--
-- Table structure for table `datasepatu`
--

CREATE TABLE `datasepatu` (
  `kode` int(10) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `brand` varchar(25) NOT NULL,
  `kategori` varchar(25) NOT NULL,
  `footwear` varchar(25) NOT NULL,
  `ukuran` int(5) NOT NULL,
  `gender` varchar(15) NOT NULL,
  `warna` varchar(20) NOT NULL,
  `harga` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datasepatu`
--

INSERT INTO `datasepatu` (`kode`, `nama`, `brand`, `kategori`, `footwear`, `ukuran`, `gender`, `warna`, `harga`) VALUES
(101, 'Astec Factory Flip Flop', 'Astec', 'Walking', 'Sandals', 39, 'Men', 'Black', 38700),
(102, 'Adidas Ultimashow', 'Adidas', 'Running', 'Sport Performances', 42, 'Unisex', 'White', 640000),
(103, 'Skechers Go Walk Joy', 'Skechers', 'Walking', 'Sneakers', 39, 'Women', 'Purple', 767200),
(104, 'Astec Hawke', 'Astec', 'Badminton', 'Sport Performances', 40, 'Men', 'Blue', 447200),
(105, 'Diadora Futura', 'Diadora', 'Basketball', 'Sport Performances', 43, 'Men', 'Black', 479200);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datalogin`
--
ALTER TABLE `datalogin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `datasepatu`
--
ALTER TABLE `datasepatu`
  ADD PRIMARY KEY (`kode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
