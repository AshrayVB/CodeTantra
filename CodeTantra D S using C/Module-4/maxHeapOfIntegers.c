#include <stdio.h>
typedef struct{
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
	int largest=i;
	int left=2*i+1;
	int right=2*i+2;
	if(left<heap->size&&heap->data[left]>heap->data[largest])
		largest=left;

	if(right<heap->size&&heap->data[right]>heap->data[largest])
		largest=right;
	if(largest!=i)
	{
		swap(&heap->data[i],&heap->data[largest]);
		heapify(heap,largest);
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
int extractMax(Heap* heap)
{
	if(heap->size==0)
		return -1;
	int max=heap->data[0];
	heap->data[0]=heap->data[heap->size-1];
	heap->size--;
	heapify(heap,0);
	return max;
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
	printf("elements: ");
	for(int i=0;i<heap.size;i++)
		scanf("%d",&heap.data[i]);
	buildHeap(&heap);
	printf("Max Heap: ");
	printHeap(&heap);
	printf("Extracting elements from max heap:\n");
	while(heap.size>0)
		{
			printf("Extracted: %d\n",extractMax(&heap));
		}
	free(heap.data);
	return 0;
}
