package com.tough.dev.campusevents;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ClubEventsActivity extends ListActivity {

	static String[] info = {"Club Event 1","Club Event 2","Club Event 3","Club Event 4"};
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_events);
        info = EventProvider.getClubEvents();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getApplicationContext(), android.R.layout.simple_list_item_1, info);
		setListAdapter(adapter);
    }
	
}
