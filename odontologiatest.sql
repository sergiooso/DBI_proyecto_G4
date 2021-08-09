-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-08-2021 a las 20:09:21
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `odontologiatest`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `borrarProcedureConsulta` (IN `num_consultaIn` INT(11))  READS SQL DATA
DELETE FROM consulta WHERE num_consulta = num_consultaIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `borrarProcedureConsultorio` (IN `num_consultorioIn` INT(11))  READS SQL DATA
DELETE FROM consultorio WHERE num_consultorio = num_consultorioIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `borrarProcedureEmpleado` (IN `id_empleadoIn` INT(11))  READS SQL DATA
DELETE FROM empleado WHERE id_empleado = id_empleadoIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `borrarProcedureExpediente` (IN `id_expedienteIn` INT(11))  READS SQL DATA
DELETE FROM paciente WHERE id_expediente = id_expedienteIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `borrarProcedureFactura` (IN `num_facturaIn` INT(11))  READS SQL DATA
DELETE FROM factura WHERE num_factura = num_facturaIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `borrarProcedureOdontologo` (IN `id_odontologoIn` INT(11))  READS SQL DATA
DELETE FROM odontologo WHERE id_odontologo = id_odontologoIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `borrarProcedurePaciente` (IN `idIn` INT(11))  READS SQL DATA
DELETE FROM paciente WHERE id_paciente = id_pacienteIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `borrarProcedureReceta` (IN `id_recetaIn` INT(11))  READS SQL DATA
DELETE FROM receta_medica WHERE id_receta = id_recetaIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `borrarProcedureSucursal` (IN `id_sucursalIn` INT(11))  READS SQL DATA
DELETE FROM sucursal WHERE id_sucursal = id_sucursalIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `borrarProcedureTratamiento` (IN `id_tratamientoIn` INT(11))  READS SQL DATA
DELETE FROM tratamiento WHERE id_tratamiento = id_tratamientoIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ciudadProcedureEmpleado` (IN `ciudadIn` VARCHAR(255))  READS SQL DATA
SELECT * FROM empleado WHERE cargo = cargoIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ciudadProcedureSucursal` (IN `ciudadIn` VARCHAR(255))  READS SQL DATA
SELECT * FROM sucursal WHERE ciudad = ciudadIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `correoProcedurePaciente` (IN `correoIn` VARCHAR(255))  READS SQL DATA
SELECT * FROM paciente WHERE correo = correoIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `fechaProcedureExpediente` (IN `fecha_inicioIn` DATE)  READS SQL DATA
SELECT * FROM expediente WHERE fecha_inicio = fecha_inicioIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `fechaProcedureTratamiento` (IN `fecha_inicioIn` DATE)  READS SQL DATA
SELECT * FROM tratamiento WHERE fecha_inicio = fecha_inicioIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `idProcedureConsulta` (IN `num_consulta` INT(11))  READS SQL DATA
SELECT * FROM consulta WHERE num_consulta = num_consultaIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `idProcedureConsultorio` (IN `num_consultorio` INT(11))  READS SQL DATA
SELECT * FROM consultorio WHERE num_consultorio = num_consultorioIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `idProcedureEmpleado` (IN `id_empleadoIn` INT(11))  READS SQL DATA
SELECT * FROM empleado WHERE id_empleado = id_empleadoIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `idProcedureExpediente` (IN `id_expedienteIn` INT(11))  READS SQL DATA
SELECT * FROM expediente WHERE id_expediente = id_expedienteIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `idProcedureFactura` (IN `num_facturaIn` INT(11))  READS SQL DATA
SELECT * FROM factura WHERE num_factura = num_facturaIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `idProcedureOdontologo` (IN `id_odonotlogoIn` INT(11))  READS SQL DATA
SELECT * FROM odontologo WHERE id_odontologo = id_odontologoIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `idProcedurePaciente` (IN `idIn` INT(11))  READS SQL DATA
SELECT * FROM paciente WHERE id_paciente = id_pacienteIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `idProcedureReceta` (IN `id_receta` INT(11))  READS SQL DATA
SELECT * FROM receta_medica WHERE id_receta = id_recetaIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `idProcedureSucursal` (IN `id_sucursalIn` INT(11))  READS SQL DATA
SELECT * FROM sucursal WHERE id_sucursal = id_sucursalIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `idProcedureTratamiento` (IN `id_tratamientoIn` INT(11))  READS SQL DATA
SELECT * FROM tratamiento WHERE id_tratamiento = id_tratamientoIn$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listaProcedureConsulta` ()  READS SQL DATA
SELECT * FROM consulta$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listaProcedureConsultorio` ()  READS SQL DATA
SELECT * FROM consultorio$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listaProcedureEmpleado` ()  READS SQL DATA
SELECT * FROM empleado$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listaProcedureExpediente` ()  READS SQL DATA
SELECT * FROM expediente$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listaProcedureFactura` ()  READS SQL DATA
SELECT * FROM factura$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listaProcedureOdontologo` ()  READS SQL DATA
SELECT * FROM odontologo$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listaProcedurePaciente` ()  READS SQL DATA
SELECT * FROM paciente$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listaProcedureReceta` ()  READS SQL DATA
SELECT * FROM receta_medica$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listaProcedureSucursal` ()  READS SQL DATA
SELECT * FROM sucursal$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listaProcedureTratamiento` ()  READS SQL DATA
SELECT * FROM tratamiento$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `saveProcedureConsulta` (IN `fechaIn` DATE, IN `id_OdontologoIn` INT(11), IN `pacienteIn` FLOAT)  MODIFIES SQL DATA
INSERT INTO consulta(num_consulta, fecha, id_odontologo, paciente)
                            VALUES (num_consultaIn ,fechaIn, id_odontologoIn, pacienteIn)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `saveProcedureConsultorio` (IN `nombre_consultorioIn` VARCHAR(255), IN `ubicacionIn` VARCHAR(255), IN `id_sucursalIn` INT(11))  MODIFIES SQL DATA
