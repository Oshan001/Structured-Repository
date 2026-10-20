#include <stdio.h>
#include <math.h>

int main(void) {
    int numbers[] = {
        2, 3, 6, 5, 6, 0, 0, 1, 3, 4, 4, 5, 6, 7, 9, 4,
        9, 3, 1, 8, 3, 1, 7, 4, 8, 6, 2, 5, 1, 6, 4, 4,
        3, 3, 4, 2, 1, 5, 8, 7, 0, 8, 8, 2, 6, 7, 8, 1,
        3, 5, 3, 8, 4, 0, 0, 0, 3, 0, 9, 2, 4, 6, 9, 9,
        8, 5, 6, 0, 1, 7, 6, 7, 0, 3, 1, 0, 2, 4, 2, 0,
        1, 1, 2, 6, 7, 6, 3, 5, 7, 9, 3, 6, 6, 7, 8, 2,
        3, 5, 9, 6, 6, 4, 0, 3, 9, 3, 6, 8, 1, 5, 0, 7,
        6, 2, 6, 0, 5, 7, 8, 0
    };

    int n = sizeof(numbers) / sizeof(numbers[0]);
    int i;

    float p = 0.1f;  // Probability of each digit (1/10)

    int frequencies[10] = {34, 30, 13, 13, 9, 5, 3, 1, 1, 1};

    int bins[10][2] = {
        {0, 3},
        {4, 7},
        {8, 11},
        {12, 15},
        {16, 19},
        {20, 23},
        {24, 27},
        {28, 31},
        {32, 35},
        {36, 39}
    };

    int total_gaps = 110;

    printf("Gap Length | Frequency | N(x)/S | F(x) | |F(x)-S|\n");
    printf("------------------------------------------------------\n");

    float cumulative = 0.0f;
    float max_diff = 0.0f;

    for (i = 0; i < 10; i++) {
        float nx = (float)frequencies[i] / total_gaps;

        cumulative += nx;

        float fx = 1.0f - pow(0.9f, bins[i][1] + 1);

        float diff = fabs(fx - cumulative);

        if (diff > max_diff)
            max_diff = diff;

        printf("%2d - %2d   | %9d | %.4f | %.4f | %.4f\n",
               bins[i][0],
               bins[i][1],
               frequencies[i],
               nx,
               cumulative,
               diff);
    }

    float d_alpha = 1.36f / sqrt((float)total_gaps);

    printf("\nMaximum |F(x) - S(x)| = %.4f\n", max_diff);
    printf("Critical value D_0.05 = %.4f\n", d_alpha);

    if (max_diff > d_alpha) {
        printf("Reject null hypothesis at alpha = 0.05\n");
    } else {
        printf("Do not reject the null hypothesis of independence at alpha = 0.05\n");
    }

    return 0;
}

