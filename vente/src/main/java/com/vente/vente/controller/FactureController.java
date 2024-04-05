package main.java.com.vente.vente.controller;

import main.java.com.vente.vente.model.Facture;
import main.java.com.vente.vente.service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/factures")
public class FactureController {

    private final FactureService factureService;

    @Autowired
    public FactureController(FactureService factureService) {
        this.factureService = factureService;
    }

    @GetMapping
    public List<Facture> getAllFactures() {
        return factureService.getAllFactures();
    }

    @GetMapping("/{id}")
    public Optional<Facture> getFactureById(@PathVariable Long id) {
        return factureService.getFactureById(id);
    }

    @PostMapping
    public Facture createFacture(@RequestBody Facture facture) {
        return factureService.saveOrUpdateFacture(facture);
    }

    @PutMapping("/{id}")
    public Facture updateFacture(@PathVariable Long id, @RequestBody Facture facture) {
        facture.setId(id);
        return factureService.saveOrUpdateFacture(facture);
    }

    @DeleteMapping("/{id}")
    public void deleteFacture(@PathVariable Long id) {
        factureService.deleteFacture(id);
    }
}