INSERT INTO consultorio(num_consultorio, nombre_consultorio, ubicacion, id_sucursal)
                            VALUES (num_consultorioIn, nombre_consultorioIn, ubicacionIn, id_sucursalIn)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `saveProcedureEmpleado` (IN `cargoIn` VARCHAR(255), IN `contraseniaIn` VARCHAR(255), IN `pri_apellidoIn` VARCHAR(255), IN `pri_nombreIn` VARCHAR(255), IN `seg_apellidoIn` VARCHAR(255), IN `seg_nombreIn` VARCHAR(255), IN `sexoIn` VARCHAR(255), IN `telefonoIn` VARCHAR(255), IN `dni_empleadoIn` VARCHAR(255), IN `id_sucursalIn` INT(11))  MODIFIES SQL DATA
INSERT INTO empleado(cargo,contrasenia, pri_apellido, pri_nombre, seg_apellido, seg_nombre, sexo, telefono, dni_empleado, id_sucursal )
                            VALUES (cargoIn ,contraseniaIn, pri_apellidoIn, pri_nombreIn, seg_apellidoIn, seg_nombreIn, sexoIn, telefonoIn, dni_empleadoIn, id_sucursalIn)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `saveProcedureExpediente` (IN `descripcionIn` VARCHAR(255), IN `fecha_inicioIn` DATE, IN `id_odontologoIn` INT(11), IN `id_pacienteIn` INT(11))  MODIFIES SQL DATA
INSERT INTO expediente(id_expediente, descripcion, fecha_inicio,id_odontologo, id_paciente)
                            VALUES (id_expedienteIn, descripcionIn, fecha_InicioIn, id_odontologoIn, id_pacienteIn)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `saveProcedureFactura` (IN `descripcionIn` VARCHAR(255), IN `direccionIn` VARCHAR(255), IN `fecha_actualIn` DATE, IN `subtotalIn` FLOAT, IN `total_pagarIn` FLOAT, IN `pacienteIn` INT(11), IN `tratamientoIn` INT(11))  MODIFIES SQL DATA
INSERT INTO factura(num_factura,descripcion,direccion,fecha_actual,subtotal,total_pagar, paciente, tratamiento )
                            VALUES (num_facturaIn,descripcionIn,direccionIn,fecha_actualIn,subtotalIn, total_pagarIn, pacientIn, tratamientoIn  )$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `saveProcedureOdontologo` (IN `pri_apellidoIn` VARCHAR(255), IN `pri_nombreIn` VARCHAR(255), IN `seg_apellidoIn` VARCHAR(255), IN `seg_nombreIn` VARCHAR(255), IN `sucursalIn` INT(11), IN `contraseniaIn` VARCHAR(255))  MODIFIES SQL DATA
INSERT INTO odontologo( pri_nombre, seg_nombre, pri_apellido, seg_apellido,contrasenia, sucursal)
                            VALUES (pri_nombreIn, seg_nombreIn, pri_apellidoIn, seg_apellidoIn,contraseniaIn, sucursalIn)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `saveProcedurePaciente` (IN `pri_nombreIn` VARCHAR(255), IN `seg_nombreIn` VARCHAR(255), IN `pri_apellidoIn` VARCHAR(255), IN `seg_apellidoIn` VARCHAR(255), IN `telefonoIn` VARCHAR(9), IN `correoIn` VARCHAR(255), IN `direccionIn` VARCHAR(255), IN `fecha_nacIn` DATE, IN `contraseniaIn` VARCHAR(255))  MODIFIES SQL DATA
