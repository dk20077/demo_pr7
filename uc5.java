public class OOPSBannerUC5 {
    public static void main(String[] args) {

        // Inline array initialization with String.join()
        String[] banner = {
            String.join(" ", " ***** ", " ***** ", " ******", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "*     *"),
            String.join(" ", "*     *", "*     *", "*     *", "*      "),
            String.join(" ", "*     *", "*     *", "****** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*      ", "      *"),
            String.join(" ", "*     *", "*     *", "*      ", "*     *"),
            String.join(" ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}