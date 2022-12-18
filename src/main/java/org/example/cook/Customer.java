package org.example.cook;


public class Customer {

    public void order(String menuName, Menu menu, Cooking cooking){
        MenuItem item = menu.choose(menuName);
        Cook cook = cooking.makeCook(item);
    }
}
