package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_of_graph {

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];
        bfs(adj, ans, vis, 0);
        return ans;
    }

    private static void bfs(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, boolean[] vis, int src) {

        Queue<Integer> queue = new LinkedList<>();
        vis[src] = true;
        queue.add(src);

        while (!queue.isEmpty()) {
            int front = queue.poll();
            ans.add(front);

            for (int neighbor : adj.get(front)) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    queue.add(neighbor);
                }
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

        ArrayList<Integer> ans = bfs(adj);
        System.out.println(ans);
    }
}
