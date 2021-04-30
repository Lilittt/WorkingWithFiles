import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        String path = "C:\\Users\\Lilit\\Desktop\\students.txt";
        String[] strings = FileService.read(path);
        Student[] students = StudentConverter.StringToStudent(strings);

        Scanner s = new Scanner(System.in);
        boolean isMenuActive = true;

        while (isMenuActive) {
            System.out.println("1. Print full names of students");
            System.out.println("2. Print all female students");
            System.out.println("3. Print all female students who have mark greater than 50.4");
            System.out.println("4. Print student information having the minimal mark");
            System.out.println("5. Print biggest male student information");
            System.out.println("6. Print students sorted by mark");
            System.out.println("7. Print female students sorted by year");

            int taskNumber = s.nextInt();

            switch (taskNumber) {
                case 1:
                    StudentService.PrintFullNames(students);
                    break;
                case 2:
                    StudentService.PrintMaleStudents(students);
                    break;
                case 3:
                    StudentService.PrintAllFemalesMarkMore50_4(students);
                    break;
                case 4:
                    StudentService.PrintStudentWithMinMark(students);
                    break;
                case 5:
                    StudentService.PrintBiggestMaleStudent(students);
                    break;
                case 6:
                    StudentService.PrintStudentsSortedByMark(students);
                    break;
                case 7:
                    StudentService.PrintFemaleStudentsSortedByYear(students);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Invalid task number!");
            }
        }
    }
}
