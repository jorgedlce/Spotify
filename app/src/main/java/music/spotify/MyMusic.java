package music.spotify;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import music.spotify.fragments.AmigosFragment;
import music.spotify.fragments.DestacadosFragment;
import music.spotify.fragments.ProfileFragment;

public class MyMusic extends AppCompatActivity {

    private Fragment[] fragments = new Fragment[]{
        new DestacadosFragment(),
        new AmigosFragment(),
        new ProfileFragment()
    };
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager)findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(mViewPager);
        //pro

    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments[position];

        }

        @Override
        public int getCount() {
            return 4;
        }
        /*
        @Override
        public boolean isViewFromObject(View view, Object object) {
            return false;
        }
        */
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Destacados";
                case 1:
                    return "Amigos";
                case 2:
                    return "Perfil";
                case 3:
                    return "Perfil";

            }
            return null;
        }
    }
}
