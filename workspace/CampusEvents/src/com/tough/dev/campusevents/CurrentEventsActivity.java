package com.tough.dev.campusevents;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class CurrentEventsActivity extends ListActivity {

	static String [] info = {"Current Event 1","Current Event 2","Current Event 3","Current Event 4"};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_current_events);
		info = EventProvider.getAllEvents();
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getApplicationContext(), android.R.layout.simple_list_item_1, info);
		setListAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.current_events, menu);
		return true;
	}

}
