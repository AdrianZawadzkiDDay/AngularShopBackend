--liquibase formatted sql
--changeset mdabrowski:9
alter table review add moderated boolean  default false;
