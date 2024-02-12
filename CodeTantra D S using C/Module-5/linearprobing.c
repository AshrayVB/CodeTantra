#include<stdio.h>
#include<stdlib.h>

int hash(int key,int m)
{
	return key % 7;
}
int main()
{
	int n,key,index,i,c=0;
	FILE *file=fopen("file1.txt","r");

	printf("Enter number of records: ");
	scanf("%d",&n);

	int ht[10],flag[10];
	for(i=0;i<7;i++)
		{
			ht[i]=-1;
			flag[i]=0;
		}
	for(i=0;i<n;i++)
		{
			fscanf(file,"%d",&key);
			index=hash(key,10);
			printf("store n=%d, key=%d, hk=%d\n",i,key,index);
			if(flag[index]==1)
			{
				printf("Collision\n");
			}
			if(c > 6)
			{
				printf("Overflow?\n");
				break;
			}
			while(ht[index] != -1)
				{
					index=(index+1) % 10;
				}
			ht[index]=key;
			flag[index]=1;
			c++;
		}
	fclose(file);
	printf("Hash Table:\n");
	for(i=0;i<=6;i++)
		{
			printf("%d\t%d\n",i,ht[i]);
		}
}
