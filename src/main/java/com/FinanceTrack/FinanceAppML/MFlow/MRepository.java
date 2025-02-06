package com.FinanceTrack.FinanceAppML.MFlow;

import java.util.List;

// import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;

//A way to avoid writing CRUD functions
public interface MRepository extends ListCrudRepository<MoneyTransaction, Integer> {

    // @Query
    List<MoneyTransaction> findAllByReason(String Reason);

}
