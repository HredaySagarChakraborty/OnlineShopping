package hreday.sagar.allusaonlineshop.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface8 {
    @GET("b2dcd31b0f6ee26cbea0")
    Call<List<PojoClass8>> getName();
    //Log.d("Creation","Here are the errors");
}