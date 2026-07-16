#include <stdio.h>
int main(){
    char a;
    scanf("%c",&a);
    switch(a){
        case 'a': printf("A");
        break;
         case 'A':
            printf("You entered uppercase A\n");
            break;
        case 'b': printf("C");
        break;
        default:printf("wrong input");
    }
}