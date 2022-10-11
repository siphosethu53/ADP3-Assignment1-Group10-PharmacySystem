package za.ac.cput.domain;

/* Pharmacy.java
Domain for the Pharmacy
Author: Waseem Dollie (216040566)
Date: 10 October 2022 */

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class PharmacyContact {

    private String pharmId;
    private String contact;

    private PharmacyContact(Builder builder){
        this.pharmId = builder.pharmId;
        this.contact = builder.contact;
    }

    protected PharmacyContact(){
    }

    public String getPharmId() {return pharmId;}

    public String getContact() {return contact;}


    private void setPharmId(String pharmId) {
        this.pharmId = pharmId;
    }
    private void getContact(String contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PharmacyContact pharmacyContact = (PharmacyContact) o;
        return pharmId.equals(pharmacyContact.pharmId) && contact.equals(pharmacyContact.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pharmId, contact);
    }

    @Override
    public String toString() {
        return "PharmacyContact{" +
                "pharmId='" + pharmId + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

    public static class Builder{
        private String pharmId, contact;

        public Builder pharmId(String pharmId){
            this.pharmId = pharmId;
            return this;
        }

        public Builder contact(String contact){
            this.contact = contact;
            return this;
        }


        public Builder copy(PharmacyContact pharmacyContact){
            this.pharmId = pharmacyContact.pharmId;
            this.contact = pharmacyContact.contact;
            return this;
        }

        public PharmacyContact build(){
            return new PharmacyContact(this);
        }

    }
}

