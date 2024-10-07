package AddEdgesToMakeDegreesOfAllNodesEven;

import java.util.*;

public class MySolution {

    public boolean isPossible(int n, List<List<Integer>> edges) {

        List<Set<Integer>> adjacencyMatrix = new ArrayList<>(n+1); // Adjacency matrix to track connections
        for (int u = 0; u <= n; u++) adjacencyMatrix.add(new HashSet<>());

        int[] degrees = new int[n+1]; // Degree array to track degrees of nodes

        // Populate the Adjacency Matrix and Degree Array
        for (List<Integer> edge : edges) {

            int v = edge.get(0);
            int w = edge.get(1);

            degrees[v] ++; // Incrementing the degree of edge u
            degrees[w] ++; // Incrementing the degree of edge v

            // Marking u and v as connected on the adjacency matrix
            adjacencyMatrix.get(v).add(w);
            adjacencyMatrix.get(w).add(v);
        }

        List<Integer> oddDegreeNodes = new ArrayList<>(); //For storing the odd degree nodes

        // Identify Nodes with Odd Degrees
        for (int x = 0; x <= n; x++){

            if(degrees[x] % 2 != 0) oddDegreeNodes.add(x);
        }

        // Count Odd-Degree Nodes
        int oddDegreeNodesCount = oddDegreeNodes.size();
        System.out.println("Odd Degrees Count: " + oddDegreeNodesCount);

        // CASE 1: If there are no odd-degree nodes we return true since no connections are needed
        if (oddDegreeNodesCount == 0) return true;

            // CASE 2: Exactly 2 Odd-Degree Nodes
        else if (oddDegreeNodesCount == 2) {

            int oddOne = oddDegreeNodes.get(0);
            int oddTwo = oddDegreeNodes.get(1);

            // Checking if there's no existing edge so we can connect the two odd nodes
            if(!adjacencyMatrix.get(oddOne).contains(oddTwo)) {

                System.out.println("our 2 Odd Nodes Aren't Connected. \nEnd of Algorithm");
                return true;
            }
            else System.out.println("our 2 Odd Nodes Are Connected. \nProceeding with Algorithm");

            // Attempting to connect both nodes to a common node
            for (int y = 1; y <= n; y++){


                if(y != oddOne && y != oddTwo && !adjacencyMatrix.get(oddOne).contains(y) && !adjacencyMatrix.get(oddTwo).contains(y)) {

                    System.out.println("Found a common node: " + y);
                    return true;
                }
            }
        }

        // CASE 3: Exactly 4 Odd-Degree Nodes
        else if (oddDegreeNodesCount == 4) {

            int oddA = oddDegreeNodes.get(0);
            int oddB = oddDegreeNodes.get(1);
            int oddC = oddDegreeNodes.get(2);
            int oddD = oddDegreeNodes.get(3);

            if (!adjacencyMatrix.get(oddA).contains(oddB) && !adjacencyMatrix.get(oddC).contains(oddD)) return true;

            if (!adjacencyMatrix.get(oddA).contains(oddC) && !adjacencyMatrix.get(oddB).contains(oddD)) return true;

            if (!adjacencyMatrix.get(oddA).contains(oddD) && !adjacencyMatrix.get(oddB).contains(oddC)) return true;
        }

        return false;
    }


    public static void printAdjacencyMatrix(boolean[][] matrix) {

        for (boolean[] booleans : matrix) {
            for (boolean aBoolean : booleans) {
                System.out.print((aBoolean ? 1 : 0) + " "); // Print 1 for true and 0 for false
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
