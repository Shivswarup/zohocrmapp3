package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.service.ContactService;
import com.zohocrm.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value ="/createLead", method=RequestMethod.GET)
	public String viewCraeteLeadform() {
		return "create_lead";
		
	}
	
	@RequestMapping(value ="/saveLead", method=RequestMethod.POST)
	public String saveLead(@ModelAttribute("lead") Lead lead , Model model) {
		 leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	
	@RequestMapping(value ="/convertLead", method=RequestMethod.POST)
	public String convertLead(@RequestParam("id") long id, Model model) {
		Lead lead =leadService.getLeadById(id);
		
		//convert into Contact
		Contact contact = new Contact();
		contact.setLastName(lead.getFirstName());
		contact.setFirstName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.saveContact(contact);
		
		leadService.deleteLeadById(id);
		
		List<Contact> contacts = contactService.getContacts();
		model.addAttribute("contacts",contacts);
		
		return "contact_list";
		
	}
	
	@RequestMapping("/listleads")
	public String listLeads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads",leads);
		return "list_leads";
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id , Model model ) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
}
