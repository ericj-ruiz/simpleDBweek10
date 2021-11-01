package com.company.views;


public class CmdLineView {
    public void promptUserM(){
        System.out.println("Enter a Movie:\n");
    }
    public void promptRating(){
        System.out.println("Enter Rating:\n");
    }
    public void promptRDate(){
        System.out.println("Enter Release Date:\n");
    }
    public void addMore(){
        System.out.println("Would you like to enter another Movie: Enter [1 = yes] [0 = no]\n");
    }
    public void showMovs(String movieD ){
        System.out.println(movieD);
    }
}
