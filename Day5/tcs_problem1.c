#include <stdio.h>

int main() {
    int tw, fw, wheels, vechiles, total, totalFw;

    printf("Wheels: ");
    scanf("%d", &wheels);

    printf("Vechiles: ");
    scanf("%d", &vechiles);

    fw = (wheels - 2 * vechiles) / 2;
    tw = vechiles - fw;

    printf("Two wheelers: %d\n", tw);
    printf("Four wheelers: %d\n", fw);

    return 0;
}