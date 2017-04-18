package jp.pgw.develop.swallow.camelsample;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by kazamage on 2017/04/18.
 */
@SpringBootApplication
@ImportResource("groovy/*.groovy")
public class Application extends RouteBuilder {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void configure() throws Exception {
        getContext().getShutdownStrategy().setTimeout(10);
        from("seda:stop").process(e -> getContext().stop());
    }

}
