package igramemorije;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Krug2 extends Component {

    public Krug2() {

    }

    public void paint(Graphics naziv) {
        Graphics2D naziv2 = (Graphics2D) naziv;
        naziv2.setColor(Color.blue);
        naziv2.setBackground(Color.LIGHT_GRAY);
        naziv2.fillOval(20, 20, 100, 100);
        AffineTransform savedTransform = naziv2.getTransform();

    }
}
