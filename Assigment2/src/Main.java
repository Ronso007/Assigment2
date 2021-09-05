// ספיר מוסקוביץ - 322400227
// רון סופר - 208569061

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] buildings = getArrayFromUser();
        int[] view = FindBuildingsView(buildings);
        printArray(view);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] getArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        int[] buildings = new int[30];

        for (int i = 0; i < buildings.length; i++) {
            buildings[i] = scanner.nextInt();
        }

        return buildings;
    }

    static int[] FindBuildingsView(int[] buildings) {
        int[] output = new int[buildings.length];

        LinkedList stackList = new LinkedList();
        for (int i = 0; i < buildings.length ;i++) {
            while (!stackList.isEmpty() && buildings[stackList.peek()] <= buildings[i]) {
                stackList.pop();
            }

            if (stackList.isEmpty()) {
                output[i] = 0;
            } else {
                output[i] = stackList.peek() + 1;
            }

            stackList.push(i);
        }

        return output;
    }
}
