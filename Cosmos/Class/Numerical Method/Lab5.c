// //Curve Fitting Using Ragression Analysis
// #include <stdio.h>
// #include<math.h>
// int main() {
//     int n, i;
//     float x[100], y[100], a, b, sum_x = 0, sum_y = 0, sum_xy = 0, sum_x2 = 0;
//     printf("Enter the number of data points: ");
//     scanf("%d", &n);
//     printf("Enter the data points (x y):\n");
//     for (i = 0; i < n; i++) {
//         scanf("%f %f", &x[i], &y[i]);
//         sum_x += x[i];
//         sum_y += y[i];
//         sum_xy += x[i] * y[i];
//         sum_x2 += x[i] * x[i];

//     }
//     printf("\n\nS.N\t\tX\t\tY\t\tXY\t\tX^2\n");
//     printf("_______________________________________________________________________\n");

//         for (i = 0; i < n; i++) {
//         printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n",i, x[i], y[i], x[i] * y[i], x[i] * x[i]);

//     }

//     // Calculate coefficients a and b
//     b = (n * sum_xy - sum_x * sum_y) / (n * sum_x2 - sum_x * sum_x);
//     a = (sum_y - b * sum_x) / n;

//     printf("The equation of the line is: y = %.2fx + %.2f\n", b, a);

//     return 0;
// }



//fit y =ax + b^2
//log10(y) = log10(a) + b * log10(x)
#include <stdio.h>
#include<math.h>
int main() {
    int n, i;
    float x[100], y[100], a, b, A, B, sum_x = 0, sum_y = 0, sum_xy = 0, sum_x2 = 0;
    printf("Enter the number of data points: ");
    scanf("%d", &n);
    printf("Enter the data points (x y):\n");
    for (i = 0; i < n; i++) {
        scanf("%f %f", &x[i], &y[i]);
        sum_x += log(x[i]);
        sum_y += log(y[i]);
        sum_xy += log(x[i]) * log(y[i]);
        sum_x2 += log(x[i]) * log(x[i]);
    }
    printf("\n\nS.N\t\tX\t\tY\t\tXY\t\tX^2\n");
    printf("_______________________________________________________________________\n");
        for (i = 0; i < n; i++) {
       printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", i, log(x[i]), log(y[i]), log(x[i]) * log(y[i]), log(x[i]) * log(x[i]));

    }

    // Calculate coefficients a and b
b = (n * sum_xy - sum_x * sum_y) / (n * sum_x2 - sum_x * sum_x);
A = (sum_y - b * sum_x) / n;
a = exp(A);
printf("The equation of the line is: y = %.2f * x^(%.2f)\n", a, b);

    return 0;
}
