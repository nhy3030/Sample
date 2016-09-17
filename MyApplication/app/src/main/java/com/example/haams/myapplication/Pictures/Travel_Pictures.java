package com.example.haams.myapplication.Pictures;

import android.widget.ImageView;

import com.example.haams.myapplication.MainActivity;
import com.example.haams.myapplication.R;
import com.squareup.picasso.Picasso;

/**
 * Created by haams on 2016-09-17.
 */
public class Travel_Pictures {
    MainActivity mActivity;

    public Travel_Pictures(MainActivity mActivity) {
        this.mActivity = mActivity;
        fillViews();
    }

    private void fillViews() {
        Picasso.with(mActivity)
                .load("http://cfile7.uf.tistory.com/image/206384384FBBD309149859")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.t_Image1));
        Picasso.with(mActivity)
                .load("http://cfile7.uf.tistory.com/image/206384384FBBD309149859")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.t_Image1));

        Picasso.with(mActivity)
                .load("http://cfile21.uf.tistory.com/image/15324B37505BA517108D76")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.t_Image2));
        Picasso.with(mActivity)
                .load("http://cfile21.uf.tistory.com/image/15324B37505BA517108D76")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.t_Image2));

        Picasso.with(mActivity)
                .load("http://cfile8.uf.tistory.com/image/2776483F55A789D024B5FF")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.t_Image3));
        Picasso.with(mActivity)
                .load("http://cfile8.uf.tistory.com/image/2776483F55A789D024B5FF")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.t_Image3));

        Picasso.with(mActivity)
                .load("http://cfile5.uf.tistory.com/image/2449A840562DE4E90120E9")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.t_Image4));
        Picasso.with(mActivity)
                .load("http://cfile5.uf.tistory.com/image/2449A840562DE4E90120E9")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.t_Image4));

        Picasso.with(mActivity)
                .load("http://cfile217.uf.daum.net/image/1127CC454DE4681732C7B7")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.t_Image5));
        Picasso.with(mActivity)
                .load("http://cfile217.uf.daum.net/image/1127CC454DE4681732C7B7")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.t_Image5));

        Picasso.with(mActivity)
                .load("http://cfile4.uf.tistory.com/image/2142644B533D16881E8099")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.t_Image6));
        Picasso.with(mActivity)
                .load("http://cfile4.uf.tistory.com/image/2142644B533D16881E8099")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.t_Image6));
        Picasso.with(mActivity)
                .load("http://cfile24.uf.tistory.com/image/255DAE40546BE8F50425FD")
                .skipMemoryCache().into((ImageView)mActivity.findViewById(R.id.t_Image7));
        Picasso.with(mActivity)
                .load("http://cfile24.uf.tistory.com/image/255DAE40546BE8F50425FD")
                .fit().centerCrop()
                .into((ImageView) mActivity.findViewById(R.id.t_Image7));
    }
}
