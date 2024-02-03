package com.altapay.task.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import helper.LocalDateTimeConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    @JsonIgnoreProperties
    @LastModifiedDate
    @UpdateTimestamp
    @Column(name = "dt", columnDefinition = "TIMESTAMP default NOW()", nullable = false)
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime dateTime;

}
