package com.example.event_manager.activities.compositeStrategyFilter;

import android.util.Log;


import com.example.event_manager.activities.EventMaker.Event;

import java.util.ArrayList;

public class BusinessFilter extends FilterStrategy {

    @Override
    public ArrayList<Event> filter(ArrayList<Event> eventList) {
        if(filteredList!=null){
            filteredList.clear();

        }
        for(Event e:eventList){
            if(e.category.equals("Business")){
                filteredList.add(e);
                Log.d("filteredList","afterfilteredaddedevent"+e.toString());
            }
        }
        return filteredList;
    }
}