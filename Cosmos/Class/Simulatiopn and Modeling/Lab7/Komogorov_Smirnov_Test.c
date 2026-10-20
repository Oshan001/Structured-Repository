#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define MAX 100

/* Comparison function for qsort */
int compare(const void *a, const void *b)
{
    float fa = *(const float *)a;
    float fb = *(const float *)b;

    if (fa > fb)
        return 1;
    else if (fa < fb)
        return -1;
    else
        return 0;
}

int main(void)
{
    int n, i;

    float data[MAX];
    float D_plus = 0.0f;
    float D_minus = 0.0f;
    float D;

    printf("Enter the number of observations (n): ");
    scanf("%d", &n);

    if (n <= 0 || n > MAX)
    {
        printf("Invalid number of observations.\n");
        return 1;
    }

    printf("Enter %d numbers (between 0 and 1):\n", n);

    for (i = 0; i < n; i++)
    {
        scanf("%f", &data[i]);

        if (data[i] < 0.0f || data[i] > 1.0f)
        {
            printf("Invalid input. All numbers must be in [0, 1].\n");
            return 1;
        }
    }

    /* Sort the data */
    qsort(data, n, sizeof(float), compare);

    /* Calculate D+ and D- */
    for (i = 0; i < n; i++)
    {
        float F_theoretical = data[i];

        float F_empirical_i =
            (float)(i + 1) / n;

        float F_empirical_i_minus =
            (float)i / n;

        float Dp =
            F_empirical_i - F_theoretical;

        float Dm =
            F_theoretical - F_empirical_i_minus;

        if (Dp > D_plus)
            D_plus = Dp;

        if (Dm > D_minus)
            D_minus = Dm;
    }

    /* Calculate K-S statistic */
    D = (D_plus > D_minus) ? D_plus : D_minus;

    printf("\nD+ = %.6f\n", D_plus);
    printf("D- = %.6f\n", D_minus);
    printf("Kolmogorov-Smirnov statistic D = %.6f\n", D);

    /* Critical value for alpha = 0.05 */
    float D_critical = 1.36f / sqrt((float)n);

    printf("Critical value at alpha = 0.05: %.6f\n",
           D_critical);

    if (D > D_critical)
    {
        printf("\nResult: Reject null hypothesis.\n");
        printf("Data is NOT uniformly distributed.\n");
    }
    else
    {
        printf("\nResult: Fail to reject null hypothesis.\n");
        printf("Data MAY be uniformly distributed.\n");
    }

    return 0;
}
