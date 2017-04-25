package com.example.hotelreseration.NavigationDrawer;

import com.example.hotelreseration.R;
import com.example.hotelreseration.R.layout;
import com.example.hotelreseration.SelectUserActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_reservations extends Fragment {
	private FragmentTabHost mTabHost;

    //Mandatory Constructor
    public Fragment_reservations() {
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_reservations,container, false);


        mTabHost = (FragmentTabHost)rootView.findViewById(android.R.id.tabhost);
        mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.realtabcontent);
        
        if(SelectUserActivity.flagOwner==true){
        	mTabHost.addTab(mTabHost.newTabSpec("fragmentb").setIndicator("Running"),
                    Fragment_Running.class, null);
            mTabHost.addTab(mTabHost.newTabSpec("fragmentc").setIndicator("Upcoming"),
                    Fragment_Upcoming.class, null);

        }else{
        	mTabHost.addTab(mTabHost.newTabSpec("fragmentb").setIndicator("Search"),
                    Fragment_Search.class, null);
            mTabHost.addTab(mTabHost.newTabSpec("fragmentc").setIndicator("Booked"),
                    Fragment_Booked.class, null);
            mTabHost.addTab(mTabHost.newTabSpec("fragmentd").setIndicator("Favorite"),
                    Fragment_Favorite.class, null);
        }

        return rootView;
    }
}