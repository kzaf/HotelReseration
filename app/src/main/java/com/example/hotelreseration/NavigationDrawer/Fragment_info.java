package com.example.hotelreseration.NavigationDrawer;

//import android.R;
import com.example.hotelreseration.R;
import com.example.hotelreseration.SelectUserActivity;
import com.example.hotelreseration.R.layout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment_info extends Fragment {
    
    public View onCreateView(
            LayoutInflater inflater, 
            ViewGroup container, 
            Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_info, container, false);
        
        final TextView OwnerGuide = (TextView)rootView.findViewById(R.id.guide);
        if (SelectUserActivity.flagOwner==true){
	    			OwnerGuide.setText("Owner Guide");
        }else{      	
        	    	OwnerGuide.setText("Traveler Guide");
        }
        //OwnerGuide = (TextView)rootView.findViewById(R.id.guide);
        OwnerGuide.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View v) {
                ((MainActivity) getActivity()).OwnerGuide();            
            }  
    	    });
        final TextView AboutUs = (TextView)rootView.findViewById(R.id.changeinfo);
        AboutUs.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View v) {   	
                ((MainActivity) getActivity()).AboutUs();            
            }  
    	    });
        final TextView ContactUs = (TextView)rootView.findViewById(R.id.contactus);
        ContactUs.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View v) {   	
                ((MainActivity) getActivity()).ContactUs();            
            }  
    	    });
        final TextView ReportProblem = (TextView)rootView.findViewById(R.id.reportaproblem);
        ReportProblem.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View v) {   	
                ((MainActivity) getActivity()).ReportProblem();            
            }  
    	    });
        return rootView;
    }   
}