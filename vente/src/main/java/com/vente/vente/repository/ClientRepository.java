package main.java.com.vente.vente.repository;

import main.java.com.vente.vente.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    // Vous pouvez ajouter des méthodes personnalisées pour les requêtes spécifiques ici si nécessaire
}
