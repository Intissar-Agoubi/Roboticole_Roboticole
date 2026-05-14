package org.roboticole.domain;

import org.edu.roboticole.domain.GetAllStudentsUseCase;
import org.edu.roboticole.domain.StudentModel;
import org.roboticole.mocks.EmptyStudentMockRepository;
import org.roboticole.mocks.NullStudentMockRepository;
import org.roboticole.mocks.StudentMockRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GetAllStudentsUseCaseTest {

    @Test
    public void shouldReturnStudentListWhenExecuteUseCase() {
        StudentMockRepository mockRepository = new StudentMockRepository();
        GetAllStudentsUseCase useCase = new GetAllStudentsUseCase(mockRepository);

        ArrayList<StudentModel> students = useCase.execute();

        assertEquals(3, students.size());
        assertEquals("1", students.get(0).getId());
    }

    @Test
    public void shouldReturnEmptyStudentListWhenExecuteUseCase() {
        EmptyStudentMockRepository emptyRepository = new EmptyStudentMockRepository();
        GetAllStudentsUseCase useCase = new GetAllStudentsUseCase(emptyRepository);

        ArrayList<StudentModel> students = useCase.execute();

        assertEquals(0, students.size());
    }

    @Test
    public void shouldReturnNullStudentListWhenExecuteUseCase() {
        NullStudentMockRepository nullRepository = new NullStudentMockRepository();
        GetAllStudentsUseCase useCase = new GetAllStudentsUseCase(nullRepository);

        ArrayList<StudentModel> students = useCase.execute();

        assertNull(students);
    }
}