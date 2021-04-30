public class Student {
    private String name;
    private String surName;
    private int year = 1921;
    private char gender = 'f';
    private double mark = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1920 && year < 2003)
            this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'm' || gender == 'f')
            this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= 0 && mark <= 100)
            this.mark = mark;
    }
}
