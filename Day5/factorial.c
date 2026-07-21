#include <stdio.h>


int fact(int n){
    if(n == 0 || n == 1) return 1;
    return n * fact(n);
}
int main () {
    int n;

    printf("Enter the N : ");
    scanf("%d", &n);

    printf("%d/n", fact(n));
}