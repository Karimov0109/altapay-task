package com.altapay.task.dto;

import com.altapay.task.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardResponse {

    private Long id;

    private Long balance;

    @JsonProperty("card_expire")
    private String cardExpire;

    @JsonProperty("card_name")
    private String cardName;

    @JsonProperty("card_number")
    private String cardNumber;

    private LocalDateTime dt;

//    @JsonProperty("card_type")
//    private CardType cardType;

    private Integer status;

    private List<TransactionResponse> transactions;

}
