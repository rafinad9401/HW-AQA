package Lesson_4;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Размер массива не корректный!");
    }
}