INSERT INTO paciente(pri_nombre, seg_nombre,pri_apellido,seg_apellido,telefono,correo,
                            direccion,fechaNac,constrasenia)
                            VALUES (pri_nombreIn, seg_nombreIn,pri_apellidoIn,seg_apellidoIn,
                            telefonoIn,correoIn,direccionIn,fecha_nacIn,contraseniaIn)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `saveProcedureReceta` (IN `descripcionIn` VARCHAR(255), IN `fecha_actualIn` DATE, IN `id_odontologoIn` INT(11), IN `pacienteIn` INT(11))  MODIFIES SQL DATA
INSERT INTO receta_medica(id_receta, descripcion, fecha_actual, id_odontologo, paciente)
        VALUES (id_recetaIn, descripcionIn, fecha_actualIn, id_odontologoIn, pacienteIn)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `saveProcedureSucursal` (IN `avenidaIn` VARCHAR(255), IN `calleIn` VARCHAR(255), IN `ciudadIn` VARCHAR(255), IN `direccionIn` VARCHAR(255), IN `telefonoIn` VARCHAR(9))  MODIFIES SQL DATA
INSERT INTO sucursal(id_sucursal, avenida, calle, ciudad, direccion, telefono)
                            VALUES (id_sucursalIn, avenidaIn, calleIn, ciudadIn, direccionIn, telefonoIn)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `saveProcedureTratamiento` (IN `fecha_inicioIn` DATE, IN `nombreIn` VARCHAR(255), IN `precioIn` FLOAT, IN `id_odontologoIn` INT(11))  MODIFIES SQL DATA
INSERT INTO factura(id_tratamiento, fecha_inicio, nombre, precio, id_odontologo)
                            VALUES (id_tratamientoIn ,fecha_inicioIn, nombreIn, precionIn, id_odontologoIn )$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consulta`
--

CREATE TABLE `consulta` (
  `num_consulta` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `id_odontologo` int(11) NOT NULL,
  `paciente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultorio`
--

CREATE TABLE `consultorio` (
  `num_consultorio` int(11) NOT NULL,
  `nombre_consultorio` varchar(255) DEFAULT NULL,
  `ubicacion` varchar(255) DEFAULT NULL,
  `id_sucursal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `id_empleado` int(11) NOT NULL,
  `cargo` varchar(255) DEFAULT NULL,
  `contrasenia` varchar(255) DEFAULT NULL,
  `pri_apellido` varchar(255) DEFAULT NULL,
  `pri_nombre` varchar(255) DEFAULT NULL,
  `seg_apellido` varchar(255) DEFAULT NULL,
  `seg_nombre` varchar(255) DEFAULT NULL,
  `sexo` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `dni_empleado` varchar(255) DEFAULT NULL,
  `id_sucursal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `expediente`
--

CREATE TABLE `expediente` (
  `id_expediente` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `id_odontologo` int(11) NOT NULL,
  `paciente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `num_factura` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `fecha_actual` date DEFAULT NULL,
  `subtotal` float NOT NULL,
  `total_pagar` float NOT NULL,
  `paciente` int(11) DEFAULT NULL,
  `tratamiento` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `odontologo`
--

CREATE TABLE `odontologo` (
  `id_odontologo` int(11) NOT NULL,
  `contrasenia` varchar(255) DEFAULT NULL,
  `pri_apellido` varchar(255) DEFAULT NULL,
  `pri_nombre` varchar(255) DEFAULT NULL,
  `seg_apellido` varchar(255) DEFAULT NULL,
  `seg_nombre` varchar(255) DEFAULT NULL,
  `sucursal` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id_paciente` int(11) NOT NULL,
  `contrasenia` varchar(255) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `fecha_nac` date DEFAULT NULL,
  `pri_apellido` varchar(255) DEFAULT NULL,
  `pri_nombre` varchar(255) DEFAULT NULL,
  `seg_apellido` varchar(255) DEFAULT NULL,
  `seg_nombre` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `receta_medica`
--

CREATE TABLE `receta_medica` (
  `id_receta` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `fecha_actual` date DEFAULT NULL,
  `id_odontologo` int(11) NOT NULL,
  `paciente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursal`
--

CREATE TABLE `sucursal` (
  `id_sucursal` int(11) NOT NULL,
  `avenida` varchar(255) DEFAULT NULL,
  `calle` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `id_tratamiento` int(11) NOT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` float NOT NULL,
  `id_odontologo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `consulta`
--
ALTER TABLE `consulta`
  ADD PRIMARY KEY (`num_consulta`),
  ADD KEY `FKbelx573o4vb6goni6dw2g7cqp` (`id_odontologo`),
  ADD KEY `FKbi5x3tf7f45cgvmxi715yguaw` (`paciente`);

--
-- Indices de la tabla `consultorio`
--
ALTER TABLE `consultorio`
  ADD PRIMARY KEY (`num_consultorio`),
  ADD KEY `FKeijdwr92973tqkac1a5n99psa` (`id_sucursal`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id_empleado`),
  ADD KEY `FK5lshn105gw8o1gcw78wysko3u` (`id_sucursal`);

