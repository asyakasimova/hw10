package io.github.qaguru.owner;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {

    @Key("fruitsList")
    @Separator(",")
    @DefaultValue("apple, banana, orange")
    List<String> getFruits();

}
