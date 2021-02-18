package com.ecolepratique.praticien.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolepratique.praticien.entite.Praticien;
import com.ecolepratique.praticien.repository.PraticienRepositoryItf;

@Service
public class PraticienService implements PraticienServiceItf {
	@Autowired
	private PraticienRepositoryItf praticienRepository;
	
	@Override
	public List<Praticien> list() {
		return praticienRepository.findAll();
	}
	@Override
	public Praticien create(Praticien praticien) {
		return praticienRepository.save(praticien);
	}
	@Override
	public Praticien getById(Long id) {
		return praticienRepository.findById(id).get();
	}
	@Override
	public void deleteById(Long id) {
		praticienRepository.deleteById(id);
	}
	@Override
	public Praticien updateById(Long id, Praticien praticien) {
		praticien.setId(id);
		return praticienRepository.save(praticien);
	}
	
}
