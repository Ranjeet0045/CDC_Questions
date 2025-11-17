package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    static List<List<Integer>> result = new ArrayList<>();

    public static void find(int start,int n,int k,List<Integer> temp){
        
        if(k == 0){
            result.add(new ArrayList<>(temp));;
            return;
        }
        if(start > n){
            return;
        }
        temp.add(start);
        find(start+1,n,k-1,temp);
        temp.remove(temp.size() - 1);
        find(start+1,n,k,temp);

        return;
    }

    public static List<List<Integer>> combine(int n, int k) {

        find(1, n, k, new ArrayList<>());
        return result;

    }

    public static void main(String[] args) {
        int n = 4, k = 2;
        List<List<Integer>> ans = combine(n, k);
        System.out.println(ans);
    }
}
