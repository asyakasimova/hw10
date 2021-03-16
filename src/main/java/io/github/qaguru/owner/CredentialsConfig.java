package io.github.qaguru.owner;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/Java/credentials.properties",
        "classpath:credentials.properties"
})
//@Config.LoadPolicy(Config.LoadType.FIRST)
public interface CredentialsConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();
}
