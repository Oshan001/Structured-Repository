#include <stdio.h>
#include <conio.h>
#include <graphics.h>
#include <math.h>
int main()
{
    int gd = DETECT, gm;
    float x1, y1, x2, y2, x3, y3, x4, y4, a, t;
    initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");
    printf("Enter coordinates of starting point (x1 y1):\n");
    scanf("%f %f", &x1, &y1);
    printf("Enter coordinates of ending point (x2 y2):\n");
    scanf("%f %f", &x2, &y2);
    printf("Enter angle for rotation (in degrees):\n");
    scanf("%f", &a);
    setcolor(WHITE);
    line(x1, y1, x2, y2);
    outtextxy(x2 + 5, y2 + 5, "Original line");
    t = a * (M_PI / 180.0); // Convert to radians
    // Rotation transformation
    y3 = ( x1 * sin(t) ) + ( y1 * cos(t) );
    x4 = ( x2 * cos(t) ) - ( y2 * sin(t) );
    x3 = ( x1 * cos(t) ) - ( y1 * sin(t) );
    y4 = ( x2 * sin(t) ) + ( y2 * cos(t) );
    setcolor(YELLOW);
    line(x3, y3, x4, y4);
    outtextxy(x3 + 5, y3 + 5, "Line after rotation");
    getch();
    closegraph(); // Close the graph
}
