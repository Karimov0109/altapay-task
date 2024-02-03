package com.altapay.task.entity;

import com.altapay.task.entity.enums.CardType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cards")
public class Card extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @Column(name = "user_id", columnDefinition = "BIGINT", nullable = false)
    private Long userId;

    @Column(name = "card_name")
    private String cardName;

    @Column(name = "card_type", length = 3, columnDefinition = "VARCHAR(3) CHECK (card_type IN ('UZ', 'HUM'))")
    @Enumerated(EnumType.STRING)
    private CardType cardType;

    @Column(name = "card_number", length = 20)
    private String cardNumber;

    @Column(name = "card_expire", length = 7)
    private String cardExpire;

    @Column(name = "balance")
    private Long balance;

    @Column(name = "status")
    private Integer status;

}
