package io.github.ynagarjuna1995.retrofitimplementation.common;

/**
 * Created by Nagarjuna on 10-03-2017.
 */


import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 *  This provides the common utillites for holding the Activity UI
 */
public class ActivityUtils {


    public static void addFragment(@NonNull FragmentManager fragmentManager,
                                   @NonNull Fragment fragment,
                                   int frameId)
    {

        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId,fragment);
        transaction.commit();
    }

    public static void changeScreenintent(@NonNull Context CurrentActivity,
                                    @NonNull Class NextActivity)
    {
        checkNotNull(CurrentActivity);
        checkNotNull(NextActivity);
        Intent intent = new Intent(CurrentActivity,
                NextActivity);
        CurrentActivity.startActivity(intent);
    }
}
