package app.messages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MessageRepository {

    private final static Log log = LogFactory.getLog(MessageRepository.class);

    public void saveMessage(Message message) {
        // save message in DB
        log.info("Saved message: " + message.getText());
    }
}