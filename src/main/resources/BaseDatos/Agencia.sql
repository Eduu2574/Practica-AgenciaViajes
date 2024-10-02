DROP DATABASE IF EXISTS agencia_viajes;
CREATE DATABASE agencia_viajes;
Use agencia_viajes;

CREATE TABLE usuarios (
                          id_usuario INT AUTO_INCREMENT PRIMARY KEY,
                          usuario VARCHAR(50) NOT NULL,
                          contrasena VARCHAR(264) NOT NULL
);

CREATE TABLE reservas (
                          id_reserva INT AUTO_INCREMENT PRIMARY KEY,
                          id_usuario INT,
                          destino VARCHAR(50) NOT NULL,
                          medioTransporte VARCHAR(50) NOT NULL,
                          FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);
