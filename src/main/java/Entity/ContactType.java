package Entity;

/**
 * @author Daniella Burgess 219446482
 * This is ContactType.java
 * Date 05 April 2022
 */

public class ContactType {

        private int typeId;
        private String contactName;
        private String contactDescription;

        private ContactType(Builder builder) {
            this.typeId = builder.typeId;
            this.contactName = builder.contactName;
            this.contactDescription = builder.contactDescription;
        }


        public int getTypeId() {
            return typeId;
        }

        public void setTypeId(int typeId) {
            this.typeId = typeId;
        }

        public String getContactName() {
            return contactName;
        }

        public void setContactName(String contactName) {
            this.contactName = contactName;
        }

        public String getContactDescription() {
            return contactDescription;
        }

        public void setContactDescription(String contactDescription) {
            this.contactDescription = contactDescription;
        }

        @Override
        public String toString() {
            return "ContactType{" +
                    "typeId=" + typeId +
                    ", contactName='" + contactName + '\'' +
                    ", contactDescription='" + contactDescription + '\'' +
                    '}';
        }

        public static class Builder {

            private int typeId;
            private String contactName;
            private String contactDescription;

            public Builder typeId(int typeId) {
                this.typeId = typeId;
                return this;
            }

            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            public Builder contactDescription(String contactDescription) {
                this.contactDescription = contactDescription;
                return this;
            }

            public Builder copy(ContactType contactType) {
                this.typeId = contactType.typeId;
                this.contactName = contactType.contactName;
                this.contactDescription = contactType.contactDescription;
                return this;
            }

            public ContactType build() {
                return new ContactType(this);
            }

        }
    }


