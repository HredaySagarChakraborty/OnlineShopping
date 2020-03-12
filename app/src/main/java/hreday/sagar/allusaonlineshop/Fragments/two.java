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

import hreday.sagar.allusaonlineshop.Fashionss.Adapter2;
import hreday.sagar.allusaonlineshop.Fashionss.ApiInterface2;
import hreday.sagar.allusaonlineshop.Fashionss.Armani;
import hreday.sagar.allusaonlineshop.Fashionss.Asos;
import hreday.sagar.allusaonlineshop.Fashionss.Bluenile;
import hreday.sagar.allusaonlineshop.Fashionss.Elle;
import hreday.sagar.allusaonlineshop.Fashionss.Gap;
import hreday.sagar.allusaonlineshop.Fashionss.Gilt;
import hreday.sagar.allusaonlineshop.Fashionss.Jared;
import hreday.sagar.allusaonlineshop.Fashionss.Kay;
import hreday.sagar.allusaonlineshop.Fashionss.Kohls;
import hreday.sagar.allusaonlineshop.Fashionss.Macys;
import hreday.sagar.allusaonlineshop.Fashionss.PojoClass2;
import hreday.sagar.allusaonlineshop.Fashionss.RossSymons;
import hreday.sagar.allusaonlineshop.Fashionss.Victoria;
import hreday.sagar.allusaonlineshop.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class two extends Fragment {

    Adapter2 adapter;
    private RecyclerView recyclerView;
    List<PojoClass2> list;
    Context context;



    public two() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_two, container, false);
        recyclerView = v.findViewById(R.id.recyclerId);


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());



        adapter = new Adapter2(this, list);

        adapter.setOnItemClickListener(new Adapter2.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Armani.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(getActivity(), Asos.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(getActivity(), Bluenile.class);
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(getActivity(), Elle.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(getActivity(), Gap.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(getActivity(), Gilt.class);
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(getActivity(), Jared.class);
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(getActivity(), Kay.class);
                    startActivity(intent);

                }

                if (position == 8) {
                    Intent intent = new Intent(getActivity(), Kohls.class);
                    startActivity(intent);

                }


                if (position == 9) {
                    Intent intent = new Intent(getActivity(), Macys.class);
                    startActivity(intent);

                }


                if (position == 10) {
                    Intent intent = new Intent(getActivity(), RossSymons.class);
                    startActivity(intent);

                }

                if (position == 11) {
                    Intent intent = new Intent(getActivity(), Victoria.class);
                    startActivity(intent);

                }



            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.npoint.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface2 apiInterface = retrofit.create(ApiInterface2.class);
        Call<List<PojoClass2>> call=apiInterface.getName();
        call.enqueue(new Callback<List<PojoClass2>>() {
            @Override
            public void onResponse(Call<List<PojoClass2>> call, Response<List<PojoClass2>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<PojoClass2>> call, Throwable t) {

            }
        });


        return v;


    }

    private void showIt(List<PojoClass2> response) {

        Adapter2 adapter = new Adapter2(getActivity(), response);
        recyclerView.setAdapter(adapter);

    }


}
