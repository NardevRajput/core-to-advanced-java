import java.util.Scanner;

class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n = 0;

        int choice;
        do {
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Display Array");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int insertElement = sc.nextInt();
                    arr[n] = insertElement;
                    n++;
                    System.out.println("Element inserted.");
                    break;

                case 2:
                    System.out.print("Enter element to delete: ");
                    int deleteElement = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == deleteElement) {
                            for (int j = i; j < n - 1; j++) {
                                arr[j] = arr[j + 1];
                            }
                            n--;
                            found = true;
                            System.out.println("Element deleted.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 3:
                    System.out.println("Array Elements:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int searchElement = sc.nextInt();
                    boolean isFound = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == searchElement) {
                            System.out.println("Element found at index " + i);
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
