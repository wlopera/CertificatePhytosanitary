INSERT INTO TBL_CERTIFICADO_SANITARIO (
codigo_interacion,
id_servicio,
id_remitente,
pais_remitente,
id_destinatario,
pais_destinatario,
id_transaccion,
estado_transaccion,
fecha,
tipo_documento,
id_documento,
codigo_acuse_recibo,
glosa_acuse_recibo,
fecha_acuse_recibo
) 
VALUES
  ('IOP.MC.101', 'IOP.PE.FS.001', 'VUCEPE', 'PE', 'VUCEMX', 'MX', 'PE041219000001', 'ECIOP', '2019-12-04T13:20:00.000-05:00', 'FS', '302330', 'RCB', 'Recibido...', '2019-12-04T12:27:50.411-03:00'),
	('IOP.MC.101', 'IOP.PE.FS.001', 'VUCEPE', 'PE', 'VUCEMX', 'MX', 'PE051219000002', 'ECIOP', '2019-12-05T13:20:00.000-05:00', 'FS', '302330', 'RCB', 'Recibido...', '2019-12-05T12:27:50.411-03:00'),
	('IOP.MC.101', 'IOP.PE.FS.001', 'VUCEPE', 'PE', 'VUCEMX', 'MX', 'PE051219000002', 'ECIOP', '2019-12-05T13:20:00.000-05:00', 'FS', '302330', 'ERR', null, null);	
	
INSERT INTO TBL_MENSAJE_FALLA (
id_certificado,
codigo_error,
mensaje_error
) 
VALUES
(3, 'EC007', 'ID de Transacción  no es válido'),
(3, 'EC008', 'Mensaje de prueba erronea');