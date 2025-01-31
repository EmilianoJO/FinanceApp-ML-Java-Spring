package com.FinanceTrack.FinanceAppML.MFlow;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository // JDBC Repository
public class MRepository {

    private static final Logger log = LoggerFactory.getLogger(MRepository.class);
    private final JdbcClient jdbcClient;

    public MRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<MoneyTransaction> findAll() {
        return jdbcClient.sql("select * from transaction").query(MoneyTransaction.class).list();
    }

}
