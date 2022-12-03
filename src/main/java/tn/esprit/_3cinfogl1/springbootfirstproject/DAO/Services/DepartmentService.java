package tn.esprit._3cinfogl1.springbootfirstproject.DAO.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit._3cinfogl1.springbootfirstproject.DAO.Repositories.DepartmentRepo;

public class DepartmentService implements IDepartmentService {
    @Autowired
    private DepartmentRepo dRepo;
}
