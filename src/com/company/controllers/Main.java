package com.company.controllers;


import com.company.models.Movie;
import com.company.views.CmdLineView;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        DBConnect db = new DBConnect("movies.db");
        db.createNewDatabase();
        db.addTables();

        CmdLineView view =new CmdLineView();
        int num =1;
        while(num==1) {
            view.promptUserM();
            Scanner movy = new Scanner(System.in);
            String movieTitle = movy.nextLine();
            view.promptRDate();
            String rDate = movy.nextLine();
            view.promptRating();
            String movieRating = movy.nextLine();
            db.addData(movieTitle, rDate, movieRating);
            view.addMore();
            num= movy.nextInt();
        }

        ArrayList<Movie> theMovies = db.getData();
        for(Movie movie : theMovies){
            view.showMovs(movie.toString());

        }


    }
}