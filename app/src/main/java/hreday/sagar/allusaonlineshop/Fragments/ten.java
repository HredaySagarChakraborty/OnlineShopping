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

import hreday.sagar.allusaonlineshop.Travel.Adapter10;
import hreday.sagar.allusaonlineshop.Travel.Agoda;
import hreday.sagar.allusaonlineshop.Travel.Airbnb;
import hreday.sagar.allusaonlineshop.Travel.ApiInterface10;
import hreday.sagar.allusaonlineshop.Travel.Booking;
import hreday.sagar.allusaonlineshop.Travel.Budget;
import hreday.sagar.allusaonlineshop.Travel.Carrentals;
import hreday.sagar.allusaonlineshop.Travel.Cheoapir;
import hreday.sagar.allusaonlineshop.Travel.Choicehotels;
import hreday.sagar.allusaonlineshop.Travel.Emirates;
import hreday.sagar.allusaonlineshop.Travel.Enterprise;
import hreday.sagar.allusaonlineshop.Travel.Expedia;
import hreday.sagar.allusaonlineshop.Travel.Homeaway;
import hreday.sagar.allusaonlineshop.Travel.Hotwire;
import hreday.sagar.allusaonlineshop.Travel.PojoClass10;
import hreday.sagar.allusaonlineshop.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class ten extends Fragment {
    Adapter10 adapter;
    private RecyclerView recyclerView;
    List<PojoClass10> list;

    public ten() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ten, container, false);
        recyclerView = v.findViewById(R.id.recyclerId);


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());



        adapter = new Adapter10(this, list);

        adapter.setOnItemClickListener(new Adapter10.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Agoda.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(getActivity(), Airbnb.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(getActivity(), Booking.class);
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(getActivity(), Budget.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(getActivity(), Carrentals.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(getActivity(), Cheoapir.class);
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(getActivity(), Choicehotels.class);
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(getActivity(), Emirates.class);
                    startActivity(intent);

                }

                if (position == 8) {
                    Intent intent = new Intent(getActivity(), Enterprise.class);
                    startActivity(intent);

                }


                if (position == 9) {
                    Intent intent = new Intent(getActivity(), Expedia.class);
                    startActivity(intent);

                }


                if (position == 10) {
                    Intent intent = new Intent(getActivity(), Homeaway.class);
                    startActivity(intent);

                }

                if (position == 11) {
                    Intent intent = new Intent(getActivity(), Hotwire.class);
                    startActivity(intent);

                }



            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.npoint.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface10 apiInterface = retrofit.create(ApiInterface10.class);
        Call<List<PojoClass10>> call=apiInterface.getName();
        call.enqueue(new Callback<List<PojoClass10>>() {
            @Override
            public void onResponse(Call<List<PojoClass10>> call, Response<List<PojoClass10>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<PojoClass10>> call, Throwable t) {

            }
        });


        return v;


    }

    private void showIt(List<PojoClass10> response) {

        Adapter10 adapter = new Adapter10(getActivity(), response);
        recyclerView.setAdapter(adapter);

    }


}
