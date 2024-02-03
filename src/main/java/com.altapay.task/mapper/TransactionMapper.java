package com.altapay.task.mapper;

import com.altapay.task.dto.TransactionResponse;
import com.altapay.task.dto.UserResponse;
import com.altapay.task.entity.Transaction;
import com.altapay.task.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
@Component
public interface TransactionMapper {

    TransactionResponse toResponse(Transaction transaction);

    List<TransactionResponse> toResponses(List<Transaction> transactions);

}
