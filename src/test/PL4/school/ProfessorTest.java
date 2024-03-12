package test.PL4.school;

import PL4.school.Professor;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @org.junit.jupiter.api.Test
    void getSalary() {
        //AAA
        //Arrange
        Professor p = new Professor("Ana", 1, "Assistant");
        double expectedResult = 1500;
        //Act
        double result = p.getSalary();
        //Assert
        assertEquals(expectedResult, result);
    }
}