CREATE TABLE medicos (
    id NUMBER(19) NOT NULL,
    nome VARCHAR2(100) NOT NULL,
    email VARCHAR2(100) NOT NULL UNIQUE,
    crm VARCHAR2(6) NOT NULL UNIQUE,
    especialidade VARCHAR2(100) NOT NULL,
    logradouro VARCHAR2(100) NOT NULL,
    bairro VARCHAR2(100) NOT NULL,
    cep VARCHAR2(9) NOT NULL,
    complemento VARCHAR2(100),
    numero VARCHAR2(20),
    uf CHAR(2) NOT NULL,
    cidade VARCHAR2(100) NOT NULL,

    CONSTRAINT pk_medicos PRIMARY KEY (id)
);