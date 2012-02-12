package adventure;

import java.awt.Color;
import java.awt.Graphics;

class Kitchen implements Room {

    public Kitchen() {
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue.brighter());
        g.fillRect(0, 0, 800, 600);
    }
    
}
