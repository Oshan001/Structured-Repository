// Eigenvalue and corresponding vector using Power Method
#include <stdio.h>
#include <math.h>

#define E 0.001           
#define MAX_SIZE 10       

int iteration = 0;

void MatrixMultiply(float A[MAX_SIZE][MAX_SIZE], float X[MAX_SIZE], float Result[MAX_SIZE], int n) {
    for (int i = 0; i < n; i++) {
        Result[i] = 0;
        for (int j = 0; j < n; j++) {
            Result[i] += A[i][j] * X[j];
        }
    }
}

float Normalize(float Y[MAX_SIZE], float X[MAX_SIZE], int n) {
    float max_val = fabsf(Y[0]);
    for (int i = 1; i < n; i++) {
        if (fabsf(Y[i]) > max_val) {
            max_val = fabsf(Y[i]);
        }
    }
    for (int i = 0; i < n; i++) {
        X[i] = Y[i] / max_val;
    }
    return max_val;
}

int main() {
    float A[MAX_SIZE][MAX_SIZE], X[MAX_SIZE], Y[MAX_SIZE];
    float Lambda_New = 0.0, Lambda_Old = 0.0;
    int n;

    printf("Order of Matrix (max %d): ", MAX_SIZE);
    scanf("%d", &n);

    if (n <= 0 || n > MAX_SIZE) {
        printf("Invalid matrix order. Please enter a value between 1 and %d.\n", MAX_SIZE);
        return 1;
    }

    printf("Enter the elements of the matrix A:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("A[%d][%d]: ", i, j);
            scanf("%f", &A[i][j]);
        }
    }

    printf("\nEnter the elements of the initial eigenvector:\n");
    for (int i = 0; i < n; i++) {
        printf("X[%d]: ", i);
        scanf("%f", &X[i]);
    }

    do {
        iteration++;
        Lambda_Old = Lambda_New;
        MatrixMultiply(A, X, Y, n);
        Lambda_New = Normalize(Y, X, n);
    } while (fabsf(Lambda_New - Lambda_Old) > E);

    printf("\nConverged in %d iterations.\n", iteration);
    printf("The Largest Eigenvalue = %.4f\n", Lambda_New);
    printf("The Corresponding Eigenvector:\n");
    for (int i = 0; i < n; i++) {
        printf("X[%d] = %.4f\n", i, X[i]);
    }

    return 0;
}
