package main.java.com.vente.vente.repository;

import main.java.com.vente.vente.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    // Vous pouvez ajouter des méthodes personnalisées pour les requêtes spécifiques ici si nécessaire
}
