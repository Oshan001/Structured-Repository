// Numerical Integration using Romberg's Integration
#include <stdio.h>
#include <math.h>

#define LEVEL_EXTRAPOLATION 10  // number of levels of extrapolation
#define TOL 0.01                // tolerance level

float f(float x) {
    return 1.0 / x; // Example function: f(x) = 1/x
}

// Trapezoidal Rule
float Trapezoidal(float a, float b, int n) {
    float h = (b - a) / n;
    float I = f(a) + f(b);
    for (int i = 1; i < n; i++) {
        I += f(a + i * h);
    }
    return I * (h / 2);
}

// Richardson Extrapolation (Romberg's Method)
float Richardson_Extrapolation(float a, float b) {
    float R[LEVEL_EXTRAPOLATION][LEVEL_EXTRAPOLATION];
    int i, j;

    for (i = 0; i < LEVEL_EXTRAPOLATION; i++) {
        R[i][0] = Trapezoidal(a, b, pow(2, i));
        printf("%f", R[i][0]);

        for (j = 1; j <= i; j++) {
            R[i][j] = (pow(4, j) * R[i][j - 1] - R[i - 1][j - 1]) / (pow(4, j) - 1);
            printf("\t%f", R[i][j]);
        }
        printf("\n");

        if (i > 0 && fabs(R[i][i] - R[i - 1][i - 1]) < TOL) {
            return R[i][i];
        }
    }

    return R[LEVEL_EXTRAPOLATION - 1][LEVEL_EXTRAPOLATION - 1]; // Best approximation
}

int main() {
    float a, b, I;
    printf("Enter lower and upper limits [a b]: ");
    scanf("%f%f", &a, &b);
    I = Richardson_Extrapolation(a, b); 
    printf("\nThe value of the integral from %.2f to %.2f is: %f\n", a, b, I);
    return 0;
}