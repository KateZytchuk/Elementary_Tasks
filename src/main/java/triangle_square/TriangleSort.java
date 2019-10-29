package triangle_square;


import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 21.10.2019
 * TIME: 17:07
 */

public class TriangleSort {

    private static final java.util.logging.Logger LOGGER = Logger.getLogger(TriangleSort.class.getName());
    public static void run()
    {
        LOGGER.info("Sorry not ready yet!");
        Scanner in = new Scanner(System.in);
        String choice;
        do{
            LOGGER.info("Would you like to continue?");
            choice = in.nextLine();
        }while(choice.equalsIgnoreCase("y")||choice.equalsIgnoreCase("yes"));
    }

    public static void inputData() {

    }
    private static double countByGeron(Triangle triangle) {
        double square = 0;
        double halfPerimeter = countHalfPerimeter(triangle);
        double rootExpression = halfPerimeter * ((halfPerimeter - triangle.getFirstSide())
                * (halfPerimeter - triangle.getSecondSide())
                * (halfPerimeter - triangle.getThirdSide()));
        square = Math.sqrt(rootExpression);
        return square;
    }
    private static double countHalfPerimeter(Triangle triangle)
    {
        double halfPerimeter = (triangle.getFirstSide() + triangle.getSecondSide()
                + triangle.getThirdSide()) / 2;
        return halfPerimeter;
    }
}
