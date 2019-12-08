package com.crimsonlogic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crimsonlogic.entity.CertificatePhytosanitaryEntity;
import com.crimsonlogic.entity.ErrorMesageEntity;
import com.crimsonlogic.exception.CertificatePhytosanitaryException;
import com.crimsonlogic.service.CertificatePhytosanitaryApi;

@Controller
//@RestController
//@RequestMapping("/certificate")
public class CertificatePhytosanitaryController {

	@Autowired
	CertificatePhytosanitaryApi service;

	@RequestMapping(value="/", method = RequestMethod.GET)
    public String homepage() {
		 System.out.println("HOME");
        return "home";
    }
	 
	@RequestMapping(value="/certificate", method = RequestMethod.GET)
	public ResponseEntity<List<CertificatePhytosanitaryEntity>> getCertificatesPhytosanitaries()
			throws CertificatePhytosanitaryException {

		List<CertificatePhytosanitaryEntity> outputlist = service.getCertificatesPhytosanitaries();
		return new ResponseEntity<>(outputlist, new HttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping(value="/certificate/{id}", method = RequestMethod.GET)
	public ResponseEntity<CertificatePhytosanitaryEntity> getCertificatePhytosanitaryById(@PathVariable Long id)
			throws CertificatePhytosanitaryException {

		System.out.println("Crear registro......................................................");
		CertificatePhytosanitaryEntity output = service.getCertificatePhytosanitaryById(id);
		
		output.setCodigoAcuseRecibo("ERR");
		output.setGlosaAcuseRecibo(null);
		output.setFechaHoraAcuseRecibo(null);
		
		ErrorMesageEntity error = new ErrorMesageEntity();
		error.setCodigoError("12345");
		error.setMensajeError("Probando agregar error");
		error.setIdCertificado(2L);
		
		List<ErrorMesageEntity> errores = new ArrayList<>();
		errores.add(error);
		
		output.getMensajesError().add(error);
		
		createCertificatePhytosanitary(output);
		
		return new ResponseEntity<>(output, new HttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping(value="/certificate", method = RequestMethod.POST)
	public ResponseEntity<CertificatePhytosanitaryEntity> createCertificatePhytosanitary(
			CertificatePhytosanitaryEntity input) throws CertificatePhytosanitaryException {

		CertificatePhytosanitaryEntity output = service.createCertificatePhytosanitary(input);
		return new ResponseEntity<>(output, new HttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping(value="/certificate/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteCertificatePhytosanitary(@PathVariable Long id) throws CertificatePhytosanitaryException {

		service.deleteCertificatePhytosanitary(id);
		return HttpStatus.OK;

	}

}
