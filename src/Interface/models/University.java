package Interface.models;

import java.time.LocalDate;

public class University extends EducationCenter{
    public University() {
    }

    public University(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }
}
