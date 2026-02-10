CREATE TABLE passbook
(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    category VARCHAR(256) NOT NULL,
    method VARCHAR(256) NOT NULL,
    money INT,
    memo TEXT,
);