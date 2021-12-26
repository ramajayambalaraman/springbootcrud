package com.example.service;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Incedo;
import com.example.pojo.Incedopojo;
import com.example.repository.IncedoRepository;
@Transactional
@Service
public class IncedoServiceImpl implements IncedoService{

	@Autowired
	IncedoRepository incedoRepository;
	
	@Override
	public Incedo saveincedoinfo(Incedo incedo) {
		
		return incedoRepository.save(incedo);
	}

	@Override
	public Incedo updatedincedoinfo(Incedo incedo,Integer cid) {
		
		Incedo in=incedoRepository.findById(cid).get();
		
		if(Objects.nonNull(incedo.getName()) && !"".equals(incedo.getName())) {
			
			in.setName(incedo.getName());
		}
		
		if(Objects.nonNull(incedo.getAddress()) && !"".equals(incedo.getAddress())) {
			
			in.setAddress(incedo.getAddress());
		}
		return null;
	}

	@Override
	public void deleteincedoById(Integer cid) {
		
		 incedoRepository.deleteById(cid);
	}

	@Override
	public List<Incedo> getincedolist() {
		
		return (List<Incedo>)incedoRepository.findAll();
	}

}
