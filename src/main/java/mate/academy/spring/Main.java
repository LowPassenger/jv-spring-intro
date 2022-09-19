package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User goodUser = new User();
        goodUser.setName("Good");
        goodUser.setAge(22);

        User badUser = new User();
        goodUser.setName("Bad");
        goodUser.setAge(24);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(goodUser);
        userService.add(badUser);

        System.out.println(userService.getAll());
    }
}
