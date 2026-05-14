package org.roboticole.mocks;

import org.edu.roboticole.domain.StudentModel;
import org.edu.roboticole.domain.StudentRepository;

import java.util.ArrayList;

public class EmptyStudentMockRepository implements StudentRepository {

    @Override
    public ArrayList<StudentModel> getAllStudents() {
        return new ArrayList<>();
    }

    @Override
    public void saveStudent(StudentModel studentModel) {

    }

    @Override
    public void deleteStudent(String id) {

    }

    @Override
    public StudentModel getStudentById(String id) {
        return null;
    }
}