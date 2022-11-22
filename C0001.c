#include<stdio.h>
#include<string.h>
int main()
{
    char *A = "I LOVE YOU";
    char *B = NULL;
    int length = strlen(A);
    
    B= (char*)malloc(length*sizeof(char));

    char* dest=B;


    char* src=&A[length-1];

    while(length--!=0){
        *dest=*src;
        dest++;src--;
    }
        
    printf("%s" ,B);
    return 0;
}