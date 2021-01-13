package test.pivotal.pal.trackerapi;

import io.pivotal.pal.tracker.PalTrackerApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@Import(MyTestConfiguration.class)
@SpringBootTest(classes = {PalTrackerApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WelcomeApiTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void exampleTest() {
        String body = this.restTemplate.getForObject("/", String.class);
        assertThat(body).isEqualTo("Hello from test");
    }
}
