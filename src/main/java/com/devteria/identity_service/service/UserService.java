package com.devteria.identity_service.service;

import com.devteria.identity_service.dto.request.UserCreationRequest;
import com.devteria.identity_service.dto.request.UserUpdateRequest;
import com.devteria.identity_service.entity.User;
import com.devteria.identity_service.exception.AppException;
import com.devteria.identity_service.exception.ErrorCode;
import com.devteria.identity_service.mapper.UserMapper;
import com.devteria.identity_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    // goi xuong Repository
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    // method dau tien tao cho service nay se la tao 1 user
    public User createUser(UserCreationRequest request) {


        // kiem tra duplicate user
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new AppException(ErrorCode.USER_EXISTED);
        }

        // request la nhung thong tin can thiet de tao ra table User
        // thay the duoc cho viec khoi tao User roi set tung du lieu vao voi UserCreationRequest
        User user = userMapper.toUser(request);
        // Map data
//        user.setUsername(request.getUsername());
//        user.setPassword(request.getPassword());
//        user.setFirstName(request.getFirstName());
//        user.setLastName(request.getLastName());
//        user.setDob(request.getDob());

        return userRepository.save(user);

    }

    public User updateUser(String userId, UserUpdateRequest request) {
        User user = getUser(userId);
        userMapper.updateUser(user, request);

        // ko can lam nhieu viec nhu the nay nua, code gon hon
//        user.setPassword(request.getPassword());
//        user.setFirstName(request.getFirstName());
//        user.setLastName(request.getLastName());
//        user.setDob(request.getDob());


        // save lai cai entity nay
        return userRepository.save(user);
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }


    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(String id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found!!!!!!"));
    }

}
