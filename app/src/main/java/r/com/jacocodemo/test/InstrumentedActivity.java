package r.com.jacocodemo.test;

import android.util.Log;

import r.com.jacocodemo.MainActivity;

public class InstrumentedActivity extends MainActivity {
    public static String TAG = "InstrumentedActivity";
    FinishListener mListener;

    public void setFinishListener(FinishListener listener) {
        mListener = listener;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG + ".InstrumentedActivity", "onDestroy()");
        super.finish();
        if (mListener != null) {
            mListener.onActivityFinished();
        }
    }
}

