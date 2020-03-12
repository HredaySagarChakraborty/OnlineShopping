package hreday.sagar.allusaonlineshop.Babys;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface5 {
    @GET("6ffd45397f8c44c6e2e5")
    Call<List<PojoClass5>> getName();
    //Log.d("Creation","Here are the errors");
}