class Solution {
    public boolean canFinish(int n, int[][] pre) {
   
        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] p : pre) {
            graph[p[1]].add(p[0]);
        }

        boolean[] visited = new boolean[n];
        boolean[] current = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, visited, current))
                return false;
        }

        return true;
    }

    boolean dfs(int node, List<Integer>[] graph,
                boolean[] visited, boolean[] current) {

        if (current[node])
            return true;

        if (visited[node])
            return false;

        visited[node] = true;
        current[node] = true;

        for (int next : graph[node]) {
            if (dfs(next, graph, visited, current))
                return true;
        }

        current[node] = false;

        return false;
    }
}