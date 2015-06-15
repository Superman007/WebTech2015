# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table fahrt (
  id                        varchar(255) not null,
  mitfahrer                 varchar(255),
  mitfahrer_aktuell         varchar(255),
  start_adresse             varchar(255),
  ziel_adresse              varchar(255),
  zweit_adresse             varchar(255),
  datum                     varchar(255),
  constraint pk_fahrt primary key (id))
;

create table user (
  username                  varchar(255) not null,
  vorname                   varchar(255),
  nachname                  varchar(255),
  ort                       varchar(255),
  email                     varchar(255),
  passwort                  varchar(255),
  constraint pk_user primary key (username))
;

create sequence fahrt_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists fahrt;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists fahrt_seq;

drop sequence if exists user_seq;

