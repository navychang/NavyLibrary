package navychang.www.netlibrary.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

/**
 * Created by navychang on 17/3/15.
 */

public class ImgLoadUtils {


    public static void withContext(Context context ){
        Glide.with( context);// 绑定Context

    }
   public static void withContext(Activity activity){
        Glide.with( activity);// 绑定Activity

    }
   public static void withContext(FragmentActivity activity){
        Glide.with( activity);// 绑定FragmentActivity

    }
   public static void withContext(Fragment fragment){
        Glide.with(fragment);// 绑定Fragment

    }




    /**
     * 加载网络图片到imageview
     * @param activity
     * @param imageView
     * @param imgUrl
     */
    public static void initSrcImgToView(Activity activity, ImageView imageView, String imgUrl){
        Glide.with(activity)
                .load(imgUrl)

                .into(imageView);

    }

    /**
     * 加载图片到imageview时 加上占位图和错误图片
     * @param activity
     * @param imageView
     * @param resourceId
     */
    public static void initSrcImgToView(Activity activity, ImageView imageView, String imgUrl, Integer resourceId, Integer errResourceId){
        Glide.with(activity).load(imgUrl)
                .placeholder(resourceId) //设置占位图，在加载之前显示
                .error(errResourceId) //在图像加载失败时显示
                .into(imageView);
    }
    /**
     * 加载图片到imageview时 加上占位图和错误图片
     * @param activity
     * @param imageView
     * @param resourceId
     */
    public static void initSrcImgToView(Activity activity, ImageView imageView, String imgUrl, Drawable resourceId, Drawable errResourceId){
        Glide.with(activity).load(imgUrl)
                .placeholder(resourceId) //设置占位图，在加载之前显示
                .error(errResourceId) //在图像加载失败时显示
                .into(imageView);
    }
    /**
     * 加载本地图片到imageview
     * @param activity
     * @param imageView
     * @param resourceId
     */
    public static void initLocaImgToView(Activity activity, ImageView imageView, Integer resourceId){
        Glide.with(activity)
                .load(resourceId)
                .into(imageView);


    }

    /**
     * 加载文件图片到imageview
     * @param activity
     * @param imageView
     * @param fileString
     */
    public static void initFireImgToView(Activity activity, ImageView imageView, String fileString){
        File f = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+fileString);
        Glide.with(activity).load(f).into(imageView);
//or uri
//        Glide.with(this).load(Uri.fromFile(f)).into(image);

    }

}
