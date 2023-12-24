package pro.sky.courseworktwo.service;

import org.springframework.stereotype.Service;
import pro.sky.courseworktwo.exceptions.QuestionInvalidAmountException;
import pro.sky.courseworktwo.model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService{
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> questions = new HashSet<>();

        if ( amount > questionService.getAll().size()) {
            throw new QuestionInvalidAmountException();
        }

        while (questions.size() != amount) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }
}
