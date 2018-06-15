package com.hixon.web_application_dummy.objects.responses;

import java.lang.reflect.InvocationTargetException;

import com.hixon.web_application_dummy.objects.user.UserImpl;

import springfox.documentation.spring.web.json.Json;

public interface CreateUserInterface {
	
	public Json getCreateUserResponse(UserImpl u) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException;

}
