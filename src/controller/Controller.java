package controller;

import view.View;
import model.Model;

/**
 * Created by Timur on 23.07.2016.
 */
public class Controller
{
    private View view;
    private Model model;

    public Controller(Model model)
    {
        view = new View(this);
        this.model = model;
    }

    public static void main(String[] args)
    {
        Model model = new Model();
        Controller controller = new Controller(model);

    }
}
