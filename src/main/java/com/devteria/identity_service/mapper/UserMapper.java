package com.devteria.identity_service.mapper;

import com.devteria.identity_service.dto.request.UserCreationRequest;
import com.devteria.identity_service.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    // method nay se nhan ve 1 parameter la request theo kieu UserCreationRequest va tra ve 1 class kieu la User
    User toUser(UserCreationRequest request);
}
