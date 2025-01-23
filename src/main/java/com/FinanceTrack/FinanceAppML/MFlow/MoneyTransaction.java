package com.FinanceTrack.FinanceAppML.MFlow;

import java.time.LocalDateTime;

public record MoneyTransaction(
        Integer id,
        float moneyTransferred,
        LocalDateTime transferredOn,
        String reason) {
}
