package com.hixon.web_application_dummy.objects.test;

import java.util.ArrayList;

public class JsonAttribture {
	private ArrayList<Attribture> attribtures;

	public JsonAttribture(ArrayList<Attribture> attribtures) {
		this.attribtures = attribtures;
	}
	
	public JsonAttribture() {
		this.attribtures = null;
	}

	public ArrayList<Attribture> getAttribtures() {
		return attribtures;
	}

	public void setAttribtures(ArrayList<Attribture> attribtures) {
		this.attribtures = attribtures;
	}
}
