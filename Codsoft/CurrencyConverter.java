import java.util.Scanner;

class CurrencyConverter {
    static class Currency {
        double
                IND = 1,
                USD = 83.2992,
                EUR = 89.2592,
                JPY = 0.5478,
                GBP = 101.8165,
                AUD = 52.9866;
        String[] name = new String[]{"Indian Rupee", "United States Dollar", "Euro", "Japanese Yen", "Pound Sterling", "Australian Dollar"};
        int n = 6;
    }

    public static void main(String[] args) {
        System.out.println("CURRENCY CONVERTER");
        while (true) {
            double r = 0;
            int i = 0, j = 0;
            Currency o = new Currency();
            displayCurrencyOptions(o);
            Scanner scan = new Scanner(System.in);

            System.out.print("\nStarting currency: ");
            int x = scan.nextInt();
            System.out.print("Ending currency: ");
            int y = scan.nextInt();
            System.out.print("Enter amount: ");
            double amount = scan.nextDouble();

            if (x < 1 || x > o.n || y < 1 || y > o.n) {
                System.out.println("Invalid currency choice. Please select a valid option.");
                continue;
            }

            r = convertCurrency(amount, x, y, o);

            System.out.println("\n" + amount + " " + o.name[x - 1] + " = " + r + " " + o.name[y - 1]);
        }
    }

    private static void displayCurrencyOptions(Currency o) {
        System.out.println("\nCurrency Options:");
        for (int k = 0; k < o.n; k++) {
            System.out.println((k + 1) + ". " + o.name[k]);
        }
    }

    private static double convertCurrency(double amount, int x, int y, Currency o) {
        double r = 0;
        switch (x) {
            case 1:
                r = o.IND * amount;
                break;
            case 2:
                r = o.USD * amount;
                break;
            case 3:
                r = o.EUR * amount;
                break;
            case 4:
                r = o.JPY * amount;
                break;
            case 5:
                r = o.GBP * amount;
                break;
            case 6:
                r = o.AUD * amount;
                break;
        }

        switch (y) {
            case 1:
                r *= (1 / o.IND);
                break;
            case 2:
                r *= (1 / o.USD);
                break;
            case 3:
                r *= (1 / o.EUR);
                break;
            case 4:
                r *= (1 / o.JPY);
                break;
            case 5:
                r *= (1 / o.GBP);
                break;
            case 6:
                r *= (1 / o.AUD);
                break;
        }

        return r;
    }
}
