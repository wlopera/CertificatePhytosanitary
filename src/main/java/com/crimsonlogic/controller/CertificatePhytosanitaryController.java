package com.crimsonlogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crimsonlogic.entity.CertificatePhytosanitaryEntity;
import com.crimsonlogic.exception.CertificatePhytosanitaryException;
import com.crimsonlogic.service.CertificatePhytosanitaryApi;

@RestController
@RequestMapping("/certificate")
public class CertificatePhytosanitaryController {

	@Autowired
	CertificatePhytosanitaryApi service;

	@GetMapping
	public ResponseEntity<List<CertificatePhytosanitaryEntity>> getCertificatesPhytosanitaries()
			throws CertificatePhytosanitaryException {

		List<CertificatePhytosanitaryEntity> outputlist = service.getCertificatesPhytosanitaries();
		return new ResponseEntity<>(outputlist, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CertificatePhytosanitaryEntity> getCertificatePhytosanitaryById(Long id)
			throws CertificatePhytosanitaryException {

		CertificatePhytosanitaryEntity output = service.getCertificatePhytosanitaryById(id);
		return new ResponseEntity<>(output, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<CertificatePhytosanitaryEntity> createCertificatePhytosanitary(
			CertificatePhytosanitaryEntity input) throws CertificatePhytosanitaryException {

		CertificatePhytosanitaryEntity output = service.createCertificatePhytosanitary(input);
		return new ResponseEntity<>(output, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteCertificatePhytosanitary(Long id) throws CertificatePhytosanitaryException {

		service.deleteCertificatePhytosanitary(id);
		return HttpStatus.OK;

	}

}
