package org.edu.roboticole.domain;

public class DeleteStudentUseCase {
    private StudentRepository studentRepository ;

    public DeleteStudentUseCase(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public void  execute (String id ){
        studentRepository.deleteStudent(id);
    }
}
