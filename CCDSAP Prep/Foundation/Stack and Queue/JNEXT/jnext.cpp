#include <iostream>

using namespace std;

int main()
{
    int T = 0, n, i, j;
    scanf("%d", &T);
    while (T--)
    {
        scanf("%d", &n);
        int a[n];
        bool descending_order = true;

        for (int i = 0; i < n; i++)
        {
            scanf("%d", &a[i]);
        }

        for (i = n - 1; i > 0; i--)
        {
            if (a[i] > a[i - 1])
            {
                descending_order = false;
                break;
            }
        }

        if (descending_order)
        {
            printf("-1\n");
        }
        else
        {
            for (j = 0; j < (i - 1); j++)
                printf("%d", a[j]);

            printf("%d", a[n - 1]);

            for (j = n - 2; j > i - 1; j--)
            {
                if (a[j] <= a[i - 1])
                {
                    printf("%d", a[j]);
                }
                else
                {
                    printf("%d", a[i - 1]);
                    while (j >= i)
                    {
                        printf("%d", a[j]);
                        j--;
                    }
                    break;
                }
            }

            printf("\n");
        }
    }
    return 0;
}