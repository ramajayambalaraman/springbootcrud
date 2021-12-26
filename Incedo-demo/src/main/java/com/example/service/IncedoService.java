package com.example.service;

import java.util.List;

import com.example.demo.Incedo;

public interface IncedoService {

	Incedo saveincedoinfo(Incedo incedo);
	
	Incedo updatedincedoinfo(Incedo incedo,Integer cid);
	
	void deleteincedoById(Integer cid);
	
	List<Incedo> getincedolist();

	
}
