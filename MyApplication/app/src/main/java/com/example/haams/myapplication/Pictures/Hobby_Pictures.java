package com.example.haams.myapplication.Pictures;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.haams.myapplication.MainActivity;
import com.example.haams.myapplication.R;
import com.squareup.picasso.Picasso;

/**
 * Created by haams on 2016-09-17.
 */
public class Hobby_Pictures {
    MainActivity mActivity;

    public Hobby_Pictures(MainActivity mActivity) {
        this.mActivity = mActivity;
        fillViews();
    }

    private void fillViews() {

        Glide.with(mActivity)
                .load("http://cfile203.uf.daum.net/image/17531F465008AA20264D86")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image1));


        Glide.with(mActivity)
                .load("http://cfile30.uf.tistory.com/image/2326B24F523115AB197A2C")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image2));


        Glide.with(mActivity)
                .load("http://cfile24.uf.tistory.com/image/1773253E502D8BE2294D93")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image3));


        Glide.with(mActivity)
                .load("http://cfile7.uf.tistory.com/image/213AD94154744F251DC56E")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image4));


        Glide.with(mActivity)
                .load("http://cfile30.uf.tistory.com/image/1671793C4F66EAC5298EC9")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image5));


        Glide.with(mActivity)
                .load("http://cfile8.uf.tistory.com/image/2412F94851E5AD4C2BA6D5")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image6));

        Glide.with(mActivity)
                .load("http://cfile24.uf.tistory.com/image/134B1D114CE2A4A30FD412")
                .centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image7));
    }
}
