#include <stdio.h>
#include <math.h>

int main(void)
{
    int i;
    const int N = 10000;

    int observed[7] = {
        3450, 4510, 1150, 750, 85, 40, 15
    };

    double probabilities[7] = {
        0.3024, 0.5040, 0.1080, 0.0720,
        0.0090, 0.0045, 0.0001
    };

    const char *labels[7] = {
        "All different",
        "One Pair",
        "Two Pairs",
        "Three of a kind",
        "Full House",
        "Four of a kind",
        "Five of a kind"
    };

    double chi_square = 0.0;

    printf("Poker Test Chi-Square Goodness-of-Fit\n");
    printf("-------------------------------------\n");
    printf("%-18s %10s %12s %15s\n","Category", "Observed", "Expected", "(O-E)^2/E");

    printf("--------------------------------------------------------\n");

    for (i = 0; i < 7; i++)
    {
        double expected = probabilities[i] * N;
        double diff = observed[i] - expected;
        double term = (diff * diff) / expected;

        chi_square += term;

        printf("%-18s %10d %12.2f %15.3f\n",
               labels[i],
               observed[i],
               expected,
               term);
    }

    printf("\n");
    printf("Degrees of freedom = 6\n");
    printf("Chi-Square statistic = %.3f\n", chi_square);
    printf("Critical value at 5%% significance = 12.592\n\n");

    if (chi_square > 12.592)
    {
        printf("Result: REJECT the null hypothesis.\n");
        printf("The observed distribution significantly differs from expected.\n");
    }
    else
    {
        printf("Result: FAIL TO REJECT the null hypothesis.\n");
        printf("No significant difference found.\n");
    }

    return 0;
}

