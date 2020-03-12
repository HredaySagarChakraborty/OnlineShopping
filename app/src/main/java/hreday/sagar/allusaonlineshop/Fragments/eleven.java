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

import hreday.sagar.allusaonlineshop.Pharmacy.Adapter11;
import hreday.sagar.allusaonlineshop.Pharmacy.ApiInterface11;
import hreday.sagar.allusaonlineshop.Pharmacy.Caremark;
import hreday.sagar.allusaonlineshop.Pharmacy.Contacts;
import hreday.sagar.allusaonlineshop.Pharmacy.Cvs;
import hreday.sagar.allusaonlineshop.Pharmacy.Meijer;
import hreday.sagar.allusaonlineshop.Pharmacy.Menshealth;
import hreday.sagar.allusaonlineshop.Pharmacy.PojoClass11;
import hreday.sagar.allusaonlineshop.Pharmacy.Puritan;
import hreday.sagar.allusaonlineshop.Pharmacy.Qvc;
import hreday.sagar.allusaonlineshop.Pharmacy.Riteaid;
import hreday.sagar.allusaonlineshop.Pharmacy.Vitaminshop;
import hreday.sagar.allusaonlineshop.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class eleven extends Fragment {

    Adapter11 adapter;
    private RecyclerView recyclerView;
    List<PojoClass11> list;


    public eleven() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_eleven, container, false);
        recyclerView = v.findViewById(R.id.recyclerId);


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());



        adapter = new Adapter11(this, list);

        adapter.setOnItemClickListener(new Adapter11.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Caremark.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(getActivity(), Contacts.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(getActivity(), Cvs.class);
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(getActivity(), Meijer.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(getActivity(), Menshealth.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(getActivity(), Puritan.class);
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(getActivity(), Qvc.class);
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(getActivity(), Riteaid.class);
                    startActivity(intent);

                }

                if (position == 8) {
                    Intent intent = new Intent(getActivity(), Vitaminshop.class);
                    startActivity(intent);

                }

            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.npoint.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface11 apiInterface = retrofit.create(ApiInterface11.class);
        Call<List<PojoClass11>> call=apiInterface.getName();
        call.enqueue(new Callback<List<PojoClass11>>() {
            @Override
            public void onResponse(Call<List<PojoClass11>> call, Response<List<PojoClass11>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<PojoClass11>> call, Throwable t) {

            }
        });


        return v;


    }

    private void showIt(List<PojoClass11> response) {

        Adapter11 adapter = new Adapter11(getActivity(), response);
        recyclerView.setAdapter(adapter);

    }

}
