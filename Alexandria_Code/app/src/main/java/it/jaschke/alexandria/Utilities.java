package it.jaschke.alexandria;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Matteo on 23/06/2015.
 */
public class Utilities {

    /**
     * Returns true if the network is available or about to become available.
     *
     * @param c Context used to get the ConnectivityManager
     * @return
     */
    static public boolean isNetworkAvailable(Context c) {
        ConnectivityManager cm =
                (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
    }

}
