--CREATE

CREATE TABLE Usuario (
    id INT PRIMARY KEY,
    cpf VARCHAR (18) NOT NULL UNIQUE , 
    nome VARCHAR (100) NOT NULL UNIQUE,
    email VARCHAR(300) NOT NULL UNIQUE,
    senha VARCHAR (100) NOT NULL,
    telefone VARCHAR (20) NOT NULL
);

CREATE TABLE AbrigoOficial (
    id INT PRIMARY KEY,
    nome VARCHAR (250) NOT NULL,
    cnpj VARCHAR (18) NOT NULL UNIQUE,
    endereco VARCHAR (300) NOT NULL,
    cep VARCHAR(8) NOT NULL,
    capacidade INT DEFAULT 0
);

CREATE TABLE AbrigoImprovisado (
    id INT PRIMARY KEY,
    id_usuario INT NOT NULL,
    endereco VARCHAR (300) NOT NULL,
    cep VARCHAR (8) NOT NULL,
    capacidade INT DEFAULT 0,

    FOREIGN KEY (id_usuario) REFERENCES Usuario(id)
);



