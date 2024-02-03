package com.altapay.task.dto;

import com.altapay.task.entity.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponse {

    private Long id;

    @JsonProperty("type")
    private TransactionType transactionType;

    private Long amount;

    private Long oldBalance;

    private Long newBalance;

    @JsonProperty("dt")
    private LocalDateTime dateTime;

}
