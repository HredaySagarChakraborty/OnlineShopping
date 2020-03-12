package hreday.sagar.allusaonlineshop.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import hreday.sagar.allusaonlineshop.News.Abc;
import hreday.sagar.allusaonlineshop.News.Adapter8;
import hreday.sagar.allusaonlineshop.News.Aoi;
import hreday.sagar.allusaonlineshop.News.ApiInterface8;
import hreday.sagar.allusaonlineshop.News.Bbc;
import hreday.sagar.allusaonlineshop.News.Britannica;
import hreday.sagar.allusaonlineshop.News.Cnn;
import hreday.sagar.allusaonlineshop.News.Espn;
import hreday.sagar.allusaonlineshop.News.Fobes;
import hreday.sagar.allusaonlineshop.News.Fox;
import hreday.sagar.allusaonlineshop.News.Medicalnews;
import hreday.sagar.allusaonlineshop.News.Newwork;
import hreday.sagar.allusaonlineshop.News.PojoClass8;
import hreday.sagar.allusaonlineshop.News.Usatoday;
import hreday.sagar.allusaonlineshop.News.Weather;
import hreday.sagar.allusaonlineshop.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class eight extends Fragment {

    Adapter8 adapter;
    private RecyclerView recyclerView;
    List<PojoClass8> list;


    public eight() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_eight, container, false);
        recyclerView = v.findViewById(R.id.recyclerId);


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());



        adapter = new Adapter8(this, list);

        adapter.setOnItemClickListener(new Adapter8.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Abc.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(getActivity(), Aoi.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(getActivity(), Bbc.class);
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(getActivity(), Britannica.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(getActivity(), Cnn.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(getActivity(), Espn.class);
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(getActivity(), Fobes.class);
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(getActivity(), Fox.class);
                    startActivity(intent);

                }

                if (position == 8) {
                    Intent intent = new Intent(getActivity(), Medicalnews.class);
                    startActivity(intent);

                }



                if (position == 9) {
                    Intent intent = new Intent(getActivity(), Newwork.class);
                    startActivity(intent);

                }

                if (position == 10) {
                    Intent intent = new Intent(getActivity(), Usatoday.class);
                    startActivity(intent);

                }

                if (position == 11) {
                    Intent intent = new Intent(getActivity(), Weather.class);
                    startActivity(intent);

                }

            }
        });

        try {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.npoint.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            ApiInterface8 apiInterface = retrofit.create(ApiInterface8.class);
            Call<List<PojoClass8>> call=apiInterface.getName();
            call.enqueue(new Callback<List<PojoClass8>>() {
                @Override
                public void onResponse(Call<List<PojoClass8>> call, Response<List<PojoClass8>> response) {
                    showIt(response.body());


                }

                @Override
                public void onFailure(Call<List<PojoClass8>> call, Throwable t) {

                }
            });
        }catch (Exception e){


        }





        return v;


    }

    private void showIt(List<PojoClass8> response) {

        Adapter8 adapter = new Adapter8(getActivity(), response);
        recyclerView.setAdapter(adapter);

    }

}


