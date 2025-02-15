package com.FinanceTrack.FinanceAppML.MFlow;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "TRANSACTIONS")
public record MoneyTransaction(
                @Id Integer id,
                float money_transf,
                LocalDateTime transf_on,
                String reason,
                @Version Integer version) {
}
