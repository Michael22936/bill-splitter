import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("how much is your bill??");

        Integer getAmount = input.nextInt();

        System.out.println("how many people in your party??");

        Integer totalPeople = input.nextInt();

        System.out.println("ok your total is " + getAmount / totalPeople);

    }

//        public static int totalAmount(int a, int b){
//       return a + b;
//    }
//
//        public static int split(int total, int people){
//        return total/people;
//    }

}
