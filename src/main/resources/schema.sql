CREATE TABLE passbook
(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    category VARCHAR(256) NOT NULL,
    method VARCHAR(256) NOT NULL,
    amount INT,
    Continue VARCHAR(256) NOT NULL,
    memo TEXT
);

CREATE TABLE Opportunity
(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    opportunityMoney INT,
    differenceMoney INT,
    sumMoney INT
)