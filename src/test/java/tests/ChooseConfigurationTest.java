package tests;

import io.github.qaguru.owner.GlobalConfig;
import io.github.qaguru.owner.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ChooseConfigurationTest {
    @Test
    public void testChooseConfiguration() {
        final WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

        System.out.println(config.browserName());
    }
}
