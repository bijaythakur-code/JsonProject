package com.biijay.jsonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
//        Student student = new Student("Bijay", 5, "bijaythakur330@gmail.com");
//
//        String json = gson.toJson(student);

//        String json = "{\"course_count\":5,\"email\":\"bijaythakur330@gmail.com\",\"name\":\"Bijay\"}";
//        Student student = gson.fromJson(json, Student.class);
//
//        Log.d("Test", student.toString());

        List<Video> videos = new ArrayList<>();
        videos.add(new Video("Intro", 4));
        videos.add(new Video("Exercise files", 8));
        videos.add(new Video("Installation", 12));

        Course course = new Course("Java", "Bootcamp");
        Student student = new Student("bijay", 3, "bijaythakur330@gamil.com", course, videos);
        String json = gson.toJson(student);

//        String json = "{\"course_count\":3,\"email\":\"bijaythakur330@gamil.com\",\"course\":{\"description\":\"Bootcamp\",\"name\":\"Java\"},\"name\":\"bijay\"}";
//        Student student = gson.fromJson(json, Student.class);

//        Log.d("Test", student.toString());
        Log.d("Test", json);

    }
}
