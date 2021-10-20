package in.dz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class WebMvcExample {

    public static void main(String[] args) {

        SpringApplication.run(WebMvcExample.class, args);
    }
}

@Controller
@RequestMapping("/test")
class TestMvcController {

    @RequestMapping
    public String index() {
        return "index.jsp";
    }
}

//@Configuration
//class EventHandle {
//    @EventListener
//    public void handleContextRefreshEvent(ContextStartedEvent ctxStartEvt) {
//        System.out.println("Context Start Event received.**************************");
//    }
//}
//
//class ContextRefreshedListener
//        implements ApplicationListener<ContextStartedEvent> {
//    @Override
//    public void onApplicationEvent(ContextStartedEvent cse) {
//        System.out.println("Handling context re-freshed event. ");
//    }
//}