import java.security.SecureRandom;

public class SecretKeyGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int SECRET_LENGTH = 64; // Length of the secret string (you can adjust this)

    public static String generateSecretString() {
        SecureRandom random = new SecureRandom();
        StringBuilder secretString = new StringBuilder(SECRET_LENGTH);

        for (int i = 0; i < SECRET_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            secretString.append(CHARACTERS.charAt(index));
        }

        return secretString.toString();
    }

    public static void main(String[] args) {
        String secretString = generateSecretString();
        System.out.println("Generated Secret String: " + secretString);
    }
}
