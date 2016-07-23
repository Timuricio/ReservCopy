package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Timur on 23.07.2016.
 */
public class StringControlFile extends JPanel
{
    private JButton buttonRemove = null;
    private String nameFile = "";
    private final int maxLenghtNameFile = 1000;

    public StringControlFile(String nameFile)
    {
        this.nameFile = nameFile;
        init();
    }

    private void init()
    {
        String displayedNameFile;

        if (nameFile.length() > maxLenghtNameFile)
            displayedNameFile = cutNameFile();

        setSize(165,10);
        setBorder(BorderFactory.createLineBorder(Color.black));
        setLayout(null);

        JLabel labelNameFile = new JLabel(nameFile);
        labelNameFile.setBounds(0, 0, 150, 10);
        add(labelNameFile);

        buttonRemove = new JButton("-");
        buttonRemove.setBounds(155,0,10,10);
        add(buttonRemove);
    }

    private String cutNameFile()
    {
        return null;
    }

    public JButton getButtonRemove()
    {
        return buttonRemove;
    }

    public void setButtonRemove(JButton buttonRemove)
    {
        this.buttonRemove = buttonRemove;
    }

    public String getNameFile()
    {
        return nameFile;
    }
}
