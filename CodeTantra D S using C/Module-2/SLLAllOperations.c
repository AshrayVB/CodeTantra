#include <stdio.h>
#include <stdlib.h>

struct node{
	int data;
	struct node *next;
} *start = NULL;
struct node *current = NULL;

void create(){
	struct node *newnode;
	newnode = (struct node *)malloc(1 * sizeof(struct node));
	printf("Element: ");
	scanf("%d", &newnode->data);
	newnode->next = NULL;
	if(start == NULL){
		start = newnode;
		current = newnode;
	} else {
		current->next = newnode;
		current = newnode;
	}
}

void deletion_pos(){
  	struct node *temp = start;
    struct node *prev = NULL;
    int count = 1;
    int pos;
  	printf("Position: ");
  	scanf("%d", &pos);
      if (start == NULL) {
          printf("List is empty\n");
          return;
      }
      if (pos == 1) {
          start = start->next;
          free(temp);
          return;
      }
      while (temp != NULL && count < pos) {
        prev = temp;
        temp = temp->next;
        count++;
      }
      if (temp == NULL) {
        printf("Invalid position\n");
        return;
      }
      prev->next = temp->next;
      free(temp);
  	  printf("Deleted successfully\n");
}

void display(){
	if(start == NULL){
		printf("The linked list is empty.\n");
		exit(0);
	}
	struct node *temp = start;
	printf("Elements of linked list: %d ", temp->data);
	while(temp ->next != NULL){
			temp = temp->next;
			printf("%d ", temp->data);
		}
	printf("\n");
}

void count(){
	struct node *temp = start;
	int count =0;
	while(temp != NULL){
			count++;
			temp = temp->next;
		}
	printf("No of elements: %d\n", count);
}

void main(){
	int choice;
	do {
		printf("1.Insert 2.Delete 3.Display 4.Count 5.Exit\n");
		printf("choice: ");
		scanf("%d", &choice);
		switch(choice) {
			case 1 : create();
					break;
			case 2 : deletion_pos();
					break;
			case 3 : display();
					break;
			case 4 : count();
					break;
			case 5 : exit(0);
					break;
			default : printf("Invalid Option.\n");
					break;
		}
	} while(choice != 5);
}
