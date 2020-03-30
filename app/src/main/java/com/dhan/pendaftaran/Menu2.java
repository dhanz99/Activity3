package com.dhan.pendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Menu2 extends AppCompatActivity {

    EditText edtNama, edtAdress, edtTelp;
    Button bSend;
    String user, adress, telp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        edtNama = findViewById(R.id.editName);
        edtAdress = findViewById(R.id.editAdress);
        edtTelp = findViewById(R.id.editTelp);
        bSend = findViewById(R.id.btn);

        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = edtNama.getText().toString();
                adress = edtAdress.getText().toString();
                telp = edtTelp.getText().toString();

                if (TextUtils.isEmpty(edtNama.getText()) || TextUtils.isEmpty(edtAdress.getText()) || TextUtils.isEmpty(edtTelp.getText())) {
                    Toast.makeText(getApplicationContext(), "Data Harus Terisi", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
