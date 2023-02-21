package com.portfolio.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.api.entity.ContactDeveloper;
import com.portfolio.api.repository.ContactDeveloperRepository;
@Service
public class ContactDeveloperServiceImpl implements ContactDeveloperService{
	@Autowired
	ContactDeveloperRepository contactDeveloperRepository;
	
	@Override
	public List<ContactDeveloper> findAllContactDeveloper() {
		List<ContactDeveloper> contactDeveloper = contactDeveloperRepository.findAll();
		return contactDeveloper;
	}
 

	@Override
	public ContactDeveloper findByIdContactDeveloper(Long id) {
		ContactDeveloper contactDeveloper = contactDeveloperRepository.findById(id).orElseThrow(()->new NullPointerException("No se encontró el ID del contacto"));
		return contactDeveloper;
	}

	@Override
	public void saveContactDeveloper(ContactDeveloper contactDeveloper) {
		contactDeveloperRepository.save(contactDeveloper);
	}

	@Override
	public ContactDeveloper updateContactDeveloper(Long id, ContactDeveloper contactDeveloperModified) {
		ContactDeveloper contactDeveloper = contactDeveloperRepository.findById(id).orElseThrow(()->new NullPointerException("No se encontró el ID del contacto"));
		contactDeveloper.setNameDeveloper(contactDeveloperModified.getNameDeveloper());
		contactDeveloper.setPerfiDeveloper(contactDeveloperModified.getPerfiDeveloper());
		contactDeveloper.setLocationDeveloper(contactDeveloperModified.getPerfiDeveloper());
		contactDeveloper.setEmailDeveloper(contactDeveloperModified.getEmailDeveloper());
		contactDeveloper.setWebSiteDeveloper(contactDeveloperModified.getWebSiteDeveloper());
		contactDeveloper.setGitHubDeveloper(contactDeveloperModified.getGitHubDeveloper());
		contactDeveloper.setLinkedinDevelper(contactDeveloperModified.getLinkedinDevelper());
		
		return contactDeveloperRepository.save(contactDeveloper);
	}

	@Override
	public void deleteByIdContactDeveloper(Long id) {
		contactDeveloperRepository.findById(id).orElseThrow(()->new NullPointerException("No se encontró el ID del contacto"));
		contactDeveloperRepository.deleteById(id);
		
	}

}
