package Repository;

import Entity.Supplier;

import java.util.Set;

public interface ISupplierRepository extends IRepository<Supplier,String> {
    public Set<Supplier> getAll();
}
