# backend-envolti

para o correto funcionamento, please create a table in a postgres database with the following settings:
database: postgres
user: postgres
password: root 


CREATE TABLE public.person
(
    id integer NOT NULL DEFAULT nextval('person_id_seq'::regclass),
    nome character varying COLLATE pg_catalog."default",
    cpf character varying COLLATE pg_catalog."default",
    email character varying COLLATE pg_catalog."default",
    sexo character varying COLLATE pg_catalog."default",
    nascimento date,
    naturalidade character varying COLLATE pg_catalog."default",
    nacionalidade character varying COLLATE pg_catalog."default",
    created_date date,
    last_updated_date date,
    CONSTRAINT id_pk PRIMARY KEY (id)
)
