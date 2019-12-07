package com.crimsonlogic.service;

import java.util.List;

import com.crimsonlogic.entity.CertificatePhytosanitaryEntity;
import com.crimsonlogic.exception.CertificatePhytosanitaryException;

/**
 * Api - CRUD - Base de datos.
 * 
 * @author Willian Lopera
 */
public interface CertificatePhytosanitaryApi {

	/**
	 * Permite consultar todos los Envio de Certificado Fitosanitarios.
	 * 
	 * @return Lista de Envios de certificados fitosanitarios
	 */
	List<CertificatePhytosanitaryEntity> getCertificatesPhytosanitaries() throws CertificatePhytosanitaryException;

	/**
	 * Permite consultar un Envio de Certificado Fitosanitario sgun su
	 * identificador.
	 * 
	 * @return Envio de certificado fitosanitario requerido
	 * 
	 * @throws CertificatePhytosanitaryException Excepcion en caso de falla
	 */
	CertificatePhytosanitaryEntity getCertificatePhytosanitaryById(Long id) throws CertificatePhytosanitaryException;

	/**
	 * Permite un Envio de Certificado Fitosanitaris
	 * 
	 * @return Envio de certificado fitosanitario generado
	 * 
	 * @throws CertificatePhytosanitaryException Excepcion en caso de falla
	 */
	CertificatePhytosanitaryEntity createCertificatePhytosanitary(CertificatePhytosanitaryEntity entity)
			throws CertificatePhytosanitaryException;

	/**
	 * Permite eliminar un Envio Fitosaitario de la BD.
	 * 
	 * @param id Identificador del envio fitasinatario a eliminar.
	 * 
	 * @throws CertificatePhytosanitaryException Excepcion en caso de falla
	 */
	void deleteCertificatePhytosanitary(Long id) throws CertificatePhytosanitaryException;

}
