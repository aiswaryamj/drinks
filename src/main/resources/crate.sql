DROP TABLE IF EXISTS CRATE;

CREATE TABLE CRATE (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  crate_pic VARCHAR(250) NOT NULL,
  noOfBottles INT NOT NULL,
  price FLOAT NOT NULL,
  cratesInStock INT NOT NULL,
);