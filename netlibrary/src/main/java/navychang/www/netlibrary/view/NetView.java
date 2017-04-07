package navychang.www.netlibrary.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import navychang.www.netlibrary.R;


/**
 * Created by ASUS on 2016/12/6.
 */
public class NetView extends LinearLayout {

    private LinearLayout null_ll;
    private ImageView null_image;
    private TextView null_textview;
    private Context context;

    public NetView(Context context) {
        super(context);
        this.context = context;
        initView();
        showNetView();
    }

    public NetView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initView();
    }

    public void initView(){
        View view = LayoutInflater.from(context).inflate(R.layout.netview,null);

        null_ll = (LinearLayout) view.findViewById(R.id.null_ll);
        null_image = (ImageView) view.findViewById(R.id.null_image);
        null_textview = (TextView) view.findViewById(R.id.null_textview);

        this.addView(view);
    }

    //  显示暂无布局
    public NetView setNullVisibili(int visibili){
        null_ll.setVisibility(visibili);
        return this;
    }

    //  设置暂无图片内容
    public NetView setNullImage(int id){
        null_image.setImageResource(id);
        return this;
    }

    //  设置暂无文字内容
    public NetView setNullText(String s){
        null_textview.setText(s);
        return this;
    }

    //  添加到手机屏幕中
    public void showNetView(){
        Window window = ((Activity) context).getWindow();
        View view = window.getDecorView();
        FrameLayout decorView = (FrameLayout) view.findViewById(android.R.id.content);
//        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, Gravity.CENTER);
        decorView.addView(this);
    }
}
