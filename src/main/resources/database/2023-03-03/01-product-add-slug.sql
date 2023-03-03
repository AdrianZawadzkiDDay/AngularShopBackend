--liquibase formatted sql
--changeset az:3 4
alter table product add slug varchar(255) after image;
alter table product add constraint ui_product_slug unique key(slug);
alter table product add full_description text default null after description;