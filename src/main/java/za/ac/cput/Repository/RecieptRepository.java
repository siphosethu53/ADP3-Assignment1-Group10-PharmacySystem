package za.ac.cput.Repository;

import za.ac.cput.Entity.Reciept;

import java.util.HashSet;
import java.util.Set;
/* RecieptRepository.java
 * Repository for the Reciept
 * Thabiso Matsaba 220296006
 * 08 April 2022
 */

public class RecieptRepository implements IRecieptRepository{

    private static RecieptRepository repository = null;
    private Set<Reciept> recieptObjects = null;

    private RecieptRepository(){

        recieptObjects = new HashSet<Reciept>();
    }

    public static RecieptRepository getRepository() {
        if (repository == null) {
            repository = new RecieptRepository();
        }
        return repository;
    }

    @Override
    public Reciept create(Reciept reciept) {
        boolean success = recieptObjects.add(reciept);
        if(!success)
            return null;
          return reciept;
    }

    @Override
    public Reciept read(String recieptID) {
        for (Reciept e : recieptObjects) {
            if (e.getRecieptID().equals(recieptID))
                return e;
        }
        return null;
    }

    @Override
    public Reciept update(Reciept reciept) {
        Reciept oldReciept = read(reciept.getRecieptID());
        if (oldReciept != null){
          recieptObjects.remove(oldReciept);
          recieptObjects.add(reciept);
          return reciept;
        }
        return null;
    }

    @Override
    public boolean delete(String recieptID) {
        Reciept recieptToDelete = read(recieptID);
        if(recieptToDelete == null)
            return false;
            recieptObjects.remove(recieptToDelete);
        return true;
    }

    @Override
    public Set<Reciept> getAll() {

        return recieptObjects;
    }
}
