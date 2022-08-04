package sg.edu.rp.c346.id20039583.demodialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button btnDemo1, btnDemo2, btnDemo3, btnExercise,btnDemo4,btnDemo5;
    TextView tvDemo2, tvNeg, tvDemo3, tvInput, tvNum, tvNum2, tvEx,tvDemo4,tvDemo5;
    EditText etInput, etNum, etNum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btnDemo1 = findViewById(R.id.ButtonDemo1);
         btnDemo2 = findViewById(R.id.buttonDemo2);
         btnDemo3 = findViewById(R.id.buttonDemo3);
         btnDemo4 = findViewById(R.id.buttonDemo4);
        btnDemo5 = findViewById(R.id.buttonDemo5);
         tvDemo2 = findViewById(R.id.textViewDemo2);
         tvNeg = findViewById(R.id.textViewNeg);
         tvDemo3 = findViewById(R.id.textViewDemo3);
         tvInput = findViewById(R.id.textViewInput);
         tvNum = findViewById(R.id.textViewNum);
         tvNum2 = findViewById(R.id.textViewNum2);
         tvEx = findViewById(R.id.textViewExercise);
         etInput = findViewById(R.id.editTextInput);
         btnExercise = findViewById(R.id.buttonExercise3);
         etNum = findViewById(R.id.editTextNum);
         etNum2 = findViewById(R.id.editTextNum2);
         tvDemo4 = findViewById(R.id.textViewDemo4);
        tvDemo5 = findViewById(R.id.textViewDemo5);


         //First Demo Button
         btnDemo1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 //Create the dialog builder
                 AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                 //Setting Dialog Details
                /* myBuilder.setTitle("Demo 1-Simple Dialog");
                 myBuilder.setMessage("I can develop Android App. ");
                 myBuilder.setCancelable(false);
                 myBuilder.setPositiveButton("Close",null);

                 AlertDialog myDialog = myBuilder.create();
                 myDialog.show(); */

                 myBuilder.setTitle("Congratulations");
                 myBuilder.setMessage("You have completed a simple Dialog box. ");
                 myBuilder.setCancelable(false);
                 myBuilder.setPositiveButton("Close",null);

                 AlertDialog myDialog = myBuilder.create();
                 myDialog.show();

             }
         });


         //Second Demo Button
        btnDemo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                myBuilder.setTitle("Demo 2 Button Dialog");
                myBuilder.setMessage("Select one of the buttons below. ");
                myBuilder.setCancelable(false);


                //Configure the 'positive' button
                myBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        tvDemo2.setText("You have selected Yes. ");
                    }
                });
                 //Configure the 'negative' button
                myBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        tvNeg.setText("You have selected No.");
                    }
                });



                //Configure the 'neutral' button
                myBuilder.setNeutralButton("Cancel", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }


        });
        //Third Demo button
                 btnDemo3.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         LayoutInflater inflater =
                                 (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                         View viewDialog = inflater.inflate(R.layout.input, null);


                         //obtain ui componenet in the input.xml layout
                         //it needs to be defined as "final", so that it can be used in the onCLick

                         final EditText etInput = viewDialog.findViewById(R.id.editTextInput);

                         AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                         myBuilder.setView(viewDialog);
                         myBuilder.setTitle("Demo 3-Text Input Dialog");
                         myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialogInterface, int i) {
                                 //Extract the text entered by the user
                                 String message = etInput.getText().toString();
                                 //set tje text to the TextView
                                 tvDemo3.setText(message);
                             }
                         });
                         myBuilder.setNegativeButton("CANCEL", null);
                         AlertDialog myDialog = myBuilder.create();
                         myDialog.show();
                     }
                 });
                 //Exercise 3
                 btnExercise.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         LayoutInflater inflater =
                                 (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                         View viewDialog = inflater.inflate(R.layout.input_exercise, null);

                         final EditText etNum = viewDialog.findViewById(R.id.editTextNum);
                         final EditText etNum2 = viewDialog.findViewById(R.id.editTextNum2);

                         AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                         myBuilder.setView(viewDialog);
                         myBuilder.setTitle("Exercise 3");
                         myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                             @Override
                             public void onClick(DialogInterface dialogInterface, int i) {

                                 String message = etNum.getText().toString();
                                 String message2 = etNum2.getText().toString();

                                 tvEx.setText(message + message2);



                             }
                         });
                         myBuilder.setNegativeButton("CANCEL", null);
                         AlertDialog myDialog = myBuilder.create();
                         myDialog.show();
                     }
                 });


                 //Fourth Demo button
                 btnDemo4.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {

                         DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
                             @Override
                             public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {


                             }
                         };

                         DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this,
                                 myDateListener, 2014, 11, 31);
                         myDateDialog.show();
                     }
                 });

                 //Fifth Demo button
                 btnDemo5.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         TimePickerDialog.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
                             @Override
                             public void onTimeSet(TimePicker timePicker, int hourofDay, int minute) {
                                 tvDemo5.setText("Time: " + hourofDay + ":" + minute);

                             }
                         };

                         Calendar now = Calendar.getInstance();
                         int hourOfDay = now.get(Calendar.HOUR_OF_DAY);  // Current Hour
                         int minute = now.get(Calendar.MINUTE);  // Current Minute
                         TimePickerDialog myTimeDialog = new TimePickerDialog(MainActivity.this,
                                 myTimeListener, hourOfDay, minute, false);


                         myTimeDialog.show();

                     }
                 });







    }
}