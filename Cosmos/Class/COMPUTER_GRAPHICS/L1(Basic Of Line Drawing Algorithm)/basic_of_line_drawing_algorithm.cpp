#include <graphics.h>
int main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");
    circle(200, 200, 50); // Draw a circle
    line(100, 100, 300, 300); // Draw a line from (100,100) to (300,300)
    getch();
    closegraph();
    return 0;
}
