package hreday.sagar.allusaonlineshop.Fashionss;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface2 {
    @GET("37101fd091ee3affc62a")
    Call<List<PojoClass2>> getName();
    //Log.d("Creation","Here are the errors");
}