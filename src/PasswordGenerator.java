import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    private static final String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final SecureRandom secureRandom = new SecureRandom();
    public static String generatorPassword(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < length; i++) {
            int index = secureRandom.nextInt(ALPHA_NUMERIC_STRING.length());
            stringBuilder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String passwordLength = null;
        String generatePassword = null;

        while(true) {
            passwordLength = in.nextLine();
            if(passwordLength.equals("exit")) {
                break;
            } else {
                generatePassword = generatorPassword(Integer.parseInt(passwordLength));
                System.out.println("Ваш сгенерированный пароль: " + generatePassword);
            }
        }
        System.out.println("Вы выбрали этот сгенерированный пароль: " + generatePassword);
    }
}
