package org.edu.roboticole.presentation;

import org.edu.roboticole.data.StudentDataRepository;
import org.edu.roboticole.data.StudentLocalDataSource;
import org.edu.roboticole.domain.DeleteStudentUseCase;
import org.edu.roboticole.domain.GetAllStudentsUseCase;
import org.edu.roboticole.domain.SaveStudentUseCase;
import org.edu.roboticole.domain.StudentModel;


import java.util.ArrayList;

public class StudentView {

    public static void funcion1(){
        printStudents();
        saveStudent();
        printStudents();
    }
    public  static void funcion2(){
        printStudents();
    }
    public  static  void funcion3(){
        printStudents();
        deleteStudent("FF23");
        printStudents();
    }



    public static void printStudents() {
       GetAllStudentsUseCase getAllStudentsUseCase = new GetAllStudentsUseCase(new StudentDataRepository(StudentLocalDataSource.getInstance()));
        ArrayList<StudentModel> students = getAllStudentsUseCase.execute();
        System.out.println("Students: " +students);
    }

    public static void saveStudent() {
        StudentModel studentModel = new StudentModel("FF23", "Vicky", 22, "loli@gmail.fr", "DAM");
        SaveStudentUseCase saveStudentUseCase = new SaveStudentUseCase(new StudentDataRepository(StudentLocalDataSource.getInstance()));
        saveStudentUseCase.execute(studentModel);

    }
    public static void deleteStudent (String id ){
        DeleteStudentUseCase deleteStudentUseCase = new DeleteStudentUseCase(new StudentDataRepository(StudentLocalDataSource.getInstance()));
        deleteStudentUseCase.execute(id);
    }

}