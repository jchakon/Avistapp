package chacon.joan.avistapp;

import android.app.Notification;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Chako on 20/12/2015.
 */

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Chako on 20/12/2015.
 */
public class ave1 extends ActionBarActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {
    private ViewPager viewPagerave1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ave1);

        viewPagerave1 = (ViewPager) findViewById(R.id.pagerave1);
        PagerAdapter adapterave1 = new PagerAdapter(getSupportFragmentManager());
        viewPagerave1.setAdapter(adapterave1);

        viewPagerave1.setOnPageChangeListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        android.support.v7.app.ActionBar.Tab tab = actionBar.newTab().setText("Foto").setTabListener(this);
        actionBar.addTab(tab);

        tab = actionBar.newTab().setText("Descripción").setTabListener(this);
        actionBar.addTab(tab);


    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        getSupportActionBar().setSelectedNavigationItem(position);

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabSelected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {
        viewPagerave1.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }

    public class PagerAdapter extends FragmentPagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new fotoave1fragment();
                case 1:
                    return new descripcionave1fragment();

                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 2; //Se retorna el numero total de fragments de la app
        }
    }

}