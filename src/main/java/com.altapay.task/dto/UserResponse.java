package com.altapay.task.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private Long id;

    @JsonProperty("dob")
    private Date dateOfBirthday;

    @JsonProperty("dt")
    private LocalDateTime dateTime;

    private String email;

    private String fio;

    private Long phone;

    private Integer status;

    private List<CardResponse> cards;

}
