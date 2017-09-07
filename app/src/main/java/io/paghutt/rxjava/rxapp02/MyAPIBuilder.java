package io.paghutt.rxjava.rxapp02;

import com.google.gson.*;
import retrofit2.*;
import retrofit2.adapter.rxjava2.*;
import retrofit2.converter.gson.*;

public final class MyAPIBuilder {
    private static final String BASE_URL = "http://jsonplaceholder.typicode.com/";
    private static MyAPI sMyAPI;
    private MyAPIBuilder() {
    }
    public static MyAPI getMyAPI() {
        init();
        return sMyAPI;
    }
    private static void init() {
        if (sMyAPI == null) {
            Gson gson = new GsonBuilder().registerTypeAdapter(User.class, new UserDeserializer()).create();
            Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(BASE_URL)
				.addConverterFactory(GsonConverterFactory.create(gson))
				.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
				.build();
            sMyAPI = retrofit.create(MyAPI.class);
            //If you break up your API into different interfaces you can initialize them all here.
        }
    }
}
