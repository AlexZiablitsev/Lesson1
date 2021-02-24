package Lesson5.Task2;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
        //Номер банковского счета.
        //Создать массив объектов. Вывести:
        //a) список покупателей в алфавитном порядке;
        //b) список покупателей, у которых номер кредитной карточки находится
        //в заданном интервале.
        Customer customer1 = new Customer(
                "Strosin",
                "Porter",
                "Liam",
                "31467 Zboncak Springs Suite 594",
                5468860432136795L,
                "833198919L");
        Customer customer2 = new Customer(
                "Jaskolski",
                "Linnie",
                "Mason",
                "603 Halie Meadows Apt. 266",
                371890026100060L,
                "7712746105604S");
        Customer customer3 = new Customer(
                "Runte",
                "Dock",
                "Jacob",
                "95059 Bryon Locks Apt. 239",
                4916862562739084L,
                "57922394L");
        Customer[] customersList = new Customer[3];
        customersList[0] = customer1;
        customersList[1] = customer2;
        customersList[2] = customer3;

        Arrays.sort(customersList, Customer::compareThem);
//        for (Customer customer : customersList) {
//            customer.fullInfoCusmer();
//        }

        System.out.println("\n" + "\n");
        Customer[] findCard = CustomerService.findByCard(customersList, 300000000000000L, 400000000000000L);

        for (Customer customer : findCard) {
            customer.fullInfoCusmer();
        }
    }
}