package ru.otus.quiz.service;

import lombok.RequiredArgsConstructor;
import ru.otus.quiz.dao.QuestionDao;
import ru.otus.quiz.dao.QuestionsGettingException;
import ru.otus.quiz.domain.Question;

import java.util.List;

@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionDao dao;

    @Override
    public List<Question> getQuestions() throws QuestionsGettingException {
        return dao.getQuestions();
    }
}
