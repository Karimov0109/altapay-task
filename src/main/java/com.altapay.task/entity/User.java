package com.altapay.task.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "fio", nullable = false)
    private String fio;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private Long phone;

    @Column(name = "status")
    private Integer status;

    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirthday;

    @OneToMany(mappedBy = "user",
              cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Card> cards = new ArrayList<>();

    @OneToMany(mappedBy = "user",
              cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Transaction> transactions = new ArrayList<>();

}
