package com.FinanceTrack.FinanceAppML.MFlow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class MRepository {

    private List<MoneyTransaction> mfs = new ArrayList<>();

    @PostConstruct
    private void init() {
        mfs.add(new MoneyTransaction(1, 100, LocalDateTime.now(), "Test"));
        mfs.add(new MoneyTransaction(2, 200, LocalDateTime.now(), "Test2"));
    }

    List<MoneyTransaction> findAll() {
        return mfs;
    }

    Optional<MoneyTransaction> findById(int id) {
        return mfs.stream().filter(mf -> mf.id() == id).findFirst();
    }

    // Post
    void newTransaction(MoneyTransaction mt) {
        mfs.add(mt);
    }

}
