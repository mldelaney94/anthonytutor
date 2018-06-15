package com.hixon.web_application_dummy.configuration.controllers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hixon.web_application_dummy.objects.responses.CreateUser;
import com.hixon.web_application_dummy.objects.test.Attribture;
import com.hixon.web_application_dummy.objects.test.JsonUser;
import com.hixon.web_application_dummy.objects.user.UserImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.core.util.Json;

@RestController
public class UserController {
 
    @RequestMapping(value = "/me", method = RequestMethod.POST)
    @ApiOperation("Creates a new user")
    public UserImpl custom() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    	CreateUser creation = new CreateUser();    	
        return creation.getCreateUserResponseUser(new UserImpl("John", "Allan"));
    }
    
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ApiOperation("Creates a new user")
    public String createJsonUser() {
    	ArrayList<Object> input = new ArrayList<Object>();
    	input.add(new Attribture("firstName", "test"));
    	input.add(new Attribture("lastName", "data"));
    	Attribture homePNum = new Attribture("number", "0421385390");
    	Attribture homePEx = new Attribture("extension", 61);
    	Attribture homePCountry = new Attribture ("country", "Australia");
    	LinkedHashMap<String,Attribture> homePhone = new LinkedHashMap<String,Attribture>();
    	homePhone.put("number", homePNum);
    	homePhone.put("extension",homePEx);
    	homePhone.put("country", homePCountry);
    	
    	input.add(homePhone);
    	JsonUser u = new JsonUser(input);    	
    	
        return Json.pretty(u.getPayload());
    }
}
