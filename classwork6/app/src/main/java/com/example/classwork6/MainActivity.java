package com.example.classwork6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    ArrayList<Students> students = new ArrayList<>();

    int jenan = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView studentName , studentAge , studentGrade;
        ImageView studentPhoto;
        Button Next ;


        studentName  = findViewById(R.id.TextName);
        studentAge   = findViewById(R.id.TextAge);
        studentGrade = findViewById(R.id.TextGrade);
        studentPhoto = findViewById(R.id.StudentsImage);
        Next         = findViewById(R.id.NextButton);





        Students s1 = new Students("Mohammad",17,11,R.drawable.boy);
        Students s2 = new Students("Habiba",16,10,R.drawable.girl);
        Students s3 = new Students("Salman",18,12,R.drawable.boy1);
        Students s4 = new Students("Hamad", 15,9,R.drawable.boy2);
        Students s5 = new Students("Jawan",13,7,R.drawable.girl1);
        Students s6 = new Students("Dana",14,8,R.drawable.girl2);



        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);



        studentName.setText(students.get(jenan).getStudentName());
        studentAge.setText(String.valueOf(students.get(jenan).getStudentAge()));
        studentGrade.setText(String.valueOf(students.get(jenan).getStudentGrade()));
        studentPhoto.setImageResource(students.get(jenan).getStudentPhoto());






        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jenan++;


                //bonus
                if (jenan==students.size()){

                    jenan=0;
                }

                studentName.setText(students.get(jenan).getStudentName());
                studentAge.setText(String.valueOf(students.get(jenan).getStudentAge()));
                studentGrade.setText(String.valueOf(students.get(jenan).getStudentGrade()));
                studentPhoto.setImageResource(students.get(jenan).getStudentPhoto());






;
                }

        });



    }
}