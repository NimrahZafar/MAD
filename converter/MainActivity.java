package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button insertbtn,deletebtn,updatebtn,RVButton;
    EditText Room_No, NO_of_beds;
    
    Spinner spn,sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Room_No = findViewById(R.id.Room_No);
     NO_of_beds = findViewById(R.id.no_of_beds);
      
        DBHelper dbHelper=new DBHelper();


        
  

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            route_from = R_from[position];

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        sp2 = findViewById(R.id.sp2);
        String[] r_to = {"12","22,"45"};
        ArrayAdapter type_Adap = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,r_to);
        sp2.setAdapter(type_Adap);

        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if (sel_type==null && sel_type.isEmpty() && sel_type.equals("null")){
           
//                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        insertbtn=findViewById(R.id.insert);
        insertbtn.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
        dbHelper.insertRoom(getApplicationContext(),Room_No.getText().toString(),NO_of_beds.getText().toString(),
        Room_No.setText("");
     NO_of_beds.setText("");
       
        }
        });


        RVButton=findViewById(R.id.RecyclerView);
        RVButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RVData.class);
                startActivity(i);
            }
        });



        deletebtn=findViewById(R.id.delete);
        deletebtn.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
        dbHelper.deleteRoom(getApplicationContext(),Room_No.getText().toString());
        }
        });



        updatebtn=findViewById(R.id.update);
        updatebtn.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            dbHelper.updateRoom(getApplicationContext(),Room_No.getText().toString(),NO_of_beds.getText().toString();
            Room_No.setText("");
         NO_of_beds.setText("");
        
        }
        });


    }
}