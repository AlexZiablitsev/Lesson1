package Lesson7.Task2.AdministrativUnit;

public interface ListService <T>{

    int getLength();

    T[] addElement(T element);

    T getElement(int index);

    T[] addAllElements(T[] elements);

    T[] getAllElements();

}
