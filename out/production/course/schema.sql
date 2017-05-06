CREATE SEQUENCE id_sequence;

CREATE TABLE PILOTS (
  pilot_id BIGINT PRIMARY KEY DEFAULT nextval('id_sequence'),
  full_name VARCHAR(70) NOT NULL,
  dob DATE NOT NULL,
  years_exp SMALLINT NOT NULL,
  nationality CHAR(3) NOT NULL
);

CREATE TABLE COMPANIES (
  company_id BIGINT PRIMARY KEY DEFAULT nextval('id_sequence'),
  full_name VARCHAR(20) NOT NULL UNIQUE,
  year_registration SMALLINT NOT NULL,
  country VARCHAR(50) NOT NULL,
  main_base VARCHAR(50) NOT NULL,
  additional_hub VARCHAR(50)
);

CREATE TABLE AIRCRAFTS (
  aircraft_id VARCHAR(20) PRIMARY KEY NOT NULL,
  model VARCHAR(30) NOT NULL,
  year_issue SMALLINT NOT NULL,
  state VARCHAR(50) NOT NULL,
  company_id BIGINT REFERENCES COMPANIES ON DELETE CASCADE
);

CREATE TABLE FLIGHTS (
  flight_id BIGINT PRIMARY KEY DEFAULT nextval('id_sequence'),
  aircraft_id VARCHAR(20) REFERENCES AIRCRAFTS ON DELETE CASCADE,
  pilot_id BIGINT REFERENCES PILOTS ON DELETE CASCADE,
  start_time TIME NOT NULL,
  departure VARCHAR(50) NOT NULL,
  destination VARCHAR(50) NOT NULL,
  tickets_bought SMALLINT NOT NULL,
  tickets_available SMALLINT NOT NULL
);