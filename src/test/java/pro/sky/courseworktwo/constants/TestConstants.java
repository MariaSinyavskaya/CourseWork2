package pro.sky.courseworktwo.constants;

import pro.sky.courseworktwo.model.Question;

import java.util.HashSet;
import java.util.Set;

public class TestConstants {
    public static final Set<Question> QUESTIONS = new HashSet<>(Set.of(
            new Question(
                    "Какие существуют типы данных в Java?",
                    "Примитивные: byte, short, int, long, float, " +
                            "double, char, boolean; " +
                            "Ссылочные: классы, массивы, интерфейсы"
            ),
            new Question(
                    "Какой диапазон допустимых значений у типа byte?",
                    "От -128 до 127"
            ),
            new Question(
                    "Что такое инкапсуляция?",
                    "Это процесс сокрытия внутренних деталей " +
                            "реализации объекта и предоставления внешнему " +
                            "миру только необходимых методов для " +
                            "взаимодействия с объектом."
            ),
            new Question(
                    "Как называется упорядоченная коллекция элементов, " +
                            "допускающая дублирование?",
                    "List"
            ),
            new Question(
                    "Как называется коллекция элементов, не допускающих дублирования?",
                    "Set"
            ),
            new Question(
                    "Что такое очередь?",
                    "очередь — это структура данных, которая используется" +
                            " для хранения элементов в порядке появления (First-In-First-Out, FIFO)."
            ),
            new Question(
                    "Какие модификаторы доступа существуют в Java?",
                    "public, private, protected, default"
            ),
            new Question(
                    "Что такое метод?",
                    "Это именованный блок кода, объявляемый внутри класса. " +
                            "Он содержит некоторую законченную последовательность " +
                            "действий (инструкций), направленных на решение " +
                            "отдельной задачи, который можно многократно использовать"
            ),
            new Question(
                    "Что такое геттер?",
                    "Это метод, который возвращает значение поля/свойства объекта"
            ),
            new Question(
                    "Что делает метод toUpperCase?",
                    "Переводит все символы в верхний регистр"
            )
    ));

    public static final Question QUESTION = new Question("Вопрос", "Ответ");

    public static final Question QUESTION_2 = new Question(
            "Что такое геттер?",
            "Это метод, который возвращает значение поля/свойства объекта"
    );

    public static final Question QUESTION_3 = new Question(
            "Что делает метод toUpperCase?",
            "Переводит все символы в верхний регистр"
    );

    private TestConstants() {
    }
}
