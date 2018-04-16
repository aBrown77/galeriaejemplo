package cr.ac.unadeca.galeria.database;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;


public class galeriaapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}
