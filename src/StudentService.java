public class StudentService {

    public static void PrintStudent(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurName());
        System.out.println("Birth year: " + student.getYear());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Mark: " + student.getMark());
    }

    public static void PrintFullNames(Student[] students) {
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getSurName());
        }
    }

    public static void PrintMaleStudents(Student[] students) {
        for (Student s : students) {
            if (s.getGender() == 'm') {
                PrintStudent(s);
            }
        }
    }

    public static void PrintAllFemalesMarkMore50_4(Student[] students) {
        for (Student s : students) {
            if (s.getGender() == 'f' && s.getMark() > 50.4) {
                PrintStudent(s);
            }
        }
    }

    public static void PrintStudentWithMinMark(Student[] students) {
        double mark = students[0].getMark();
        int k = 0;
        for (int i = 0; i < students.length; i++) {
            if (mark > students[i].getMark()) {
                mark = students[i].getMark();
                k = i;
            }
        }
        PrintStudent(students[k]);
    }

    public static void PrintBiggestMaleStudent(Student[] students) {
        int k = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'm') {
                k = i;
                break;
            }
        }
        int year = students[k].getYear();
        int m = 0;
        for (; k < students.length; k++) {
            if (year > students[k].getYear() && students[k].getGender() == 'm') {
                year = students[k].getYear();
                m = k;
            }
        }
        PrintStudent(students[m]);
    }

    public static void PrintStudentsSortedByMark(Student[] students) {
        Student temp = null;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[i].getMark() > students[i + 1].getMark()) {
                    temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
        }
        for (Student s : students) {
            PrintStudent(s);
        }
    }

    public static void PrintFemaleStudentsSortedByYear(Student[] students) {
        Student temp = null;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[i].getYear() > students[i + 1].getYear() && students[i].getGender() == 'f' && students[i + 1].getGender() == 'f') {
                    temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
        }
        for (Student s : students) {
            if (s.getGender() == 'f') {
                PrintStudent(s);
            }
        }
    }
}