#include<stdio.h>
#include<stdlib.h>
typedef struct
{
int size;
int *data;
}Heap;
void swap(int *a,int *b)
{
	int temp=*a;
	*a=*b;
	*b=temp;
}
void heapify(Heap* heap,int i)
{
	int smallest=i;
	int left=2*i+1;
	int right=2*i+2;
	if(left<heap->size&&heap->data[left]<heap->data[smallest])
		smallest=left;
	if(right<heap->size&&heap->data[right]<heap->data[smallest])
		smallest=right;
if(smallest!=i)
{
	swap(&heap->data[i],&heap->data[smallest]);
	heapify(heap,smallest);
}
}
void buildHeap(Heap* heap)
{
	int startIdx=(heap->size/2)-1;
	for(int i=startIdx;i>=0;i--)
		{
			heapify(heap,i);
		}
}
int extractMin(Heap* heap)
{
	if(heap->size==0)
	return -1;
	int min=heap->data[0];
	heap->data[0]=heap->data[heap->size-1];
	heap->size--
;
heapify(heap,0);
return min;
}
void printHeap(Heap* heap)
{
	for(int i=0;i<heap->size;++i)
		printf("%d ",heap->data[i]);
	printf("\n");
}
int main()
{
	Heap heap;
	printf("Enter no of elements: ");
	scanf("%d",&heap.size);
	heap.data=(int*)malloc(heap.size*sizeof(int));
	printf("Enter elements: ");
	for(int i=0;i<heap.size;i++)
		scanf("%d",&heap.data[i]);
	buildHeap(&heap);
	printf("Min Heap: ");
	printHeap(&heap);
	printf("Extracting elements from the min heap:\n");
	while(heap.size>0)
		{
			printf("Extracted: %d\n",extractMin(&heap));
		}
	free(heap.data);
	return 0;
}
