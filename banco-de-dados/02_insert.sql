USE kart_db;

SELECT * FROM Temporada;

INSERT INTO Temporada(numero) VALUES(2024);

INSERT INTO Patrocinio(nomePatrocinio) VALUES
('MotorTech Brasil'), ('Velocidade Extrema'),
('Alta Performance'),('Turbo Racing'),
('Pneus ProDrive');

INSERT INTO Equipe(nome,patrocinio_idPatrocinio) VALUES
('Escuderia Veloz',1),
('Rapidos & Furiosos',2),
('Fênix Racing',3),
('Equipe Tempestade',4),
('Corredores de Aço',5);

INSERT INTO Piloto(nome,peso,capitao,equipe_idEquipe,nacionalidade)VALUES
('Lucas Andrade',75.5,1,1,'Brasil'),('Renato FIgueiredo',75,0,1,'Brasil'),
('Mateus Silva',68,0,2,'Brasil'),('Bruno Almeida',78.3,1,2,'Brasil'),
('Carla Pereira',60,1,3,'Brasil'),('Gabriel Torres',58.5,0,3,'Brasil'),
('João Costa',80.5,0,4,'Brasil'),('Thiago Santos',72.5,0,4,'Brasil'),
('Mariana Gomes',62,1,5,'Brasil'),('Beatriz Lopes',63.2,0,5,'Brasil');

INSERT INTO Etapa(local,data,hora,Temporada_idTemporada)VALUES
('São Paulo','2024-01-15','14:00:00',1),
('Rio de Janeiro','2024-02-20','16:00:00',1),
('Campo Grande','2024-03-18','15:00:00',1),
('Londrina','2024-04-22','13:00:00',1),
('Porto Alegre','2024-05-10','10:00:00',1);

INSERT INTO Etapa_has_Piloto(Etapa_idEtapa,Piloto_idPiloto)VALUES
(1,1),(1,3),(1,5),(1,7),(1,9),
(1,2),(1,4),(1,6),(1,8),(1,10);
