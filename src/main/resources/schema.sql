DROP TABLE IF EXISTS TBL_CERTIFICADO_SANITARIO;
 
CREATE TABLE TBL_CERTIFICADO_SANITARIO (
  id_certificado INT AUTO_INCREMENT  PRIMARY KEY,
  codigo_interacion VARCHAR(25) NOT NULL,
	id_servicio VARCHAR(25) NOT NULL,
	id_remitente VARCHAR(25) NOT NULL,
	pais_remitente VARCHAR(25) NOT NULL,
	id_destinatario VARCHAR(25) NOT NULL,
	pais_destinatario VARCHAR(25) NOT NULL,
	id_transaccion VARCHAR(25) NOT NULL,
	estado_transaccion VARCHAR(25) NOT NULL,
	fecha VARCHAR(50) NOT NULL,
	tipo_documento VARCHAR(25) NOT NULL,
	id_documento VARCHAR(25) NOT NULL,
  codigo_acuse_recibo VARCHAR(50) NOT NULL,
	glosa_acuse_recibo VARCHAR(250),
	fecha_acuse_recibo VARCHAR(50)
);

DROP TABLE IF EXISTS TBL_MENSAJE_FALLA;
 
CREATE TABLE TBL_MENSAJE_FALLA (
  id_mensaje INT AUTO_INCREMENT  PRIMARY KEY,
  id_certificado INT NOT NULL,
	codigo_error VARCHAR(50) NOT NULL,
	mensaje_error VARCHAR(250) NOT NULL,
	FOREIGN KEY (id_certificado) REFERENCES TBL_CERTIFICADO_SANITARIO(id_certificado)
);


alter table TBL_MENSAJE_FALLA add FOREIGN KEY (id_certificado) REFERENCES TBL_CERTIFICADO_SANITARIO(id_certificado);
