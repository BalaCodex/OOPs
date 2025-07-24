package OOPS.StudentManagementSystem;

import java.util.Scanner;
//13/7/25
public class Main {
    public static void main(String[] args) {
        StudentManager studentManager=new StudentManager();
        Scanner sc = new Scanner(System.in);
         int userInput=1;
         boolean gate=true;
         while(gate){
             System.out.println("1. Add Student\n" +
                     "2. Display All Students\n" +
                     "3. Search Student by ID\n" +
                     "4. Update Student\n" +
                     "5. Delete Student\n" +
                     "6. Exit");
             userInput=sc.nextInt();
             switch (userInput){
                 case 1:
                     System.out.println("id");
                     int id=sc.nextInt();
                     System.out.println("name:");
                     String name=sc.next();
                     System.out.println("age");
                     int age=sc.nextInt();
                     System.out.println("Course");
                     String course=sc.next();
                     studentManager.addStudents(id,name,age,course);
                     break;
                 case 2:
                     studentManager.displayAllStudents();
                     break;
                 case 3:
                     System.out.println("Enter the id of the student :");
                     int n =sc.nextInt();
                     studentManager.searchStudentById(n);
                     break;
                 case 4:
                     System.out.println("Enter the id of the student :");
                     int idNo=sc.nextInt();
                     System.out.println("name:");
                     String nam=sc.next();
                     System.out.println("age");
                     int Age=sc.nextInt();
                     System.out.println("Course");
                     String Course=sc.next();
                     studentManager.updateStudent(idNo,nam,Age,Course);
                     break;
                 case 5:
                     System.out.println("Enter the id of the student :");
                     int Id=sc.nextInt();
                     studentManager.deleteStudent(Id);
                     break;
                 case 6:
                     System.out.println("Thank you! Exiting Student Management System.");
                     gate=false;
                     break;
                 default:
                     System.out.println("Invalid choice! Please enter a number between 1-6.");
             }
         }
    }
}
