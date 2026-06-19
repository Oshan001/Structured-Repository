//solution of ordinarya differential eqn using RK1,RK2,RK4 method
#include<stdio.h>
#include<math.h>
float f(float x ,float y)
{
    return x+y;
}

void RK1(float x0,float y0,float h,float xn)
{
    float x=x0,y=y0,m;
    printf("\nsolution form Eular(RK1) method");
    while (x<xn){
   m = f(x,y);
        y+=m*h;
        x+=h;
        printf("\n%f\t%f",x,y);
    }
    printf("\n");
}



void RK2(float x0,float y0,float h,float xn){
    float x=x0,y=y0,m,m1,m2;
    printf("\nsolution form Eular(RK2) method");
    printf("\nx\ny");
    while (x<xn){
   m1 = f(x,y);
   m2=f(x+h,y+m1*h);
   m=(m1+m2)/2;
        y+=m*h;
        x+=h;
        printf("\n%f\t%f",x,y);
    }
    printf("\n");
}




void RK4(float x0,float y0,float h,float xn){
    float x=x0,y=y0,m,m1,m2,m3,m4;
    printf("\nsolution form Eular(RK4) method");
    printf("\nx\ny");
    while (x<xn){
   m1 = f(x,y);
   m2=f(x+(h/2),y+m1*(h/2));
   m3=f(x+(h/2),y+m2*(h/2));
   m4=f(x+h,y+m3*h);
   m=((m1+2*m2+2*m3+m4)/6);
        y+=m*h;
        x+=h;
        printf("\n%f\t%f",x,y);
    }
    printf("\n");
}



int main()
{
float x0 = 0,y0 =1,h =0.2,xn;
printf("\nEnter xn :-");
scanf("\n%f",&xn);
RK1(x0,y0,h,xn);
RK2(x0,y0,h,xn);
RK4(x0,y0,h,xn);
return 0;
}
