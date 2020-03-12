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

import hreday.sagar.allusaonlineshop.Foodss.Adapter3;
import hreday.sagar.allusaonlineshop.Foodss.Allrecepies;
import hreday.sagar.allusaonlineshop.Foodss.ApiInterface3;
import hreday.sagar.allusaonlineshop.Foodss.BurgerKing;
import hreday.sagar.allusaonlineshop.Foodss.Chickfill;
import hreday.sagar.allusaonlineshop.Foodss.Delivery;
import hreday.sagar.allusaonlineshop.Foodss.Dominous;
import hreday.sagar.allusaonlineshop.Foodss.Eatingwell;
import hreday.sagar.allusaonlineshop.Foodss.Foodnetwork;
import hreday.sagar.allusaonlineshop.Foodss.Freshdirect;
import hreday.sagar.allusaonlineshop.Foodss.HelloFresh;
import hreday.sagar.allusaonlineshop.Foodss.Instacart;
import hreday.sagar.allusaonlineshop.Foodss.Kfc;
import hreday.sagar.allusaonlineshop.Foodss.PojoClass3;
import hreday.sagar.allusaonlineshop.Foodss.Wholefoodmarket;
import hreday.sagar.allusaonlineshop.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class three extends Fragment {
    Adapter3 adapter;
    private RecyclerView recyclerView;
    List<PojoClass3> list;
    Context context;

    public three() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_three, container, false);
        recyclerView = v.findViewById(R.id.recyclerId);


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());



        adapter = new Adapter3(this, list);

        adapter.setOnItemClickListener(new Adapter3.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();



                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Allrecepies.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(getActivity(), BurgerKing.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(getActivity(), Chickfill.class);
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(getActivity(), Delivery.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(getActivity(), Dominous.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(getActivity(), Eatingwell.class);
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(getActivity(), Foodnetwork.class);
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(getActivity(), Freshdirect.class);
                    startActivity(intent);

                }


                if (position == 8) {
                    Intent intent = new Intent(getActivity(), HelloFresh.class);
                    startActivity(intent);

                }


                if (position == 9) {
                    Intent intent = new Intent(getActivity(), Instacart.class);
                    startActivity(intent);

                }

                if (position == 10) {
                    Intent intent = new Intent(getActivity(), Kfc.class);
                    startActivity(intent);

                }
                if (position == 11) {
                    Intent intent = new Intent(getActivity(), Wholefoodmarket.class);
                    startActivity(intent);

                }


            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.npoint.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface3 apiInterface = retrofit.create(ApiInterface3.class);
        Call<List<PojoClass3>> call=apiInterface.getName();
        call.enqueue(new Callback<List<PojoClass3>>() {
            @Override
            public void onResponse(Call<List<PojoClass3>> call, Response<List<PojoClass3>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<PojoClass3>> call, Throwable t) {

            }
        });


        return v;


    }

    private void showIt(List<PojoClass3> response) {

        Adapter3 adapter = new Adapter3(getActivity(), response);
        recyclerView.setAdapter(adapter);

    }


}
