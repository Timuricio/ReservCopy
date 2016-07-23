package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Timur on 23.07.2016.
 */
public class View {
    private Controller controller;
    private JFrame frame;

    public View(Controller controller)
    {
        this.controller = controller;
        init();
    }

    private void init()
    {
        frame = new JFrame("Backup files");
        frame.setPreferredSize(new Dimension(800,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setLayout(new FlowLayout());




        frame.setVisible(true);
        frame.pack();
    }
}
