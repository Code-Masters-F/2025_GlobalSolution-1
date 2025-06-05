-- UPDATE
-- INSERT
-- DELETE

INSERT INTO Usuario (id, cpf, nome, email, senha, telefone) VALUES
(1, '556.362.310-67', 'João da Silva', 'joao.dasilva@gmail.com', 'teste12345', '11987654321'),
(2, '123.456.789-00', 'Maria Oliveira', 'maria.oliveira@hotmail.com', 'maria123', '21987654321');

INSERT INTO AbrigoImprovisado (id, id_usuario, endereco, cep, capacidade) VALUES
(1, 1, 'Rua das Flores, 123', '12345678', 10),
(2, 1, 'Avenida Brasil, 456', '87654321', 5);

INSERT INTO AbrigoOficial (id, nome, cnpj, endereco, cep, capacidade) VALUES
(1, 'Abrigo Oficial São Paulo', '12.345.678/0001-90', 'Rua da Esperança, 789', '12345678', 50),
(2, 'Abrigo Oficial Rio de Janeiro', '98.765.432/0001-10', 'Avenida do Sol, 321', '87654321', 30);

UPDATE Usuario SET senha = 'novaSenha123' WHERE id = 1;
UPDATE AbrigoImprovisado SET capacidade = 15 WHERE id = 2;

DELETE FROM Usuario WHERE id = 2;
DELETE FROM AbrigoImprovisado WHERE id = 2;






