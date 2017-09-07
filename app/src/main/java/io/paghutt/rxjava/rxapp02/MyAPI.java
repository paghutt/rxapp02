package io.paghutt.rxjava.rxapp02;

import io.reactivex.*;
import org.json.*;
import retrofit2.http.*;

public interface MyAPI
{
	@GET("posts")
	Observable<JSONArray> getList();
}
