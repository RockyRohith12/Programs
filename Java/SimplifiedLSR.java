import java.util.Arrays; 
public class SimplifiedLSR { 
static int INF = 9999; 
// Dijkstra's algorithm for Link State Routing 
public static void dijkstra(int[][] graph, int src) { 
int n = graph.length; 
int[] dist = new int[n]; 
boolean[] visited = new boolean[n]; 
Arrays.fill(dist, INF); 
dist[src] = 0; 
for (int i = 0; i < n - 1; i++) { 
int u = minDistance(dist, visited); 
visited[u] = true; 
for (int v = 0; v < n; v++) { 
if (!visited[v] && graph[u][v] != INF && dist[u] + graph[u][v] < dist[v]) { 
dist[v] = dist[u] + graph[u][v]; 
} 
} 
} 
System.out.println("Router " + src + " shortest paths: " + 
Arrays.toString(dist)); 
} 
public static int minDistance(int[] dist, boolean[] visited) { 
int min = INF, minIndex = -1; 
for (int i = 0; i < dist.length; i++) 
if (!visited[i] && dist[i] <= min) { 
min = dist[i]; 
minIndex = i; 
} 
return minIndex; 
} 
public static void main(String[] args) { 
int[][] graph = { 
{0, 2, INF, 1}, 
{2, 0, 3, 2}, 
{INF, 3, 0, 1}, 
{1, 2, 1, 0} 
}; 
for (int i = 0; i < graph.length; i++) 
dijkstra(graph, i); 
} 
}