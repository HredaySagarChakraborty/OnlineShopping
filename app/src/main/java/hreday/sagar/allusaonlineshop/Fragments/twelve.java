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

import hreday.sagar.allusaonlineshop.Books.Adapter12;
import hreday.sagar.allusaonlineshop.Books.ApiInterface12;
import hreday.sagar.allusaonlineshop.Books.Audible;
import hreday.sagar.allusaonlineshop.Books.Bookdepository;
import hreday.sagar.allusaonlineshop.Books.Burnandnoble;
import hreday.sagar.allusaonlineshop.Books.Chegg;
import hreday.sagar.allusaonlineshop.Books.ChristianBook;
import hreday.sagar.allusaonlineshop.Books.Goodreads;
import hreday.sagar.allusaonlineshop.Books.Kobo;
import hreday.sagar.allusaonlineshop.Books.Penguin;
import hreday.sagar.allusaonlineshop.Books.PojoClass12;
import hreday.sagar.allusaonlineshop.Books.Powel;
import hreday.sagar.allusaonlineshop.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class twelve extends Fragment {


    Adapter12 adapter;
    private RecyclerView recyclerView;
    List<PojoClass12> list;


    public twelve() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_twelve, container, false);
        recyclerView = v.findViewById(R.id.recyclerId);


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());



        adapter = new Adapter12(this, list);

        adapter.setOnItemClickListener(new Adapter12.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Audible.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(getActivity(), Bookdepository.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(getActivity(), Burnandnoble.class);
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(getActivity(), Chegg.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(getActivity(), ChristianBook.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(getActivity(), Goodreads.class);
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(getActivity(), Kobo.class);
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(getActivity(), Penguin.class);
                    startActivity(intent);

                }

                if (position == 8) {
                    Intent intent = new Intent(getActivity(), Powel.class);
                    startActivity(intent);

                }

            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.npoint.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface12 apiInterface = retrofit.create(ApiInterface12.class);
        Call<List<PojoClass12>> call=apiInterface.getName();
        call.enqueue(new Callback<List<PojoClass12>>() {
            @Override
            public void onResponse(Call<List<PojoClass12>> call, Response<List<PojoClass12>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<PojoClass12>> call, Throwable t) {

            }
        });


        return v;


    }

    private void showIt(List<PojoClass12> response) {

        Adapter12 adapter = new Adapter12(getActivity(), response);
        recyclerView.setAdapter(adapter);

    }


}
