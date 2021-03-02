package Lesson5.Task3;

class BookService {

    public static Book[] findAllByAuthor(Book[] list, String Author) {
        Book[] array = new Book[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i].getAuthor().compareTo(Author) == 0) {
                Book[] newArray = new Book[array.length + 1];
                if (array.length >= 0) System.arraycopy(array, 0, newArray, 0, array.length);
                newArray[array.length] = list[i];
                array = newArray;
            }
        }
        return array;
    }

    public static Book[] findAllByPublisher(Book[] list, String Publisher) {
        Book[] array = new Book[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i].getPublisher().compareTo(Publisher) == 0) {
                Book[] newArray = new Book[array.length + 1];
                if (array.length >= 0) System.arraycopy(array, 0, newArray, 0, array.length);
                newArray[array.length] = list[i];
                array = newArray;
            }
        }
        return array;

    }

    public static Book[] findAllByYear(Book[] list, int year) {
        Book[] array = new Book[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i].getYear() >= year) {
                Book[] newArray = new Book[array.length + 1];
                if (array.length >= 0) System.arraycopy(array, 0, newArray, 0, array.length);
                newArray[array.length] = list[i];
                array = newArray;
            }
        }return array;
    }
}
