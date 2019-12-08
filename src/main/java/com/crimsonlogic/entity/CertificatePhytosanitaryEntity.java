package com.crimsonlogic.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
@Table(name = "TBL_CERTIFICADO_SANITARIO")
public class CertificatePhytosanitaryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCertificado;

	@Column(name = "codigo_interacion")
	private String codigoInteraccion;

	@Column(name = "id_servicio")
	private String idServicio;

	@Column(name = "id_remitente")
	private String idRemitente;

	@Column(name = "pais_remitente")
	private String paisRemitente;

	@Column(name = "id_destinatario")
	private String idDestinatario;

	@Column(name = "pais_destinatario")
	private String paisDestinatario;

	@Column(name = "id_transaccion")
	private String idTransaccion;

	@Column(name = "estado_transaccion")
	private String estadoTransaccion;

	@Column()
	private String fecha;

	@Column(name = "tipo_documento")
	private String tipodeDocumento;

	@Column(name = "id_documento")
	private String idDocumento;

	@Column(name = "codigo_acuse_recibo")
	private String codigoAcuseRecibo;

	@Column(name = "glosa_acuse_recibo")
	private String glosaAcuseRecibo;

	@Column(name = "fecha_acuse_recibo")
	private String fechaHoraAcuseRecibo;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_certificado")
	@Fetch(value = FetchMode.SUBSELECT)
	private Set<ErrorMesageEntity> mensajesError;

}
