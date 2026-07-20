#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
	int size;
    char s[100];
    scanf("%[^\n]%*c", &s);
    size = strlen(s);
  	printf("Hello, World!");
    printf("\n");
    for(int i = 0; i < size; i++){
    printf("%c", s[i]);
    }
    return 0;
}