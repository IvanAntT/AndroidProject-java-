package com.example.johny.workshopui.Data;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableZip;

/**
 * Created by Johny on 10-Oct-17.
 */

public  class  GetFood {


    public Observable<ArrayList<Food>> getFood()
    {

        return Observable.create(e -> {
            TimeUnit.SECONDS.sleep(5);

            ArrayList<Food> list = new ArrayList<>();
            list.add(new Food("Kartog","http://www.bulgarian-kitchen.com/statii/36/1.jpg",23));
            list.add(new Food("Chushka","http://www.bulgarian-kitchen.com/statii/36/1.jpg",33));
            list.add(new Food("Domat","http://www.bulgarian-kitchen.com/statii/36/1.jpg",43));
            list.add(new Food("Carevica","http://www.bulgarian-kitchen.com/statii/36/1.jpg",53));
            list.add(new Food("Meso","http://www.bulgarian-kitchen.com/statii/36/1.jpg",63));
            list.add(new Food("Kartog","http://www.bulgarian-kitchen.com/statii/36/1.jpg",23));
            list.add(new Food("Chushka","http://www.bulgarian-kitchen.com/statii/36/1.jpg",33));
            list.add(new Food("Domat","http://www.bulgarian-kitchen.com/statii/36/1.jpg",43));
            list.add(new Food("Carevica","http://www.bulgarian-kitchen.com/statii/36/1.jpg",53));
            list.add(new Food("Meso","http://www.bulgarian-kitchen.com/statii/36/1.jpg",63));
            list.add(new Food("Kartog","http://www.bulgarian-kitchen.com/statii/36/1.jpg",23));
            list.add(new Food("Chushka","http://www.bulgarian-kitchen.com/statii/36/1.jpg",33));
            list.add(new Food("Domat","http://www.bulgarian-kitchen.com/statii/36/1.jpg",43));
            list.add(new Food("Carevica","http://www.bulgarian-kitchen.com/statii/36/1.jpg",53));
            list.add(new Food("Meso","http://www.bulgarian-kitchen.com/statii/36/1.jpg",63));
            e.onNext(list);
        });

    }
}
