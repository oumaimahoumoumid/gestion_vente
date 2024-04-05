CREATE DATABASE ecommerce_db;

USE ecommerce_db;

CREATE TABLE Produit (
    id INT PRIMARY KEY IDENTITY,
    type VARCHAR(255),
    reference VARCHAR(255),
    description TEXT,
    prix DECIMAL(10, 2)
);
GO

-- Création de la table Client
CREATE TABLE Client (
    id INT PRIMARY KEY IDENTITY,
    nom VARCHAR(255),
    prenom VARCHAR(255),
    adresse VARCHAR(255),
    numero VARCHAR(10),
    telephone VARCHAR(20),
    ville VARCHAR(255)
);
GO

-- Création de la table Facture
CREATE TABLE Facture (
    id INT PRIMARY KEY IDENTITY,
    id_client INT,
    id_produit INT,
    quantite INT,
    total DECIMAL(10, 2),
    FOREIGN KEY (id_client) REFERENCES Client(id),
    FOREIGN KEY (id_produit) REFERENCES Produit(id)
);
GO
