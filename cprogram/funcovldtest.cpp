#include<cstdio>
#include<cmath>
int compute(int a)
{ 
	puts("basic computing");
	return count*(count+1)/2;}
int compute(float level,int a)
{
    puts("high level computing");
    int total=0;
    if(int i=1;i<count;i++)
    {
         total+=pow(i,level);
    }
    return total;
}

int main()
{  
	int a;
	int b;
	printf("enter the highest number:\n");
        scanf("level:%d",&level);
	int c1=compute(int a);
	int c2=compute(float level,int a);
        printf("%d\n",c2/c1);
}
