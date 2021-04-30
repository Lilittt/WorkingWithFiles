public class StudentConverter {
    public static Student[] StringToStudent(String[] strings) {
        Student[] students = new Student[strings.length];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
        String[] student;

        for (int i = 0; i < strings.length; i++) {
            student = strings[i].split(",");
            students[i].setName(student[0]);
            students[i].setSurName(student[1]);
            students[i].setYear(Integer.parseInt(student[2]));
            students[i].setGender(student[3].charAt(0));
            students[i].setMark(Double.parseDouble(student[4]));

        }
        return students;
    }
}