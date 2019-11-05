package envelopes.console;

import java.util.logging.Logger;

public class OutputInfo {

    private static final Logger LOGGER = Logger.getLogger(OutputInfo.class.getName());

    public static void showMessage(String str) {
        LOGGER.info(str);
    }
}
