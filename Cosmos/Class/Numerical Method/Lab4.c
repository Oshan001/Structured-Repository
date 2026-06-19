//Numerical integration using General Quadrature formula (Trapezoidal rule,Simpson's rule 1/3 rule, Simpson's rule 3/8 rule)
#include<stdio.h>
#include<math.h>
float f(float x){
    return (1/(x)); // Function to be integrated
}
float Trapezoid(float a, float b, int n){
    float h, sum = 0.0, x;
    h = (b - a) / n; // Width of each segment
    sum = f(a) + f(b); // Initial sum with endpoints
    for(int i = 1; i < n; i++) {
          sum += 2 * f(a+i*h); // Add twice the function value at x
    }

    return (h / 2) * sum; // Final result
}

float Simpsons13(float a, float b, int n){
    if(n % 2 != 0) {
        n++; // Ensure n is even for Simpson's 1/3 rule
    }
    float h = (b - a) / n; // Width of each segment
    float sum = f(a) + f(b); // Initial sum with endpoints
    for(int i = 1; i < n; i++) {
        if(i % 2 == 0) {
            sum += 2 * f(a + i * h); // Even index terms
        } else {
            sum += 4 * f(a + i * h); // Odd index terms
        }
    }
    return (h / 3) * sum; // Final result
}

float Simpsons38(float a, float b, int n){
    if(n % 3 != 0) {
        n += (3 - (n % 3)); // Ensure n is a multiple of 3 for Simpson's 3/8 rule
    }
    float h = (b - a) / n; // Width of each segment
    float sum = f(a) + f(b); // Initial sum with endpoints
    for(int i = 1; i < n; i++) {
        if(i % 3 == 0) {
            sum += 2 * f(a + i * h); // Every third term
        } else {
            sum += 3 * f(a + i * h); // Other terms
        }
    }
    return (3 * h / 8) * sum; // Final result
}


int main(){
float a,b,I_trap,Is13,Is38;
int n,i;
printf("Enter the lower limit and upper limit of integration: ");
scanf("%f%f",&a,&b);
printf("Enter the number of segments: ");
scanf("%d",&n);
I_trap =Trapezoid(a, b, n);// Trapezoidal rule
Is13 = Simpsons13(a, b, n);//Simpsons13 rule
 Is38 = Simpsons38(a, b, n);//Simpsons38 rule
printf("The value of integral using \n Trapezoidal rule is: %f\nSimpson's13 :%f\nSimpson's38: %f\n", I_trap,Is13,Is38);
}
