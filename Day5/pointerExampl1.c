#include <stdio.h>

int main() {
    int x = 25;
    int *p = &x;

    printf("%d\n", x);
    printf("%p\n", &x);
    printf("%p\n", p);
    printf("%d\n", *p);
    printf("%p\n", p);
}