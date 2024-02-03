package com.altapay.task.controller;

import com.altapay.task.dto.UserResponse;
import com.altapay.task.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    @GetMapping("/user-info")
    public ResponseEntity<List<UserResponse>> getCardsByPhoneNumber() {

        return userService.getUserInfo();
    }

}
