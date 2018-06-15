package com.hixon.web_application_dummy.objects.responses;

import java.lang.reflect.InvocationTargetException;
import com.hixon.web_application_dummy.objects.user.UserImpl;
import com.hixon.web_application_dummy.objects.utility.JsonUtility;

import springfox.documentation.spring.web.json.Json;

public class CreateUser implements CreateUserInterface {

	public Json getCreateUserResponse(UserImpl u) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// create the user
		UserImpl user = new UserImpl(u);
		JsonUtility builder = new JsonUtility(null,u.getAttributes());
		return builder.getJson();
	}

	public UserImpl getCreateUserResponseUser(UserImpl u) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// create the user
		UserImpl user = new UserImpl(u);
		return user;
	}

}
