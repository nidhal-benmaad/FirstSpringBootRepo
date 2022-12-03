package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Services;

import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Entities.Departement;

import java.util.List;

public interface IDepartmentService {
    Departement addDepartement(Departement c);

    Departement updateDepartement(Departement c);

    void deleteDepartement(Departement c);

    void deleteDepartement(Long id);

    List<Departement> findAllDepartement(Long id);
}
