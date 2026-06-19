#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<dos.h>
void flood(int x, int y, int fill_col, int old_col);
 int main() {
     printf("FLOOD_FILL 4_CONNECTED ALGORITHM:\n");
    int gd = DETECT, gm;
    detectgraph(&gd, &gm);
    initgraph(&gd, &gm, " ");
    rectangle(50, 50, 100, 100);
    flood(55, 55, 9, 0);
    getch();
    closegraph();
}
void flood(int x, int y, int fill_col, int old_col) {
    if (getpixel(x, y) == old_col) {
        delay(10);
        putpixel(x, y, fill_col);
        flood(x + 1, y, fill_col, old_col);
        flood(x - 1, y, fill_col, old_col);
        flood(x, y + 1, fill_col, old_col);
        flood(x, y - 1, fill_col, old_col);
    }
}
