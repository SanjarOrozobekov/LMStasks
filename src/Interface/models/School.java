package Interface.models;

import java.time.LocalDate;

public class School extends EducationCenter{
    public School() {
    }

    public School(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }
}
