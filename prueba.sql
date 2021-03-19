-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-03-2021 a las 01:55:04
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 7.3.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prueba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prueba`
--

CREATE TABLE `prueba` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(15) NOT NULL,
  `edad` int(11) NOT NULL,
  `correo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `prueba`
--

INSERT INTO `prueba` (`id`, `nombre`, `apellido`, `edad`, `correo`) VALUES
(3, 'Clemencia ', 'rojas Vargas', 54, 'clementina@gmail.com'),
(4, 'sebastian camilo  ', 'Olmos Rojas', 25, 'sebasolmos1995@gmail.com'),
(5, 'rigoberto', 'olmos rivera', 56, 'sajdsajdlas@gmail.com'),
(6, 'a', 'b', 0, 'k'),
(7, 'c', 'c', 0, 'c'),
(8, 't', 't', 0, 't'),
(9, 'r', 'r', 0, 'r'),
(14, 'q', 'q', 0, 'q'),
(15, 'i', 'i', 0, 'i'),
(16, 'i', 'i', 0, 'i'),
(20, 'Andres Felipe', 'Olmos Rojas', 18, 'afolmos28@misena.edu.co'),
(25, 'John', 'Doe', 15, 'john@example.com'),
(26, 'kk', 'oo', 18, ' aa'),
(27, 'asdaa', 'iaa', 12, ' aaaaaaaa'),
(28, 'hola', 'chao', 1, ' no teno'),
(29, '', '', 0, '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `prueba`
--
ALTER TABLE `prueba`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `prueba`
--
ALTER TABLE `prueba`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
