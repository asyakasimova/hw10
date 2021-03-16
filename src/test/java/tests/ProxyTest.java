package tests;

import io.github.qaguru.owner.ProxyConfig;
import io.github.qaguru.owner.SelenoidConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProxyTest {

    @Test
    public void testProxy() {
        final ProxyConfig config = ConfigFactory.create(ProxyConfig.class, System.getProperties());

        assertThat(config.host()).isEqualTo("proxy.company.com");
        assertThat(config.port()).isEqualTo(4444);
        assertThat(config.enabled()).isEqualTo(true);
    }
}
