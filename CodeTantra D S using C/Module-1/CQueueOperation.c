// Implement of Circular Queue using arrays

#include <stdio.h>
#include <stdlib.h>
#include "CQueueOperations.c"

int main() {
	int op, x;
	while(1) {
		printf("1.Enqueue 2.Dequeue 3.Display 4.Is empty 5.Size 6.Exit\n");
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


// write this code
#include <stdio.h>
#define MAX 5
int queue[MAX];
int front = -1, rear = -1;

void enqueue(int element) {
    if ((front == 0 && rear == MAX - 1) || (front == rear + 1)) {
        printf("Circular queue is overflow.\n");
    } else {
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % MAX;
        queue[rear] = element;
        printf("Successfully inserted.\n");
    }
}

void dequeue() {
    if (front == -1) {
        printf("Circular queue is underflow.\n");
    } else {
        printf("Deleted element = %d\n", queue[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % MAX;
        }
    }
}

void display() {
    if (front == -1) {
        printf("Circular queue is empty.\n");
    } else {
        printf("Elements in the circular queue : ");
        int i;
        for (i = front; i != rear; i = (i + 1) % MAX) {
            printf("%d ", queue[i]);
        }
        printf("%d \n", queue[rear]);
    }
}

int isEmpty() {
    if (front == -1) {
        printf("Circular queue is empty.\n");
        return 1;
    } else {
        printf("Circular queue is not empty.\n");
        return 0;
    }
}

int size() {
    if (front == -1) {
        printf("Circular queue size : 0\n");
        return 0;
    } else {
        int count = 0;
        int i;
        for (i = front; i != rear;i = ( i + 1) % MAX) {
            count++;
        }
        count++;
        printf("Circular queue size : %d\n", count);
     return count;
    }
}
