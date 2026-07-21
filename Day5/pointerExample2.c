#include <stdio.h>

int main () {
    int x = 25;
    int *p = &x;

    *p = 100;

    printf("%d", x);

    return 0;
}