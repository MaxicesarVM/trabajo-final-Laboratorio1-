-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-11-2025 a las 22:58:37
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tfi- spa entre dedos`
--
CREATE DATABASE IF NOT EXISTS `tfi- spa entre dedos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `tfi- spa entre dedos`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `codCliente` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre_completo` varchar(50) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `edad` int(11) NOT NULL,
  `afecciones` varchar(50) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`codCliente`, `dni`, `nombre_completo`, `telefono`, `edad`, `afecciones`, `estado`) VALUES
(1, 39393939, 'Maxi Velazquez', 11321231, 29, 'ninguna', 1),
(2, 4747474, 'alejandro peralta', 131341323, 20, 'agarra la pala', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dia_de_spa`
--

CREATE TABLE `dia_de_spa` (
  `codPack` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `preferencias` varchar(50) NOT NULL,
  `codCli` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `monto` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dia_de_spa`
--

INSERT INTO `dia_de_spa` (`codPack`, `fecha`, `preferencias`, `codCli`, `estado`, `monto`) VALUES
(1, '2025-11-13', 'faciales', 1, 1, 0),
(3, '2025-11-15', 'esteticos', 2, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `instalacion`
--

CREATE TABLE `instalacion` (
  `codInstalacion` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `detalle` varchar(100) NOT NULL,
  `precio` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `instalacion`
--

INSERT INTO `instalacion` (`codInstalacion`, `nombre`, `detalle`, `precio`, `estado`) VALUES
(0, 'Ninguno', 'Ninguno', 0, 1),
(1, 'Jacuzzi o hidromasaje', 'Bañeras con chorros de agua a presión para relajar', 5000, 1),
(2, 'Piscina climatizada', 'Piscinas con agua a temperatura agradable', 2000, 1),
(3, 'Baño turco o Sauna', 'Habitaciones con vapor de agua caliente para purificar y limpiar la piel en profundidad', 1200, 1),
(4, 'Duchas de sensaciones', 'Combina diferentes temperaturas, presiones y aroma', 1500, 1),
(5, 'Pediluvio', 'Baño de pies que combina agua fría y caliente', 2500, 1),
(6, 'Circuito de hidroterapia', 'Secuencia de 3 bañeras de agua con diferentes temperaturas', 2500, 1),
(7, 'Zona de relajacion', 'Espacio con tumboras o sillones para descansar', 500, 1),
(8, 'Sala de te', 'area que ofrecen bebida relajante bonificado', 5000, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `masajista`
--

CREATE TABLE `masajista` (
  `matricula` int(11) NOT NULL,
  `nombre_completo` varchar(50) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `especialidad` varchar(50) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `masajista`
--

INSERT INTO `masajista` (`matricula`, `nombre_completo`, `telefono`, `especialidad`, `estado`) VALUES
(101, 'Ana López', 2657123456, 'facial', 1),
(102, 'María Giménez', 2657234567, 'facial', 1),
(103, 'Carla Torres', 2664112233, 'facial', 1),
(201, 'Lucía Fernández', 2664223344, 'estetico', 1),
(202, 'Sofía Ruiz', 2657345678, 'estetico', 1),
(203, 'Valeria Gómez', 2664334455, 'estetico', 1),
(301, 'Jorge Paez', 2657456789, 'corporales', 1),
(302, 'Marcos Sosa', 2664556677, 'corporales', 1),
(303, 'Diego Castro', 2657567890, 'corporales', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sesion`
--

CREATE TABLE `sesion` (
  `codSesion` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `hora_inicio` time NOT NULL,
  `hora_fin` time NOT NULL,
  `codTratamiento` int(11) DEFAULT NULL,
  `codMasajista` int(11) DEFAULT NULL,
  `codPack` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `codInstalacion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sesion`
--

INSERT INTO `sesion` (`codSesion`, `fecha`, `hora_inicio`, `hora_fin`, `codTratamiento`, `codMasajista`, `codPack`, `estado`, `codInstalacion`) VALUES
(1, '2025-11-13', '11:00:00', '12:30:00', 3, 102, 1, 1, 3),
(2, '2025-11-15', '12:00:00', '14:00:00', 4, 201, 3, 1, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `codTratamiento` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `detalle` varchar(100) NOT NULL,
  `producto` varchar(50) DEFAULT NULL,
  `duracion` int(11) NOT NULL,
  `costo` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`codTratamiento`, `nombre`, `tipo`, `detalle`, `producto`, `duracion`, `costo`, `estado`) VALUES
(0, 'Ninguno', 'Ninguno', 'Ninguno', 'Ninguno', 0, 0, 1),
(1, 'Facial básico', 'facial', 'Limpieza profunda, exfoliación y mascarilla para refrescar el cutis.', 'Mascarilla de Arcilla', 60, 3500, 1),
(2, 'Faciales avanzados', 'facial', 'Pueden incluir tratamientos antienvejecimiento, microdermoabrasión o hidrafaciales.', 'Sérum Antiedad (acido hialuronico)', 60, 7000, 1),
(3, 'Microdermoabrasión', 'facial', 'Exfolia la capa superficial de la piel usando puntas de diamante o microcristales.', 'Puntas de Diamante (insumo)', 30, 4500, 1),
(4, 'Radiofrecuencia', 'facial', 'Usa ondas de radio para generar calor en la piel, estimulando la producción de colágeno y elastina.', 'Gel Conductor (AloeVera)', 60, 5500, 1),
(5, 'Ultrasonido', 'facial', 'Usa ondas sonoras de alta frecuencia para limpiar la piel, penetrar activos o hacer masajes profundo', 'Crema humectante', 30, 4800, 1),
(6, 'Luz Pulsada Intensa (IPL)', 'facial', 'Utilizada para fotodepilación, rejuvenecimiento de la piel y tratamiento de manchas.', 'Gel de Enfriamiento (a base de agua)', 30, 6000, 1),
(7, 'Vaporizador facial', 'facial', 'Produce vapor para abrir los poros y limpiar la piel profundamente.', 'Agua Destilada', 30, 2000, 1),
(8, 'Exfoliación corporal', 'corporal', 'Elimina las células muertas de la piel con el uso de sales o azúcares.', 'Sales Marinas Exfoliantes', 30, 4000, 1),
(9, 'Envolturas corporales', 'corporal', 'Hidratan y desintoxican la piel con ingredientes como algas, barro o chocolate.', 'Algas o Barro', 60, 5200, 1),
(10, 'Hidroterapia', 'corporal', 'Sesiones en saunas, jacuzzis o baños de vapor.', 'Ninguno', 60, 4500, 1),
(11, 'Vacumterapia', 'corporal', 'Es una succión corporal que mejora la circulación sanguínea y el drenaje linfático.', 'Aceite Drenante (de origen vegetal)', 30, 5000, 1),
(12, 'Manicura', 'estetico', 'Cuidado y embellecimiento de las uñas de las manos.', 'Esmalte y Loción Hidratante', 30, 2500, 1),
(13, 'Pedicura', 'estetico', 'Cuidado y embellecimiento de las uñas de los pies.', 'Crema Callicida y Esmalte', 30, 3000, 1),
(14, 'Tratamiento capilar', 'estetico', 'Procedimientos para mejorar la salud y apariencia del cabello.', 'Ampolla Reestructurante', 60, 5500, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codCliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `dia_de_spa`
--
ALTER TABLE `dia_de_spa`
  ADD PRIMARY KEY (`codPack`),
  ADD KEY `codCli` (`codCli`);

--
-- Indices de la tabla `instalacion`
--
ALTER TABLE `instalacion`
  ADD PRIMARY KEY (`codInstalacion`);

--
-- Indices de la tabla `masajista`
--
ALTER TABLE `masajista`
  ADD PRIMARY KEY (`matricula`);

--
-- Indices de la tabla `sesion`
--
ALTER TABLE `sesion`
  ADD PRIMARY KEY (`codSesion`),
  ADD KEY `codTratamiento` (`codTratamiento`),
  ADD KEY `codMasajista` (`codMasajista`),
  ADD KEY `sesion/pack_ibfk_2` (`codPack`),
  ADD KEY `codInstalacion` (`codInstalacion`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`codTratamiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `codCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `dia_de_spa`
--
ALTER TABLE `dia_de_spa`
  MODIFY `codPack` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `instalacion`
--
ALTER TABLE `instalacion`
  MODIFY `codInstalacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `sesion`
--
ALTER TABLE `sesion`
  MODIFY `codSesion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `codTratamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dia_de_spa`
--
ALTER TABLE `dia_de_spa`
  ADD CONSTRAINT `dia_de_spa_ibfk_1` FOREIGN KEY (`codCli`) REFERENCES `cliente` (`codCliente`);

--
-- Filtros para la tabla `sesion`
--
ALTER TABLE `sesion`
  ADD CONSTRAINT `sesion_ibfk_1` FOREIGN KEY (`codTratamiento`) REFERENCES `tratamiento` (`codTratamiento`),
  ADD CONSTRAINT `sesion_ibfk_2` FOREIGN KEY (`codPack`) REFERENCES `dia_de_spa` (`codPack`),
  ADD CONSTRAINT `sesion_ibfk_3` FOREIGN KEY (`codMasajista`) REFERENCES `masajista` (`matricula`),
  ADD CONSTRAINT `sesion_ibfk_4` FOREIGN KEY (`codInstalacion`) REFERENCES `instalacion` (`codInstalacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
