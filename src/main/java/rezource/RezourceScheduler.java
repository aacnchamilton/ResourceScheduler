package rezource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"java"})
public class RezourceScheduler {

  public static void main(String[] args) {
    SpringApplication.run(RezourceScheduler.class, args);
  }

}
