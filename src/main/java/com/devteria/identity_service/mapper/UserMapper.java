package com.devteria.identity_service.mapper;

import com.devteria.identity_service.dto.request.UserCreationRequest;
import com.devteria.identity_service.dto.request.UserUpdateRequest;
import com.devteria.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    // method nay se nhan ve 1 parameter la request theo kieu UserCreationRequest va tra ve 1 class kieu la User
    User toUser(UserCreationRequest request);

    // map data tu UserUpdateRequest vao Object User
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
