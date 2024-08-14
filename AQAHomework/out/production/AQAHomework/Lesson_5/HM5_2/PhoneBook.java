package Lesson_5.HM5_2;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook{

    private Map<String, String[]> phoneNumbers;

    public PhoneBook() {
        phoneNumbers = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneNumbers.containsKey(lastName)) {
            String[] existingNumbers = phoneNumbers.get(lastName);
            String[] newNumbers = new String[existingNumbers.length + 1];
            for (int i = 0; i < existingNumbers.length; i++) {
                newNumbers[i] = existingNumbers[i];
            }
            newNumbers[existingNumbers.length] = phoneNumber;
            phoneNumbers.put(lastName, newNumbers);
        } else {
            phoneNumbers.put(lastName, new String[] {phoneNumber});
        }
    }

    public String[] get(String lastName) {
        return phoneNumbers.getOrDefault(lastName, new String[] {});
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "8(916) 456-7890");
        phoneBook.add("Иванов", "8(987) 654-3210");
        phoneBook.add("Петров", "8(903) 123-4567");
        phoneBook.add("Сидоров", "8(936) 456-1125");

        String[] ivanovNumbers = phoneBook.get("Иванов");
        System.out.println("Номера телефона для Иванов:");
        for (String number : ivanovNumbers) {
            System.out.println(number);
        }

        String[] petrovNumbers = phoneBook.get("Петров");
        System.out.println("\nНомера телефона для Петров:");
        for (String number : petrovNumbers) {
            System.out.println(number);
        }

        String[] nonExistingNumbers = phoneBook.get("Сидоров");
        System.out.println("\nНомера телефона для Сидоров:");
        for (String number : nonExistingNumbers) {
            System.out.println(number);
        }
    }
}