package org.edu.roboticole.domain;

import java.util.ArrayList;

public class GetAllStudents {
    private  StudentRepository studentRepository ;

    public GetAllStudents(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public ArrayList<StudentModel>execute (){
        return studentRepository.getAllStudents();
    }
}
