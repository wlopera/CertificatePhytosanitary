package com.crimsonlogic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimsonlogic.entity.CertificatePhytosanitaryEntity;
import com.crimsonlogic.exception.CertificatePhytosanitaryException;
import com.crimsonlogic.repository.CertificatePhytosanitaryRepository;
import com.crimsonlogic.util.CertificatePhytosanitaryMessageErrorEnum;

@Service
public class CertificatePhytosanitaryService implements CertificatePhytosanitaryApi {

	@Autowired
	CertificatePhytosanitaryRepository repository;

	@Override
	public List<CertificatePhytosanitaryEntity> getCertificatesPhytosanitaries()
			throws CertificatePhytosanitaryException {

		try {

			List<CertificatePhytosanitaryEntity> outputList = repository.findAll();

			if (CollectionUtils.isNotEmpty(outputList)) {
				return outputList;
			}

		} catch (Exception e) {

			throw new CertificatePhytosanitaryException(
					CertificatePhytosanitaryMessageErrorEnum.NO_EXIT_REGISTER_BY_GET_ALL.getId());
		}

		return new ArrayList<>();

	}

	@Override
	public CertificatePhytosanitaryEntity getCertificatePhytosanitaryById(Long id)
			throws CertificatePhytosanitaryException {

		Optional<CertificatePhytosanitaryEntity> output = repository.findById(id);

		if (output.isPresent()) {
			return output.get();
		}

		throw new CertificatePhytosanitaryException(
				CertificatePhytosanitaryMessageErrorEnum.NO_EXIT_REGISTER_BY_ID.getId() + id);

	}

	// TODO: Se puede ajustar el codigo para enviar actualizaciones por este metodo
	// (validando si ya esiste el registro y acttualizando los cambios)
	@Override
	public CertificatePhytosanitaryEntity createCertificatePhytosanitary(CertificatePhytosanitaryEntity entity)
			throws CertificatePhytosanitaryException {

		try {

			entity = repository.save(entity);

		} catch (Exception e) {

			throw new CertificatePhytosanitaryException(
					CertificatePhytosanitaryMessageErrorEnum.ERROR_CREATE_REGISTER.getId());
		}

		return entity;

	}

	@Override
	public void deleteCertificatePhytosanitary(Long id) throws CertificatePhytosanitaryException {

		Optional<CertificatePhytosanitaryEntity> output = repository.findById(id);

		if (output.isPresent()) {
			repository.deleteById(id);
			return;
		}

		throw new CertificatePhytosanitaryException(
				CertificatePhytosanitaryMessageErrorEnum.ERROR_DELETE_REGISTER.getId() + id);

	}

}
