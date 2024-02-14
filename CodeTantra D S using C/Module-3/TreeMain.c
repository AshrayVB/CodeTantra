#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void updateElement(char *tree, int arraySize, char s, char t) {
  for (int i = 0; i < arraySize; i++) {
    if (tree[i] == s) {
      tree[i] = t;
    }
  }
}
int setRoot(int dataKey, char *tree) {
  tree[0]=dataKey;
  	return 0;
}

int addLeft(char dataKey, int parentIndex, char *tree) {
  if(tree[parentIndex]=='\0'){
  	printf("No parent found\n");
  	return -1;
  }
  	int leftChildIndex=2*parentIndex+1;
  	tree[leftChildIndex]=dataKey;
  	return leftChildIndex;
}

int addRight(char dataKey, int parentIndex, char *tree) {
  if(tree[parentIndex]=='\0'){
  		printf("No parent found\n");
  		return -1;
  	}
  	int rightChildIndex=2*parentIndex+2;
  	tree[rightChildIndex]=dataKey;
  	return rightChildIndex;
}

int displayTree(char *tree, int arraySize) {
	for(int i=0;i<arraySize;i++)
		{
			if(tree[i]!='\0')
				printf("%c ",tree[i]);
		}
  }

int deleteNode(char *tree, char dataKey, int arraySize) {
  for(int i=0;i<arraySize;i++){
  		if(tree[i]==dataKey){
  			int rightMostIndex=arraySize-1;
  			while(tree[rightMostIndex]=='\0'){
  					rightMostIndex--;
  				}
  			tree[i]=tree[rightMostIndex];
  			tree[rightMostIndex]='\0';
  			return;
  		}
  	}
	printf("Node with data key %c not found.\n",dataKey);
}

// Driver Code
int main() {
  char *tree;
  char ch, choice, delNode;
  printf("Enter the number of nodes: ");
  int n, index;
  scanf("%d", &n);
  int height = round(log2(n) + 1);
  printf("height: %d\n", height);
  int arraySize = pow(2, height) - 1;
  tree = (char *)malloc(arraySize * sizeof(char));
  memset(tree, '\0', sizeof(char *) * arraySize);
  printf("Enter the data key in root node: ");
  scanf(" %c", &ch);
  setRoot(ch, tree);
  if (n > 1) {
    printf("Enter rest of the nodes in the binary tree: \n");
    for (int i = 1; i < n; i++) {
      printf("Enter R or r for right and L or l for left side insertion: ");
      scanf(" %c", &choice);
      if (choice == 'R' || choice == 'r') {
        printf("Enter datakey and parent index: ");
        scanf(" %c", &ch);
        scanf("%d", &index);
        addRight(ch, index, tree);
      } else {
        printf("Enter datakey and parent index: ");
        scanf(" %c", &ch);
        scanf("%d", &index);
        addLeft(ch, index, tree);
      }
    }
  }
  printf("Binary tree is:\n");
  displayTree(tree, arraySize);
  printf("\nEnter the data element you want to update: ");
  char s, t;
  scanf(" %c", &s);
  scanf(" %c", &t);
  updateElement(tree, arraySize, s, t);
  printf("Binary tree is:\n");
  displayTree(tree, arraySize);

  printf("\nEnter DeleteNode: ");
  scanf(" %c", &delNode);
  deleteNode(tree, delNode, arraySize);
  printf("Tree after deletion\n");
  displayTree(tree, arraySize);
  return 0;
}
