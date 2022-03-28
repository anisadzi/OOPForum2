import java.util.Scanner;


class No1 {
    public static void main(String[] args) {
        Scanner PrintArray = new Scanner(System.in);
        System.out.print("Enter the number of items: ");

        int NUM_ITEMS = PrintArray.nextInt();
        int [] items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; ++i) {
                items[i]  = PrintArray.nextInt();
        }

        System.out.print("The values are: [");

            for (int i = 0; i < items.length - 1; ++i) {
                System.out.print(items[i] + ", ");
            }

            for (int i = items.length - 1; i == NUM_ITEMS - 1; ++i) {
                System.out.print(items[i]);
            }

        System.out.print("]");
    }
}