package hreday.sagar.allusaonlineshop.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import hreday.sagar.allusaonlineshop.Fragments.eight;
import hreday.sagar.allusaonlineshop.Fragments.eleven;
import hreday.sagar.allusaonlineshop.Fragments.five;
import hreday.sagar.allusaonlineshop.Fragments.four;
import hreday.sagar.allusaonlineshop.Fragments.nine;
import hreday.sagar.allusaonlineshop.Fragments.one;
import hreday.sagar.allusaonlineshop.Fragments.seven;
import hreday.sagar.allusaonlineshop.Fragments.six;
import hreday.sagar.allusaonlineshop.Fragments.ten;
import hreday.sagar.allusaonlineshop.Fragments.three;
import hreday.sagar.allusaonlineshop.Fragments.twelve;
import hreday.sagar.allusaonlineshop.Fragments.two;
import hreday.sagar.allusaonlineshop.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public static TabLayout tabLayout;
    public static ViewPager viewPager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        viewPager = root.findViewById(R.id.viewpager);
        tabLayout = root.findViewById(R.id.tab);

        MypagerAdapter mypagerAdapter = new MypagerAdapter(getFragmentManager());
        viewPager.setAdapter(mypagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        //  viewPager.setOffscreenPageLimit(7);

        return root;
    }


    class MypagerAdapter extends FragmentStatePagerAdapter {


        String[] name = {"Shopping","Fashion","Food","Home Rentals","Baby & Toys","Furniture","Electronics","News","Pet Supplies","Travel","Pharmacy","Books"};
        Integer array = 12;


        public MypagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }


        @NonNull
        @Override
        public Fragment getItem(int position) {

            switch (position) {

                case 0:
                    one tab1 = new one();
                    return tab1 ;
                case 1:
                    two tab2 = new two();
                    return tab2 ;
                case 2:
                    three tab3 = new three();
                    return tab3 ;
                case 3:
                    four tab4 = new four();
                    return tab4 ;

                case 4:
                    five tab5 = new five();
                    return tab5 ;
                case 5:
                    six ta = new six();
                    return ta ;
                case 6:
                    seven tab31 = new seven();
                    return tab31 ;

                case 7:
                    eight tab32 = new eight();
                    return tab32 ;


                case 8:
                   nine tn = new nine();
                    return tn ;

                case 9:
                    ten ttn = new ten();
                    return ttn ;


                case 10:
                    eleven tr = new eleven();
                    return tr ;


                case 11:
                   twelve tr2 = new twelve();
                    return tr2 ;
            }


            return null;
        }

        @Override
        public int getCount() {
            return name.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return name[position];
        }
    }


}