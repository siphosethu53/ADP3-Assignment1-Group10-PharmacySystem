package factory;
import domain.Name;
/* NameFactory.java
 * Factory for the Name entity
 * Thabiso Matsaba 220296006
 * 10 August 2022
 */
public class NameFactory {

    public static Name build(String firstName, String middleName, String lastName) {

        return new Name.Builder().firstName(firstName)
                .middleName(middleName)
                .lastName(lastName)
                .build();
    }
}

