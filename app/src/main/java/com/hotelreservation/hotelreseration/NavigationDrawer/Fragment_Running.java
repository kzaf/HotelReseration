package com.hotelreservation.hotelreseration.NavigationDrawer;

import java.util.ArrayList;
import java.util.HashMap;
import com.hotelreservation.hotelreseration.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import static com.hotelreservation.hotelreseration.NavigationDrawer.MainActivity.dboFKey;

public class Fragment_Running extends Fragment {

	static ArrayList<HashMap<String,String>> records = new ArrayList<>();
	static ListView RunninglistView;
	static SimpleAdapter adapter;
	static TextView txt;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
        View view = inflater.inflate(R.layout.fragment_owner_running, container,false);

		RunninglistView = (ListView) view.findViewById(R.id.runningResList);
	    txt=(TextView) view.findViewById(R.id.nobookingtxt);

		adapter = new SimpleAdapter(getActivity(), records, R.layout.mytextview, new String[] {"HotelandTravelertitle","dates"}, new int[] {R.id.tv,R.id.sub});

		RunninglistView.setAdapter(adapter);// Assign adapter to ListView

        ((MainActivity) getActivity()).loadOwnerReservations(dboFKey);

        txt.setVisibility(RunninglistView.getCount() == 0 ? View.VISIBLE : View.GONE);
	    
	    return view;
	}
}