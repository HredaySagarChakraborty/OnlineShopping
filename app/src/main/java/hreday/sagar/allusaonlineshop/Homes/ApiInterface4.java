package hreday.sagar.allusaonlineshop.Homes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface4 {
    @GET("3c1617735e060f381e56")
    Call<List<PojoClass4>> getName();
    //Log.d("Creation","Here are the errors");
}