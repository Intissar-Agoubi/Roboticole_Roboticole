package org.edu.roboticole.data;

import org.edu.roboticole.domain.StudentModel;
import org.edu.roboticole.domain.StudentRepository;

import java.util.ArrayList;

public class StudentDataRepository implements StudentRepository {
    private  StudentLocalDataSource studentLocalDataSource;

    public StudentDataRepository(StudentLocalDataSource studentLocalDataSource) {
        this.studentLocalDataSource = studentLocalDataSource;
    }

    @Override
    public void saveStudent(StudentModel studentModel) {
       studentLocalDataSource.saveStudent(studentModel);
    }

    @Override
    public void deleteStudent(String id) {
        studentLocalDataSource.delete(id);
    }

    @Override
    public ArrayList<StudentModel> getAllStudents() {
        return studentLocalDataSource.getALLStudents();
    }

    @Override
    public StudentModel getStudentById(String id) {
        return studentLocalDataSource.getStudentById(id);
    }
}
