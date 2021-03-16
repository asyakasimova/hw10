package tests;

import io.github.qaguru.owner.GlobalConfig;
import io.github.qaguru.owner.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class MobileTest {

    @Test
    public void testMobileConfig() {
        final MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        System.out.println(config.platformName());
        System.out.println(config.PlatformVersion());
        System.out.println(config.applicationLocation());
    }
}
