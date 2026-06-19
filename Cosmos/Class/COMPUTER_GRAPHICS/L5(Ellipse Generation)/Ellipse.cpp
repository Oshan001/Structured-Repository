#include <stdio.h>
#include <conio.h>
#include <graphics.h>
#include <math.h>

// Global Variables
int x, y, xc, yc;

// Function to display symmetric points of the ellipse
void disp();

int main() {
    int gd = DETECT, gm;
    int rx, ry;
    float p1, p2;

    // Initialize graphics mode
    initgraph(&gd, &gm, "C:\\TurboC3\\BGI");

    // Input ellipse parameters
    printf("Enter the center point of the ellipse:\n");
    printf("Xc: ");
    scanf("%d", &xc);
    printf("Yc: ");
    scanf("%d", &yc);
    printf("Enter the horizontal (Rx) and vertical (Ry) radii:\n");
    scanf("%d %d", &rx, &ry);

    // Region 1
    x = 0;
    y = ry;
    p1 = (ry * ry) - (rx * rx * ry) + (rx * rx) / 4;

    while ((2.0 * ry * ry * x) <= (2.0 * rx * rx * y)) {
        if (p1 < 0) {
            x++;
            p1 = p1 + (2.0 * ry * ry * x) + (ry * ry);
        } else {
            x++;
            y--;
            p1 = p1 + (2.0 * ry * ry * x) - (2.0 * rx * rx * y) + (ry * ry);
        }
        disp();
        x = -x;
        disp();
        x = -x;
    }

    // Region 2
    x = rx;
    y = 0;
    p2 = (rx * rx) + (2.0 * ry * ry * rx) + (ry * ry) / 4;

    while ((2.0 * ry * ry * x) > (2.0 * rx * rx * y)) {
        if (p2 > 0) {
            y++;
            p2 = p2 - (2.0 * rx * rx * y) + (rx * rx);
        } else {
            x--;
            y++;
            p2 = p2 + (2.0 * ry * ry * x) - (2.0 * rx * rx * y);
        }
        disp();
        y = -y;
        disp();
        y = -y;
    }

    // Wait for user input and close graphics
    getch();
    closegraph();
}

// Function to display symmetric points of the ellipse
void disp() {
    putpixel(xc + x, yc + y, WHITE);
    putpixel(xc - x, yc + y, WHITE);
    putpixel(xc + x, yc - y, WHITE);
    putpixel(xc - x, yc - y, WHITE);
}
