package com.accionlabs.AMSCaps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accionlabs.AMSCaps.domain.AmsCaps;
import com.accionlabs.AMSCaps.repository.AmsCapsRepository;


@Service
public class AmsCapsService {

	
	@Autowired
	private AmsCapsRepository repo;
	
	public List<AmsCaps> listAll()
	{
		return repo.findAll();
	}
    
	
	public void save(AmsCaps Ams)
	{
		repo.save(Ams);
	}
	
	
	public AmsCaps get(int id)
	{
		return repo.findById(id).get();
	}
	
	public void delete(int id)
	{
		repo.deleteById(id);
	}
}
