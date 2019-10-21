package triangle_square;

import java.util.Scanner;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 21.10.2019
 * TIME: 17:07
 */

public class TriangleSort {

    public static void inputData()
    {
        Scanner in = new Scanner(System.in);
        String choice;
        do{
            LOGGER.info("Would you like to continue?");
            choice = in.nextLine();
        }while(choice.equalsIgnoreCase("y")||choice.equalsIgnoreCase("yes"));
    }

    private static double countByGeron(Triangle triangle) {
        double square = 0;
        double halfPerimeter = (triangle.getFirstSide() + triangle.getSecondSide()
                + triangle.getThirdSide()) / 2;
        double rootExpression = halfPerimeter * ((halfPerimeter - triangle.getFirstSide())
                * (halfPerimeter - triangle.getSecondSide())
                * (halfPerimeter - triangle.getThirdSide()));
        square = Math.sqrt(rootExpression);
        return square;
    }
}
