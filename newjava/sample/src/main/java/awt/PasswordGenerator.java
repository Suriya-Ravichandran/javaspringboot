package awt;
import java.util.Random;

public class PasswordGenerator {

    // Define the possible characters for the password
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()_+-=";

    // Create a random object
    private static final Random random = new Random();

    // Generate a random password with the given length and options
    public static String generatePassword(int length, boolean useLowercase, boolean useUppercase, boolean useNumbers, boolean useSymbols) {
       
    	// Check if the length is valid
        if (length < 1) {
            throw new IllegalArgumentException("The password length must be at least 1");
        }

        // Check if there is at least one option selected
        if (!useLowercase && !useUppercase && !useNumbers && !useSymbols) {
            throw new IllegalArgumentException("The password must contain at least one type of character");
        }

        // Create a string builder to store the password
        StringBuilder password = new StringBuilder();

        // Create a string to store the possible characters for the password
        String possibleCharacters = "";

        // Add the lower case characters if selected
        if (useLowercase) {
            possibleCharacters += LOWERCASE;
        }

        // Add the upper case characters if selected
        if (useUppercase) {
            possibleCharacters += UPPERCASE;
        }

        // Add the numbers if selected
        if (useNumbers) {
            possibleCharacters += NUMBERS;
        }

        // Add the symbols if selected
        if (useSymbols) {
            possibleCharacters += SYMBOLS;
        }

        // Loop until the password reaches the desired length
        while (password.length() < length) {
        
            // Get a random index from the possible characters string
            int index = random.nextInt(possibleCharacters.length());

            // Get the character at that index and append it to the password
            char c = possibleCharacters.charAt(index);
            password.append(c);
        }

        // Return the password as a string
        return password.toString();
    }

    // Test the password generator
    public static void main(String[] args) {
    	
        // Generate a 10-character password with all options
        String password1 = generatePassword(10, true, true, true, true);
        System.out.println("Password 1: " + password1);

        // Generate a 8-character password with only lower case and numbers
        String password2 = generatePassword(8, true, false, true, false);
        System.out.println("Password 2: " + password2);

        // Generate a 12-character password with only upper case and symbols
        String password3 = generatePassword(12, false, true, false, true);
        System.out.println("Password 3: " + password3);
    }
}


