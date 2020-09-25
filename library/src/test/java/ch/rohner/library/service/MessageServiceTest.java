package ch.rohner.library.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest("service.message=Hello")
public class MessageServiceTest {
  @Autowired
  private MessageService messageService;

  @SpringBootApplication
  static class TestConfiguration {
  }

  @Test
  public void contextLoads() {
    assertThat(messageService.message()).isNotNull();
  }
}