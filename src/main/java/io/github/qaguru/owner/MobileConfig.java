package io.github.qaguru.owner;


import org.aeonbits.owner.Config;

@Config.Sources("classpath:ios.properties")
public interface MobileConfig extends Config {
    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String PlatformVersion();

    @Key("application.location")
    String applicationLocation();
}
