import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("how much is your bill??");

        Double getAmount = input.nextDouble();

        System.out.println("Do you want to add a tip??? [Y/N]");

        if (input.nextLine().equalsIgnoreCase("n")){

        System.out.println("how much do you want to add???");

        Double tip = input.nextDouble();

        System.out.println("how many people in your party??");

        Integer totalPeople1 = input.nextInt();

        System.out.println("ok your total is " + (getAmount + tip) / totalPeople1);

        } else if (input.nextLine().equalsIgnoreCase("y")) {

        System.out.println("how many people in your party??");

        Integer totalPeople = input.nextInt();

        System.out.println("ok your total is " + getAmount / totalPeople);

        }

    }

}
