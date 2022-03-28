import java.util.Scanner;


class No2 {
    public static void main(String[] args) {
        Scanner PrintArray = new Scanner(System.in);
        System.out.print("Enter the number of items: ");

        int NUM_ITEMS = PrintArray.nextInt();
        int[] items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < items.length; ++i) {
            items[i] = PrintArray.nextInt();
        }

        for (int i = 0; i < items.length; ++i) {
            System.out.print(i + ": ");

            for (int starNo = 1; starNo <= items[i]; ++starNo) {
                System.out.print("*");
            }
            System.out.println("("+items[i]+")");
        }
    }
}