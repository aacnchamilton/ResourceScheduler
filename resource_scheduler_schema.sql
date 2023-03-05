DROP TABLE IF EXISTS reservation;
DROP TABLE IF EXISTS address;
DROP TABLE IF EXISTS resource;
DROP TABLE IF EXISTS person;

CREATE TABLE person (
  person_id int unsigned NOT NULL AUTO_INCREMENT,
  first_name varchar(100) NOT NULL, 
  middle_name varchar(100),
  last_name varchar(45) NOT NULL,
  email varchar (320) NOT NULL,
  phone varchar(20) NOT NULL,
  PRIMARY KEY (person_id),
  UNIQUE KEY (email)
);

CREATE TABLE resource (
	resource_id int unsigned NOT NULL AUTO_INCREMENT,
	name varchar(200) NOT NULL,
	description varchar(1000) NOT NULL,
	resource_type enum('person', 'place', 'thing') NOT NULL,
	resourcer_id int unsigned NOT NULL,
	schedule_type enum('hourly', 'daily') NOT NULL,
	price decimal(9,2) NOT NULL,
	start_time TIME NOT NULL,
	end_time TIME NOT NULL,
	PRIMARY KEY (resource_id),
	UNIQUE KEY (name, resourcer_id)
);

CREATE TABLE address (
	address_id int unsigned NOT NULL AUTO_INCREMENT,
	addr1 varchar(200) NOT NULL,
	addr2 varchar(200) NOT NULL,
	city varchar(200) NOT NULL,
	state varchar(2),
	province varchar(200),
	postal_code varchar(10) NOT null,
	country varchar(60) NOT NULL,
	resource_id int unsigned,
	resourcer_id int unsigned,
	scheduler_id int unsigned,
	PRIMARY KEY (address_id),
	UNIQUE KEY (addr1, addr2, postal_code, country),
	FOREIGN KEY (resource_id) REFERENCES resource (resource_id),
	FOREIGN KEY (resourcer_id) REFERENCES person (person_id),
	FOREIGN KEY (scheduler_id) REFERENCES person (person_id)
);

CREATE TABLE reservation (
	reservation_id int unsigned NOT NULL AUTO_INCREMENT,
	date_from DATE NOT NULL,
	date_to DATE NOT NULL,
	start_time TIME NOT NULL,
	end_time TIME NOT NULL,
	resource_id int unsigned NOT NULL,
	scheduler_id int unsigned NOT NULL,
	address_id int unsigned NOT NULL,
	PRIMARY KEY (reservation_id),
	FOREIGN KEY (resource_id) resource (resource_id),
	FOREIGN KEY (scheduler_id) person (person_id),
	FOREIGN KEY (address_id) address (address_id)
);
