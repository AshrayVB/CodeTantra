#include<stdio.h>
#include<stdlib.h>
int r=-1,f=0,n,e;
int q[40];
int visited[10],i,j;
int adj[10][10];

void bfs(int v)
{
	visited[v]=1;
	q[++r]=v;

	while(f<=r)
		{
			v=q[f++];
			printf("%d\n",v);
	for(i=1;i<= n;i++)
		{
			if(adj[v][i] && !visited[i])
			{
				q[++r]=i;
				visited[i]=1;
			}
		}
		}
}

int main()
	{
		int v,s,d;
		printf("Enter no of vertices: ");
		scanf("%d",&n);
		for(i=1;i<=n;i++)
			{
				q[i]=0;
				visited[i]=0;
				for(j=1;j<=n;j++)
					{
						adj[i][j]=0;
					}
			}
		printf("Enter no of edges: ");
		scanf("%d",&e);
				for(j=1;j<=e;j++)
					{
						printf("Enter source: ");
						scanf("%d",&s);
						printf("Enter destination: ");
						scanf("%d",&d);
						adj[s][d]=1;
					}
		printf("Enter Start Vertex for BFS: ");
		scanf("%d",&v);
		printf("BFS of graph: \n");
		bfs(v);
		return 0;
	}
