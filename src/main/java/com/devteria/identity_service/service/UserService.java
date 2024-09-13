package com.devteria.identity_service.service;

import com.devteria.identity_service.dto.request.UserCreationRequest;
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
    public User createUser(UserCreationRequest request) {
        // request la nhung thong tin can thiet de tao ra table User
        User user = new User();
        // Map data
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user);

    }
}
