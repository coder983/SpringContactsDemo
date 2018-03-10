/**
 * 
 */
package com.aws.contacts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.aws.contacts.domain.Contact;
import com.aws.contacts.domain.ContactRepository;
import com.aws.contacts.domain.State;
import com.aws.contacts.domain.StateRepository;

/**
 * @author coder983
 *
 */
@Component("service")
public class ContactServices {
	
	@Autowired
	ContactRepository contactRepo;
	
	@Autowired
	StateRepository stateRepo;
	
	public void ListContacts(ModelMap model) {
		List<Contact> contacts;
		contacts = (List<Contact>) contactRepo.findAll();
		
		model.put("contacts", contacts);
	}

	public void loadStates(ModelMap model) {
		
		List<State> states;
		
		states = (List<State>) stateRepo.findAll();
		
		model.put("states", states);
	}
	
	public void setupAdd(ModelMap model) {
		
		Contact contact = new Contact();
		
		model.put("contact", contact);
	}

}
