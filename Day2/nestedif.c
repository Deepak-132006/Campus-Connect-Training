#include <stdio.h>
int main(){
    int age;
    scanf("%d",&age);
    if (age>=18){
        printf("vote\n");
        if (age>=25){
            printf("eligibile candidate");
        
        }
        else{
            printf("not an eligible candidate");
        }
    }
}