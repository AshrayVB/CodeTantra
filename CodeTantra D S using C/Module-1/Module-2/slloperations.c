#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct Student{
  int r;
  char name[50];
  struct Student *nex;
}*start=NULL;

void insertStudent(struct Student **t,int a,char n[12]){
	struct Student *s1;
	s1=(struct Student*)malloc(sizeof(struct Student));
	s1->r=a;
	strcpy(s1->name,n);
	s1->nex=NULL;
	if(*t==NULL){
		start=s1;
		*t=s1;
	} else {
		(*t)->nex=s1;
		*t=s1;
	}
}

void displayStudents(struct Student *a){
	struct Student *temp=start;
	printf("Student Information:\n");
	while(temp!=NULL){
			printf("Roll Number: %d, Name: %s\n",temp->r,temp->name);
			temp=temp->nex;
		}
}

int main() {
    struct Student* studentList = NULL;
    int n;
    printf("number of students: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        int rollNumber;
        char name[50]
        printf("Roll Number for student %d: ", i + 1);
        scanf("%d", &rollNumber);
        printf("Name for student %d: ", i + 1);
        scanf("%s", name);
        insertStudent(&studentList, rollNumber, name);
    }
    // Display the student information
    displayStudents(studentList);
    return 0;
}
