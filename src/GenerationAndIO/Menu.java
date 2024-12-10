package GenerationAndIO;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    ArrayList<GuiElement> _elements;

    public Menu(){
        // można tutaj dodać te podstawowe elementy takie jak np w Mainie
    }

    public Menu(ArrayList<GuiElement> elements){
        _elements = elements;
    }

    // jakby ktoś chciał
    public Menu(GuiElement... elements){

        _elements = new ArrayList<>();

        for(int i = 0; i < elements.length; i++)
            _elements.add(elements[i]);
    }

    // returns false if chosen option "end" else returns true
    public boolean showMenu() {

        int i;

        // show all options to choose from
        for(i = 0; i < _elements.size(); i++) {
            // variable i will be shown from 1 to n+1
            System.out.println((i+1) + ". " + _elements.get(i).getDescription());
        }

        // add an option to end the program
        System.out.println((i + 1)  + ". Zakończ.");

        Scanner scanner = new Scanner(System.in);
        try
        {
            // variable i will be shown from 1 to n+1
            int chosenVal =  scanner.nextInt() - 1;
            if (chosenVal == i)
                return false;
            _elements.get(chosenVal).performAction();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Podaj numer opcji.");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Nie ma takiej opcji.");
        }
        return true;
    }
}
