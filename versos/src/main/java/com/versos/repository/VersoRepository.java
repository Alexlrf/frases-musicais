package com.versos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.versos.model.entity.Verso;

@Repository
public interface VersoRepository extends JpaRepository<Verso, Long>{

}
