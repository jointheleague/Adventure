package adventure;

import java.awt.Color;
import java.awt.Graphics;

class Player {

    public int x = 400;
    private int y = 300;
    private int w = 50;
    private int h = 100;
    private boolean facesLeft = true;

    void paint(Graphics g) {
        // Draw the body
        g.setColor(Color.pink);
        g.fillOval(x - w / 2, y - h, w, h);

        // Draw the eye
        g.setColor(Color.black);
        if (facesLeft) {
            g.fillOval(x - w/3, y - h + 20, 10, 10);
        } else {
            g.fillOval(x + w/3 - 10, y - h + 20, 10, 10);
        }
    }

    public void goLeft() {
        x -= 5;
        facesLeft = true;
    }
    
    public void goRight() {
        x += 5;
        facesLeft = false;
    }

    void goBack() {
        y -= 5;
        if (facesLeft) {
            x -= 1;
        } else {
            x += 1;
        }
    }

    void comeForward() {
        y += 5;
        if (facesLeft) {
            x -= 1;
        } else {
            x += 1;
        }
    }
}
