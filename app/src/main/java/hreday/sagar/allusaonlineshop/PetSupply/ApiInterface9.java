package hreday.sagar.allusaonlineshop.PetSupply;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface9 {
    @GET("ef07c6f51cc0b69b7a62")
    Call<List<PojoClass9>> getName();
    //Log.d("Creation","Here are the errors");
}