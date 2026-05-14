package org.roboticole.domain;

import org.edu.roboticole.domain.DeleteStudentUseCase;
import org.roboticole.mocks.StudentMockRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteStudentUseCaseTest {

    @Test
    public void shouldCallDeleteMethodWhenUseCaseExecuted() {
        StudentMockRepository mockRepository = new StudentMockRepository();
        DeleteStudentUseCase useCase = new DeleteStudentUseCase(mockRepository);

        useCase.execute("1");

        assertEquals(1, mockRepository.countDeleteMethod);
    }
}