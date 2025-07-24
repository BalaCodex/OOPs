package OOPS.StudentManagementSystem;

import java.io.*;
import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students;
    public StudentManager() {
        students = new ArrayList<>();
        loadFromFile();
    }
    public void addStudents(int id,String name,int age,String course){
        Student s1=new Student(id,name,age,course);
        students.add(s1);
        saveToFile();
    }
   public void displayAllStudents(){
        if(students.isEmpty()){
            System.out.println("No students in the list");
            return;
        }
        for (Student s:students){
            s.display();
        }
   }
   public void searchStudentById(int n){
       if(students.isEmpty()){
           System.out.println("No students in the list");
           return;
       }
       for (Student s:students){
           if(s.getId()==n){
               s.display();
               return;
           }
       }
       System.out.println("Sorry, The student is not exist");
   }
   public void updateStudent(int id, String newName, int newAge, String newCourse){
       if(students.isEmpty()){
           System.out.println("No students in the list");
           return;
       }
       for (Student s:students){
           if(s.getId()==id){
               s.setAge(newAge);
               s.setCourse(newCourse);
               s.setName(newName);
               saveToFile();
               System.out.println("Student with ID " + id + " Updated.");
               return;
           }
       }

       System.out.println("Sorry, The student is not exist");
   }
    public void deleteStudent(int id){
        if(students.isEmpty()){
            System.out.println("No students in the list");
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Student with ID " + id + " deleted.");
                saveToFile();
                return;
            }
        }
        System.out.println("Sorry, The student is not exist");

    }
    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            for (Student s : students) {
                String line = s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getCourse();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Student data saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving data: " + e.getMessage());
        }
    }


    public void loadFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    String course = parts[3];

                    Student student = new Student(id, name, age, course);
                    students.add(student);
                }
            }
            System.out.println("Students loaded from file.");
        } catch (IOException e) {
            System.out.println("An error occurred while loading data: " + e.getMessage());
        }
    }


}
