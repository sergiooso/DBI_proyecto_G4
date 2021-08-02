
CREATE DATABASE Odontologia;
USE Odontologia;

CREATE TABLE Paciente(
    Id_Paciente INT, 
    Pri_Nombre TEXT NOT NULL,
    Seg_Nombre TEXT NOT NULL,
    Pri_Apellido TEXT NOT NULL,
    Seg_Apellido TEXT NOT NULL,
    Telefono VARCHAR(9) NOT NULL,
    Correo TEXT NOT NULL,
    Direccion TEXT NOT NULL,
    Fecha_Nac DATE NOT NULL,
    Contrasenia VARCHAR(20) NOT NULL,

    CONSTRAINT PK_Id_Paciente PRIMARY KEY (Id_Paciente)
);

CREATE TABLE Sucursal(
    Id_Sucursal INT,
    Direccio VARCHAR(50) NOT NULL,
    Avenida VARCHAR(30) NOT NULL,
    Calle VARCHAR(30) NOT NULL,
    Ciudad VARCHAR(20) NOT NULL,
    Telefono VARCHAR(9) NOT NULL,

    CONSTRAINT PK_Id_Sucursal PRIMARY KEY (Id_Sucursal)
);

CREATE TABLE Empleado(
    Dni_Empleado INT,
    Pri_Nombre TEXT NOT NULL,
    Seg_Nombre TEXT NOT NULL,
    Pri_Apellido TEXT NOT NULL,
    Seg_Apellido TEXT NOT NULL,
    Telefono VARCHAR(9) NOT NULL,
    Cargo ENUM ('Recepcionista','Contador','Gerente Administrativo') NOT NULL, 
    /*Pueden haber mas tipos de cargo, los que estan ahi solo son de ejemplo*/
    Sexo ENUM ('Femenino','Masculino') NOT NULL,
    Contrasenia VARCHAR(20) NOT NULL,
    Id_Sucursal INT NOT NULL,

    CONSTRAINT PK_Dni_Empleado PRIMARY KEY (Dni_Empleado),
    CONSTRAINT FK_Id_Sucursal_E FOREIGN KEY (Id_Sucursal) REFERENCES Sucursal(Id_Sucursal)
);

CREATE TABLE Consultorio(
    Num_Consultorio INT NOT NULL,
    Id_Sucursal INT NOT NULL,
    Nombre_Consultorio VARCHAR (50) NOT NULL, 
    Ubicacion VARCHAR(50) NOT NULL,

	PRIMARY KEY (Num_Consultorio,Id_Sucursal),
    CONSTRAINT FK_Id_Sucursal_C FOREIGN KEY (Id_Sucursal) REFERENCES Sucursal(Id_Sucursal)
);

CREATE TABLE Odontologo(
    Id_Odontologo INT,
    Especialidad VARCHAR(20) NOT NULL,
    Pri_Nombre TEXT NOT NULL,
    Seg_Nombre TEXT NOT NULL,
    Pri_Apellido TEXT NOT NULL,
    Seg_Apellido TEXT NOT NULL,
    Contrasenia VARCHAR(20) NOT NULL,
    Id_Sucursal INT NOT NULL,

    CONSTRAINT PK_Id_Odontologo PRIMARY KEY (Id_Odontologo),
    CONSTRAINT FK_Id_Sucursal FOREIGN KEY (Id_Sucursal) REFERENCES Sucursal(Id_Sucursal)
);

CREATE TABLE Consulta(
    Num_Consulta INT,
    Fecha DATE NOT NULL,
    Id_Paciente INT NOT NULL,
    Id_Odontologo INT NOT NULL,

    CONSTRAINT PK_Num_Consulta PRIMARY KEY (Num_Consulta),
    CONSTRAINT FK_Id_Paciente_CON FOREIGN KEY (Id_Paciente) REFERENCES Paciente(Id_Paciente),
    CONSTRAINT FK_Id_Odontologo_CON FOREIGN KEY (Id_Odontologo) REFERENCES Odontologo(Id_Odontologo)

);

CREATE TABLE Expediente(
    Id_Expediente INT,
    Descripcion TEXT NOT NULL,
    Fecha_Inicio DATE NOT NULL,
    Id_Paciente INT NOT NULL,
    Id_Odontologo INT NOT NULL,

    CONSTRAINT PK_Id_Expediente PRIMARY KEY (Id_Expediente),
    CONSTRAINT FK_Id_Paciente_EX FOREIGN KEY (Id_Paciente) REFERENCES Paciente(Id_Paciente),
    CONSTRAINT FK_Id_Odontologo_EX FOREIGN KEY (Id_Odontologo) REFERENCES Odontologo(Id_Odontologo)
);

CREATE TABLE Receta_Medica(
    Id_Receta INT,
    Descripcion TEXT NOT NULL,
    Fecha_Actual DATE NOT NULL,
    Id_Paciente INT NOT NULL,
    Id_Odontologo INT NOT NULL,

    CONSTRAINT PK_Id_Receta PRIMARY KEY (Id_Receta),
    CONSTRAINT FK_Id_Paciente_RM FOREIGN KEY (Id_Paciente) REFERENCES Paciente (Id_Paciente),
    CONSTRAINT FK_Id_Odontologo_RM FOREIGN KEY (Id_Odontologo) REFERENCES Odontologo(Id_Odontologo)
);

CREATE TABLE Tratamiento(
    Id_Tratamiento INT,
    Nombre VARCHAR(50) NOT NULL,
    Precio FLOAT NOT NULL,
    Fecha_Inicio DATE NOT NULL,
    Id_Odontologo INT NOT NULL,

    CONSTRAINT PK_Id_Tratamiento PRIMARY KEY (Id_Tratamiento),
    CONSTRAINT FK_Id_Odontologo_TR FOREIGN KEY (Id_Odontologo) REFERENCES Odontologo(Id_Odontologo)
);

CREATE TABLE Factura(
    Num_Factura INT,
    Descripcion VARCHAR(50) NOT NULL,
    Total_Pagar FLOAT NOT NULL,
    Direccion TEXT NOT NULL,
    Fecha_Actual DATE NOT NULL,
    Subtotal FLOAT NOT NULL,
    Id_Paciente INT NOT NULL,
    Id_Odontologo INT NOT NULL,

    CONSTRAINT Num_Factura PRIMARY KEY (Num_Factura),
    CONSTRAINT FK_Id_Paciente_FC FOREIGN KEY (Id_Paciente) REFERENCES Paciente(Id_Paciente),
    CONSTRAINT FK_Id_Odontologo_FC FOREIGN KEY (Id_Odontologo) REFERENCES Odontologo(Id_Odontologo)
);

