package com.FinanceTrack.FinanceAppML.MFlow;

import java.time.LocalDateTime;

public record MoneyTransaction(
                Integer id,
                float money_transf,
                LocalDateTime transf_on,
                String reason) {
}
