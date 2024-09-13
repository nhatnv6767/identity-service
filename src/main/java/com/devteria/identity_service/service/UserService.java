package com.devteria.identity_service.service;

import com.devteria.identity_service.entity.User;
import com.devteria.identity_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // goi xuong Repository
    @Autowired
    private UserRepository userRepository;

    // method dau tien tao cho service nay se la tao 1 user
    public User createRequest(Object request) {
        // request la nhung thong tin can thiet de tao ra table User
    }
}
