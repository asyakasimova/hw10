package tests;

import io.github.qaguru.owner.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConfigurationTest {

    @Test
    public void testConfiguration() {
        final WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        assertThat(config.getWebDriverUrl()).isEqualTo("http://localhost:4444");
        assertThat(config.getWebDriverBrowser()).isEqualTo("chrome");
        assertThat(config.getBaseUrl()).isEqualTo("https://testing.github.com");
        assertThat(config.isEnabled()).isEqualTo(true);
    }
}
