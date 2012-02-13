package adventure;

import java.awt.Color;
import java.awt.Graphics;

class Hallway implements Room {

    public Hallway() {
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.green.darker());
        g.fillRect(0, 0, 800, 600);
    }

    @Override
    public Room exitWest() {
        return null;
    }

    @Override 
    public Room exitEast() {
        return new Kitchen();
    }
    
}
