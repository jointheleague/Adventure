package adventure;

import java.awt.Graphics;

interface Room {

    public void paint(Graphics g);

    public Room exitWest();

    public Room exitEast();
    
}
