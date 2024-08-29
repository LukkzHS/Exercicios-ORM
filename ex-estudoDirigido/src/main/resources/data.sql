CREATE TABLE item_nota_fiscal (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_nf INT NOT NULL,
    id_item INT NOT NULL,
    cod_prod INT NOT NULL,
    nome_produto VARCHAR(100) NOT NULL,
    valor_unit DECIMAL(12, 3) NOT NULL,
    quantidade INT NOT NULL CHECK (quantidade > 0),
    desconto DECIMAL(6, 3) NOT NULL DEFAULT 0,
    UNIQUE (id_nf, id_item)
);


INSERT INTO item_nota_fiscal (id_nf, id_item, cod_prod, nome_produto, valor_unit, quantidade, desconto) VALUES
(1, 1, 101, 'Teclado Mecânico', 150.750, 2, 10.500),
(1, 2, 102, 'Mouse Óptico', 85.250, 1, 5.000),
(2, 1, 103, 'Monitor LED 24"', 800.000, 1, 20.000),
(2, 2, 104, 'Headset Gamer', 200.500, 1, 0.000),
(3, 1, 105, 'Cadeira Gamer', 950.000, 1, 30.000),
(3, 2, 106, 'Teclado Sem Fio', 120.000, 2, 0.000),
(4, 1, 107, 'Microfone Condensador', 350.000, 1, 25.000),
(4, 2, 108, 'Webcam Full HD', 220.750, 1, 15.000),
(5, 1, 109, 'Placa de Vídeo', 1200.000, 1, 100.000),
(5, 2, 110, 'SSD 1TB', 550.500, 1, 50.000),
(6, 1, 111, 'Fonte 750W', 450.250, 1, 0.000),
(6, 2, 112, 'Memória RAM 16GB', 300.750, 2, 10.000);
