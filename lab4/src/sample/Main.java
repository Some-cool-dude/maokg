package sample;

import com.sun.j3d.utils.universe.SimpleUniverse;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JFrame implements ActionListener, KeyListener {
    Plane plane;
    float angleX = 0;
    float angleY = 0;

    public Main() {
        super("Lab4");

        plane = new Plane();

        Canvas3D canvas3D = new Canvas3D(SimpleUniverse.getPreferredConfiguration());

        add(canvas3D);
        canvas3D.addKeyListener(this);

        Timer timer = new Timer(50, this);
        timer.start();


        BranchGroup scene = plane.createSceneGraph();
        SimpleUniverse u = new SimpleUniverse(canvas3D);
        u.getViewingPlatform().setNominalViewingTransform();
        u.addBranchGraph(scene);

        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) { new Main(); }

    @Override
    public void keyTyped(KeyEvent keyEvent) { }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode() == KeyEvent.VK_S) {
            angleX -= 0.02;
            plane.rotate(angleX, angleY);
        }

        if(keyEvent.getKeyCode() == KeyEvent.VK_W) {
            angleX += 0.02;
            plane.rotate(angleX, angleY);
        }

        if(keyEvent.getKeyCode() == KeyEvent.VK_A) {
            angleY -= 0.02;
            plane.rotate(angleX, angleY);
        }

        if(keyEvent.getKeyCode() == KeyEvent.VK_D) {
            angleY += 0.02;
            plane.rotate(angleX, angleY);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
