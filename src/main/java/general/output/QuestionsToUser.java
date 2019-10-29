package general.output;


import java.util.logging.Logger;

public class QuestionsToUser {
    private static final Logger LOGGER = Logger.getLogger(QuestionsToUser.class.getName());

    public static void continueWork(){
        LOGGER.info("Would you like to continue?");
    }
}
