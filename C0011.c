#include <string.h>
#include <stdio.h>
#include <malloc.h>
int main()
{
    char *p = (char *)malloc(100);
    strcpy(p, "nihao");
    free(p);          //free函数将p指针所指向的空间归还给系统
    if (p != NULL)         //p指针中的值并没有改变，依然指向原来的地址
        strcpy(p, "shijie");        //可以正常调用strcpy函数
    for (int i = 0; i < 6; i++)
        printf("%c", *(p + i));
    printf("\n");
    return 0;
}