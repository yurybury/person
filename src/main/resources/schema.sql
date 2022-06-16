DROP TABLE IF EXISTS Person;

CREATE TABLE Person (
  id VARCHAR(250)  PRIMARY KEY,
  href VARCHAR(250),
  status VARCHAR(25),
  creationDate DATE,
  lastUpdate DATE,
  fromDate DATE,
  toDate DATE,
  namePrefix VARCHAR(250),
  givenName VARCHAR(250),
  middleName VARCHAR(250),
  familyName VARCHAR(250),
  nickname VARCHAR(250),
  gender VARCHAR(250),
  eMailAddress VARCHAR(250),
  workPhone VARCHAR(250),
  privatePhone VARCHAR(250),
  webHomePage VARCHAR(250)
);

