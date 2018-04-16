package cr.ac.unadeca.galeria.database;

import com.raizlabs.android.dbflow.annotation.Database;


@Database(name = galeriaDB.db_name, version = galeriaDB.version)
public class galeriaDB {
    public static final String db_name = "Galeria";
    public static final int version = 1;
}
