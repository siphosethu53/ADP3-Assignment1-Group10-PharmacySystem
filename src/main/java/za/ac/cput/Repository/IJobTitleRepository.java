package za.ac.cput.Repository;

import za.ac.cput.Entity.JobTitle;

import java.util.Set;

public interface IJobTitleRepository extends IRepository<JobTitle, Integer>{
      Set<JobTitle> getAll();
}
