CREATE TABLE IF NOT EXISTS TRANSACTIONS (
    id INT NOT NULL,
    money_transf FLOAT NOT NULL,
    transf_on TIMESTAMP NOT NULL,
    reason VARCHAR(100),
    PRIMARY KEY (id),
    version INT
);

-- ALTER TABLE TRANSACTIONS RENAME TO transactions;
-- ALTER TABLE transactions RENAME COLUMN money_transf TO money_transf;
-- ALTER TABLE transactions RENAME COLUMN transf_on TO transf_on;
-- ALTER TABLE transactions RENAME COLUMN reason TO reason;
-- ALTER TABLE transactions RENAME COLUMN version TO version;