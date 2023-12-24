package pro.sky.courseworktwo.tests;

import org.junit.jupiter.api.Test;
import pro.sky.courseworktwo.exceptions.QuestionNotFoundException;
import pro.sky.courseworktwo.model.Question;
import pro.sky.courseworktwo.service.JavaQuestionService;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.courseworktwo.constants.TestConstants.*;

public class JavaQuestionServiceTest {
    private final JavaQuestionService out = new JavaQuestionService();

    @Test
    void shouldReturnQuestionForAddMethodWithStringParams() {
        Question result = out.add(
                QUESTION.getQuestion(),
                QUESTION.getAnswer());
        assertEquals(QUESTION, result);
    }

    @Test
    void shouldReturnQuestionForAddMethod () {
        Question result = out.add(QUESTION);
        assertEquals(QUESTION, result);
    }

    @Test
    void shouldReturnQuestionForRemoveMethod() {
        Question result = out.remove(QUESTION_2);
        assertEquals(QUESTION_2, result);
    }

    @Test
    void shouldThrowQuestionNotFoundExceptionForRemoveMethod() {
        assertThrows(QuestionNotFoundException.class,
                () -> out.remove(QUESTION));
    }

    @Test
    void shouldReturnAllQuestionsForGetAllMethod() {
        assertIterableEquals(QUESTIONS, out.getAll());
    }
}
