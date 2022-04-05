package za.ac.cput.Builder;

/**
 * @author Daniella Burgess 219446482
 * This is Address.java
 * Date 05 April 2022
 */

public class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String zipCode;

    private Address(Address.Builder builder) {
        this.houseNumber = builder.houseNumber;
        this.street = builder.street;
        this.city = builder.city;
        this.zipCode = builder.zipCode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public static class Builder {

        private String houseNumber;
        private String street;
        private String city;
        private String zipCode;

        public Builder houseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
