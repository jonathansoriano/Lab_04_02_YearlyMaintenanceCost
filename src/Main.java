public class Main {
    public static void main(String[] args)
    {
        double springCost = 300.75;
        double summerCost = 500.55;
        double fallCost = 200.25;
        double winterCost = 600.99;
        double yearlyCost = 0;

        yearlyCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("The maintenance cost of Spring is " + springCost + ". ");
        System.out.println("The maintenance cost of Summer is " + summerCost + ". ");
        System.out.println("The maintenance cost of Fall is " + fallCost + ". ");
        System.out.println("The maintenance cost of Winter is " + winterCost + ". ");
        System.out.println("The yearly maintenance cost is " + yearlyCost + ". ");

    }
}