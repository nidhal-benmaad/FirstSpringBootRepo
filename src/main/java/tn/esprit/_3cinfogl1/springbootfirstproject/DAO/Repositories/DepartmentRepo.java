package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Entities.Departement;

public interface DepartmentRepo extends CrudRepository<Departement,Long> {
}
