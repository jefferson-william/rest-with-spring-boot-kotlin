CREATE TABLE public.person (
    id bigint NOT NULL,
    address character varying(255) NOT NULL,
    first_name character varying(255) NOT NULL,
    gender character varying(255) NOT NULL,
    last_name character varying(255) NOT NULL
);
ALTER TABLE public.person OWNER TO postgres;
ALTER TABLE public.person ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.person_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
ALTER TABLE ONLY public.person ADD CONSTRAINT person_pkey PRIMARY KEY (id);
