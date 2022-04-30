package com.accionlabs.AMSCaps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accionlabs.AMSCaps.domain.AmsCaps;
import com.accionlabs.AMSCaps.service.AmsCapsService;

@Controller
public class IndexController {
	
   @RequestMapping("/display")
   public String display()
   {
	   return "display";
  }
   @RequestMapping("/insert")
   public String insert()
   {
	   return "insert";
  }
   @RequestMapping("/update")
   public String update()
   {
	   return "update";
  }
   
   @RequestMapping("/delete")
   public String delete()
   {
	   return "delete";
  }
   
   
}
