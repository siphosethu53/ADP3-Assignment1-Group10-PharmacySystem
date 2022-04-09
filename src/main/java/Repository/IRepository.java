/* IRepository.java
Repository Interface (CRUD)
 Author: Zaeem Petersen (219010145)
 Date: 05 April 2022
*/
package Repository;

public interface IRepository<T,ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
