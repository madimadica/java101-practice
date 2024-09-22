package conditionals;

public class Solution_TaxBracketCalculator {
    public static final long BRACKET_UPPER_1 = 11_600;
    public static final long BRACKET_UPPER_2 = 47_150;
    public static final long BRACKET_UPPER_3 = 100_525;
    public static final long BRACKET_UPPER_4 = 191_950;
    public static final long BRACKET_UPPER_5 = 243_725;
    public static final long BRACKET_UPPER_6 = 609_350;

    public static final double BRACKET_RATE_1 = 0.10;
    public static final double BRACKET_RATE_2 = 0.12;
    public static final double BRACKET_RATE_3 = 0.22;
    public static final double BRACKET_RATE_4 = 0.24;
    public static final double BRACKET_RATE_5 = 0.32;
    public static final double BRACKET_RATE_6 = 0.35;
    public static final double BRACKET_RATE_7 = 0.37;

    public static long calculateFederalTax(long amount) {
        double federalTax = 0;
        if (0 <= amount) {
            long limit = Math.min(amount, BRACKET_UPPER_1);
            federalTax += BRACKET_RATE_1 * limit;
        }
        if (BRACKET_UPPER_1 < amount) {
            long limit = Math.min(amount, BRACKET_UPPER_2);
            federalTax += BRACKET_RATE_2 * (limit - BRACKET_UPPER_1);
        }
        if (BRACKET_UPPER_2 < amount) {
            long limit = Math.min(amount, BRACKET_UPPER_3);
            federalTax += BRACKET_RATE_3 * (limit - BRACKET_UPPER_2);
        }
        if (BRACKET_UPPER_3 < amount) {
            long limit = Math.min(amount, BRACKET_UPPER_4);
            federalTax += BRACKET_RATE_4 * (limit - BRACKET_UPPER_3);
        }
        if (BRACKET_UPPER_4 < amount) {
            long limit = Math.min(amount, BRACKET_UPPER_5);
            federalTax += BRACKET_RATE_5 * (limit - BRACKET_UPPER_4);
        }
        if (BRACKET_UPPER_5 < amount) {
            long limit = Math.min(amount, BRACKET_UPPER_6);
            federalTax += BRACKET_RATE_6 * (limit - BRACKET_UPPER_5);
        }
        if (BRACKET_UPPER_6 < amount) {
            federalTax += BRACKET_RATE_7 * (amount - BRACKET_UPPER_6);
        }
        return Math.round(federalTax);
    }
}
