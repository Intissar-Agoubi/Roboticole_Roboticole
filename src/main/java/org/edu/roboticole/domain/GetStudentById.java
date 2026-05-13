package org.edu.roboticole.domain;

public class GetStudentById {
    private  StudentRepository studentRepository ;

    public GetStudentById(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public  StudentModel execute (String id ){
       return studentRepository.getStudentById(id);
    }
}
