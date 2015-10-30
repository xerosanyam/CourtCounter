package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int scoreA=0,scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void displayForTeamA(){
        TextView scoreView=(TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    private void displayForTeamB(){
        TextView scoreView=(TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
    public void incBy3_A(View view){
        scoreA+=3;
        displayForTeamA();
    }
    public void incBy2_A(View view){
        scoreA+=2;
        displayForTeamA();
    }
    public void incBy1_A(View view){
        scoreA+=1;
        displayForTeamA();
    }
    public void incBy3_B(View view){
        scoreB+=3;
        displayForTeamB();
    }
    public void incBy2_B(View view){
        scoreB+=2;
        displayForTeamB();
    }
    public void incBy1_B(View view){
        scoreB+=1;
        displayForTeamB();
    }
    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA();
        displayForTeamB();
    }
}
