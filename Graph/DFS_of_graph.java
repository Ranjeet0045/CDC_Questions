package Graph;

import java.util.ArrayList;
import java.util.List;

public class DFS_of_graph {

    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];
        findDfs(adj, ans, vis, 0);
        return ans;
    }

    private static void findDfs(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans,boolean[] vis,int src) {
        vis[src] = true;
        ans.add(src);

        for (int neighbour : adj.get(src)) {
            if (!vis[neighbour]) {
                findDfs(adj, ans, vis, neighbour);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(
            List.of(
                new ArrayList<>(List.of(2, 3, 1)),
                new ArrayList<>(List.of(0)),
                new ArrayList<>(List.of(0, 4)),
                new ArrayList<>(List.of(0)),
                new ArrayList<>(List.of(2))
            )
        );

        ArrayList<Integer> ans = dfs(adj);
        System.out.println(ans);
    }
}
