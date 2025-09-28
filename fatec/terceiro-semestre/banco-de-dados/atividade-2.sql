CREATE DATABASE IF NOT EXISTS atividade_aluno_disciplina;

USE atividade_aluno_disciplina;

SHOW DATABASES;
SHOW TABLES;

DROP DATABASE atividade_aluno_disciplina;
DROP DATABASE IF EXISTS atividade_aluno_disciplina;

DROP TABLE aluno;
DROP TABLE disciplina;
DROP TABLE cursa;

ALTER TABLE aluno MODIFY nome VARCHAR(150);
ALTER TABLE aluno ADD COLUMN telefone VARCHAR(11);
ALTER TABLE aluno RENAME COLUMN data_nascimento TO data_nasc;
ALTER TABLE aluno DROP COLUMN telefone;

UPDATE disciplina SET nome = “Programação de Banco de Dados” WHERE codigo = 1;
DETELE FROM disciplina WHERE codigo = 4; 

SELECT * FROM aluno;
DESCRIBE aluno;
CREATE TABLE aluno(
	ra INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	email VARCHAR(50) NOT NULL,
	data_nascimento DATE NOT NULL
);

INSERT INTO aluno (nome, cpf, email, data_nascimento)
VALUE ("Guilherme", "474...", "chama@gmail.com", "2003-02-22");


SELECT * FROM disciplina;
DESCRIBE disciplina;
CREATE TABLE disciplina(
	codigo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	carga_horaria INT NOT NULL
);


SELECT * FROM cursa;
DESCRIBE cursa;
CREATE TABLE cursa(
	codigo_aluno INT NOT NULL PRIMARY KEY,
	codigo_disciplina INT NOT NULL,
	data_inicio DATE NOT NULL,
	FOREIGN KEY(codigo_aluno) REFERENCES aluno(ra) ON DELETE CASCADE,
	FOREIGN KEY(codigo_disciplina) REFERENCES disciplina(codigo) ON DELETE RESTRICT #Poderia usar ON UPDATE ou DELETE CASCADE, mas faz mais sentido DELETE RESTRIC
);