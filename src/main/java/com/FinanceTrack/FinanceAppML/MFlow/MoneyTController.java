package com.FinanceTrack.FinanceAppML.MFlow;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/m") // Adds this to the endpoints of the class
public class MoneyTController {

    private final MRepository mr;

    public MoneyTController(MRepository mRepository) {
        this.mr = mRepository;
    }

    // @GetMapping("api/m")
    @GetMapping("")
    List<MoneyTransaction> findAll() {
        return mr.findAll();
    }

    // @GetMapping("/{id}")
    // MoneyTransaction findById(@PathVariable int id) {
    // Optional<MoneyTransaction> mt = mr.findById(id);
    // if (mt.isEmpty())
    // throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Transaction not
    // found.");
    // return mt.get();
    // }

    // @ResponseStatus(HttpStatus.CREATED)
    // @PostMapping("") // Post
    // void newTransaction(@RequestBody MoneyTransaction mt) {
    // mr.newTransaction(mt);
    // }

    // @ResponseStatus(HttpStatus.NO_CONTENT)
    // @PutMapping("/{id}") // Put
    // void updateTransaction(@RequestBody MoneyTransaction mt, @PathVariable int
    // id) {
    // mr.updateTransaction(mt, id);
    // }

    // @ResponseStatus(HttpStatus.NO_CONTENT)
    // @DeleteMapping("/{id}") // Delete
    // void deleteTransaction(@PathVariable int id) {
    // mr.deleteTransaction(id);
    // }

}
