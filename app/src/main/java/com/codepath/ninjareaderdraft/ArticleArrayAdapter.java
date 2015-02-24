package com.codepath.ninjareaderdraft;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ccoria on 2/22/15.
 */
public class ArticleArrayAdapter extends ArrayAdapter<Article> {

    public ArticleArrayAdapter(Context context, ArrayList<Article> objects) {
        super(context, R.layout.reading_item, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Article article = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.reading_item, parent, false);
        }

        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvItemNumber = (TextView) convertView.findViewById(R.id.tvItemNumber);
        tvTitle.setText(article.getTitle());
        tvItemNumber.setText(getNumber(position));
        return convertView;
    }

    private String getNumber(int position) {
        String[] circledNumbers = new String[]{"①", "②", "③", "④", "⑤", "⑥", "⑦", "⑧", "⑨", "⑩"};
        return circledNumbers[position];
    }
}
