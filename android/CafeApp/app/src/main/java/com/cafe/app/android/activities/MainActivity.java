package com.cafe.app.android.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.cafe.app.android.R;
import com.cafe.app.android.fragments.CheckoutFragment;
import com.cafe.app.android.fragments.Fragment;
import com.cafe.app.android.fragments.HomeFragment;
import com.cafe.app.android.fragments.MenuFragment;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    MenuFragment frgMenu;
    CheckoutFragment frgCheckout;
    HomeFragment frgHome;

    private void createFragments() {
        frgMenu = new MenuFragment();
        frgCheckout = new CheckoutFragment();
        frgHome = new HomeFragment();
    }

    private void goTo(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.setTransition(FragmentTransaction.TRANSIT_NONE);
        transaction.replace(R.id.content, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    goTo(frgHome);
                    return true;
                case R.id.navigation_dashboard:
                    goTo(frgMenu);
                    return true;
                case R.id.navigation_notifications:
                    goTo(frgCheckout);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createFragments();

        setContentView(R.layout.activity_main);

        goTo(frgHome);
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}