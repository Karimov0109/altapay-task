package com.altapay.task.mapper;

import com.altapay.task.dto.CardResponse;
import com.altapay.task.entity.Card;
import com.altapay.task.entity.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", uses = {
        TransactionMapper.class
})
@Component
public interface CardMapper {

    @Mapping(target = "dt", source = "card.dateTime")
    CardResponse toResponse(Card card, List<Transaction> transactions);

}
