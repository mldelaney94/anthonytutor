package com.hixon.web_application_dummy.objects.utility;

import java.util.LinkedHashMap;

import springfox.documentation.spring.web.json.Json;

public class JsonUtility {
	
	private Json payload;
	private LinkedHashMap<Object, Object> meta;
	private LinkedHashMap<Object, Object> attributes;

	
	public JsonUtility() {
		this.payload = new Json("{" + payloadBuilder(null,null) + "}");
	}
	
	public JsonUtility(LinkedHashMap<Object,Object> m, LinkedHashMap<Object,Object> a) {
		this.meta = m;
		this.attributes = a;
		this.payload = new Json(payloadBuilder(m,a));
	}
	
	@SuppressWarnings("unchecked")
	JsonUtility(LinkedHashMap<Object,Object> d) {
		this.meta = (LinkedHashMap<Object, Object>) d.get("meta");
		this.attributes = (LinkedHashMap<Object, Object>) d.get("attributes");
		this.payload = new Json("{" + d + "}");
	}
	
	public Json getJson() {
		return this.payload;
	}
	
	
	private String payloadBuilder (LinkedHashMap<Object,Object> m, LinkedHashMap<Object,Object> a) {
		
		LinkedHashMap<Object,Object> payload = new LinkedHashMap<Object,Object>();
		LinkedHashMap<Object,Object> data = new LinkedHashMap<Object,Object>();
		data.put("meta", m);
		data.put("attributes", a);
		payload.put("data", data);
		return payload.toString();
	}

}
