package hreday.sagar.allusaonlineshop.Travel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface10 {
    @GET("592d09cf1942c7b26e5e")
    Call<List<PojoClass10>> getName();
    //Log.d("Creation","Here are the errors");
}