#include<stdio.h>
#include<stdlib.h>

struct Node{
int coef;
int powx,powy,powz;
struct Node* link;
};
typedef struct Node* NODE;
NODE getnode(){
	NODE x;
	x=(NODE)malloc(sizeof(struct Node));
	if(x==NULL){
		printf("Out of memory\n");
		exit(0);
	}
	return x;
}

NODE insert_rear(int coef,int powx,int powy,int powz,NODE head){
	NODE temp,cur;
	temp=getnode();
	temp->coef=coef;
	temp->powx=powx;
	temp->powy=powy;
	temp->powz=powz;
	cur=head->link;
	while(cur->link!=head){
			cur=cur->link;
		}
	cur->link=temp;
	temp->link=head;
	return head;
}

NODE read_poly(NODE head){
	int i,n;
	int coef,powx,powy,powz;
	printf("Enter no of terms: ");
	scanf("%d", &n);
	for(i=1;i<=n;i++){
			printf("Enter the %d term: Coef =  ", i);
			scanf("%d", &coef);
			printf("Enter Pow(x) Pow(y) and Pow(z): ");
			scanf("%d%d%d",&powx,&powy,&powz);
			head=insert_rear(coef,powx,powy,powz,head);
		}
	return head;
}

void display(NODE head){
	NODE temp;
	if(head->link==head){
		printf("Polynomial does not exist\n");
		return;
	}
	temp=head->link;
	while(temp!=head){
			printf("%dx^%dy^%dz^%d",temp->coef,temp->powx,temp->powy,temp->powz);
			temp=temp->link;
			if(temp!=head){
				printf(" + ");
			}
		}
}

NODE poly_sum(NODE head1,NODE head2,NODE head3){
	NODE a,b;
	int coef;
	a=head1->link;
	b=head2->link;
	while(a!=head1&&b!=head2){
			if(a->powx==b->powx&&a->powy==b->powy&&a->powz==b->powz){
				coef=a->coef+b->coef;
				if(coef!=0){
					head3=insert_rear(coef,a->powx,a->powy,a->powz,head3);
				}
				a=a->link;
				b=b->link;
			}
			else if(a->powx>b->powx||(a->powx==b->powx&&a->powy>b->powy)||(a->powx==b->powx&&a->powy==b->powy&&a->powz>b->powz)){
			head3=insert_rear(a->coef,a->powx,a->powy,a->powz,head3);
			a=a->link;
			}
			else{
				head3=insert_rear(b->coef,b->powx,b->powy,b->powz,head3);
				b=b->link;
			}
		}
	while(a!=head1){
			head3=insert_rear(a->coef,a->powx,a->powy,a->powz,head3);
			a=a->link;
		}
	while(b!=head2){
      head3=insert_rear(b->coef,b->powx,b->powy,b->powz,head3);
			b=b->link;
		}
		return head3;
}

void main()
{   NODE head, head1, head2, head3;
    int res, ch;
    head = getnode();
    head1 = getnode();
    head2 = getnode();
    head3 = getnode();

    head->link=head;
    head1->link=head1;
    head2->link=head2;
    head3->link= head3;

	printf("Enter the POLY1(x,y,z)\n");
    head1 = read_poly(head1);
    printf("Polynomial 1 is: ");
    display(head1);
    printf("\nEnter the POLY2(x,y,z)\n");
    head2 = read_poly(head2);
    printf("Polynomial 2 is: ");
    display(head2);
    printf("\nPolynomial addition result: ");
    head3 = poly_sum(head1,head2,head3);
    display(head3);
    printf("\n");
}    
