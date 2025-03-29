package Interface;

import Interface.models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EducationCenter school = new School("S.Erkinbaev","Kyrgyzstan",LocalDate.of(1935,1,9));
        EducationCenter university = new University("BGU","Kyrgyzstan",LocalDate.of(1950,9,8));
        EducationCenter college = new College("Ala-Too","Kyrgyzstan",LocalDate.of(2000,5,6));

        Student[] students = {
                new Student("Sanjar","Orozobekov",'M',LocalDate.of(2013,9,1),school),
                new Student("Ratbek","Eshenkulov",'M',LocalDate.of(2024,9,1),university),
                new Student("Beksultan","Kachkynov",'M',LocalDate.of(2024,9,1),college),
                new Student("Jenish","Nurbekov",'M',LocalDate.of(2013,9,1),school),
                new Student("Nurkyz","Kanybekova",'F',LocalDate.of(2024,9,9),university),
                new Student("Nurperi","Orozobekova",'F',LocalDate.of(2024,9,9),university),
                new Student("Temirlan","Syiynychbekov",'M',LocalDate.of(20210,9,1),school),
                new Student("Salim","Janserkeev",'M',LocalDate.of(2016,9,1),school),
                new Student("Beknazar","Jologonov",'M',LocalDate.of(2014,9,1),school),
                new Student("Altynbek","Kenjebekov",'M',LocalDate.of(2000,9,1),school)
        };
        for (Student student : students) {
            student.infoStudent();
        }
    }
}

//1.EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
//2.Абстракт класска School , University, College деген саб класстарды тузунуз.
//3.Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(), void
// getStudentsStudyingYear()  деген 2 метод тузунуз.
//4.Student деген класс тузунуз. Полелери: name, surname, Gender gender,
// LocalDate dateOfStart()(студент кайсыл жылы окуп баштаганы), EducationCenter educationCenter;
//5.Main класста студенттердин массивин тузуп ичине 10 студент салыныз. Студенттер ар кандай окуу жайда окусун.
//6.Main класста 1 метод тузунуз.
//7.  1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда окуганы тууралу
// маалыматты жана окуганыны канча жыл болгону тууралу маалыматты чыгарып берсин.
