package com.portfolio.api.service;

import java.util.List;

import com.portfolio.api.entity.ContactDeveloper;

public interface ContactDeveloperService {
	public List<ContactDeveloper> findAllContactDeveloper();
	public ContactDeveloper  findByIdContactDeveloper(Long id);
	public void  saveContactDeveloper(ContactDeveloper contactDeveloper);
	public ContactDeveloper updateContactDeveloper(Long id, ContactDeveloper contactDeveloper);
	public void deleteByIdContactDeveloper(Long id);
}
