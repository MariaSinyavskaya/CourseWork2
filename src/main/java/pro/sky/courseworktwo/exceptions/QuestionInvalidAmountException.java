package pro.sky.courseworktwo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Количество вопросов слишком большое")
public class QuestionInvalidAmountException extends RuntimeException{
    public QuestionInvalidAmountException() {
    }

    public QuestionInvalidAmountException(String message) {
        super(message);
    }
}
