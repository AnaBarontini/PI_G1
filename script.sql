CREATE DATABASE seu_banco_aqui;
USE seu_banco_aqui;

CREATE TABLE usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(100) NOT NULL,
    senha VARCHAR(5) NOT NULL -- Aqui você salvará o RM de 5 dígitos
);

-- Inserir um teste
INSERT INTO usuarios (email, senha) VALUES ('aluno@etec.cps.sp.gov.br', '12345');