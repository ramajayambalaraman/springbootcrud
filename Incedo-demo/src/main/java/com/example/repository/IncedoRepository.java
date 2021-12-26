package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.Incedo;
@Service
public interface IncedoRepository extends JpaRepository<Incedo,Integer> {

}
