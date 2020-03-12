package hreday.sagar.allusaonlineshop.Fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import hreday.sagar.allusaonlineshop.Homes.Adapter4;
import hreday.sagar.allusaonlineshop.Homes.Apartmentfinder;
import hreday.sagar.allusaonlineshop.Homes.Apartmentguide;
import hreday.sagar.allusaonlineshop.Homes.Apartments;
import hreday.sagar.allusaonlineshop.Homes.ApiInterface4;
import hreday.sagar.allusaonlineshop.Homes.Flipkey;
import hreday.sagar.allusaonlineshop.Homes.Forrent;
import hreday.sagar.allusaonlineshop.Homes.Homefinder;
import hreday.sagar.allusaonlineshop.Homes.PojoClass4;
import hreday.sagar.allusaonlineshop.Homes.Rent;
import hreday.sagar.allusaonlineshop.Homes.Rentals;
import hreday.sagar.allusaonlineshop.Homes.Trulia;
import hreday.sagar.allusaonlineshop.Homes.Vrbo;
import hreday.sagar.allusaonlineshop.Homes.Zillow;
import hreday.sagar.allusaonlineshop.Homes.Zumper;
import hreday.sagar.allusaonlineshop.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class four extends Fragment {

    Adapter4 adapter;
    private RecyclerView recyclerView;
    List<PojoClass4> list;
    Context context;
    public four() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_four, container, false);
        recyclerView = v.findViewById(R.id.recyclerId);


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());



        adapter = new Adapter4(this, list);

        adapter.setOnItemClickListener(new Adapter4.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Apartmentfinder.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(getActivity(), Apartmentguide.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(getActivity(), Apartments.class);
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(getActivity(), Flipkey.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(getActivity(), Forrent.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(getActivity(), Homefinder.class);
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(getActivity(), Rent.class);
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(getActivity(), Rentals.class);
                    startActivity(intent);

                }


                if (position == 8) {
                    Intent intent = new Intent(getActivity(), Trulia.class);
                    startActivity(intent);

                }


                if (position == 9) {
                    Intent intent = new Intent(getActivity(), Vrbo.class);
                    startActivity(intent);

                }

                if (position == 10) {
                    Intent intent = new Intent(getActivity(), Zillow.class);
                    startActivity(intent);

                }
                if (position == 11) {
                    Intent intent = new Intent(getActivity(), Zumper.class);
                    startActivity(intent);

                }

            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.npoint.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface4 apiInterface = retrofit.create(ApiInterface4.class);
        Call<List<PojoClass4>> call=apiInterface.getName();
        call.enqueue(new Callback<List<PojoClass4>>() {
            @Override
            public void onResponse(Call<List<PojoClass4>> call, Response<List<PojoClass4>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<PojoClass4>> call, Throwable t) {

            }
        });


        return v;


    }

    private void showIt(List<PojoClass4> response) {

        Adapter4 adapter = new Adapter4(getActivity(), response);
        recyclerView.setAdapter(adapter);

    }


}


