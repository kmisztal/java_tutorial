package objects;

import java.util.ArrayList;

public class MList {
    public static void main(String[] args) {
        int [] x = {1, 2, 3, 4};
        System.out.println(x[1]);
        int [][] y = {
                {1, 2, 3},
                {2, 3, 4},
                {1, 2}
        };
        System.out.println(y[1][2]);

        int [][][] t = {
                { {0, 1}, {2, 3}},
                { {4, 5}, {6, 7}},
                { {3, 2}}
        };
        System.out.println(t[0][0][0]);


        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(2);
        System.out.println(list);

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
    }
}
