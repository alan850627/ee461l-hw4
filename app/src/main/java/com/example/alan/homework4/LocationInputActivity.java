package com.example.alan.homework4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class LocationInputActivity extends AppCompatActivity {
    public static String GOOGLE_API_KEY = "";
    public final static String ADDRESS_MESSAGE = "com.example.alan.homework4.ADDRESS";
    public final static String LNG_MESSAGE = "com.example.alan.homework4.LNG";
    public final static String LAT_MESSAGE = "com.example.alan.homework4.LAT";

    public Intent newIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_input);
        GOOGLE_API_KEY = getResources().getString(R.string.google_maps_key);
    }

    /** Called when the user clicks the Send button */
    public void sendLocation(View view){
        newIntent = new Intent(this, MapsActivity.class);
        EditText editText =(EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        newIntent.putExtra(ADDRESS_MESSAGE, message);
        startActivity(newIntent);
    }
}
