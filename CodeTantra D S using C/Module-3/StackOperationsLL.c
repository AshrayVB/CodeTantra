// Don't change the code in this File: StackusingLL
#include <stdio.h>
#include <stdlib.h>
#include "StackOperationsLL.c"

int main() {
	int op, x;
	while(1) {
		printf("1.Push 2.Pop 3.Display 4.Is Empty 5.Peek 6.Exit\n");
		printf("Enter your option : ");
		scanf("%d", &op);
		switch(op) {
			case 1:
				printf("Enter element : ");
				scanf("%d", &x);
				push(x);
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			case 4:
				isEmpty();
				break;
			case 5:
				peek();
				break;
			case 6:
				exit(0);
		}
	}
}

// Write this code: Filename: StackOperationsLL
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Node {
    int data;
    struct Node *next;
};

struct Node *top = NULL;

void push(int x) {
    struct Node *temp;
	temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = x;
    temp->next = top;
    top=temp;
    printf("Successfully pushed.\n");
}

void pop() {
	struct Node* temp;
    if (top == NULL) {
        printf("Stack is underflow.\n");
        return;
    }
	temp=top;
	top=top->next;
	printf("Popped value = %d\n",temp->data);
	free(temp);
}

void display() {
	struct Node* temp;
    if (top == NULL)
	{
		printf("Stack is empty.\n");
		return;
	 }
        printf("Elements of the stack are : ");
        temp=top;
	while(temp!=NULL)
    {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

void isEmpty() {
	if(top==NULL) {
		printf("Stack is empty.\n");
	} else {
		printf("Stack is not empty.\n");
	}
}

void peek() {
	if (top == NULL) {
		printf("Stack is underflow.\n");
	}
	else{
		printf("Peek value = %d\n",top->data);
	}
}
