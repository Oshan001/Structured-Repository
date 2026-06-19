//Solution of Non Linear Equation Using NR Method one Secant Method
//NR Method

float f(float x){
return x * x - x - 1 ;
}
float df(float x){
return 2 * x - 1 ;
}
#include<stdio.h>
#include<math.h>
#define tol 0.001
#define h 0.001
int main(){
    float f1,f0,x0,x1,df0,ea;
    int iteration=0;
    do{
    printf("Enter the initial guess =");
    scanf("%f",&x0);
    }while(df(x0) ==0);
    printf("\n iteration \t x0\t x1\t ea");

do{
    f0=f(x0);
    df0=df(x0);
    x1=x0-f0/df0;
    ea=fabs(x1-x0);
    printf("\n%d \t%f \t %f \t%f",iteration,x0,x1,ea);
    if(f(x1)==0)
        break;
    else
        x0=x1;
    iteration++;
}while(ea>tol);
printf("\nroot =%f",x1);
return 0;
}





//Secant Method
/*
#include <stdio.h>
#include <math.h>
#define tol 0.001
float f(float x) {
    return x * x - x - 1;
}
float df(float x) {
    return 2 * x - 1;
}
int main() {
   float x0,x1,f0,f1,x2,f2,ea;
   int iteration =0;
   while(1){
        printf("Enter x0,x1 =");
    scanf("%f%f",&x0,&x1);
    if(f(x0)!=f(x1))
     break;
    else
        printf("another guess");
    printf("\n iteration \t x0\t x1\t ea");
    }
    do{

      f0=f(x0);
      f1=f(x1);
      x2=(x0*f1-x1*f0)/(f1-f0);
      f2=f(x2);
      ea=fabs(x2-x1);
        printf("\n%d \t%f \t %f \t%f",iteration,x0,x1,ea);
    iteration++;
      x0=x1;
      x1=x2;
    }while(ea >tol);
    printf("\n root =%f ",x2);
    return 0;
}
*/
