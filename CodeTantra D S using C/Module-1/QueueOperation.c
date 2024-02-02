// Impplement different operations on Queue using Arrays

#include <conio.h>
#include <stdio.h>
#include "QueueOperations.c"
int main() {
	int op, x;
	while(1) {
		printf("1.Enqueue 2.Dequeue 3.Display 4.Is Empty 5.Size 6.Exit\n");
		printf("Enter your option : ");
		scanf("%d",&op);
		switch(op) {
			case 1:
				printf("Enter element : ");
				scanf("%d",&x);
				enqueue(x);
				break;
			case 2:
				dequeue();
				break;
			case 3:
				display();
				break;
			case 4:
				isEmpty();
				break;
			case 5:
				size();
				break;
			case 6: exit(0);
		}
	}
}

// write only this code
#include<stdio.h>
#define MAX 10
int queue_array[MAX];
int rear = -1;
int front = 0;
//define a variable MAX to 10

//declare the size of the array to be MAX

//define the front and rear to -1
void enqueue(int x){
	//write your code here to enqueue an element
	if(rear == MAX-1)
	{
		printf("Queue is overflow.\n");
	}
	else
	{
		rear++;
		queue_array[rear]=x;
		printf("Successfully inserted.\n");
	}
}

void dequeue() {
	//write your code here to dequeue an element
	int data;
	if(rear<front)
	{
		printf("Queue is underflow.\n");
	}
	else
	{
		printf("Deleted element = %d\n",queue_array[front]);
		front++;
	}
}

void display() {
	//Write your code here to display the queue
	int i;
	if(front>rear)
	{
		printf("Queue is empty.\n");
	}
	else
	{
		printf("Elements in the queue : ");
		for(i=front;i<=rear;i++)
			{
				printf("%d ",queue_array[i]);
			}
		printf("\n");
	}
}

void size() {
	// write your code here to get the size of the queue
	int size_q;
	if(rear==-1)
	{
		printf("Queue size : 0\n");
		return 0;
	}
	else{
		size_q=rear-front+1;
		printf("Queue size : %d\n",size_q);
	}

}

void isEmpty() {
	//write your code here to check whether the queue is empty not
	if(front>rear)
	{
		printf("Queue is empty.\n");
		return 1;
	}
	else
	{
		printf("Queue is not empty.\n");
		return 0;
	}
}
