CREATE TABLE IF NOT EXISTS Transaction(
    id int NOT NULL,
    money_transferred float NOT NULL,
    transferred_on timestamp NOT NULL,
    reason varchar(100) NOT NULL,
    primary key(id)
);