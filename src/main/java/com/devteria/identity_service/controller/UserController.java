package com.devteria.identity_service.controller;

import com.devteria.identity_service.dto.request.UserCreationRequest;
import com.devteria.identity_service.entity.User;
import com.devteria.identity_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    // tuong tac truc tiep voi class service
    @Autowired
    private UserService userService;

    // endpoint -> di kem voi 1 method
    @PostMapping("/users")
    // 1 endpoint se nhan data tu user
    // de map data tu request vao voi object thi ta su dung @RequestBody
    User createUser(@RequestBody UserCreationRequest request){
        return userService.createUser(request);
    }
}
