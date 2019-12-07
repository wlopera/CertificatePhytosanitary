package com.crimsonlogic.model;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Modelo del Negocio
 * 
 * @author Willian Lopera
 */
@Getter
@Service
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CertificatePhytosanitaryDTO implements Serializable {

	private static final long serialVersionUID = 1141073717585522220L;

	private Long id;
	private String codigoIteration;
	private String idService;
	private String idSender;
	private String contrySender;
	private String idRecipient;
	private String countryRecipient;
	private String idTransaction;
	private String statusTransaction;
	private String date;
	private String documentType;
	private String idDocument;
	private String codigoAcknowledgmentReceipt;
	private String descriptionAcknowledgmentReceipt;
	private String dateAcknowledgmentReceipt;

}
