package com.altapay.task.service.impl;

import com.altapay.task.dto.CardResponse;
import com.altapay.task.dto.UserResponse;
import com.altapay.task.mapper.CardMapper;
import com.altapay.task.mapper.UserMapper;
import com.altapay.task.repository.TransactionRepository;
import com.altapay.task.repository.UserRepository;
import com.altapay.task.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final CardMapper cardMapper;
    private final UserRepository userRepository;
    private final TransactionRepository transactionRepository;

    @Override
    public ResponseEntity<List<UserResponse>> getUserInfo() {
        return ResponseEntity.ok(userRepository.findAll()
                .stream()
                .parallel()
                .map(user -> {
                    UserResponse userResponse = userMapper.toResponse(user);

                    List<CardResponse> cardResponses = user.getCards()
                            .stream()
                            .parallel()
                            .map(card -> cardMapper.toResponse(
                                    card,
                                    transactionRepository.findAllByUserIdAndCardId(user.getId(), card.getId())
                            ))
                            .collect(Collectors.toList());

                    userResponse.setCards(cardResponses);

                    return userResponse;
                })
                .collect(Collectors.toList()));
    }

}
