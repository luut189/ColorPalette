import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
// import javax.swing.event.ChangeEvent;
// import javax.swing.event.ChangeListener;

public class Frame extends JFrame {//implements ChangeListener {
    Panel panel;
    //JSlider slider = new JSlider(0, 255, 0);

    Frame(String name) {
        panel = new Panel();
        // slider.addChangeListener(this);
        // slider.setMajorTickSpacing(0);
        // slider.setMajorTickSpacing(128);
        // slider.setMajorTickSpacing(255);
        // slider.setPaintLabels(true);

        this.setTitle(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        //this.add(slider, BorderLayout.SOUTH);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    // @Override
    // public void stateChanged(ChangeEvent e) {
    //     Panel.blue = slider.getValue();
    //     repaint();
    // }
}
