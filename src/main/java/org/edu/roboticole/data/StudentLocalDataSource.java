package org.edu.roboticole.data;

import org.edu.roboticole.domain.StudentModel;

import java.util.ArrayList;
import java.util.Objects;

public class StudentLocalDataSource {
    private static StudentLocalDataSource instance = null;
    private ArrayList<StudentModel>storage = new ArrayList<>();

    public StudentLocalDataSource() {
    }

    public  void saveStudent(StudentModel studentModel){
        storage.add(studentModel);
    }
    public void delete(String id ){
        storage.removeIf(studentModel -> Objects.equals(studentModel.getId(),id));
    }
    public ArrayList<StudentModel>getALLStudents(){
        return storage ;
    }
    public StudentModel getStudentById(String id){
        for (StudentModel studentModel : storage){
            if (Objects.equals(studentModel.getId(),id)){
                return studentModel ;
            }
        }
        return null ;
    }
    public  static StudentLocalDataSource getInstance(){
        if (instance == null ){
            instance =new StudentLocalDataSource();
        }
        return instance ;
    }
}
