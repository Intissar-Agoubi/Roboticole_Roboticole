package org.edu.roboticole.domain;

public class SaveStudentUseCase {
    private  StudentRepository studentRepository ;

    public SaveStudentUseCase(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
   public void  execute(StudentModel studentModel){
        studentRepository.saveStudent(studentModel);
    }
}
