package com.view.drop;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;

public class test extends ImageView {
	private int mBorderWidth,mBorderColor;
	public test(Context context, AttributeSet attrs) {
		super(context, attrs);
		super.setScaleType(ScaleType.CENTER_CROP);
		TypedArray a= context.obtainStyledAttributes(attrs, R.styleable.CircleImageView);
		mBorderColor=a.getColor(R.styleable.CircleImageView_border_color, Color.RED);
		mBorderWidth=a.getDimensionPixelSize(R.styleable.CircleImageView_border_width, 0);
		a.recycle();
		
	}

}
