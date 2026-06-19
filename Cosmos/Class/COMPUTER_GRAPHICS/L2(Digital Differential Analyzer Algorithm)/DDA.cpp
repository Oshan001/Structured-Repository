#include <graphics.h>
#include <stdio.h>

void draw_point(int x, int y) {
    putpixel(x, y, WHITE);
    char label[20];
    sprintf(label, "(%d, %d)", x, y);
    outtextxy(x + 5, y - 5, label);
}

void drawline(int x1, int y1, int x2, int y2) {
    int dx = x2 - x1;
    int dy = y2 - y1;
    int steps = abs(dx) > abs(dy) ? abs(dx) : abs(dy);
    float x_inc = dx / (float)steps;
    float y_inc = dy / (float)steps;
    float x = x1, y = y1;

    for(int i = 0; i <= steps; i++) {
        putpixel(x, y, WHITE);
        x += x_inc;
        y += y_inc;
    }
}

int main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");

    int x1, y1, x2, y2;
    printf("Enter coordinates of first point (x1 y1): ");
    scanf("%d %d", &x1, &y1);
    printf("Enter coordinates of second point (x2 y2): ");
    scanf("%d %d", &x2, &y2);

    draw_point(x1, y1);
    draw_point(x2, y2);
    setcolor(RED);
    drawline(x1, y1, x2, y2);

    getch();
    closegraph();
    return 0;
}
