package Main;

import Model.Students;

import java.util.Arrays;
import java.util.Scanner;

public class Navbar {
    public static void main(String[] args) {
        Students[] students = new Students[3];

        students[0] = new Students(1, "son", 30);
        students[1] = new Students(2, "ngan", 28);
        students[2] = new Students(3, "men", 30);


        while (true) {
            System.out.println("==== MENU ====");
            System.out.println("1. Show liststudents");
            System.out.println("2.Create Student ");
            System.out.println("3.Update Student");
            System.out.println("4.Delete Student");
            System.out.print("Sort Student By Age ASC (Tăng Dần)");
            System.out.println("Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập từ bàn phím chức năng mà bạn muốn hiển thị:");
            int choice = sc.nextInt();
            Students[] newStudent = new Students[0];

            switch (choice) {
                case 1:
                    System.out.println(Arrays.toString(students));
                    break;
                case 2:
                    newStudent =new Students[students.length+1];

                    for (int i=0; i<newStudent.length-1; i++){
                        newStudent[i] = students[i];
                    }
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter student id: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter student name: ");
                    String studentName = scanner.next();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();

                    newStudent[students.length] = new Students(studentId,studentName,age);
                    System.out.println(Arrays.toString(newStudent));
                case 3:
                    System.out.println("Chọn id bạn muốn sửa: ");
                    int suaId = sc.nextInt();
                    System.out.println("Nhập id cần sửa: ");
                    int newId = sc.nextInt();
                    System.out.println("Nhập tên cần sửa: ");
                    String newName = sc.nextLine();
                    System.out.println("Nhập tuổi cần sửa: ");
                    int newAge = sc.nextInt();
                    Students updateStd= new Students(newId,newName,newAge);
                    int numberIndex = suaId-1;
                    newStudent = students;
                    for (int i=0; i<newStudent.length; i++){
                        if(numberIndex==i){
                            newStudent[numberIndex]= updateStd;

                        }
                    }
                    System.out.println("Mảng mới sau khi update là: ");
                    System.out.println(Arrays.toString(newStudent));


            }

        }
    }
}


