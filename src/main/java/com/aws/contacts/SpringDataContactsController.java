/**
 * 
 */
package com.aws.contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aws.contacts.domain.ContactRepository;
import com.aws.contacts.service.ContactServices;


/**
 * @author coder983
 *
 */

@Controller
@RequestMapping("/")
public class SpringDataContactsController {
	
	@Autowired
	ContactRepository contactRepo;
	
	@Autowired
	ContactServices service;
	
	@RequestMapping
	public String viewContacts(ModelMap model) {
		
		service.ListContacts(model);
				
		return "mainview";
	}
	
	@RequestMapping("/add")
	public String addContact(ModelMap model){
		
		service.loadStates(model);
		
		return "addcontact";
	}
	
	@PostMapping("/create")
	public String createContact() {
		
		return "mainview";
	}

}
