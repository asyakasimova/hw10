package tests;

import com.codeborne.selenide.Configuration;
import io.github.qaguru.owner.SelenoidConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @BeforeEach
    public void initBrowser() {
        final  SelenoidConfig config = ConfigFactory.create(SelenoidConfig.class, System.getProperties());
        Configuration.browser = config.browser();
    }

    @Test
    public void testOpenPage() {
        open("https://github.com");
    }
}
