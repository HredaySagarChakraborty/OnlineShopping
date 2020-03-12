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

import hreday.sagar.allusaonlineshop.Electreonics.Adapter7;
import hreday.sagar.allusaonlineshop.Electreonics.Adorama;
import hreday.sagar.allusaonlineshop.Electreonics.ApiInterface7;
import hreday.sagar.allusaonlineshop.Electreonics.Apple;
import hreday.sagar.allusaonlineshop.Electreonics.Craig;
import hreday.sagar.allusaonlineshop.Electreonics.Frys;
import hreday.sagar.allusaonlineshop.Electreonics.PojoClass7;
import hreday.sagar.allusaonlineshop.Electreonics.Rakuten;
import hreday.sagar.allusaonlineshop.Electreonics.Sears;
import hreday.sagar.allusaonlineshop.Electreonics.Sony;
import hreday.sagar.allusaonlineshop.Electreonics.Tiger;
import hreday.sagar.allusaonlineshop.Electreonics.Woot;
import hreday.sagar.allusaonlineshop.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class seven extends Fragment {

    Adapter7 adapter;
    private RecyclerView recyclerView;
    List<PojoClass7> list;


    public seven() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_seven, container, false);
        recyclerView = v.findViewById(R.id.recyclerId);


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());



        adapter = new Adapter7(this, list);

        adapter.setOnItemClickListener(new Adapter7.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Adorama.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(getActivity(), Apple.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(getActivity(), Craig.class);
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(getActivity(), Frys.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(getActivity(), Rakuten.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(getActivity(), Sears.class);
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(getActivity(), Tiger.class);
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(getActivity(), Woot.class);
                    startActivity(intent);

                }


                if (position == 8) {
                    Intent intent = new Intent(getActivity(), Sony.class);
                    startActivity(intent);

                }



            }
        });


        try{
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.npoint.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            ApiInterface7 apiInterface = retrofit.create(ApiInterface7.class);
            Call<List<PojoClass7>> call=apiInterface.getName();
            call.enqueue(new Callback<List<PojoClass7>>() {
                @Override
                public void onResponse(Call<List<PojoClass7>> call, Response<List<PojoClass7>> response) {
                    showIt(response.body());


                }

                @Override
                public void onFailure(Call<List<PojoClass7>> call, Throwable t) {

                }
            });



        }catch (Exception e){


        }


        return v;


    }

    private void showIt(List<PojoClass7> response) {

        Adapter7 adapter = new Adapter7(getActivity(), response);
        recyclerView.setAdapter(adapter);

    }

}


