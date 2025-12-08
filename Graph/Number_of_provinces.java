package Graph;

public class Number_of_provinces {

    public static int findCircleNum(int[][] isConnected) {
        int m = isConnected.length;
        int count = 0;
        boolean[] vis = new boolean[m];

        for(int i=0; i<m; i++){
            if(!vis[i]){
                dfs(i,vis,isConnected);
                count++;
            }
        }
        return count;
    }

    private static void dfs(int i, boolean[] vis, int[][] isConnected) {
        int n = isConnected.length;
        vis[i] = true;

        for(int j=0; j<n; j++){
            if(isConnected[i][j] == 1 && vis[j] == false){
                dfs(j, vis, isConnected);
            }
        }
    }

    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        int ans = findCircleNum(isConnected);
        System.out.println(ans);
    }
}
