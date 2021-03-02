package Lesson5.Task2;


public class Customer implements Comparable<Customer> {
    //Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
    //Номер банковского счета.
    //Создать массив объектов. Вывести:
    //a) список покупателей в алфавитном порядке;
    //b) список покупателей, у которых номер кредитной карточки находится
    //в заданном интервале.
    private int id;
    private long creditCardNumber;
    private String bankAccountNumber;
    private String lastName;
    private String firstName;
    private String patronymicName;
    private String address;


    public Customer(String lastName, String firstName, String patronymicName, String address, long creditNumberCard, String bankAccountNumber) {
        this.id = GenerateId.newId();
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.address = address;
        this.creditCardNumber = creditNumberCard;
        this.bankAccountNumber = bankAccountNumber;

    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void fullInfoCusmer() {
        String fullInfo = (String.format("ID: %s \nLast Name: %s, \nFirst Name: %s, \nPatronymic Name: %s, \nAddress: %s, " +
                        "\nCredit Card Number: %s, \nBank Account Number: %s.",
                id, lastName, firstName, patronymicName, address, creditCardNumber, bankAccountNumber));
        System.out.println(fullInfo);
    }

    public int compareTo(Customer a) {
        return lastName.compareTo(a.lastName);
    }
}
