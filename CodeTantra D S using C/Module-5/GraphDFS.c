#include<stdio.h>
#include<stdlib.h>

#define MAX_VERTICES 100

// Structure to represent an edge in the graph
struct Edge {
int source, destination;
};

// Structure to represent a graph
struct Graph {
int vertices, edges;
struct Edge* edgeList;
};

// Function to perform DFS traversal
void DFS(struct Graph* graph, int vertex, int* visited) {
printf("%d\n", vertex);
visited[vertex] = 1;

    for (int i = 0; i < graph->edges; ++i) {
        int src = graph->edgeList[i].source;
        int dest = graph->edgeList[i].destination;

        if (src == vertex && !visited[dest]) {
            DFS(graph, dest, visited);
        }
    }
}

// Function to initialize the graph
struct Graph* createGraph(int vertices, int edges) {
    struct Graph* graph = (struct Graph*)malloc(sizeof(struct Graph));
    graph->vertices = vertices;
    graph->edges = edges;
    graph->edgeList = (struct Edge*)malloc(edges * sizeof(struct Edge));
    return graph;
}

int main() {
    int vertices, edges;

    // Input for a single test case
    printf("Enter no of vertices: ");
    scanf("%d", &vertices);
    printf("Enter no of edges: ");
    scanf("%d", &edges);

    struct Graph* graph = createGraph(vertices, edges);

    for (int i = 0; i < edges; ++i) {
        printf("Enter source: ");
        scanf("%d", &graph->edgeList[i].source);
        printf("Enter destination: ");
        scanf("%d", &graph->edgeList[i].destination);
    }

    int startVertex;
    printf("Enter Start Vertex for DFS: ");
    scanf("%d", &startVertex);

    int* visited = (int*)calloc(MAX_VERTICES, sizeof(int));
    printf("DFS of graph: \n");
    DFS(graph, startVertex, visited);

    // Free allocated memory
    free(graph->edgeList);
    free(graph);
    free(visited);

    return 0;
}
