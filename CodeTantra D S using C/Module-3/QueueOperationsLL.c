 // Don't change the code in this File: StackusingLL
 #include <stdlib.h>
 #include <stdio.h>
 #include "QueueOperationsLL.c"
 int main() {
 	int op, x;
 	while(1) {
 		printf("1.Enqueue 2.Dequeue 3.Display 4.Is Empty 5.Size 6.Exit\n");
 		printf("Option: ");
 		scanf("%d",&op);
 		switch(op) {
 			case 1:
 				printf("element: ");
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

// Write this code: Filename: QueuOpearationsLL
#include<stdio.h>
#include<stdlib.h>
struct node{
  int data;
  struct node* next;
};
struct node* front=NULL;
struct node* rear=NULL;

void enqueue(int x){
	struct node *temp;
	temp=(struct node*)malloc(sizeof(struct node));
	temp->data=x;
	temp->next=NULL;
	if(front==NULL&&rear==NULL){
		front=rear=temp;
	} else {
		rear->next=temp;
		rear=temp;
	}
	printf("Successfully inserted\n");
}

void dequeue(){
	struct node *temp=front;
	if(front==NULL){
		printf("Queue is underflow\n");
		return;
	}
	if(front == rear)	{
		front=rear=NULL;
	} else {
		front=front->next;
	}
	printf("Deleted value: %d\n",temp->data);
	free(temp);
}

void display(){
	struct node* temp=front;
	if(front==NULL){
		printf("Queue is empty\n");
		return;
	}
	printf("Elements: ");
		while(temp!=NULL){
	    printf("%d ",temp->data);
			temp=temp->next;
		}
	printf("\n");
}

void isEmpty(){
	if(front==NULL){
		printf("Queue is empty\n");
	}	else {
		printf("Queue is not empty\n");
	}
}

void size(){
	struct node *temp=front;
	int count=0;
	while(temp!=rear){
			count+=2;
			temp=temp->next;
		}
		printf("Queue size: %d\n",count);
}
