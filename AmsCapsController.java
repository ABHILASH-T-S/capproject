package com.accionlabs.AMSCaps.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.accionlabs.AMSCaps.domain.AmsCaps;
import com.accionlabs.AMSCaps.service.AmsCapsService;


@RestController
public class AmsCapsController {
	@Autowired
	private AmsCapsService service;
	@GetMapping("/AmsCaps")
	public List<AmsCaps> viewData()
	{
		return service.listAll();	
	}
	
	@GetMapping("/AmsCaps/{id}")
 	public AmsCaps getTask(@PathVariable int id)
	{
		return service.get(id);	
	}
	
	@PutMapping(value="/AmsCaps/{id}")
	public ResponseEntity<?> editEmpDEtailsPage(@RequestBody AmsCaps newams, @PathVariable int id ,Model model) { 
		  try { 
		  AmsCaps existingams= service.get(id);
		  existingams.setAgencyname(newams.getAgencyname());
		  existingams.setAgencytype(newams.getAgencytype());
		  existingams.setAgencyaddress(newams.getAgencyaddress());
		  existingams.setAgencydesc(newams.getAgencydesc()); 
		  existingams.setModified_date(java.time.LocalDateTime.now());
		  service.save(existingams);
		  return new ResponseEntity<>(HttpStatus.OK); } catch(Exception exp) { return
		  new ResponseEntity<>(HttpStatus.NOT_FOUND); }	 
	}
	
	@PostMapping("/AmsCaps")
	public void add(@RequestBody AmsCaps  ams)
	{
		ams.setCreated_date(java.time.LocalDateTime.now());
		ams.setModified_date(java.time.LocalDateTime.now());
		service.save(ams);
	}

	@DeleteMapping("/AmsCaps/{id}")
	public ResponseEntity<?> delete(@PathVariable int id)
	{
		try {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception exp) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
