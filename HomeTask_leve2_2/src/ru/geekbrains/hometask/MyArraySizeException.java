package ru.geekbrains.hometask;

public class MyArraySizeException extends CustomException{
    public MyArraySizeException() {
        super("!!!The matrix must be of size 4x4");
    }
}
