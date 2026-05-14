package org.roboticole.mocks;

import org.edu.roboticole.domain.StudentModel;
import org.edu.roboticole.domain.StudentRepository;

import java.util.ArrayList;

public class StudentMockRepository implements StudentRepository {

    public Integer countSaveMethod = 0;
    public Integer countDeleteMethod = 0;

    @Override
    public ArrayList<StudentModel> getAllStudents() {
        ArrayList<StudentModel> students = new ArrayList<>();

        students.add(new StudentModel("1", "Ana", 20, "ana@iesam.es", "2DAM"));
        students.add(new StudentModel("2", "Luis", 21, "luis@iesam.es", "2DAM"));
        students.add(new StudentModel("3", "Maria", 22, "maria@iesam.es", "2DAM"));

        return students;
    }

    @Override
    public void saveStudent(StudentModel studentModel) {
        countSaveMethod++;
    }

    @Override
    public void deleteStudent(String id) {
        countDeleteMethod++;
    }

    @Override
    public StudentModel getStudentById(String id) {
        return new StudentModel("1", "Ana", 20, "ana@iesam.es", "2DAM");
    }
}