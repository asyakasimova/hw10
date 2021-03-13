package io.github.qaguru.owner;

import org.aeonbits.owner.Config;

public interface ReturnTypeConfig extends Config {

    @Key("double")
    double getDouble();

    @Key("int")
    int getInt();

    @Key("boolean")
    boolean getBoolean();

    @Key("string")
    String getString();

    @Key("long")
    long getLong();
}
