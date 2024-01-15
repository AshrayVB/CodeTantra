// Write a C program to implement stack operations using arrays.

#include <stdio.h>
#define MAX_SIZE 10

int stack[MAX_SIZE];
int top = -1;

void push(int element) {
    if (top == MAX_SIZE - 1) {
        printf("Stack is overflow\n");
    } else {
        top++;
        stack[top] = element;
        printf("Successfully pushed\n");
    }
}

void pop() {
    if (top == -1) {
        printf("Stack is underflow\n");
    } else {
        printf("Popped value: %d\n", stack[top]);
        top--;
    }
}

void display() {
    if (top == -1) {
        printf("Stack is empty\n");
    } else {
        printf("Elements: ");
        for (int i = top; i >= 0; i--) {
            printf("%d ", stack[i]);
        }
        printf("\n");
    }
}

int isEmpty() {
    return top == -1 ? 1 : 0;
}

int peek() {
    if (top == -1) {
        printf("Stack is underflow\n");
        return -1; // Assuming -1 as an invalid value for the stack
    } else {
        return stack[top];
    }
}

int main() {
    int option, element;

    do {
        printf("1.Push 2.Pop 3.Display 4.Is Empty 5.Peek 6.Exit\nOption: ");
        scanf("%d", &option);

        switch (option) {
            case 1:
                printf("element: ");
                scanf("%d", &element);
                push(element);
                break;
            case 2:
                pop();
                break;
            case 3:
                display();
                break;
            case 4:
                if (isEmpty()) {
                    printf("Stack is empty\n");
                } else {
                    printf("Stack is not empty\n");
                }
                break;
            case 5:
                printf("Peek value: %d\n", peek());
                break;
            case 6:
                printf("Exiting program\n");
                break;
            default:
                printf("Invalid option\n");
        }
    } while (option != 6);

    return 0;
}
