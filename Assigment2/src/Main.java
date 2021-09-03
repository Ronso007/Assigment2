import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] buildings = new int[]{101,87,122,208,74,107,152,130};
        int[] view = FindBuildingsView(buildings);
    }

    static int[] FindBuildingsView(int[] buildings) {
        int[] output = new int[buildings.length];

        LinkedList<Integer> stackList = new LinkedList<>();
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