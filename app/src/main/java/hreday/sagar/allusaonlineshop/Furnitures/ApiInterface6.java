package hreday.sagar.allusaonlineshop.Furnitures;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface6 {
    @GET("dc434288352196bb2793")
    Call<List<PojoClass6>> getName();
    //Log.d("Creation","Here are the errors");
}