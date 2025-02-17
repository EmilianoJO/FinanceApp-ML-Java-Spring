package com.FinanceTrack.FinanceAppML.MFlow;

import java.util.List;
import java.util.Optional;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

@Repository // JDBC Repository
public class JdbcClientMRepository {

    // private static final Logger log = LoggerFactory.getLogger(MRepository.class);
    private final JdbcClient jdbcClient;

    public JdbcClientMRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<MoneyTransaction> findAll() {
        List<MoneyTransaction> l = jdbcClient.sql("SELECT * FROM TRANSACTIONS").query(MoneyTransaction.class).list();
        l.forEach(System.out::println);
        return l;
    }

    public Optional<MoneyTransaction> findById(Integer Id) {
        return jdbcClient.sql("SELECT id, money_transf, transf_on, reason FROM TRANSACTIONS WHERE id = :Id")
                .param("id", Id)
                .query(MoneyTransaction.class)
                .optional();
    }

    public void create(MoneyTransaction mt) {
        var updated = jdbcClient.sql("INSERT INTO TRANSACTIONS(id, money_transf, transf_on, reason) VALUES(?,?,?,?)")
                .params(List.of(mt.id(), mt.moneyTransf(), mt.transfOn(), mt.reason()))
                .update();
        Assert.state(updated == 1, "Failed to create transaction " + mt.reason());
    }

    public void update(MoneyTransaction mt, Integer id) {
        var updated = jdbcClient.sql("UPDATE TRANSACTIONS SET money_transf = ?, transf_on = ?, reason = ? WHERE id = ?")
                .params(List.of(mt.moneyTransf(), mt.transfOn(), mt.reason().toString(), id))
                .update();
        Assert.state(updated == 1, "Failed to update transaction " + mt.reason());
    }

    public void delete(Integer id) {
        var updated = jdbcClient.sql("DELETE FROM TRANSACTIONS WHERE id = :id")
                .param("id", id)
                .update();
        Assert.state(updated == 1, "Failed to delete transaction " + id);
    }

    public int count() {
        return jdbcClient.sql("SELECT * FROM TRANSACTIONS").query().listOfRows().size();
    }

    public void saveAll(List<MoneyTransaction> mts) {
        mts.stream().forEach(this::create);
    }

    public List<MoneyTransaction> findByReason(String reason) {
        return jdbcClient.sql("SELECT * FROM TRANSACTIONS WHERE REASON = :reason")
                .param("reason", reason)
                .query(MoneyTransaction.class)
                .list();
    }

}
