package Array_Questions;
//In this question we have to reverse the list after position k

import java.util.ArrayList;

public class Reversing_the_list {

    public static void reverseArray(ArrayList<Integer> list, int m){
       int i = m;
       int j = list.size()-1;

       while(i <= j){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
       }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = 3;
        for(int i=1; i<=5; i++){
            list.add(i);
        }
        reverseArray(list,k);
        System.out.println(list);
    }
}
