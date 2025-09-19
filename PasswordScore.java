public class PasswordScore {

    private PasswordValidator validator;

    public PasswordScore(PasswordValidator validator) {
        this.validator = validator;
    }

    public int score(String password) {
        int score = 0;
        validator.isValid(password);
        int num = validator.getNumberCount();
        int sym = validator.getSymbolCount();

        if (password.length() >= 15) score += 15;
        else if (password.length() >= 12) score += 10;
        else if (password.length() >= 8) score += 5;

        if (num >= 4) score += 15;
        else if (num >= 3) score += 10;
        else if (num >= 2) score += 5;

        if (sym >= 4) score += 12;
        else if (sym >= 3) score += 10;
        else if (sym >= 2) score += 5;

        for (int i = 0; i < password.length() - 1; i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                score++;
                if (i + 1 < password.length() && Character.isLowerCase(password.charAt(i + 1))) score++;
            }
        }
        for (int k = 0; k < password.length() - 2; k++) {
            if (password.charAt(k) == password.charAt(k + 1) && password.charAt(k) == password.charAt(k + 2)) score += 7;
        }

        if (score >= 80) System.out.println("Password Strength: Very Strong");
        else if (score >= 60) System.out.println("Password Strength: Strong");
        else if (score >= 35) System.out.println("Password Strength: Medium");
        else System.out.println("Password Strength: Weak");

        return score;
    }
}