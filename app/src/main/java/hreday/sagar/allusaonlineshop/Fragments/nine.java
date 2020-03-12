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

import hreday.sagar.allusaonlineshop.PetSupply.Adapter9;
import hreday.sagar.allusaonlineshop.PetSupply.ApiInterface9;
import hreday.sagar.allusaonlineshop.PetSupply.Carerbuilder;
import hreday.sagar.allusaonlineshop.PetSupply.Freelancer;
import hreday.sagar.allusaonlineshop.PetSupply.Guru;
import hreday.sagar.allusaonlineshop.PetSupply.Indeed;
import hreday.sagar.allusaonlineshop.PetSupply.Monster;
import hreday.sagar.allusaonlineshop.PetSupply.PojoClass9;
import hreday.sagar.allusaonlineshop.PetSupply.Snagajob;
import hreday.sagar.allusaonlineshop.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class nine extends Fragment {

    Adapter9 adapter;
    private RecyclerView recyclerView;
    List<PojoClass9> list;

    public nine() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_nine, container, false);
        recyclerView = v.findViewById(R.id.recyclerId);


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());



        adapter = new Adapter9(this, list);

        adapter.setOnItemClickListener(new Adapter9.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Carerbuilder.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(getActivity(), Freelancer.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(getActivity(), Guru.class);
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(getActivity(), Indeed.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(getActivity(), Monster.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(getActivity(), Snagajob.class);
                    startActivity(intent);

                }



            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.npoint.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface9 apiInterface = retrofit.create(ApiInterface9.class);
        Call<List<PojoClass9>> call=apiInterface.getName();
        call.enqueue(new Callback<List<PojoClass9>>() {
            @Override
            public void onResponse(Call<List<PojoClass9>> call, Response<List<PojoClass9>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<PojoClass9>> call, Throwable t) {

            }
        });


        return v;


    }

    private void showIt(List<PojoClass9> response) {

        Adapter9 adapter = new Adapter9(getActivity(), response);
        recyclerView.setAdapter(adapter);

    }

}
