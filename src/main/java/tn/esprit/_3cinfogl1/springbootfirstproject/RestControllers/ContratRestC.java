package tn.esprit._3cinfogl1.springbootfirstproject.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Entities.Contrat;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Services.IcontratService;

import java.util.List;

@RestController
@RequestMapping("contrats")
public class ContratRestC {
    @Autowired
    private IcontratService ics;

    @PostMapping("addC")
    Contrat addContrat(@RequestBody Contrat c) {
        return ics.addContrat(c);
    }

    @PutMapping("updateC")
    Contrat updateContrat(@RequestBody Contrat c) {
        return ics.updateContrat(c);
    }

    @DeleteMapping("deleteC")
    void deleteContrat(@RequestBody Contrat c) {
        ics.deleteContrat(c);
    }

    @DeleteMapping("deleteCID/{id}")
    void deleteContratById(@PathVariable Long id) {
        ics.deleteContratById(id);
    }

    @GetMapping("findAllByC")
    List<Contrat> findAllContrat(@RequestParam Long id) {
        return ics.findAllContrat(id);
    }

    @GetMapping("findContratById")
    Contrat findContratById(@RequestParam Long id) {
        return ics.findContratById(id);
    }

    @GetMapping("findByArch/{arch}")
    List<Contrat> findByArchive(@PathVariable boolean arch) {
        return ics.findContratByArchive(arch);
    }

}
