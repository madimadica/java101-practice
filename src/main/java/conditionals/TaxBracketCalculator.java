package conditionals;

/**
 * <p>The US tax brackets for filing single in tax-year 2024 are</p>
 * <table>
 *     <thead>
 *         <tr>
 *             <th>Tax Rate</th>
 *             <th>Single</th>
 *         </tr>
 *     </thead>
 *     <tbody>
 *         <tr>
 *             <td>10%</td>
 *             <td>[0, 11_600]</td>
 *         </tr>
 *         <tr>
 *             <td>12%</td>
 *             <td>[11_601, 47_150]</td>
 *         </tr>
 *         <tr>
 *             <td>22%</td>
 *             <td>[47_151, 100_525]</td>
 *         </tr>
 *         <tr>
 *             <td>24%</td>
 *             <td>[100_526, 191_950]</td>
 *         </tr>
 *         <tr>
 *             <td>32%</td>
 *             <td>[191_951, 243_725]</td>
 *         </tr>
 *         <tr>
 *             <td>35%</td>
 *             <td>[243_726, 609_350]</td>
 *         </tr>
 *         <tr>
 *             <td>37%</td>
 *             <td>[609_351, ∞)</td>
 *         </tr>
 *     </tbody>
 * </table>
 * <p>
 *     The upper bounds have been provided as static constants to avoid the usage of magic numbers.
 * </p>
 * <p>Recall how these work. In the above table, the <em>first</em> $11,600 are taxed at <strong>10%</strong>.
 * If you made $5,000 then the tax would be $500. But, for the next bracket (12%), it applies to anything made
 * after the 10% bracket ends. So, if you made $12,600, then $11,600 would be taxed at 10% ($1,160), and then
 * the remaining $1,000 ($12,600 - $11,600) would be taxed at 12% ($120). So the total tax would be $1160 + $120 = $1280.
 * </p>
 * <p>
 *     In a larger example, if you made $150,000, the calculation would be as follows:
 * </p>
 * <table>
 *     <thead>
 *         <tr>
 *             <th>Amount Calculation</th>
 *             <th>Amount To Tax</th>
 *             <th>Percent</th>
 *             <th>Tax</th>
 *         </tr>
 *     </thead>
 *     <tbody>
 *         <tr>
 *             <td>$11,600 - $0</td>
 *             <td>$11,600</td>
 *             <td>10%</td>
 *             <td>$1,160</td>
 *         </tr>
 *         <tr>
 *             <td>$47,150 - $11,600</td>
 *             <td>$35,550</td>
 *             <td>12%</td>
 *             <td>$4,266</td>
 *         </tr>
 *         <tr>
 *             <td>$100,525 - $47,150</td>
 *             <td>$53,375</td>
 *             <td>22%</td>
 *             <td>$11,742.50</td>
 *         </tr>
 *         <tr>
 *             <td>$150,000 - $100,525</td>
 *             <td>$49,475</td>
 *             <td>24%</td>
 *             <td>$11,874</td>
 *         </tr>
 *     </tbody>
 * </table>
 * <p>And when you sum up all the partial tax amounts, you get $29,042.50</p>
 * <h2>Rounding</h2>
 * <p>
 *     Generally speaking, tax dollars are rounded to the nearest dollar, for input and output.
 *     So in our previous example, the tax would be $29,043 (rounded up).
 * </p>
 * <p>
 *     For the method you will be implementing, the input will be an `long`, so there is no decimal value
 *     or need to worry about precision errors on boundaries. The output will also be a `long`, but
 *     should <em>only</em> be rounded at the <em>end</em> of the calculations.
 * </p>
 * <p>
 *     In Java, you can round a double to the nearest long with <pre>Math.round(doubleValue)</pre>.
 * </p>
 * <h2>Manual Testing</h2>
 * <p>
 *     In addition to the automated test suite, you can run manual
 *     tests inside a main(String[] args) method in this class,
 *     add a debugger where necessary, etc. Nothing in main
 *     will be graded/tested.
 * </p>
 */
public class TaxBracketCalculator {

    public static void main(String[] args) {
        // Manual testing/debugging
        System.out.println(calculateFederalTax(5000));
    }
    
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
        // TODO implement your solution
        return 0;
    }

}
