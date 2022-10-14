package drawingProject;

import static drawingProject.CreateNumbers.madenumber;
import static drawingProject.CreateNumbers.printNumber;

public class RunDrawingNumbers {

    public static void main(String[] args)  {

        String[][] numbers = new String[5][6];

        madenumber(numbers);

        printNumber(numbers);
    }
}
