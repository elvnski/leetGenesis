package PathWithMaximumProbability;

import java.util.*;

public class BellmanFordAlgorithmSolution {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {

        double[] maxProb = new double[n];
        maxProb[start_node] = 1.0;

        for (int u = 0; u < n-1; u++){

            boolean updated = false;

            for (int v = 0; v < edges.length; v++){

                int node1 = edges[v][0], node2 = edges[v][1];
                double prob = succProb[v];

                if (maxProb[node1] * prob > maxProb[node2]){

                    maxProb[node2] = maxProb[node1] * prob;
                    updated = true;
                }

                if (maxProb[node2] * prob > maxProb[node1]){

                    maxProb[node1] = maxProb[node2] * prob;
                    updated = true;
                }
            }

            if (!updated) break;
        }

        return maxProb[end_node];
    }
}
