INSERT INTO cliente
(cliente_id, nombre, apellido_paterno, apellido_materno, edad)
VALUES
(1, 'JOSE DANIEL', 'SANCHEZ', 'ESTRADA', 24),
(2, 'ARANTXA CRISTINA', 'SANCHEZ', 'ESTRADA', 21),
(3, 'DONALD', 'TRUMP', NULL, 90);

INSERT INTO vuelo
(vuelo_id, fecha_salida, fecha_regreso, origen, destino)
VALUES
(1, '2016-11-21 06:00:00', '2016-11-30 15:30:00', 'CDMX', 'ALEMANIA'),
(2, '2016-12-01 08:00:00', '2016-12-01 09:15:00', 'CDMX', 'GUADALAJARA'),
(3, '2017-01-15 07:30:00', '2017-01-15 17:30:00', 'CDMX', 'EGIPTO'),
(4, '2017-02-14 22:00:00', '2017-02-15 10:05:00', 'USA', 'IRAN');

INSERT INTO venta
(venta_id, cliente_id, vuelo_id, asiento)
VALUES
(1, 1, 1, '21-A'),
(2, 1, 3, '21-A'),
(3, 3, 4, '50-F'),
(4, 2, 2, '1-D'),
(5, 3, 3, '10-F');
