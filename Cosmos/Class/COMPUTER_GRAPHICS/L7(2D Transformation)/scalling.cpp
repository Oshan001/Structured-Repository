
#include <stdio.h>
#include <conio.h>
#include <graphics.h>
#include <math.h>

int main() {
    int gd = DETECT, gm;
    int x1, y1, x2, y2;
    float sx, sy;
    int x3, y3, x4, y4;
    initgraph(&gd, &gm, "C:\\TurboC3\\BGI");
    printf("Enter the starting point coordinates: ");
    scanf("%d %d", &x1, &y1);
    printf("Enter the ending point coordinates: ");
    scanf("%d %d", &x2, &y2);
    printf("Enter scaling factors sx, sy:\n");
    scanf("%f %f", &sx, &sy);
    setcolor(5);
    line(x1, y1, x2, y2);
    outtextxy(x2 + 2, y2 + 2, "Original line");
    x3 = (x1 * sx);
    y3 = (y1 * sy);
    x4 = (x2 * sx);
    y4 = (y2 * sy);
    setcolor(7);
    line(x3, y3, x4, y4);
    outtextxy(x3 + 2, y3 + 2, "Line after scaling");

    // Pause until a key is pressed
    getch();

    // Close graphics mode
    closegraph();

    return 0;
}
