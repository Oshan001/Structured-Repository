#include <stdio.h>
#include <graphics.h>

// Function prototypes
void draw_circle(int xc, int yc, int rad);
void symmetry(int x, int y, int xc, int yc);

int main() {
    int gd = DETECT, gm;
    int xc, yc, R;

    // Initialize the graphics mode
    initgraph(&gd, &gm, "C:\\TurboC3\\BGI");

    // Input circle parameters
    printf("Enter the center of the circle:\n");
    printf("Xc: ");
    scanf("%d", &xc);
    printf("Yc: ");
    scanf("%d", &yc);
    printf("Enter the radius of the circle: ");
    scanf("%d", &R);

    // Draw the circle
    draw_circle(xc, yc, R);

    // Wait for user input and close graphics
    getch();
    closegraph();
}

// Function to draw a circle using the Midpoint Circle Drawing algorithm
void draw_circle(int xc, int yc, int rad) {
    int x = 0;
    int y = rad;
    int p = 1 - rad;

    // Draw the initial symmetric points
    symmetry(x, y, xc, yc);

    // Use a for loop to calculate and draw the remaining points
    for (x = 0; x <= y; x++) {
        if (p < 0) {
            p += 2 * x + 1;
        } else {
            y--;
            p += 2 * (x - y) + 1;
        }
        symmetry(x, y, xc, yc);
        delay(50);
    }
}

// Function to draw symmetric points of the circle
void symmetry(int x, int y, int xc, int yc) {
    putpixel(xc + x, yc + y, WHITE);
    putpixel(xc - x, yc + y, WHITE);
    putpixel(xc + x, yc - y, WHITE);
    putpixel(xc - x, yc - y, WHITE);
    putpixel(xc + y, yc + x, WHITE);
    putpixel(xc - y, yc + x, WHITE);
    putpixel(xc + y, yc - x, WHITE);
    putpixel(xc - y, yc - x, WHITE);
}
