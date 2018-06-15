package com.hixon.web_application_dummy.objects.user;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.hixon.web_application_dummy.objects.test.Attribture;

public class UserImpl implements UserInterface {

	@NotBlank
	@Size(min = 1, max = 20)
	private String firstName;
	@NotBlank
	@Size(min = 1, max = 20)
	private String lastName;
	@NotBlank
	private LinkedHashMap<Object,Object> attributes;

	UserImpl() {
		this.firstName = null;
		this.lastName = null;
		attributes = new LinkedHashMap<Object, Object>();
		attributes.put("firstName", this.firstName);
		attributes.put("lastName", this.lastName);

	}

	public UserImpl(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		attributes = new LinkedHashMap<Object, Object>();
		attributes.put("firstName", this.firstName);
		attributes.put("lastName", this.lastName);
	}

	public UserImpl(UserImpl u) {
		this.firstName = u.firstName;
		this.lastName = u.lastName;
	}
/*
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}*/

	public void setFirstName(String fn) {
		this.firstName = fn;
	}

	public void setLastName(String ln) {
		this.lastName = ln;
	}
	
	public LinkedHashMap<Object,Object> getAttributes() {
		return this.attributes;
	}

	@Override
	public Attribture getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attribture getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFirstName(Attribture fn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLastName(Attribture ln) {
		// TODO Auto-generated method stub
		
	}

}
