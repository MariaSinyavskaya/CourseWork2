package pro.sky.courseworktwo.service;

import pro.sky.courseworktwo.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
