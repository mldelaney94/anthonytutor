package com.hixon.web_application_dummy.objects.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class PhunImpl extends JsonAttribture {
	private Attribture number;
	private Attribture country;
	private Attribture ext;
	
	public PhunImpl (Attribture num_, Attribture country_, Attribture ext_) {
		this.number = num_;
		this.country = country_;
		this.ext = ext_;
		ArrayList<Attribture> att = new ArrayList<Attribture>();
		
		att.add(new Attribture("extension", ext_));
		att.add(new Attribture("country", country_));
		att.add(new Attribture("number", num_));
		
		this.setAttribtures(att);
	}
	
	public PhunImpl(LinkedHashMap<String,Attribture> p) {
		ArrayList<Attribture> att = new ArrayList<Attribture>();
		this.number = p.get("number");
		this.ext = p.get("extension");
		this.country = p.get("country");
		att.addAll(p.values());
		this.setAttribtures(att);
	}
	
	public PhunImpl () {
		this.number = null;
		this.country = null;
		this.ext = null;
		this.setAttribtures(null);

	}
	
	public Attribture getNumber() {
		return number;
	}
	public void setNumber(Attribture number) {
		this.number = number;
	}
	public Attribture getCountry() {
		return country;
	}
	public void setCountry(Attribture country) {
		this.country = country;
	}
	public Attribture getExt() {
		return ext;
	}
	public void setExt(Attribture ext) {
		this.ext = ext;
	}
	
	
}
