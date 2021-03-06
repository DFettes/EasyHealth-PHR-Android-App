package com.example.phr;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.TextView;

public class view_height_weight extends Activity{
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
        
        setContentView(R.layout.view_height_weight);
        
        TextView addNewHeightWeight= (TextView) findViewById(R.id.add_new_height_weight);
        TextView backHeightWeight= (TextView) findViewById(R.id.back_height_weight);
        
        addNewHeightWeight.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), add_height_weight.class);
                startActivity(i); 

            }
	});
        backHeightWeight.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), profile_page.class);
                startActivity(i); 

            }
	});
	}
}
