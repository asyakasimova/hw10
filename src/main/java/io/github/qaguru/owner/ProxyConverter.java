package io.github.qaguru.owner;

import org.aeonbits.owner.Converter;
import java.lang.reflect.Method;

public class ProxyConverter implements Converter {

    @Override
    public Object convert(Method method, String input){
        final String[] data = input.split(":");
        return new Proxy(data[0], Integer.parseInt(data[1]));
    }

}
