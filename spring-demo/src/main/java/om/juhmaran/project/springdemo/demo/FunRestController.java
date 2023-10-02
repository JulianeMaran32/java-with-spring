package om.juhmaran.project.springdemo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
public class FunRestController {

    // inject properties for: coach.name and team.name

    @Value(value = "${coach.name}")
    private String coachName;

    @Value(value = "${team.name}")
    private String teamName;

    // expose a new endpoint  for "teaminfo"

    @GetMapping("/teaminfo")
    public Stream<String> getTeamInfo() {
        return Stream.of(coachName, teamName);
    }

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose a new endpoint  for "workout"

    @GetMapping("/workout")
    public String getDeilyWorkout() {
        return "Run a hard 5k!";
    }

    // expose a new endpoint  for "fortune"

    @GetMapping("/fortune")
    public String getDeilyFortune() {
        return "Today is your lucky day.";
    }

}
