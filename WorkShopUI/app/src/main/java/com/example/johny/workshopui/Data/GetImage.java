package com.example.johny.workshopui.Data;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.InputStream;
import java.lang.reflect.GenericArrayType;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
 * Created by Johny on 11-Oct-17.
 */

public class GetImage {

    public Observable<Bitmap> getImage(String url)
    {
        return Observable.create(e -> {
            OkHttpClient client = new OkHttpClient();

            Request req = new Request.Builder()
                    .url(url)
                    .build();

            Response res = client.newCall(req).execute();
            InputStream result = res.body().byteStream();

            Bitmap bitMap = BitmapFactory.decodeStream(result);

            e.onNext(bitMap);
        });
    }
}
