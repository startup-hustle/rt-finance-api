--liquibase formatted sql

--changeset white-parrot:V2024_12_17_12_08_01 (dbms:postgresql)
CREATE TABLE BILL_INFO (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    amount NUMERIC(10, 2)
);