package io.github.qaguru.owner;

import org.aeonbits.owner.Config;

public interface SelenoidConfig extends Config {

    @Key("browser")
    String browser();
}
