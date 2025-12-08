package Graph;

import java.util.ArrayList;
import java.util.List;

public class All_path_from_source_to_target {

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(0, graph, path, ans);
        return ans;
    }

    private static void dfs(int node, int[][] graph, List<Integer> path, List<List<Integer>> ans) {

        path.add(node);
        if (node == graph.length - 1) {
            ans.add(new ArrayList<>(path));
        }
        else {
            for (int next : graph[node]) {
                dfs(next, graph, path, ans);
            }
        }

        path.remove(path.size() - 1);
    }
    public static void main(String[] args) {
        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};
        List<List<Integer>> ans = allPathsSourceTarget(graph);
        System.out.println(ans);
    }
}
