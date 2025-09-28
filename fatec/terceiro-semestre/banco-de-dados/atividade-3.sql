CREATE DATABASE imobiliaria;
USE imobiliaria;

SHOW TABLES;


CREATE TABLE proprietario(
	codigo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	CPF VARCHAR(11),
	sexo TINYINT(1),
	idade DATE NOT NULL,
	telefone VARCHAR(13) NOT NULL
);

INSERT INTO proprietario (nome, CPF, sexo, idade, telefone) VALUES
('João Silva', '12345678901', 1, '1980-05-10', '11988887777'),
('Maria Oliveira', '23456789012', 0, '1975-03-20', '11977776666'),
('Carlos Pereira', '34567890123', 1, '1990-08-15', '11966665555');


DROP TABLE imovel;
CREATE TABLE imovel(
	codigo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	endereco VARCHAR(200) NOT NULL,
	descricao VARCHAR(500),
	valor_aluguel DOUBLE NOT NULL,
	tipo VARCHAR(100),
	status TINYINT(1),
	codigo_proprietario INT NOT NULL,
	FOREIGN KEY (codigo_proprietario) REFERENCES proprietario(codigo)
);

INSERT INTO imovel (endereco, descricao, valor_aluguel, tipo, status, codigo_proprietario) VALUES
('Rua das Flores, 123', 'Apartamento 2 quartos, 1 vaga de garagem', 1500.00, 'Apartamento', 1, 1),
('Av. Paulista, 1000', 'Sala comercial, 40m²', 2500.00, 'Comercial', 1, 2),
('Rua Verde, 45', 'Casa térrea, 3 quartos, quintal grande', 2000.00, 'Casa', 0, 3);


CREATE TABLE inquilino(
	codigo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	CPF VARCHAR(100),
	sexo TINYINT(1),
	idade TINYINT,
	telefone VARCHAR(13) NOT NULL
);

INSERT INTO inquilino (nome, CPF, sexo, idade, telefone) VALUES
('Fernanda Costa', '45678901234', 0, 30, '11955554444'),
('Rafael Lima', '56789012345', 1, 28, '11944443333'),
('Juliana Souza', '67890123456', 0, 35, '11933332222');


CREATE TABLE corretor(
	codigo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	CPF VARCHAR(100),
	sexo TINYINT(1),
	dt_nascimento DATE,
	telefone VARCHAR(13) NOT NULL,
	CRECI TINYINT(6)
);

INSERT INTO corretor (nome, CPF, sexo, dt_nascimento, telefone, CRECI) VALUES
('Ana Martins', '78901234567', 0, '1988-02-12', '11922221111', 1),
('Bruno Rocha', '89012345678', 1, '1992-07-25', '11911112222', 2),
('Camila Dias', '90123456789', 0, '1985-11-05', '11999990000', 3);



CREATE TABLE aluguel (
	codigo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	codigo_imovel INT NOT NULL,
	codigo_inquilino INT NOT NULL,
	codigo_corretor INT NOT NULL,
	dt_aluguel DATE NOT NULL,
	dt_vencimento DATE NOT NULL,
	valor_final_aluguel 	DOUBLE NOT NULL,
	FOREIGN KEY (codigo_imovel) REFERENCES imovel(codigo),
	FOREIGN KEY (codigo_inquilino) REFERENCES inquilino(codigo),
	FOREIGN KEY (codigo_corretor) REFERENCES corretor(codigo)
);

INSERT INTO aluguel (codigo_imovel, codigo_inquilino, codigo_corretor, dt_aluguel, dt_vencimento, valor_final_aluguel) VALUES
(1, 1, 1, '2025-01-10', '2025-02-10', 1500.00),
(2, 2, 2, '2025-02-15', '2025-03-15', 2500.00),
(3, 3, 3, '2025-03-01', '2025-04-01', 2000.00);
