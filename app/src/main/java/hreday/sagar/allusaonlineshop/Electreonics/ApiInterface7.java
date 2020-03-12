package hreday.sagar.allusaonlineshop.Electreonics;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface7 {
    @GET("5466dda8b55ee917963f")
    Call<List<PojoClass7>> getName();
    //Log.d("Creation","Here are the errors");
}