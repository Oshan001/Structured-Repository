#include <stdio.h>
#include <math.h>

/* Function to get critical value */
double get_critical_value(int df, double alpha)
{
    if (alpha == 0.05)
    {
        if (df == 1) return 3.841;
        if (df == 2) return 5.991;
        if (df == 3) return 7.815;
        if (df == 4) return 9.488;
        if (df == 5) return 11.070;
        if (df == 6) return 12.592;
        if (df == 7) return 14.067;
        if (df == 8) return 15.507;
        if (df == 9) return 16.919;
        if (df == 10) return 18.307;
    }

    printf("Critical value not available for this df and alpha.\n");
    return -1;
}

int main(void)
{
    int n, i, df;
    double chi_square = 0.0;
    double alpha, critical_value;

    printf("Enter number of categories: ");
    scanf("%d", &n);

    if (n < 2)
    {
        printf("Number of categories must be at least 2.\n");
        return 1;
    }

    double observed[n];
    double expected[n];

    printf("Enter observed frequencies:\n");

    for (i = 0; i < n; i++)
    {
        scanf("%lf", &observed[i]);
    }

    printf("Enter expected frequencies:\n");

    for (i = 0; i < n; i++)
    {
        scanf("%lf", &expected[i]);

        if (expected[i] <= 0)
        {
            printf("Error: Expected frequency cannot be zero or negative.\n");
            return 1;
        }
    }

    /* Calculate chi-square statistic */
    for (i = 0; i < n; i++)
    {
        chi_square +=
            pow(observed[i] - expected[i], 2) / expected[i];
    }

    /* Degrees of freedom */
    df = n - 1;

    printf("Enter significance level "
           "(e.g., 0.05 for 5%%): ");
    scanf("%lf", &alpha);

    critical_value = get_critical_value(df, alpha);

    if (critical_value == -1)
    {
        return 1;
    }

    printf("\nChi-square statistic = %.4f\n", chi_square);
    printf("Degrees of freedom (df) = %d\n", df);
    printf("Critical value (alpha = %.2f) = %.4f\n",
           alpha, critical_value);

    if (chi_square > critical_value)
    {
        printf("\nConclusion: REJECT the null hypothesis (H0).\n");
        printf("The given samples are not uniformly distributed.\n");
    }
    else
    {
        printf("\nConclusion: FAIL TO REJECT the null hypothesis (H0).\n");
        printf("The given samples are uniformly distributed.\n");
    }

    return 0;
}
