package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {

    public DataGenerator() {}

    public static class Registration {
        private Registration() {}

        public static DataForRegistration generateByCard(String local) {
            Faker faker = new Faker(new Locale("ru"));
            return new DataForRegistration(
                    LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                    LocalDate.now().plusDays(5).format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                    faker.phoneNumber().phoneNumber()
            );
        }

        public static String generateValidCity() {
            String[] validCity = {"Москва", "Тула", "Краснодар", "Казань", "Воронеж"};
            Random random = new Random();
            int randomIndex = random.nextInt(validCity.length);
            return validCity[randomIndex];
        }

        public static String generateInvalidCity() {
            String[] invalidCity = {"Сочи", "Новороссийск", "Орел", "Павловск"};
            Random random = new Random();
            int randomIndex = random.nextInt(invalidCity.length);
            return invalidCity[randomIndex];
        }

        public static String generateValidName() {
            String[] validName = {"Воробьева Анна", "Сорокина Нина Сергеевна", "Павлов Антоо Борисович",
                    "Малиновский Никита", "Богданов Богдан"};
            Random random = new Random();
            int randomIndex = random.nextInt(validName.length);
            return validName[randomIndex];
        }

        public static String generateInvalidName() {
            String[] invalidName = {"Воробьёва Анна", "Алёна Антонова"};
            Random random = new Random();
            int randomIndex = random.nextInt(invalidName.length);
            return invalidName[randomIndex];
        }

    }

}





