import io.github.qaguru.owner.TestConfig;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConfigurationTest {

    @Test
    public void testConfiguration() {
        final TestConfig config = new TestConfig();

        assertThat(config.getWebDriverUrl()).isEqualTo("http://localhost:8080");
        assertThat(config.getwebDriverBrowser()).isEqualTo("chrome");
        assertThat(config.getBaseUrl()).isEqualTo("testing.github.com");
        // 15.08
    }
}
