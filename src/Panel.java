import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel {
    final static int width = 768;
    final static int height = 768;

    final static int place = width/256;

    final static int size = 1;
    static int delay = 1;
    static int blue = 0;

    Dimension dim = new Dimension(width, height);
    
    Panel() {
        this.setPreferredSize(dim);
        this.setFocusable(true);
        newPanel();
    }

    private void newPanel() {
        Timer timer = new Timer(delay, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if(blue < 256) {
                    if(blue == 255) blue=0;
                    else blue++;
                }
                else blue = 0;
                repaint();
            }

        });
        timer.start();
        timer.setRepeats(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // RED
        for(int red = 0; red < 256; red++) {
            for(int green = 0; green < 256; green++) {
                g.setColor(new Color(blue,green,red));
                g.fillRect(red*size+getValue(1), green*size, size, size);
            }
        }
        for(int red = 0; red < 256; red++) {
            for(int green = 0; green < 256; green++) {
                g.setColor(new Color(blue,green,red));
                g.fillRect(red*size+getValue(2), green*size, size, size);
            }
        }
        for(int red = 0; red < 256; red++) {
            for(int green = 0; green < 256; green++) {
                g.setColor(new Color(blue,green,red));
                g.fillRect(red*size+getValue(3), green*size, size, size);
            }
        }

        // GREEN
        for(int red = 0; red < 256; red++) {
            for(int green = 0; green < 256; green++) {
                g.setColor(new Color(red,blue,green));
                g.fillRect(red*size, green*size+getValue(2), size, size);
            }
        }
        for(int red = 0; red < 256; red++) {
            for(int green = 0; green < 256; green++) {
                g.setColor(new Color(red,blue,green));
                g.fillRect(red*size+getValue(2), green*size+getValue(2), size, size);
            }
        }
        for(int red = 0; red < 256; red++) {
            for(int green = 0; green < 256; green++) {
                g.setColor(new Color(red,blue,green));
                g.fillRect(red*size+getValue(3), green*size+getValue(2), size, size);
            }
        }


        // BLUE
        for(int red = 0; red < 256; red++) {
            for(int green = 0; green < 256; green++) {
                g.setColor(new Color(red,green,blue));
                g.fillRect(red*size, green*size+getValue(3), size, size);
            }
        }
        for(int red = 0; red < 256; red++) {
            for(int green = 0; green < 256; green++) {
                g.setColor(new Color(red,green,blue));
                g.fillRect(red*size+getValue(2), green*size+getValue(3), size, size);
            }
        }
        for(int red = 0; red < 256; red++) {
            for(int green = 0; green < 256; green++) {
                g.setColor(new Color(red,green,blue));
                g.fillRect(red*size+getValue(3), green*size+getValue(3), size, size);
            }
        }
    }

    public int getValue(int time) {
        int num = 0;
        for(int i = 1; i < time; i++) {
            num += 256;
        }
        return num;
    }
}
