package com.altapay.task.service;

import com.altapay.task.dto.UserResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    ResponseEntity<List<UserResponse>> getUserInfo();

}
