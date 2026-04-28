class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
         return dfs(graph, 0);
    }

    private List<List<Integer>> dfs(int[][] graph, int node) {
        List<List<Integer>> res = new ArrayList<>();

      
        if (node == graph.length - 1) {
            List<Integer> path = new ArrayList<>();
            path.add(node);
            res.add(path);
            return res;
        }

        for (int next : graph[node]) {
            for (List<Integer> path : dfs(graph, next)) {
                path.add(0, node); 
                res.add(path);
            }
        }

        return res;
    }
}