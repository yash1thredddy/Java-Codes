// Simple Java implementation for Kruskal's
// algorithm
import java.util.*;

class GFG
{

static int V = 5;
static int[] parent = new int[V];
static int INF = Integer.MAX_VALUE;

// Find set of vertex i
static int find(int i)
{
	while (parent[i] != i)
		i = parent[i];
	return i;
}

// Does union of i and j. It returns
// false if i and j are already in same
// set.
static void union1(int i, int j)
{
	int a = find(i);
	int b = find(j);
	parent[a] = b;
}

// Finds MST using Kruskal's algorithm
static void kruskalMST(int cost[][])
{
	int mincost = 0; // Cost of min MST.

	// Initialize sets of disjoint sets.
	for (int i = 0; i < V; i++)
		parent[i] = i;

	// Include minimum weight edges one by one
	int edge_count = 0;
	while (edge_count < V - 1)
	{
		int min = INF, a = -1, b = -1;
		for (int i = 0; i < V; i++)
		{
			for (int j = 0; j < V; j++)
			{
				if (find(i) != find(j) && cost[i][j] < min)
				{
					min = cost[i][j];
					a = i;
					b = j;
				}
			}
		}

		union1(a, b);
		System.out.printf("Edge %d:(%d, %d) cost:%d \n",
			edge_count++, a, b, min);
		mincost += min;
	}
	System.out.printf("\n Minimum cost= %d \n", mincost);
}

// Driver code
public static void main(String[] args)
{
/* Let us create the following graph
		2 3
	(0)--(1)--(2)
	| / \ |
	6| 8/ \5 |7
	| /	 \ |
	(3)-------(4)
			9		 */
	int cost[][] = {
       { 0, 8, 0, 0, 0, 10, 0, 4},        
{8, 0, 4, 0, 10, 7, 0, 9},         
{0, 4, 0, 3, 0, 3, 0, 0},         
{0, 0, 3, 0, 25, 18, 2, 0},         
{0, 10, 0, 25, 0, 2, 7, 0},        
{10, 7, 3, 18, 2, 0, 0, 0},         
{0, 0, 0, 2, 7, 0, 0, 3},         
{4, 9, 0, 0, 0, 0, 3, 0}, 
	};

	// Print the solution
	kruskalMST(cost);
	}
}

// This code contributed by Rajput-Ji
