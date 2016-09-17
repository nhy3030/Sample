package com.example.haams.myapplication.Pictures;

import android.util.Log;
import android.widget.ImageView;

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
        Log.i("foods","foods234");
        fillViews();
    }

    private void fillViews() {
        Log.i("foods","foods2345");
        Picasso.with(mActivity)
                .load(R.drawable.food1)
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.f_Image1));
        Picasso.with(mActivity)
                .load(R.drawable.food1)
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image1));

        Picasso.with(mActivity)
                .load("http://cfile206.uf.daum.net/image/12413B3E4EFF6E4E2D711A")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.f_Image2));
        Picasso.with(mActivity)
                .load("http://cfile206.uf.daum.net/image/12413B3E4EFF6E4E2D711A")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image2));

        Picasso.with(mActivity)
                .load("http://image.hankookilbo.com/i.aspx?Guid=85764ac4f2354394ac00d26daed2d4f1&Month=DirectUpload&size=640")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.f_Image3));
        Picasso.with(mActivity)
                .load("http://image.hankookilbo.com/i.aspx?Guid=85764ac4f2354394ac00d26daed2d4f1&Month=DirectUpload&size=640")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image3));

        Picasso.with(mActivity)
                .load("http://cfile29.uf.tistory.com/image/2673114B51DA22D81D9575")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.f_Image4));
        Picasso.with(mActivity)
                .load("http://cfile29.uf.tistory.com/image/2673114B51DA22D81D9575")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image4));

        Picasso.with(mActivity)
                .load("http://cfile5.uf.tistory.com/image/265314375278AE6F01B083")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.f_Image5));
        Picasso.with(mActivity)
                .load("http://cfile5.uf.tistory.com/image/265314375278AE6F01B083")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image5));

        Picasso.with(mActivity)
                .load("http://cfile236.uf.daum.net/image/1701F4044CCEC9EE04A7F8")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.f_Image6));
        Picasso.with(mActivity)
                .load("http://cfile236.uf.daum.net/image/1701F4044CCEC9EE04A7F8")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image6));
        Picasso.with(mActivity)
                .load("http://cfile10.uf.tistory.com/image/121A724150EE58041CD216")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.f_Image7));
        Picasso.with(mActivity)
                .load("http://cfile10.uf.tistory.com/image/121A724150EE58041CD216")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.f_Image7));
    }
}
