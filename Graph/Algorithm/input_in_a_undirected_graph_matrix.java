import java.util.*;

class input_in_a_undirected_graph_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // - Creates a Scanner object to take input from the user.

        // Prompt user for the number of edges in the graph
        System.out.println("Enter number of Edges of an Undirected Graph:");
        int m = sc.nextInt();  //

        // Prompt user for the number of nodes in the graph
        System.out.println("Enter number of Nodes of an Undirected Graph:");
        int n = sc.nextInt();  //

        // Create a 2D array to represent the adjacency matrix of the graph
        int graph[][] = new int[n + 1][n + 1];  //- Initializes a 2D array to represent the adjacency matrix of the graph.

        
        // Graph Initialization
        // Initialize the adjacency matrix with zeros
        for (int i = 0; i <= n; i++) {  // - Initializes the adjacency matrix with zeros.
            for (int j = 0; j <= n; j++) {
                graph[i][j] = 0;
            }
        }

        // Prompt user to enter the edges of the graph
        System.out.println("Enter the Nodes to be connected in the Undirected Graph:");


        // Graph Construction:
        // Populate the adjacency matrix based on user input
        for (int i = 1; i <= m; i++) {  // - Reads user input for edges and updates the adjacency matrix accordingly.
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }


        // Graph Display:
        // Display the adjacency matrix of the graph
        System.out.println("Adjacency Matrix of the Undirected Graph:");
        for (int i = 0; i <= n; i++) {
            System.out.println();
            for (int j = 0; j <= n; j++) {
                System.out.print(graph[i][j] + " ");
            }
        }

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}



// Time Complexicity :- O(m + n^2)
// Space Complexicity :- O(n^2)