package hreday.sagar.allusaonlineshop.Foodss;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface3 {
    @GET("639efa35914d2af6e512")
    Call<List<PojoClass3>> getName();
    //Log.d("Creation","Here are the errors");
}