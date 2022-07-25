#include <stdio.h>
#include <string.h>
#include <stdbool.h>
int main()
{
    char str1[50];
    bool flag = true;
    printf("\nEnter a string: ");
    scanf("%[^\n]", str1);
    for(int i = 0; i < strlen(str1); i++){
        str1[i] = tolower(str1[i]);
    }

    for(int i = 0; i < strlen(str1)/2; i++){
        if(str1[i] != str1[strlen(str1)-i-1]){
            flag = false;
            break;
        }
    }
    if(flag)
        printf("Given string is palindrome");
    else
        printf("Given string is not a palindrome");
    return 0;
}
