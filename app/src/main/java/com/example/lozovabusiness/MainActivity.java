package com.example.lozovabusiness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.xmlpull.v1.XmlPullParser;

public class MainActivity extends AppCompatActivity {

    private EditText etName, etAddress, etKved, etStan;
    private Button btnSave, btnRead;
    private DatabaseReference myDB;
    private String BUSINESS_KEY = "business"; // имя таблицы

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        XmlPullParser xpp = getResources().getXml(R.xml.fop1);
//        BuisnessItemParser parser = new BuisnessItemParser();
//        if(parser.parse(xpp))
//        {
//            for(BusinessItem prod: parser.getBuisnessItem()){
//                System.out.println(prod.toString());
//                Log.d("XML", prod.toString());
//            }
//        }
        init();
    }

    public void init() {
        etName = findViewById(R.id.etName);
        etAddress = findViewById(R.id.etAddress);
        etKved = findViewById(R.id.etKved);
        etStan = findViewById(R.id.etStan);
        btnSave = findViewById(R.id.btnSave);
        btnRead = findViewById(R.id.btnRead);
        myDB = FirebaseDatabase.getInstance().getReference(BUSINESS_KEY);
    }

    public void onClickSave(View view) {
        String id = myDB.getKey();
        String name = etName.getText().toString();
        String address = etAddress.getText().toString();
        String kved = etKved.getText().toString();
        String stan = etStan.getText().toString();
        BusinessItem businessItem = new BusinessItem(id, name, address, kved, stan);
        myDB.push().setValue(businessItem);
    }

    public void onClickRead(View view) {

    }
}