#include <stdio.h>
#include <graphics.h>
#include <math.h>

// Ensure to replace 'void main' with 'int main' to conform to standards
int main() {
    int gd = DETECT, gm;
    int x1, y1, x2, y2, tx, ty, x3, y3, x4, y4;

    // Initialize the graphics system
    initgraph(&gd, &gm, "");

    printf("Enter the starting point of the line segment: ");
    scanf("%d %d", &x1, &y1);
    printf("Enter the ending point of the line segment: ");
    scanf("%d %d", &x2, &y2);
    printf("Enter translation distances tx, ty:\n");
    scanf("%d %d", &tx, &ty);

    // Draw the original line
    setcolor(5);
    line(x1, y1, x2, y2);
    outtextxy(x2+2, y2+2, "Original line");

    // Calculate new points after translation and draw translated line
    x3 = x1 + tx;
    y3 = y1 + ty;
    x4 = x2 + tx;
    y4 = y2 + ty;
    setcolor(7);
    line(x3, y3, x4, y4);
    outtextxy(x4+2, y4+2, "Line after translation");

    // Hold the output screen until a key is pressed
    getch();

    // Close the graphics system
    closegraph();

    return 0;
}


