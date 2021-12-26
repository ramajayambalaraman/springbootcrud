package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.IncedoService;

@RestController
public class IncedoExController {
	
	@Autowired
	IncedoService incedoService;
	

	
	@PostMapping(value = "/save")
	public Incedo saveincedoinfo(@RequestBody Incedo incedo) {
		return incedoService.saveincedoinfo(incedo);
	}
	
	@PutMapping(value="/update/{cid}")
	
	public Incedo updatedincedoinfo(@RequestBody Incedo incedo,@PathVariable("cid") Integer cid) {
		
		
		return incedoService.updatedincedoinfo(incedo, cid);
		
		
	}
	
	@DeleteMapping(value="/delete/{cid}")
	
	public  String deleteincedoById(Incedo incedo,@PathVariable("cid") Integer cid) {
		
		incedoService.deleteincedoById(cid);
		
		return null;
		
	}
	
	@GetMapping(value="/listincedo")
	public List<Incedo> getincedolist(){
		return incedoService.getincedolist();
		
	}
	
	
	
	
}
