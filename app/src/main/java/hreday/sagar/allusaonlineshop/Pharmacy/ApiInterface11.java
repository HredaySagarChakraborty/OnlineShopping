package hreday.sagar.allusaonlineshop.Pharmacy;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface11 {
    @GET("a54884e1312767ac8d75")
    Call<List<PojoClass11>> getName();
    //Log.d("Creation","Here are the errors");
}