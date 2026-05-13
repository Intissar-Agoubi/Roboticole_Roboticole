package org.edu.roboticole.domain;

import java.util.ArrayList;

public interface StudentRepository {
    void saveStudent(StudentModel studentModel);
    void deleteStudent(String id);
    ArrayList<StudentModel>getAllStudents ();
    StudentModel getStudentById(String id);

}
