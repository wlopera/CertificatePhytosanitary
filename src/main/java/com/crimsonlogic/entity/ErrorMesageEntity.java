package com.crimsonlogic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Modelo de base de datos.
 * 
 * @author Willian Lopera
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "TBL_MENSAJE_FALLA")
public class ErrorMesageEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMensaje;
	
	@Column(name = "id_certificado")
	private Long idCertificado;
	
	@Column(name = "codigo_error")
	private String codigoError;

	@Column(name = "mensaje_error")
	private String mensajeError;
	
}
