package Lesson5.Task2;

import Lesson5.Task2.Customer;

public class CustomerService {


    public static Customer[] findByCard(Customer[] customers, long sizeA, long sizeB) {

        Customer[] newArray = new Customer[0];

        for (int j = 0; j < customers.length; j++) {
            if (customers[j].getCreditCardNumber() >= sizeA && customers[j].getCreditCardNumber() <= sizeB) {
                Customer[] array = new Customer[newArray.length + 1];
                if (newArray.length >= 0) System.arraycopy(newArray, 0, array, 0, newArray.length);
                array[newArray.length] = customers[j];
                newArray = array;
            }
        }
        return newArray;
    }
}

