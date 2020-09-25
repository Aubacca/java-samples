package ch.rohner.appoflib.api;

import ch.rohner.library.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/messages", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class MessageApi {
    private final MessageService messageService;

    public MessageApi(MessageService messageService) {
        log.info("MessageApi>");
        this.messageService = messageService;
        log.info("MessageApi<");
    }

    @GetMapping
    public ResponseEntity<String> home() {
        final String message = messageService.message();
        log.info("home<message: " + message);
        return ResponseEntity.ok(message);
    }
}
