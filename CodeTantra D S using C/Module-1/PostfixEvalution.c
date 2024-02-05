// Write a C program to evalute a Postfix expression

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define MAX_SIZE 10
int INT_MIN;
int stack[MAX_SIZE];
int top = -1;

// Function to check if the stack is empty
int isEmpty();

// Function to push an element onto the stack
void push(int x);

// Function to pop an element from the stack
int pop();

// Function to evaluate a postfix expression
int evaluatePostfix(char *e);

int main() {
    char postfix[MAX_SIZE];

    printf("Enter the postfix expression : ");
    gets(postfix); // Note: gets is used here for simplicity, but it's not recommended in real-world code

    int result = evaluatePostfix(postfix);

    if (result == INT_MIN) {
        printf("Invalid postfix expression.\n");
    } else {
        printf("Result : %d\n", result);
    }

    return 0;
}

int isEmpty() {
    return top == -1;
}

void push(int x) {
    if (top == MAX_SIZE - 1) {
        printf("Stack Overflow\n");
        exit(1);
    }
    stack[++top] = x;
}

int pop() {
    if (isEmpty()) {
        printf("Stack Underflow\n");
        exit(1);
    }
    return stack[top--];
}

int evaluatePostfix(char *e) {
    int i, operand, result;

    for (i = 0; e[i] != '\0'; i++) {
        if (isdigit(e[i])) {
            operand = e[i] - '0'; // Convert character to integer
            push(operand);
        } else if (e[i] == '+' || e[i] == '-' || e[i] == '*' || e[i] == '/') {
            if (isEmpty()) {
                return INT_MIN; // Invalid postfix expression (not enough operands)
            }

            int operand2 = pop();

            if (isEmpty()) {
                return INT_MIN; // Invalid postfix expression (not enough operands)
            }
            int operand1 = pop();

            switch (e[i]) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    if (operand2 == 0) {
                        printf("Error: Division by zero\n");
                        exit(1);
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    printf("Invalid operator\n");
                    exit(1);
            }

            push(result);
        } else {
            return INT_MIN; // Invalid postfix expression (unexpected character)
        }
    }

    if (isEmpty() || top > 0) {
        return INT_MIN; // Invalid postfix expression (extra operands or operators)
    }

    return pop(); // The final result is at the top of the stack
}
