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

/**
 * @author coder983
 *
 */
@Component("service")
public class ContactServices {
	
	@Autowired
	ContactRepository contactRepo;
	
	public void ListContacts(ModelMap model) {
		List<Contact> contacts;
		contacts = (List<Contact>) contactRepo.findAll();
		
		model.put("contacts", contacts);
	}

}
