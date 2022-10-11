package za.ac.cput.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Supplier implements Serializable {
    @Id
    private String suppId;
    private String suppName;
    private Contact contact;


   //Getters
    public String getSuppId() {
        return suppId;
    }

    public String getSuppName() {
        return suppName;
    }

    public Contact getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "suppId='" + suppId + '\'' +
                ", suppName='" + suppName + '\'' +
                ", Contact=" + contact +
                '}';
    }

    //Builder Constructor
    protected Supplier(){}

    private  Supplier (Supplier.Builder builder){
        this.suppId = builder.suppId;
        this.suppName = builder.suppName;
        this.contact = builder.contact;
    }

    //Builder Classes
   public static class Builder{
        private String suppId;
        private String suppName;
        private Contact contact;

        public Supplier.Builder suppId(String suppId) {
            this.suppId=suppId;
            return this;
        }

        public Supplier.Builder suppName(String suppName) {
            this.suppName=suppName;
            return this;
        }

        public Supplier.Builder contact(Contact contact) {
            this.contact=contact;
            return this;
        }

    }

}
