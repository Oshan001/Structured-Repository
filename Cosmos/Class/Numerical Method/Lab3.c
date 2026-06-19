//Lagrange Interpolation for curve fitting
#include<stdio.h>
#include<math.h>
int main(){
  float x[10], y[10], xp,yp=0.0;
    int i,j,n;
    float l[10];
    printf("Enter the number of data points: ");
     scanf("%d",&n);
     printf("Enter the value of xp ");
     scanf("%f",&xp);
     printf("Enter the data points:\n");
    for(i=0;i<n;i++)
    {
        printf("\n enter x[%d], y[%d] ",i,i);
        scanf("%f%f",&x[i],&y[i]);
    }
    for(i=0;i<n;i++)
    {
        l[i]=1.0;
        for(j=0;j<n;j++)
        {
            if(j!=i){
                l[i]=l[i] * (xp-x[j])/(x[i]-x[j]);
            }

        }
        yp+=l[i] *y[i];
    }

    for(i=0;i<n;i++){
        printf("l(%d) = %f\n",i,l[i]);
    }
printf("y[%f] = %f \n",xp,yp);
    return 0;
}
