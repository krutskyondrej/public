#include <studio.h>

int main() {

    double num;
    printf("Enter a number: ");
    scanf("&lf", &num);

    if (num <= 0.0) {
        if (num==00) {
            printf("You entered 0.");
        else
            printf("You enterered a negative number.");
    }
    else
        printf("You entered a positive number.");
    return 0;
}
