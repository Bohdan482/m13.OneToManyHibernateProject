CREATE TABLE client
(
    ID IDENTITY PRIMARY KEY                         NOT NULL,
    NAME VARCHAR(500) CHECK (LENGTH (NAME) > 2)    NOT NULL
);

CREATE table planet
(
    ID VARCHAR CHECK (planet.ID = UPPER(ID)) PRIMARY KEY NOT NULL,
    NAME VARCHAR(500)
);

CREATE table ticket
(
    ID IDENTITY PRIMARY KEY not null,
    CREATED_AT TIMESTAMP,
    CLIENT_ID LONG,
    FROM_PLANET_ID VARCHAR,
    TO_PLANET_ID VARCHAR
);

ALTER TABLE ticket
    ADD CONSTRAINT fk_client_id
        FOREIGN KEY (client_id)
            REFERENCES client (ID);

ALTER TABLE ticket
    ADD CONSTRAINT fk_from_planet_id
        FOREIGN KEY (from_planet_id)
            REFERENCES planet (ID);

ALTER TABLE ticket
    ADD CONSTRAINT fk_to_planet_id
        FOREIGN KEY (to_planet_id)
            REFERENCES planet (ID);