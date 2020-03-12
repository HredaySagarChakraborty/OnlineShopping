package hreday.sagar.allusaonlineshop.Fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import hreday.sagar.allusaonlineshop.R;
import hreday.sagar.allusaonlineshop.Shop.Adapter;
import hreday.sagar.allusaonlineshop.Shop.ApiInterface;
import hreday.sagar.allusaonlineshop.Shop.PojoClass;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class one extends Fragment {

    Adapter adapter;
    private RecyclerView recyclerView;
    List<PojoClass> list;
    Context context;

  //  Adapter myAdapter;


    public one() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_one, container, false);

        recyclerView = v.findViewById(R.id.recyclerId);


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);


        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.myjson.com/bins/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<List<PojoClass>> call = apiInterface.getName();
        call.enqueue(new Callback<List<PojoClass>>() {
            @Override
            public void onResponse(Call<List<PojoClass>> call, Response<List<PojoClass>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<PojoClass>> call, Throwable t) {

            }
        });


        return v;


    }

    private void showIt(List<PojoClass> response) {

        Adapter adapter = new Adapter(getActivity(), response);
        recyclerView.setAdapter(adapter);

    }



}
