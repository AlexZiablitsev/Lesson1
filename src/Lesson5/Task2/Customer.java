package Lesson5.Task2;


public class Customer {
    //Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
    //Номер банковского счета.
    //Создать массив объектов. Вывести:
    //a) список покупателей в алфавитном порядке;
    //b) список покупателей, у которых номер кредитной карточки находится
    //в заданном интервале.
    public int id;
    public static int ID = 1;
    public long creditCardNumber, bankAccountNumber;
    public String lastName, firstName, patronymicName, address;
    public int length = 0;

    public Customer(String lastName, String firstName, String patronymicName, String address, long creditNumberCard, long bankAccountNumber) {
        this.id = ID++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.address = address;
        this.creditCardNumber = creditNumberCard;
        this.bankAccountNumber = bankAccountNumber;
        length++;
    }

    public void fullInfoCusmer() {
        String fullInfo = (String.format("ID: %s \nLast Name: %s, \nFirst Name: %s, \nPatronymic Name: %s, \nAddress: %s, " +
                        "\nCredit Card Number: %s, \nBank Account Number: %s.",
                id, lastName, firstName, patronymicName, address, creditCardNumber, bankAccountNumber));
        System.out.println(fullInfo);
    }

    public static int compareThem(Customer a, Customer b) {
        return a.lastName.compareTo(b.lastName);
    }
//    public String get_credit_сard_number() {
//        return creditCardNumber;
//    }

    public void printIfcardIn(long sizeA, long sizeB) {
         String size1 = Long.toString(sizeA);
        String size2 = Long.toString(sizeB);
        String creditCart = Long.toString(creditCardNumber);
        if (creditCart.compareTo(size1) >= 0 &&
                creditCart.compareTo(size2) <= 0){
            fullInfoCusmer();}
    }
}
