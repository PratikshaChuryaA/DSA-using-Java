package DAALab;
import java.util.Scanner;
public class Pgm7
{
 public static void main(String args[]) 
	{
	int i,j,n,src;
	int c[][]=new int [10][10];
	int dist[]=new int[10];
	System.out.println("Enter the number of vertices:-");
	Scanner input =new Scanner(System.in);
	n=input.nextInt();
	System.out.println("Enter cost adjacency matrix:-");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			c[i][j]=input.nextInt();
		}
	}
	System.out.println("Enter source vertex:-");
	src = input.nextInt();
	dijkstras(n,c,src,dist);
	System.out.println("Shortest path is:-");
	for(i=1;i<=5;i++)
	{
		System.out.print(+src);
		System.out.print("----------->");
		System.out.print(+i);
		System.out.print("=");
		System.out.println(+dist[i]);
	}
}
 
public static void dijkstras(int n,int c[][],int src,int[] dist)
{
int i,j,count,min,u = 0;
int vis[]=new int[10];
for(i=1;i<=n;i++)
{
	vis[i]=0;
}

for (i=1;i<=n;i++)
{
	dist[i]=c[src][i];
}
count=0;
vis[src]=1;
dist[src]=0;
count=count+1;
while(count!=n)
{
	min=999;
	for(i=1;i<=n;i++)
	{
		if(vis[i]==0)
		{
			if(dist[i]<min)
			{
				min=dist[i];
				u=i;
			}
		}
	}
vis[u]=1;
count=count+1;
for(j=1;j<=n;j++)
{
	if(vis[j]==0)
	{
		if(min+c[u][j]<dist[j])
		{
			dist[j]=min+c[u][j];
		}
	}
}
}
}
}
