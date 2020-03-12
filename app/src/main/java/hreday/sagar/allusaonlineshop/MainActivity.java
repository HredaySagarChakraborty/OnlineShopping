package hreday.sagar.allusaonlineshop;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;

import java.util.List;

import hreday.sagar.allusaonlineshop.Fashionss.Adapter2;
import hreday.sagar.allusaonlineshop.Fashionss.PojoClass2;
import hreday.sagar.allusaonlineshop.Shop.Adapter;
import hreday.sagar.allusaonlineshop.Shop.Aliexpress;
import hreday.sagar.allusaonlineshop.Shop.AmazonActivity;
import hreday.sagar.allusaonlineshop.Shop.AmericanEagle;
import hreday.sagar.allusaonlineshop.Shop.Athleta;
import hreday.sagar.allusaonlineshop.Shop.Banggood;
import hreday.sagar.allusaonlineshop.Shop.BestBuy;
import hreday.sagar.allusaonlineshop.Shop.Carters;
import hreday.sagar.allusaonlineshop.Shop.Depot;
import hreday.sagar.allusaonlineshop.Shop.Dicks;
import hreday.sagar.allusaonlineshop.Shop.Ebay;
import hreday.sagar.allusaonlineshop.Shop.Etsy;
import hreday.sagar.allusaonlineshop.Shop.Groupon;
import hreday.sagar.allusaonlineshop.Shop.Lowes;
import hreday.sagar.allusaonlineshop.Shop.Newegg;
import hreday.sagar.allusaonlineshop.Shop.Petsmart;
import hreday.sagar.allusaonlineshop.Shop.PojoClass;
import hreday.sagar.allusaonlineshop.Shop.Sears;
import hreday.sagar.allusaonlineshop.Shop.Staples;
import hreday.sagar.allusaonlineshop.Shop.Target;
import hreday.sagar.allusaonlineshop.Shop.Walgreen;
import hreday.sagar.allusaonlineshop.Shop.Walmart;
import hreday.sagar.allusaonlineshop.Shop.Za;

public class MainActivity extends AppCompatActivity {

    Adapter myAdapter;
    // Context context;

    List<PojoClass> list;

    Adapter2 myAdapter2;
    // Context context;

    List<PojoClass2> list2;
    private RecyclerView recyclerView;

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        isOnline();

        myAdapter = new Adapter(this, list);

        myAdapter.setOnItemClickListener(new Adapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, AmazonActivity.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, Ebay.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, BestBuy.class);
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(MainActivity.this, Depot.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(MainActivity.this, Walmart.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(MainActivity.this, Etsy.class);
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(MainActivity.this, Aliexpress.class);
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(MainActivity.this, AmericanEagle.class);
                    startActivity(intent);

                }

                if (position == 8) {
                    Intent intent = new Intent(MainActivity.this, Banggood.class);
                    startActivity(intent);

                }

                if (position == 9) {
                    Intent intent = new Intent(MainActivity.this, Groupon.class);
                    startActivity(intent);

                }


                if (position == 10) {
                    Intent intent = new Intent(MainActivity.this, Walgreen.class);
                    startActivity(intent);

                }

                if (position == 11) {
                    Intent intent = new Intent(MainActivity.this, Target.class);
                    startActivity(intent);

                }

                if (position == 12) {
                    Intent intent = new Intent(MainActivity.this, Carters.class);
                    startActivity(intent);

                }

                if (position == 13) {
                    Intent intent = new Intent(MainActivity.this, Athleta.class);
                    startActivity(intent);

                }

                if (position == 14) {
                    Intent intent = new Intent(MainActivity.this, Newegg.class);
                    startActivity(intent);

                }

                if (position == 15) {
                    Intent intent = new Intent(MainActivity.this, Lowes.class);
                    startActivity(intent);

                }

                if (position == 16) {
                    Intent intent = new Intent(MainActivity.this, Staples.class);
                    startActivity(intent);

                }


                if (position == 17) {
                    Intent intent = new Intent(MainActivity.this,Za.class);
                    startActivity(intent);

                }
                if (position == 18) {
                    Intent intent = new Intent(MainActivity.this, Petsmart.class);
                    startActivity(intent);

                }
                if (position == 19) {
                    Intent intent = new Intent(MainActivity.this, Dicks.class);
                    startActivity(intent);

                }
                if (position == 20) {
                    Intent intent = new Intent(MainActivity.this, Sears.class);
                    startActivity(intent);

                }







            }
        });




        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.action_settings){

            //    Intent intent=new Intent(Intent.ACTION_SEND);
            //    intent.setType("text/plain");

            //   String subject="We have tried to give you the best online services in one app";
            //   String text="It is the best apps for online shopping in USA.";

            //     intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            //  intent.putExtra(Intent.EXTRA_TEXT,text);


            //  startActivity(Intent.createChooser(intent,"Share with"));

            //  Intent intent = new Intent(Intent.ACTION_VIEW);
            // intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=io.kodular.bsdeora55520.germanyonline"));
            //  startActivity(intent);

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            String shareSubText = "USA Online Shopping Apps";
            String shareBodyText = "https://play.google.com/store/apps/details?id=hreday.sagar.allusaonlineshop";
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubText);
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(shareIntent, "Share With"));
        }
        else if(item.getItemId()==R.id.action_setting){

            try {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=" + "hreday.sagar.allusaonlineshop")));
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
            }
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Rate Us");
        builder.setIcon(R.drawable.logo);
        builder.setMessage("Click on the 'Rate Us' button to give your valuable opinion and 5 star ratings. Click 'Exit' button to get out!")
                .setPositiveButton("Rate Us", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        String url = "https://play.google.com/store/apps/details?id=hreday.sagar.allusaonlineshop";
                        Intent up = new Intent(Intent.ACTION_VIEW);
                        up.setData(Uri.parse(url));
                        startActivity(up);
                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //  Action for 'NO' Button
                        dialog.cancel();

                    }
                })

                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }


                });
        AlertDialog alert = builder.create();
        alert.show();

    }



    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }



    public boolean isOnline() {
        ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        if(netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()){
            //   Toast.makeText(this, "No Internet connection!", Toast.LENGTH_LONG).show();

            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setTitle("Please Check Your Internet Connection");
            builder.setMessage("Turn on internet connection to continue");
            builder.setPositiveButton("Retry", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    //whatever should be done when answering "YES" goes here
                    //getContent(address);
                }
            });
            builder.setNegativeButton("close", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }

            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            return false;
        }
        return true;
    }
}
