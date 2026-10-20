#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/* Compare function for qsort */
int compare(const void *a, const void *b)
{
    double diff = *(const double *)a - *(const double *)b;

    if (diff > 0)
        return 1;
    else if (diff < 0)
        return -1;
    else
        return 0;
}

/* Calculate the median */
double calculate_median(double arr[], int n)
{
    qsort(arr, n, sizeof(double), compare);

    if (n % 2 == 0)
    {
        return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
    }
    else
    {
        return arr[n / 2];
    }
}

int main(void)
{
    int n, i;
    int runs = 0;
    int n1 = 0;   /* Number of elements above median */
    int n2 = 0;   /* Number of elements below median */

    double data[100];
    double median;

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

    median = calculate_median(data, n);

    printf("\nMedian: %.4f\n", median);

    int previous = 0;

    for (i = 0; i < n; i++)
    {
        if (data[i] > median)
        {
            n1++;

            if (previous != 1)
            {
                runs++;
                previous = 1;
            }
        }
        else if (data[i] < median)
        {
            n2++;

            if (previous != -1)
            {
                runs++;
                previous = -1;
            }
        }
        /* Values equal to the median are ignored */
    }

    printf("Number of Runs: %d\n", runs);
    printf("Number of elements above median: %d\n", n1);
    printf("Number of elements below median: %d\n", n2);

    if (n1 == 0 || n2 == 0)
    {
        printf("\nRuns test cannot be performed.\n");
        printf("There must be elements both above and below the median.\n");
        return 1;
    }

    double expected_runs =
        (2.0 * n1 * n2) / (n1 + n2) + 1.0;

    double std_dev =
        sqrt(
            (2.0 * n1 * n2 *
            (2.0 * n1 * n2 - n1 - n2)) /
            ((n1 + n2) * (n1 + n2) * (n1 + n2 - 1))
        );

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

