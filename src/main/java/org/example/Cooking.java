package org.example;

import org.example.cook.Cook;
import org.example.cook.MenuItem;

public class Cooking {
    public Cook makeCook(MenuItem menuItem) {
        Cook cook = new Cook(menuItem);
    //    return new Cook("돈까스",5000);
        return  cook;
    }
}
