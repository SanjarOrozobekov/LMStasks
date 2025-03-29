package Enum;

public enum Days {
    MONDAY("Биринчи күн - Java"),
    TUESDAY("Экинчи күн - англис тили."),
    WEDNESDAY("Үчүнчү күн - математика."),
    THURSDAY("Төртүнчү күн - немец тили."),
    FRUDAY("Бешинчи күн - Java"),
    SATURDAY("Алтынчы күң - JS"),
    SUNDAY("Дем алыш күн - окуу жок!");

    private String lesson;

    Days(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Day: " +
                super.toString()+
                "\n" + lesson;
    }
}
