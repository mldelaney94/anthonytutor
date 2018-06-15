package com.hixon.web_application_dummy.objects;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotBlank;

public class JsonBase {
	
	@NotBlank
	private LinkedHashMap<Object, Object> data;
	@NotBlank
	private LinkedHashMap<Object,Object> meta;
	@NotBlank
	private LinkedHashMap<Object,Object> attribtures;
	
	public LinkedHashMap<Object, Object> getData () {
		return this.data;
	}
	
	public LinkedHashMap<Object,Object> getMeta () {
		return this.meta;
	}
	
	public LinkedHashMap<Object,Object> getAttributes() {
		return this.attribtures;
	}
	
	public void setData (LinkedHashMap<Object, Object> d) {
		this.data.putAll(d);
	}
	
	public void setMeta (LinkedHashMap<Object,Object>  m) {
		this.meta.putAll(m);;
	}
	
	public void setAttributes (LinkedHashMap<Object,Object> a) {
		this.attribtures.putAll(a);
	}
	
	public JsonBase () {
		this.meta = null;
		this.attribtures = null;
		this.data = new LinkedHashMap<Object,Object>();
		this.data.put("meta", this.meta);
		this.data.put("data", this.data);

	}
	
	public JsonBase (LinkedHashMap<Object,Object> d) {
		this.meta = (@NotBlank LinkedHashMap<Object, Object>) d.get("meta");
		this.attribtures = (@NotBlank LinkedHashMap<Object, Object>) d.get("attributes");
		this.data = d;
	}
	
	public JsonBase (LinkedHashMap<Object,Object> m, LinkedHashMap<Object,Object> a) {
		this.meta = m;
		this.attribtures = a;
		this.data = new LinkedHashMap<Object,Object> ();
		data.put("meta", m);
		data.put("attribtes", a);
	}


}
