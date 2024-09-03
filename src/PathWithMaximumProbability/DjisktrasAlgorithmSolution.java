package PathWithMaximumProbability;

import java.util.*;

public class DjisktrasAlgorithmSolution {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {

        Map<Integer, List<int[]>> graph = new HashMap<>();

        for(int u = 0; u < n; u++) graph.put(u, new ArrayList<>());

        for(int v = 0; v < edges.length; v++){

            int node1 = edges[v][0], node2 = edges[v][1];

            graph.get(node1).add(new int[]{node2, v});
            graph.get(node2).add(new int[]{node1, v});
        }

        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b) -> Double.compare(b[1], a[1]));

        pq.offer(new double[]{start_node, 1.0});

        double[] probabilities = new double[n];
        probabilities[start_node] = 1.0;

        while(!pq.isEmpty()) {

            double[] cur = pq.poll();
            int node = (int) cur[0];
            double prob = cur[1];

            if (node == end_node) return prob;

            for (int[] neighbor : graph.get(node)){

                int nextNode  = neighbor[0];
                double nextProb = prob * succProb[neighbor[1]];

                if (nextProb > probabilities[nextNode]){

                    probabilities[nextNode] = nextProb;
                    pq.offer(new double[]{nextNode, nextProb});
                }
            }
        }

        return 0.0;
    }
}
