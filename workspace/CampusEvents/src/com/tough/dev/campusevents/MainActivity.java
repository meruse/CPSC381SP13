package com.tough.dev.campusevents;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		EventProvider.loadEvents();
		setContentView(R.layout.main);

		TabHost tabHost = getTabHost();

		TabSpec currentEventsSpec = tabHost.newTabSpec("Current Events");
		// setting Title and Icon for the Tab
		currentEventsSpec.setIndicator("Current Events");
		Intent currentEventsIntent = new Intent(this, CurrentEventsActivity.class);
		currentEventsSpec.setContent(currentEventsIntent);
		
		TabSpec clubEventsSpec = tabHost.newTabSpec("Current Events");
		// setting Title and Icon for the Tab
		clubEventsSpec.setIndicator("Club Events");
		Intent clubEventsIntent = new Intent(this, ClubEventsActivity.class);
		clubEventsSpec.setContent(clubEventsIntent);
		
		tabHost.addTab(currentEventsSpec);
		tabHost.addTab(clubEventsSpec);
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.current_events, menu);
		return true;
	}

}
