-- PILOTS
INSERT INTO PILOTS (pilot_id, full_name, dob, years_exp, nationality) VALUES
  (13382, 'Dju Gen', '12/07/1975', 13, 'CHI'),
  (13376, 'Alfred Lungred', '03/21/1989', 12, 'USA'),
  (13354, 'Ivan Gladkov', '09/12/1973', 9, 'RUS'),
  (13322, 'Edwin van Cleaf', '06/26/1967', 8, 'POL'),
  (13377, 'Petr Mamontov', '08/15/1971', 10, 'BEL'),
  (13399, 'Hans Muller', '08/06/1976', 15, 'GER'),
  (13385, 'Pedro Rodriges', '11/17/1974', 12, 'MEX');

-- COMPANIES
INSERT INTO COMPANIES (company_id, full_name, year_registration, country, main_base, additional_hub) VALUES
  (5667, 'China Airlines', 1959, 'People Republic of China', 'Taiwan TPE', 'Beijing PEK'),
  (4447, 'American Airlines', 1930, 'United States of America', 'Boston BOS', 'New-York JFK'),
  (5247, 'Aeroflot', 1923, 'Russian Federation', 'Moscow DME', 'Moscow SVO'),
  (4736, 'AirBerlin', 1978, 'Federal Republic of Germany', 'Berlin BER', 'Frankfurt-on-Main FRA'),
  (9675, 'Aeromexico', 1934, 'United Mexican States', 'Mexico MEX', NULL);

-- AIRCRAFTS
INSERT INTO AIRCRAFTS (aircraft_id, model, year_issue, state, company_id) VALUES
  ('B-8488', 'Airbus A380', 1997, 'China', 5667),
  ('RA-85667', 'Boeing 777', 2005, 'USA', 4447),
  ('UP-HA001', 'Tu-154', 1997, 'Russia', 5247),
  ('DY-2802', 'Airbus A320', 1995, 'Germany', 4736),
  ('AZ-34598', 'Sukhoi Superjet 100', 2012, 'Russia', 5247),
  ('F-WTSA', 'Il-86', 2002, 'Russia', 5247),
  ('FU-158', 'Boeing 747', 2008, 'Mexico', 9675);

-- FLIGHTS
INSERT INTO FLIGHTS (flight_id, aircraft_id, pilot_id, start_time, departure, destination, tickets_bought, tickets_available) VALUES
  (20072, 'B-8488', 13382, '12:20:00', 'Moscow DME', 'Dubai DXB', 97, 153),
  (20085, 'RA-85667', 13376, '13:30:00', 'Moscow DME', 'Berlin BER', 54, 196),
  (20034, 'UP-HA001', 13354, '14:50:00', 'Moscow DME', 'New-York JFK', 174, 76),
  (20048, 'DY-2802', 13322, '17:00:00', 'Moscow DME', 'Manila MNL', 166, 84),
  (20099, 'AZ-34598', 13377, '19:33:00', 'Moscow DME', 'Tokyo HND', 85, 165),
  (20086, 'F-WTSA', 13399, '20:10:00', 'Moscow DME', 'Mexico MEX', 137, 113),
  (20022, 'FU-158', 13385, '23:05:00', 'Moscow DME', 'Minsk MSQ', 128, 122);