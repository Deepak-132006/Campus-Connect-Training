#include<stdio.h>
int main()
{
    char a;
    scanf("%c",&a);
    switch(a){
        case 'A'...'Z':
          printf("Uppercase");
          break;
        case 'a'...'z':
          printf("Lowercase");
          break;
        default:
          printf("Not a character");
    }
}