class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i < numCourses ; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] p : prerequisites){
            graph.get(p[1]).add(p[0]);
        }
        boolean[] vis = new boolean[numCourses];
        boolean[] pre = new boolean[numCourses];

        for(int i = 0 ; i < numCourses ; i++){
            if(!vis[i]){
                if(!dfs(i , graph , vis , pre)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfs(int node , List<List<Integer>> graph , boolean[] vis , boolean[] pre){
        if(pre[node]){
            return false;
        }
        if(vis[node]){
            return true;
        }
        pre[node] = true;
        vis[node] = true;
        for(int adjNode : graph.get(node)){
            if(!dfs(adjNode , graph , vis , pre)){
                return false;
            }
        }
        pre[node] = false;
        return true;
    }
}