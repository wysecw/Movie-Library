DROP DATABASE IF EXISTS CWW22;
CREATE DATABASE CWW22;
USE CWW22;
DROP TABLE IF EXISTS PlaylistCWW22;


CREATE TABLE PlaylistCWW22 (
  MovieID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Title VARCHAR(45) NOT NULL,
  DirectorName VARCHAR(45),
  DirectorDOB DATE,
  Studio VARCHAR(45),
  runTime INTEGER UNSIGNED,
  yearReleased YEAR,
  imdbURL varchar(45),
  imdbRefNum VARCHAR(15),
  metascore INTEGER UNSIGNED,
  rottenTomatoes INTEGER UNSIGNED,
  keyword1 varchar(45),
  keyword2 varchar(45),
  keyword3 varchar(45),
  PRIMARY KEY (MovieID)
);

INSERT INTO PlaylistCWW22 VALUES (
		null, 
		"Se7en", "David Fincher", '1962-08-28', "Cecchi Gori Pictures",
		127, 1995, "https://www.imdb.com/title/tt0114369/", "tt0114369",
		65, 80, "seven deadly sins", "serial killer", "brad pitt");
INSERT INTO PlaylistCWW22 VALUES (
		null, 
		"Mars Attacks!", "Tim Burton", '1958-08-25', "Warner Bros.",
		106, 1996, "https://www.imdb.com/title/tt0116996/", "tt0116996",
		52, 52, "parody", "b movie", "jack nicholson");
INSERT INTO PlaylistCWW22 VALUES (
		null, 
		"Gone in Sixty Seconds", "Dominic Sena", '1949-04-26', "Touchstone Pictures",
		118, 2000, "https://www.imdb.com/title/tt0187078/", "tt0187078",
		35, 25, "auto theft", "brother", "nicolas cage");




