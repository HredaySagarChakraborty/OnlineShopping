package hreday.sagar.allusaonlineshop.Shop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("i5xvm")
    Call<List<PojoClass>> getName();
    //Log.d("Creation","Here are the errors");
}