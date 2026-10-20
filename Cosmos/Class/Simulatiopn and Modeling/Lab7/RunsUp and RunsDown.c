#include <stdio.h>
#include <math.h>

int main(void)
{
    int n, i, runs = 0;
    double data[100];

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    if (n < 2)
    {
        printf("You need at least two elements to perform the test.\n");
        return 1;
    }

    if (n > 100)
    {
        printf("Maximum number of elements is 100.\n");
        return 1;
    }

    printf("Enter %d floating-point numbers (decimals):\n", n);

    for (i = 0; i < n; i++)
    {
        scanf("%lf", &data[i]);
    }

    int previous = 0;

    for (i = 1; i < n; i++)
    {
        if (data[i] > data[i - 1])
        {
            if (previous != 1)
            {
                runs++;
                previous = 1;
            }
        }
        else if (data[i] < data[i - 1])
        {
            if (previous != -1)
            {
                runs++;
                previous = -1;
            }
        }
    }

    printf("\nNumber of Runs: %d\n", runs);

    double expected_runs = (2.0 * n - 1) / 3.0;
    double std_dev = sqrt((16.0 * n - 29) / 90.0);
    double z = (runs - expected_runs) / std_dev;

    printf("Expected Runs: %.4f\n", expected_runs);
    printf("Standard Deviation: %.4f\n", std_dev);
    printf("Z-score: %.4f\n", z);

    if (fabs(z) < 1.96)
    {
        printf("Conclusion: The sequence is RANDOM (at 95%% confidence level).\n");
    }
    else
    {
        printf("Conclusion: The sequence is NOT RANDOM (at 95%% confidence level).\n");
    }

    return 0;
}
