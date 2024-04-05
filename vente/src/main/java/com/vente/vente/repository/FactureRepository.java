package main.java.com.vente.vente.repository;

import main.java.com.vente.vente.model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
    // Vous pouvez ajouter des méthodes personnalisées pour les requêtes spécifiques ici si nécessaire
}
