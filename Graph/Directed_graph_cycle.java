package Graph;

import java.util.ArrayList;

public class Directed_graph_cycle {

     public static boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        for (int[] e : edges)
            adj.get(e[0]).add(e[1]);

        boolean[] vis = new boolean[V];
        boolean[] pathVis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, adj, vis, pathVis))
                    return true;
            }
        }

        return false;
    }

    private static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] pathVis) {

        vis[node] = true;
        pathVis[node] = true;

        for (int neigh : adj.get(node)) {
            if (!vis[neigh]) {
                if (dfs(neigh, adj, vis, pathVis))
                    return true;
            }
            else if (pathVis[neigh]) {
                return true;
            }
        }

        pathVis[node] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        int edges[][] = {{0, 1}, {1, 2}, {2, 0}, {2, 3}};
        boolean ans  = isCyclic(V, edges);
        System.out.println(ans);
    }
}
