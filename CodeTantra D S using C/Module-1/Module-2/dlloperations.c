#include<stdio.h>
#include<stdlib.h>
typedef struct employee {
  int ssn;
  char name[20];
  char dept[20];
  char desig[20];
  float sal;
  long int ph;
  struct employee *llink;
  struct employee *rlink;
} NODE;
  typedef struct head {
  int count;
  NODE *llink;
  NODE *rlink;
} HEAD;
  NODE* getnode(){
	NODE *nn;
	nn=(NODE *)malloc(sizeof(NODE));
	printf("Enter Details such as SSN Name Department Designation Salary PhNo\n");
	scanf("%d %s %s %s %f %ld",&nn->ssn,nn->name,nn->dept,nn->desig,&nn->sal,&nn->ph);
	nn->llink=NULL;
	nn->rlink=NULL;
	return nn;
}

//insert in front
void insfront(HEAD *head){
	NODE *temp;
	temp=getnode();
	if(head->rlink==NULL){
		head->llink=temp;
		head->rlink=temp;
	} else {
		temp->rlink=head->rlink;
		head->rlink->llink=temp;
		head->rlink=temp;
	}
	head->count++;
}

//insert at rear
void insrear(HEAD *head){
	NODE *temp;
	temp=getnode();
	if(head->llink==NULL){
		head->llink=temp;
		head->rlink=temp;
	} else {
		temp->llink=head->llink;
		head->llink->rlink=temp;
		head->llink=temp;
	}
	head->count++;
}

//delete from front
void delfront(HEAD *head){
	NODE *temp;
	temp=head->rlink;
	if(temp->rlink!=NULL)
		temp->rlink->llink=NULL;
	else
		head->llink=NULL;
	head->rlink=temp->rlink;
	printf("Deleted Record is\n");
	printf("%d\t%s\t%s\t%s\t%f\t%ld\n",temp->ssn,temp->name,temp->dept,temp->desig,temp->sal,temp->ph);
	free(temp);
	head->count--;
}

//delete from rear
void delrear(HEAD *head){
	NODE *temp;
	temp=head->llink;
	if(temp->llink!=NULL)
		temp->llink->rlink=NULL;
	else
		head->rlink=NULL;
	head->rlink=temp->llink;
	printf("Deleted Record is\n");
	printf("%d\t%s\t%s\t%s\t%f\t%ld\n",temp->ssn,temp->name,temp->dept,temp->desig,temp->sal,temp->ph);
	free(temp);
	head->count--;
}

void display(HEAD *head){
	NODE *temp;
	if(head->rlink==NULL){
		printf("List Empty\n");
		return;
	}
  temp=head->rlink;
	printf("Total Number of records are %d\n",head->count);
	printf("SSN\tName\tDepartment\tDesignation\tSalary\t\tPhNo\n");
	while(temp!=NULL){
			printf("%d\t%s\t%s\t\t%s\t\t%f\t%ld\n",temp->ssn,temp->name,temp->dept,temp->desig,temp->sal,temp->ph);
			temp=temp->rlink;
		}
}

void main(){
	int ch;
	HEAD *head = (HEAD *) malloc(sizeof(HEAD));
	head->count = 0;
	head->llink = NULL;
	head->rlink = NULL;
	for(;;){
		printf("1. Insert Front\n2. Insert Rear\n3. Delete Front\n4. Delete Rear\n5. Display\n6. Exit\n");
		scanf("%d", &ch);
		switch(ch){
			case 1:
				insfront(head);
				break;
			case 2:
				insrear(head);
				break;
			case 3:
				if(head->rlink == NULL)
					printf("List Empty\n");
				else
					delfront(head);
				break;
			case 4:
				if(head->rlink == NULL)
					printf("List Empty\n");
				else
					delrear(head);
				break;
			case 5:
				if(head->rlink == NULL)
					printf("List Empty\n");
				else
					display(head);
				break;
			case 6:
				exit(0);
		}
	}
}
