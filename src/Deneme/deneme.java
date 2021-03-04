package Deneme;

import java.util.Random;

public interface deneme {
     default void methodA() {

        for (int i = 0; 1 > i; i++) {
            Random rnd = new Random();
            int number = rnd.nextInt(999999);
            System.out.println(String.format("%06d", number));

        }
        ;
        String a = "https://dev.onee.com/detail/10447";
        String[] b = a.split("/");
        System.out.println(b[4]);
        for (String c : b) {

            System.out.println(c);
        }
    }
     default void methodB() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);
    }

}
