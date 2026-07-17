#include <stdio.h>

int main () {
    int n = 0;

    printf("Enter the N: ");
    scanf("%d", &n);

    if(n > 0) printf("%d is Positive", n);
    else if ( n < 0) printf("%d is Negative", n);
    else printf("%d is Zero", n);
} 