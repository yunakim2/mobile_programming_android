package com.example.project11_1;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

class MyGridAdapter extends BaseAdapter {
    Context context;
    Integer [] posterID = {
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.e, R.drawable.f,
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.e, R.drawable.f,
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.e, R.drawable.f,
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.e, R.drawable.f,
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.e, R.drawable.f
    };
    public MyGridAdapter(Context c) {
        context = c;
    }
    @Override
    public int getCount() {
        return posterID.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageview = new ImageView(context);
        imageview.setLayoutParams(new ViewGroup.LayoutParams(200,300));
        imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageview.setPadding(5,5,5,5);
        imageview.setImageResource(posterID[i]);

        final int pos = i;
        imageview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                View dialogView = (View) View.inflate(context,R.layout.dialog,null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(context);
                ImageView ivPoster = dialogView.findViewById(R.id.ivPoster);
                ivPoster.setImageResource(posterID[pos]);
                dlg.setTitle("큰 포스터");
                dlg.setIcon(R.drawable.ic_launcher_background);
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기",null);
                dlg.show();
            }
        });

        return imageview;
    }
}
