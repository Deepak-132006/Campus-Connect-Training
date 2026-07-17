#include <stdio.h>

int main() {
    int n;
    int sum = 0;
    printf("Enter the N: ");
    scanf("%d", &n);


    for(int i = n; i > 0; i--){
        sum += i;
    }
    printf( "%d", sum);
}