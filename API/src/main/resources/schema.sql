-- CREATE TABLE IF NOT EXISTS "MoneyTransaction" (
CREATE TABLE IF NOT EXISTS MoneyTransaction (
    id INT NOT NULL,
    money_transf FLOAT NOT NULL,
    transf_on TIMESTAMP NOT NULL,
    reason VARCHAR(100),
    version INT,
    PRIMARY KEY (id)
);