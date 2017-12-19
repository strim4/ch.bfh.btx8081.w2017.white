CREATE TABLE ACTIVITY (ID INTEGER NOT NULL, CREATIONDATE TIMESTAMP, DESCRIPTION VARCHAR(255), ENTRYDATE VARCHAR(255), NAME VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE DIARYELEMENT (ID INTEGER NOT NULL, CREATIONDATE TIMESTAMP, ENTRYDATE VARCHAR(255), NAME VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE DIARYPIC (ID INTEGER NOT NULL, CREATIONDATE TIMESTAMP, DESCRIPTION VARCHAR(255), ENTRYDATE VARCHAR(255), IMAGEFILE BYTEA, NAME VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE DIARYTEXT (ID INTEGER NOT NULL, CREATIONDATE TIMESTAMP, ENTRYDATE VARCHAR(255), NAME VARCHAR(255), NOTE VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE ANOTIFICATION (ID INTEGER NOT NULL, DATE TIMESTAMP, DESCRIPTION VARCHAR(255), ISSENT BOOLEAN, TITLE VARCHAR(255), TYPE VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE TEXTNOTIFICATION (ID INTEGER NOT NULL, DATE TIMESTAMP, DESCRIPTION VARCHAR(255), ISSENT BOOLEAN, TITLE VARCHAR(255), TYPE VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE IMAGENOTIFICATION (ID INTEGER NOT NULL, DATE TIMESTAMP, DESCRIPTION VARCHAR(255), IMAGEPATH VARCHAR(255), ISSENT BOOLEAN, TITLE VARCHAR(255), TYPE VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE PUSHMESSAGES (ID INTEGER NOT NULL, MESSAGE VARCHAR(255), TYPE VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE PROFILE (ID INTEGER NOT NULL, EMERGENCYCONTACT VARCHAR(255), EMERGENCYCONTACTPHONE VARCHAR(255), FIRSTNAME VARCHAR(255), HOUSEDOCTOR VARCHAR(255), HOUSEDOCTORPHONE VARCHAR(255), LASTNAME VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(38), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)