package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

/**
 * Created by Timur on 23.07.2016.
 */
public class PanelFiles extends JPanel
{
    private List<File> files;
    private List<StringControlFile> list;

    public PanelFiles(List<File> files)
    {
        this.files = files;
        fillTheList();
        init();
    }

    private void fillTheList()
    {
        list.clear();

        for(File f : files)
            list.add(new StringControlFile(f.getAbsolutePath()));
    }

    private void init()
    {
        setSize(165,500);
        setLayout(new FlowLayout());

        if(!list.isEmpty())
        {
            for (StringControlFile str : list)
                add(str);
        }

        JButton buttonAdd = new JButton("+");
        buttonAdd.setSize(10,10);
        add(buttonAdd);

        buttonAdd.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JFileChooser fileChooser = new JFileChooser();
                File file = fileChooser.getSelectedFile();
                // TODO!!!
            }
        });
    }

    public List<File> getFiles()
    {
        return files;
    }

    public void setFiles(List<File> files)
    {
        this.files = files;
    }
}
