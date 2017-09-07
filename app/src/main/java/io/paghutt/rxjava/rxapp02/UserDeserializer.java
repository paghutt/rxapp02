package io.paghutt.rxjava.rxapp02;

import com.google.gson.*;
import java.lang.reflect.*;

public class UserDeserializer implements JsonDeserializer<User> {
    @Override
    public User deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        User user = new User();
        // custom parsing logic goes here
        return user;
    }
}