--
-- Indices de la tabla `expediente`
--
ALTER TABLE `expediente`
  ADD PRIMARY KEY (`id_expediente`),
  ADD KEY `FK9g5ljj3t4i89ddv3h91ux2xao` (`id_odontologo`),
  ADD KEY `FKos3vlp0ki8tkdyr265e16si7u` (`paciente`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`num_factura`),
  ADD KEY `FKl0xcahbxhfhnureqvsagh9mar` (`paciente`),
  ADD KEY `FKde711f8718tpgcy3chqeluwge` (`tratamiento`);

--
-- Indices de la tabla `odontologo`
--
ALTER TABLE `odontologo`
  ADD PRIMARY KEY (`id_odontologo`),
  ADD KEY `FKlu85mit0eqhd7422akovhbjre` (`sucursal`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id_paciente`);

--
-- Indices de la tabla `receta_medica`
--
ALTER TABLE `receta_medica`
  ADD PRIMARY KEY (`id_receta`),
  ADD KEY `FKl5t2rtl4xfqymt3fep1g2xetj` (`id_odontologo`),
  ADD KEY `FKrwn4lim89l8g36pw2kyw2flpf` (`paciente`);

--
-- Indices de la tabla `sucursal`
--
ALTER TABLE `sucursal`
  ADD PRIMARY KEY (`id_sucursal`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`id_tratamiento`),
  ADD KEY `FK39pn03wkp0fx5w26ehjfiwq39` (`id_odontologo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `consulta`
--
ALTER TABLE `consulta`
  MODIFY `num_consulta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `consultorio`
--
ALTER TABLE `consultorio`
  MODIFY `num_consultorio` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `id_empleado` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `expediente`
--
ALTER TABLE `expediente`
  MODIFY `id_expediente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `num_factura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `odontologo`
--
ALTER TABLE `odontologo`
  MODIFY `id_odontologo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id_paciente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `receta_medica`
--
ALTER TABLE `receta_medica`
  MODIFY `id_receta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `sucursal`
--
ALTER TABLE `sucursal`
  MODIFY `id_sucursal` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `id_tratamiento` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `consulta`
--
ALTER TABLE `consulta`
  ADD CONSTRAINT `FKbelx573o4vb6goni6dw2g7cqp` FOREIGN KEY (`id_odontologo`) REFERENCES `odontologo` (`id_odontologo`),
  ADD CONSTRAINT `FKbi5x3tf7f45cgvmxi715yguaw` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`id_paciente`);

--
-- Filtros para la tabla `consultorio`
--
ALTER TABLE `consultorio`
  ADD CONSTRAINT `FKeijdwr92973tqkac1a5n99psa` FOREIGN KEY (`id_sucursal`) REFERENCES `sucursal` (`id_sucursal`);

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `FK5lshn105gw8o1gcw78wysko3u` FOREIGN KEY (`id_sucursal`) REFERENCES `sucursal` (`id_sucursal`);

--
-- Filtros para la tabla `expediente`
--
ALTER TABLE `expediente`
  ADD CONSTRAINT `FK9g5ljj3t4i89ddv3h91ux2xao` FOREIGN KEY (`id_odontologo`) REFERENCES `odontologo` (`id_odontologo`),
  ADD CONSTRAINT `FKos3vlp0ki8tkdyr265e16si7u` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`id_paciente`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `FKde711f8718tpgcy3chqeluwge` FOREIGN KEY (`tratamiento`) REFERENCES `tratamiento` (`id_tratamiento`),
  ADD CONSTRAINT `FKl0xcahbxhfhnureqvsagh9mar` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`id_paciente`);

--
-- Filtros para la tabla `odontologo`
--
ALTER TABLE `odontologo`
  ADD CONSTRAINT `FKlu85mit0eqhd7422akovhbjre` FOREIGN KEY (`sucursal`) REFERENCES `sucursal` (`id_sucursal`);

--
-- Filtros para la tabla `receta_medica`
--
ALTER TABLE `receta_medica`
  ADD CONSTRAINT `FKl5t2rtl4xfqymt3fep1g2xetj` FOREIGN KEY (`id_odontologo`) REFERENCES `odontologo` (`id_odontologo`),
  ADD CONSTRAINT `FKrwn4lim89l8g36pw2kyw2flpf` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`id_paciente`);

--
-- Filtros para la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD CONSTRAINT `FK39pn03wkp0fx5w26ehjfiwq39` FOREIGN KEY (`id_odontologo`) REFERENCES `odontologo` (`id_odontologo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
