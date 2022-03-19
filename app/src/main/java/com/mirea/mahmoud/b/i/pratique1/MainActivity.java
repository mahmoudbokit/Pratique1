package com.mirea.mahmoud.b.i.pratique1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonOk;
    private ImageView image;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.image = (ImageView) findViewById(R.id.bird);
        this.textView = (TextView) findViewById(R.id.tvOut);
        this.buttonOk = (Button) findViewById(R.id.btnOK);
        this.buttonCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Appuiyez sur la touche OK");
            }
        };
        buttonOk.setOnClickListener(oclBtnOk);

    }
}