// Solution Of Linear Algebra Equations using Gauss JAcobi Method anf Gauss Seidel Method
#include <stdio.h>
#include <math.h>
#define E 0.001           // Tolerance for convergence
#define f1(x1,x2,x3) (4- x2- 2*x3)/4 // Example function
#define f2(x1,x2,x3) (7- 3*x1 -x3)/5    // Example function
#define f3(x1,x2,x3) (3 -x1 -x2)/3         // Example function
int iteration; // Iteration counter
void Gauss_jacobi(float x10, float x20, float x30) {
    iteration = 0;
    float x11, x21, x31,e1, e2, e3;
    printf("Iteration\t     X1    \t     X2    \t     X3    \n");
    printf("------------------------------------------------------------\n");
   do{
    x11 = f1(x10, x20, x30);
    x21 = f2(x10, x20, x30);    
    x31 = f3(x10, x20, x30);
    e1 = fabs(x11 - x10);
    e2 = fabs(x21 - x20);
    e3 = fabs(x31 - x30);
        iteration++;
    printf("    %d      \t%.4f\t\t%.4f\t\t%.4f\n", iteration, x11, x21, x31);
    x10 = x11;   x20 = x21;   x30 = x31;
   } while (e1 > E && e2 > E && e3 > E );
}

void Gauss_seidel(float x10, float x20, float x30) {
    iteration = 0;
    float x11, x21, x31, e1, e2, e3;
    printf("Iteration\t     X1    \t     X2    \t     X3    \n");
    printf("------------------------------------------------------------\n");
   do{
    x11 = f1(x10, x20, x30);
    x21 = f2(x11, x20, x30);    
    x31 = f3(x11, x21, x30);
    e1 = fabs(x11 - x10);
    e2 = fabs(x21 - x20);
    e3 = fabs(x31 - x30);
        iteration++;
    printf("    %d      \t%.4f\t\t%.4f\t\t%.4f\n", iteration, x11, x21, x31);
    x10 = x11;   x20 = x21;   x30 = x31;
   } while (e1 > E && e2 > E && e3 > E );
}
int main (){
    float x10, x20, x30; // Initial guesses
    printf("Enter initial guesses X10, X20, X30: ");
    scanf("%f %f %f", &x10, &x20, &x30);
    printf("\nGauss Jacobi Method:\n\n");
    Gauss_jacobi(x10, x20, x30);
    printf("____________________________________________________________________________________________\n");
    printf("\nGauss Seidel Method:\n\n");
    Gauss_seidel(x10, x20, x30);
    return 0;
}