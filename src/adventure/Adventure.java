package adventure;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Adventure extends JComponent implements KeyListener {
    
    Room currentRoom = new Kitchen();
    Player p = new Player();

    public static void main(String[] args) {
        JFrame window = new JFrame("Adventure");
        Adventure game = new Adventure();
        window.add(game);
        window.addKeyListener(game);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    @Override
    protected void paintComponent(Graphics g) {
        currentRoom.paint(g);
        p.paint(g);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            p.goLeft();
        } else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            p.goRight();
        } else if (ke.getKeyCode() == KeyEvent.VK_UP) {
            p.goBack();
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            p.comeForward();
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
    
    
    
}
