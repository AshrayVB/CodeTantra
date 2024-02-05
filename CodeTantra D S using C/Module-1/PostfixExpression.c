// Write a C program to convert an Infix expression into Postfix expression 


// No changing
#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <ctype.h>
#include "Infix2PostfixOperation.c"

int main() {
	char expr[20];
	char *e, x;
	printf("Enter the expression : ");
	scanf("%s",expr);
	e = expr;
	convertInfix(e);
	return 0;
}

// Writting program
#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <ctype.h>
#define STACK_MAX_SIZE 20
char stack [STACK_MAX_SIZE];

int top = -1;

//Return 1 if stack is empty else return 0.
int isEmpty() {
	return top == -1;
}

//Push the character into stack
void push(char x) {
	stack[++top] = x;
}

//pop a character from stack
char pop() {
	return stack[top--];
}

// Return 0 if char is '('
// Return 1 if char is '+' or '-'
// Return 2 if char is '*' or '/' or '%'
int stackp(char x) {
	switch (x) {
		case '(': return 0;
		case '+':
		case '-': return 2;
		case '*':
		case '/':
		case '%': return 4;
		case '#': return -1;
		default: return 8;
	}
}

int input(char x) {
	switch (x) {
		case '(': return 9;
		case ')': return 0;
		case '+':
		case '-': return 1;
		case '*':
		case '/':
		case '%': return 3;
		default: return 7;
	}
}

int valid(char sym) {
		printf("%c ", stack_[i]);
	}
	printf("\n");
}

void convertInfix(char * e) {
	int i = 0;
	int invalid = 0;
	char sym;
	while (sym = e[i++]) {
		if (!valid(sym)) {
			invalid = 1;
			break;
		}
	}
	if (invalid) {
		printf("Invalid symbols in infix expression. Only alphanumeric and { '+', '-','*', '%%', '/' } are allowed.\n");
		return;
	}
	int bracketcount = 0;
	i = 0;

	while (sym = e[i++]) {
		if (sym == '(')
			bracketcount++;
		else if (sym == ')')
			bracketcount--;
	}
	if (bracketcount) {
		printf("Invalid infix expression : unbalanced parenthesis.\n");
		return;
	}

	char s[50], p[50] = {};
	int top = 0, j = 0;
	s[top] = '#';

	for (i = 0; i < strlen(e); i++) {
		sym = e[i];

		while (stackp(s[top]) > input(sym)) {

			p[j++] = s[top--];
		}

		if (stackp(s[top]) != input(sym)) {

			s[++top] = sym;
		}
		else
			top--;
	}

	while (s[top] != '#')
		p[j++] = s[top--];

	printf("Postfix expression : %s\n", p);

}
