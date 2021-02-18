package com.ecolepratique.praticien.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolepratique.praticien.entite.Praticien;

public interface PraticienRepositoryItf extends JpaRepository<Praticien, Long>{

}

