package com.njb.controllers;

import com.njb.domain.UserCommand;
import com.njb.entities.User;
import com.njb.mappers.UserMapper;

//fake controller
public class UserController {

	public User saveUser(UserCommand userCommand) {
		// fake impl
		return UserMapper.INSTANCE.userCommandToUser(userCommand);
	}
}
