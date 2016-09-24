package com.example.haams.myapplication.Pictures;

import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.haams.myapplication.MainActivity;
import com.example.haams.myapplication.R;
import com.squareup.picasso.Picasso;

/**
 * Created by haams on 2016-09-17.
 */
public class Food_Pictures {
    MainActivity mActivity;

    public Food_Pictures(MainActivity mActivity) {
        this.mActivity = mActivity;
        Log.i("foods", "foods234");
        fillViews();
    }

    private void fillViews() {
        Log.i("foods", "foods2345");
        Glide.with(mActivity)
                .load(R.drawable.food1)
                .centerCrop()
                .placeholder(R.drawable.food1)
                .into((ImageView) mActivity.findViewById(R.id.f_Image1));

        Glide.with(mActivity)
                .load("http://cfile206.uf.daum.net/image/12413B3E4EFF6E4E2D711A")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image2));

        Glide.with(mActivity)
                .load("http://image.hankookilbo.com/i.aspx?Guid=85764ac4f2354394ac00d26daed2d4f1&Month=DirectUpload&size=640")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image3));


        Glide.with(mActivity)
                .load("http://cfile29.uf.tistory.com/image/2673114B51DA22D81D9575")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image4));


        Glide.with(mActivity)
                .load("http://cfile5.uf.tistory.com/image/265314375278AE6F01B083")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image5));


        Glide.with(mActivity)
                .load("http://cfile236.uf.daum.net/image/1701F4044CCEC9EE04A7F8")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image6));

        Glide.with(mActivity)
                .load("http://cfile10.uf.tistory.com/image/121A724150EE58041CD216")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image7));
    }
}
