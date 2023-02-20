package exercice;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> leaders = new ArrayList<>();

        int max_so_far = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max_so_far) {
                leaders.add(arr[i]);
                max_so_far = arr[i];
            }
        }

        Collections.reverse(leaders);

        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}
