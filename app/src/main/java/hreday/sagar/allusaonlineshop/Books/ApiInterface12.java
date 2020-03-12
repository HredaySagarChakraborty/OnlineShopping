package hreday.sagar.allusaonlineshop.Books;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface12 {
    @GET("233f08db2215cde97f15")
    Call<List<PojoClass12>> getName();
    //Log.d("Creation","Here are the errors");
}