package io.github.qaguru.owner;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${configuration}.properties"
})
public interface WebConfig extends Config {

    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("remote.url")
    String webDriverUrl();

    @Key("video.storage")
    String videoStorage();
}
