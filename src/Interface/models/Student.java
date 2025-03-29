package Interface.models;

import Interface.serviceimpl.Study;

import java.time.LocalDate;

public class Student implements Study {
    private String name;
    private String surname;
    private char gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    public Student(String name, String surname, char gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }


    @Override
    public void getStudentsEducationCenter() {
        System.out.println(name + " " + surname);
        System.out.println("Oкуган жери: " + educationCenter.getName());
    }

    @Override
    public void getStudentsStudyingYear() {
        int years = LocalDate.now().getYear() - dateOfStart.getYear();
        System.out.println("Окуп жатканына " + years + " жыл болду.");
    }
    public void infoStudent(){
        System.out.println("Аты жөнү: " + name + " " + surname);
        System.out.println("Жынысы: " + gender);
        System.out.println("Окуп баштаган жылы: " + dateOfStart);
        System.out.println("Окуган жери: " + educationCenter.getName());
        getStudentsStudyingYear();
        System.out.println("-----------------------");
    }
}
