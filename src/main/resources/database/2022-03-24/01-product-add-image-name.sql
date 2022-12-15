--liquibase formatted sql
--changeset azawadzki:2
alter table product add image varchar(128) after currency;