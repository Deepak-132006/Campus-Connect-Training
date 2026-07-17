// Size of array is 5
// [10, 20, 30, 40, 50]
// 140, 120, 90, 50, 0

#include <stdio.h>

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    int size = sizeof(arr) / sizeof(arr[0]);

    for (int i = 0; i < size; i++)
    {
        int sum = 0;
        for (int j = i + 1; j < size; j++)
        {
            sum += arr[j];
        }
        printf("%d ", sum);
    }
    return 0;
}