package app.messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
@Component
public class MessageService {
    private MessageRepository repository;

    @Autowired
    public MessageService (MessageRepository repository) {
        this.repository = repository;
    }

//    @Required
//    public void setRepository(MessageRepository repository) {
//        this.repository = repository;
//    }

    public void save(String text) {
        this.repository.saveMessage(new Message(text));
    }
}