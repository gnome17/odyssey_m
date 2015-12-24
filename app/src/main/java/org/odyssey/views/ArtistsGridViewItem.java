package org.odyssey.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.odyssey.R;

public class ArtistsGridViewItem extends RelativeLayout{

    private TextView mTitleView;

    public ArtistsGridViewItem(Context context, String title, ViewGroup.LayoutParams layoutParams) {
        super(context);

        View rootView = LayoutInflater.from(context).inflate(R.layout.gridview_item_artists, this, true);

        setLayoutParams(layoutParams);

        mTitleView = (TextView) rootView.findViewById(R.id.item_artists_title);
        mTitleView.setText(title);

    }

    public void setTitle(String text) {
        mTitleView.setText(text);
    }
}