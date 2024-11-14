package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ContratoModel;

@Repository
public interface IContratoRepository extends JpaRepository<ContratoModel, Long> {
    
}