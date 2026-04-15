CREATE DATABASE kart_db;

USE kart_db;

CREATE TABLE Temporada(
idTemporada INT AUTO_INCREMENT PRIMARY KEY,
numero INT NOT NULL
);

CREATE TABLE Patrocinio(
idPatrocinio INT AUTO_INCREMENT PRIMARY KEY,
nomePatrocinio VARCHAR(45) NOT NULL
);

CREATE TABLE Equipe(
idEquipe INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
patrocinio_idPatrocinio INT,
FOREIGN KEY(patrocinio_idPatrocinio)
REFERENCES Patrocinio(idPatrocinio)
);

CREATE TABLE Piloto(
idPiloto INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(150) NOT NULL,
peso FLOAT,
capitao TINYINT,
equipe_idEquipe INT,
nacionalidade VARCHAR(45),
FOREIGN KEY(equipe_idEquipe)
REFERENCES Equipe(idEquipe)
);

CREATE TABLE Etapa(
idEtapa INT AUTO_INCREMENT PRIMARY KEY,
local VARCHAR(100) NOT NULL,
data DATE,
hora TIME,
Temporada_idTemporada INT,
FOREIGN KEY(Temporada_idTemporada)
REFERENCES Temporada(idTemporada)
);

CREATE TABLE Etapa_has_Piloto(
Etapa_idEtapa INT,
Piloto_idPiloto INT,
PRIMARY KEY(Etapa_idEtapa, Piloto_idPiloto),
FOREIGN KEY(Etapa_idEtapa) REFERENCES Etapa(idEtapa),
FOREIGN KEY(Piloto_idPiloto) REFERENCES Piloto(idPiloto)
);

SELECT* FROM Piloto;
	