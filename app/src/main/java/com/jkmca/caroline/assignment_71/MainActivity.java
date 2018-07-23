package com.jkmca.caroline.assignment_71;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /*intialising variables*/
    EditText searchet;
    Button searchbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*typecasting the variables*/
        searchet = (EditText) findViewById(R.id.searchet);
        searchbtn = (Button) findViewById(R.id.button1);
        /*setting the OnClickListener on the search button*/

        searchbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*getting the query inputs into string format*/
                String searchinput = searchet.getText().toString();
                /*creating the implicit intent to open google*/
                Intent Googlesearch = new Intent(Intent.ACTION_WEB_SEARCH);
                Googlesearch.putExtra(SearchManager.QUERY, searchinput);
                /*starting the implicit intent */
                startActivity(Googlesearch);
            }
        });

    }
}


