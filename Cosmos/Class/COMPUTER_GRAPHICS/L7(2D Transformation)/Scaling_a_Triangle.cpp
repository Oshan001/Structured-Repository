#include<stdio.h>
#include<conio.h>
#include<graphics.h>

int main() {
    int gd = DETECT, gm;
    int x, y, x1, y1, x2, y2;
    int scl_fctr_x, scl_fctr_y;

    initgraph(&gd, &gm, "");
    printf("\t\t\t**********scaling**********\n");

    printf("\n\t\t\tEnter the first coordinate of the triangle: ");
    scanf("%d %d", &x, &y);

    printf("\n\t\t\tEnter the second coordinate of the triangle: ");
    scanf("%d %d", &x1, &y1);

    printf("\n\t\t\tEnter the third coordinate of the triangle: ");
    scanf("%d %d", &x2, &y2);

    line(x, y, x1, y1);
    line(x1, y1, x2, y2);
    line(x2, y2, x, y);

    printf("Enter the scaling factors: ");
    scanf("%d %d", &scl_fctr_x, &scl_fctr_y);

    // Scaling coordinates
    x *= scl_fctr_x;
    x1 *= scl_fctr_x;
    x2 *= scl_fctr_x;
    y *= scl_fctr_y;
    y1 *= scl_fctr_y;
    y2 *= scl_fctr_y;

    line(x, y, x1, y1);
    line(x1, y1, x2, y2);
    line(x2, y2, x, y);

    getch();
    closegraph();
    return 0;
}
