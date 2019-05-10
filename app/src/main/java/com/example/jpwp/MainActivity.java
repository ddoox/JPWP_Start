package com.example.jpwp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Zad 1 - Dodanie przycisku oraz nadanie mu id "btn" oraz przypisanie go do zmiennej


        //Zad 2 naciśnięcie przycisku ma wywoływać funkcję click()



    }

    //Zad 2 stworzenie funkcji, a w niej obiektu intent przenoszącego do nowej activity
    public void click()
    {
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
        //Zad 2
        //Intent intent = new Intent(this,com.example.jpwp.MapsActivity.class);
        //intent.putExtra();
        //startActivity();


    }
}
