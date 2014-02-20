package com.example.guitarbacktrackgenerator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreditsMenu extends Activity {
		Button exit;
		TextView display;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_credits_menu);
			exit = (Button) findViewById(R.id.buttonExit);
			
			exit.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent BackToMainActivity = new Intent(CreditsMenu.this, MainActivity.class);
					CreditsMenu.this.startActivity(BackToMainActivity); 
				}
			});
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
	}