package com.njb.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.njb.domain.UserCommand;
import com.njb.entities.User;

@Mapper
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	UserCommand userToUserCommand(User user);

	User userCommandToUser(UserCommand userCommand);

}
