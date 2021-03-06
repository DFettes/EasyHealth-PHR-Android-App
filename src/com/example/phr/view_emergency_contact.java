package com.example.phr;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.TextView;

public class view_emergency_contact extends Activity{
	String userID;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences settings = getSharedPreferences("userData", 0);
		userID = settings.getString("userID", "string");
         if (android.os.Build.VERSION.SDK_INT > 9) {
        	StrictMode.ThreadPolicy policy = 
        	        new StrictMode.ThreadPolicy.Builder().permitAll().build();
        	StrictMode.setThreadPolicy(policy);
        	} 
        // setting default screen to login.xml
        
        setContentView(R.layout.view_emergency_contact);
        
        TextView addNewEmergencyContact= (TextView) findViewById(R.id.add_new_emergency_contact);
        TextView backEmergencyContact= (TextView) findViewById(R.id.back_emergency_contact);
        
        addNewEmergencyContact.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), add_emergency_contact.class);
                startActivity(i); 

            }
	});
        backEmergencyContact.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), profile_page.class);
                startActivity(i); 

            }
	});
	}
}
