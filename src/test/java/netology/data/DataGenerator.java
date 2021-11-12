package netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {
    }

    public static class Registration {
        private Registration() {
        }

        public static RegistrationInfo generate(String locale) {
            Faker faker = new Faker(new Locale("ru"));
            return new RegistrationInfo(
                    faker.address().city(),
                    faker.name().lastName() + " " + faker.name().firstName(),
                    faker.numerify("+7##########"));
        }

        public static String generateDate(int days){
            return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        }
        public static String citiesTrue(){
            Random random = new Random();
            int rand = random.nextInt(5);
            String cities[] = {"Москва","Санкт-Петербург","Челябинск","Екатеринбург","Казань"};
            return cities[rand];
        }

    }

}
