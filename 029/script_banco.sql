--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6beta3
-- Dumped by pg_dump version 9.6beta3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: aluno; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE "aluno" (
    id serial NOT NULL,
    nome character varying(255) NOT NULL
);


ALTER TABLE "aluno" OWNER TO postgres;

--
-- Data for Name: aluno; Type: TABLE DATA; Schema: public; Owner: postgres
--


--
-- Name: aluno aluno_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY "aluno"
    ADD CONSTRAINT "aluno_pkey" PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

