import java.util.Arrays; 
public class SimplifiedDVR { 
static int INF = 9999; // Representing infinity 
// Distance Vector Routing Algorithm 
public static void distanceVector(int[][] graph) { 
int n = graph.length; 
int[][] dist = new int[n][n]; 
// Initialize distance vector with the graph itself 
for (int i = 0; i < n; i++) 
dist[i] = Arrays.copyOf(graph[i], n); 
// Update distance vector using neighbors 
for (int k = 0; k < n; k++) { // k is intermediate node 
for (int i = 0; i < n; i++) { 
for (int j = 0; j < n; j++) { 
if (dist[i][k] + dist[k][j] < dist[i][j]) 
dist[i][j] = dist[i][k] + dist[k][j]; 
} 
} 
} 
// Print result 
for (int i = 0; i < n; i++) 
System.out.println("Router " + i + " distance vector: " + 
Arrays.toString(dist[i])); 
} 
public static void main(String[] args) { 
int[][] graph = { 
{0, 2, INF, 1}, 
{2, 0, 3, 2}, 
{INF, 3, 0, 1}, 
{1, 2, 1, 0} 
}; 
distanceVector(graph); 
} 
} 