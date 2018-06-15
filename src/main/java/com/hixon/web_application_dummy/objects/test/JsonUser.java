package com.hixon.web_application_dummy.objects.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.NotBlank;

import com.hixon.web_application_dummy.objects.JsonBase;
import com.hixon.web_application_dummy.objects.user.UserInterface;

public class JsonUser extends JsonBase implements UserInterface{
	
	
	private Attribture firstName;
	private Attribture lastName;
	private PhunImpl phone;
	
	@NotBlank
	private LinkedHashMap<Object, Object> data;
	@NotBlank
	private LinkedHashMap<Object,Object> attribtures;

	
	public JsonUser(ArrayList<Object> l) {
		this.firstName = (Attribture) l.get(l.indexOf("firstName"));
		this.lastName = (Attribture) l.get(l.indexOf("lastName"));
		this.phone = new PhunImpl ((LinkedHashMap<String, Attribture>) l.get(l.indexOf("phone")));
		attribtures = new LinkedHashMap<Object,Object> ();
		
		for (Object a : ((Map<Object, Object>) l).values()) {
			Attribture item = (Attribture) a;
			attribtures.put(item.getKey(), item.getPair());
			
			//will not work for phone
		}
		
		data = new LinkedHashMap<Object,Object>();
		data.put("attributes", attribtures);
		data.put("meta", null);
	}

	public Attribture getFirstName() {
		return this.firstName;
	}

	public Attribture getLastName() {
		return this.lastName;
	}

	public void setFirstName(String fn) {
		this.firstName = new Attribture("firstName",fn);
	}

	public void setLastName(String ln) {
		this.lastName = new Attribture("lastName",ln);
	}
	
	public LinkedHashMap<Object,Object> getPayload () {
		LinkedHashMap<Object,Object> payload = new LinkedHashMap<Object, Object>();
		payload.put("data", this.data);
		return payload;
	}

	public PhunImpl getPhone() {
		return phone;
	}

	public void setPhone(PhunImpl phone) {
		this.phone = phone;
	}

	@Override
	public void setFirstName(Attribture fn) {
		this.firstName = fn;
	}

	@Override
	public void setLastName(Attribture ln) {
		this.lastName = ln;
	}

}
