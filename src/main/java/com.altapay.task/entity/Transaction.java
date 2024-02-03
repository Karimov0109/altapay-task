package com.altapay.task.entity;

import com.altapay.task.entity.enums.TransactionType;
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
@Table(name = "cards_transactions")
public class Transaction extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @Column(name = "user_id", columnDefinition = "BIGINT", nullable = false)
    private Long userId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "card_id", insertable = false, updatable = false)
    private Card card;

    @Column(name = "card_id", columnDefinition = "BIGINT", nullable = false)
    private Long cardId;

    @Column(name = "type", length = 6, columnDefinition = "VARCHAR(6) CHECK (type IN ('DEBIT', 'CREDIT'))")
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "old_balance")
    private Long oldBalance;

    @Column(name = "new_balance")
    private Long newBalance;

}
