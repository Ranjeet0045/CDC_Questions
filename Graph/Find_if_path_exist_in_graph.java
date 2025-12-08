package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Find_if_path_exist_in_graph {

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[] vis = new boolean[n];
        vis[source] = true;
        bfs(source, vis, adj, destination);

        return vis[destination];
    }

    private static void bfs(int source, boolean[] vis, List<List<Integer>> adj, int destination) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        while(!q.isEmpty()){
            int front = q.remove();
            for(int ele : adj.get(front)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele] =  true;
                    if(ele == destination) return;
                }
            }
        } 
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0,1},{1,2},{2,0}};
        int source = 0, destination = 2;
        boolean ans = validPath(n, edges, source, destination);
        System.out.println(ans);
    }
}
