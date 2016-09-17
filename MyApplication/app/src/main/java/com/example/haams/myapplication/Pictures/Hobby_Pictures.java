package com.example.haams.myapplication.Pictures;

import android.widget.ImageView;

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
        Picasso.with(mActivity)
                .load("http://cfile203.uf.daum.net/image/17531F465008AA20264D86")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.h_Image1));
        Picasso.with(mActivity)
                .load("http://cfile203.uf.daum.net/image/17531F465008AA20264D86")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image1));

        Picasso.with(mActivity)
                .load("http://cfile30.uf.tistory.com/image/2326B24F523115AB197A2C")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.h_Image2));
        Picasso.with(mActivity)
                .load("http://cfile30.uf.tistory.com/image/2326B24F523115AB197A2C")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image2));

        Picasso.with(mActivity)
                .load("http://cfile24.uf.tistory.com/image/1773253E502D8BE2294D93")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.h_Image3));
        Picasso.with(mActivity)
                .load("http://cfile24.uf.tistory.com/image/1773253E502D8BE2294D93")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image3));

        Picasso.with(mActivity)
                .load("http://cfile7.uf.tistory.com/image/213AD94154744F251DC56E")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.h_Image4));
        Picasso.with(mActivity)
                .load("http://cfile7.uf.tistory.com/image/213AD94154744F251DC56E")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image4));

        Picasso.with(mActivity)
                .load("http://cfile30.uf.tistory.com/image/1671793C4F66EAC5298EC9")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.h_Image5));
        Picasso.with(mActivity)
                .load("http://cfile30.uf.tistory.com/image/1671793C4F66EAC5298EC9")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image5));

        Picasso.with(mActivity)
                .load("http://cfile8.uf.tistory.com/image/2412F94851E5AD4C2BA6D5")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.h_Image6));
        Picasso.with(mActivity)
                .load("http://cfile8.uf.tistory.com/image/2412F94851E5AD4C2BA6D5")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image6));
        Picasso.with(mActivity)
                .load("http://cfile24.uf.tistory.com/image/134B1D114CE2A4A30FD412")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.h_Image7));
        Picasso.with(mActivity)
                .load("http://cfile24.uf.tistory.com/image/134B1D114CE2A4A30FD412")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.h_Image7));
    }
}
