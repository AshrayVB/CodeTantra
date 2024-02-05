// Write a C program to implement stack operations using arrays.

#include <stdio.h>
#include <stdlib.h>
#define STACK_MAX_SIZE 10
#include "StackOperations.c"

int main() {
	int op, x;
	while(1) {
		printf("1.Push 2.Pop 3.Display 4.Is Empty 5.Peek 6.Exit\n");
		printf("Option: ");
		scanf("%d", &op);
		switch(op) {
			case 1:
				printf("element: ");
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



int stack[STACK_MAX_SIZE];
void push(int element) {
	if(top==STACK_MAX_SIZE-1)
	{
		printf("Stack is overflow\n");
	}
	else
	{
	top++;
	stack[top]=element;
	printf("Successfully pushed\n");}

}

void display() {
	if(top==-1)
	{
		printf("Stack is empty\n");
	}
	else
	{printf("Elements: ");
	for(int i=top;i>=0;i--)
		{
			printf("%d ",stack[i]);
		}
		printf("\n");
	}
}

void pop() {
	if(top==-1)
	{
		printf("Stack is underflow\n");
	}
	else{
		top--;
		printf("Popped value: %d\n",stack[top+1]);

	}
}
void peek(){
	if(top==-1)
	{
		printf("Stack is underflow\n");
		return -1;
	}
	else
	{
	printf("Peek value: %d\n",stack[top]);
		return stack[top];
	}
}

void isEmpty() {
	if(top==-1)
	{
		printf("Stack is empty\n");
		return 1;
	}
	else
	{
		printf("Stack is not empty\n");
		return 0;
	}
}
