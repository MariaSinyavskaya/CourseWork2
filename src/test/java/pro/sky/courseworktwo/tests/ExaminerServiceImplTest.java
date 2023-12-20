package pro.sky.courseworktwo.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.courseworktwo.exceptions.QuestionInvalidAmountException;
import pro.sky.courseworktwo.model.Question;
import pro.sky.courseworktwo.service.ExaminerServiceImpl;
import pro.sky.courseworktwo.service.QuestionService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static pro.sky.courseworktwo.constants.TestConstants.QUESTION_2;
import static pro.sky.courseworktwo.constants.TestConstants.QUESTION_3;


@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    private QuestionService questionService;

    private ExaminerServiceImpl out;

    @BeforeEach
    public void setUp() {
        out = new ExaminerServiceImpl(questionService);
    }

    @Test
    void shouldReturnCollectionsForGetQuestionsMethod() {
        when(questionService.getRandomQuestion())
                .thenReturn(QUESTION_2)
                .thenReturn(QUESTION_3);

        List<Question> expected = new ArrayList<>(List.of(
                QUESTION_2, QUESTION_3
        ));

        int amount = 2;
        Collection<Question> result = out.getQuestions(amount);

        assertEquals(amount, result.size());
        assertTrue(result.containsAll(expected));
        assertNotNull(result);
        verify(questionService, times(amount)).getRandomQuestion();
    }
}
