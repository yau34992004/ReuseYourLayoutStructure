package com.test.uimodule.demo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.test.uimodule.R;

/**
 * Created by rex.yau on 5/21/2015.
 */
public class DemoViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;

    public DemoViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.textView2);
    }

    public void setTitle(String title) {
        mTextView.setText(title);
    }
}
