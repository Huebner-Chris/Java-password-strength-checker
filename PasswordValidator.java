public class PasswordValidator {

    private int number;
    private int symbol;

    public boolean isValid(String password) {
        int cap = 0, low = 0;
        number = 0;
        symbol = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) cap++;
            else if (Character.isLowerCase(ch)) low++;
            else if (Character.isDigit(ch)) number++;
            else symbol++;
        }

        if (password.length() < 8) {
            System.out.print("Password is too short ");
            return false;
        }
        if (number < 2) {
            System.out.print("Password needs at least 2 numbers ");
            return false;
        }
        if (symbol < 2) {
            System.out.print("Password needs at least 2 symbols ");
            return false;
        }
        if (cap < 1) {
            System.out.print("Password needs at least 1 capital letter ");
            return false;
        }
        if (low < 1) {
            System.out.print("Password needs at least 1 lower case letter ");
            return false;
        }
        return true;
    }

    public int getNumberCount() {
        return number;
    }

    public int getSymbolCount() {
        return symbol;
    }
}