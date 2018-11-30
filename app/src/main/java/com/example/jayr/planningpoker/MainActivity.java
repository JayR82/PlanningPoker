package com.example.jayr.planningpoker;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        private LinearLayout mLinearLayout;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            TextView textView2 = (TextView) rootView.findViewById(R.id.textView3);
            mLinearLayout = (LinearLayout)rootView.findViewById(R.id.LinearLayout);

            int iPage;
            iPage = getArguments().getInt(ARG_SECTION_NUMBER);
            switch(iPage){
                case 1:
                    mLinearLayout.setBackgroundColor(Color.rgb(204, 204, 179));
                    textView2.setText(" 1");
                    textView.setText("XXS");
                    break;
                case 2:
                    mLinearLayout.setBackgroundColor(Color.rgb(51, 153, 255));
                    textView2.setText(" 2");
                    textView.setText("XS");
                    break;
                case 3:
                    mLinearLayout.setBackgroundColor(Color.rgb(0, 0, 153));
                    textView2.setText(" 3");
                    textView.setText("S");
                    break;
                case 4:
                    mLinearLayout.setBackgroundColor(Color.rgb(0, 102, 0));
                    textView2.setText(" 5");
                    textView.setText("M");
                    break;
                case 5:
                    mLinearLayout.setBackgroundColor(Color.rgb(102, 255, 51));
                    textView2.setText(" 8");
                    textView.setText("L");
                    break;
                case 6:
                    mLinearLayout.setBackgroundColor(Color.rgb(255, 204, 0));
                    textView2.setText("13");
                    textView.setText("XL");
                    break;
                case 7:
                    mLinearLayout.setBackgroundColor(Color.rgb(255, 51, 0));
                    textView2.setText("21");
                    textView.setText("XXL");
                    break;
                case 8:
                    mLinearLayout.setBackgroundColor(Color.rgb(255, 0, 0));
                    textView2.setText("34");
                    textView.setText("3XL");
                    break;
                case 9:
                    mLinearLayout.setBackgroundColor(Color.rgb(0, 0, 0));
                    textView2.setText("");
                    textView.setText("0");
                    break;
                case 10:
                    mLinearLayout.setBackgroundColor(Color.rgb(0, 0, 0));
                    textView2.setText("");
                    textView.setText("?");
                    break;
            }

            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 10 total pages.
            return 10;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
                case 3:
                    return "SECTION 4";
                case 4:
                    return "SECTION 5";
                case 5:
                    return "SECTION 6";
                case 6:
                    return "SECTION 7";
                case 7:
                    return "SECTION 8";
                case 8:
                    return "SECTION 9";
                case 9:
                    return "SECTION 10";

            }
            return null;
        }
    }
}
