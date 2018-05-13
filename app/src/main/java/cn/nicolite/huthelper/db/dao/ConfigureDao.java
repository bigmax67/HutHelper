package cn.nicolite.huthelper.db.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import cn.nicolite.huthelper.model.bean.User;

import cn.nicolite.huthelper.model.bean.Configure;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CONFIGURE".
*/
public class ConfigureDao extends AbstractDao<Configure, Long> {

    public static final String TABLENAME = "CONFIGURE";

    /**
     * Properties of entity Configure.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property AppRememberCode = new Property(1, String.class, "appRememberCode", false, "APP_REMEMBER_CODE");
        public final static Property Token = new Property(2, String.class, "token", false, "TOKEN");
        public final static Property City = new Property(3, String.class, "city", false, "CITY");
        public final static Property Tmp = new Property(4, String.class, "tmp", false, "TMP");
        public final static Property Content = new Property(5, String.class, "content", false, "CONTENT");
        public final static Property UserId = new Property(6, String.class, "userId", false, "USER_ID");
        public final static Property StudentKH = new Property(7, String.class, "studentKH", false, "STUDENT_KH");
        public final static Property Lou = new Property(8, String.class, "lou", false, "LOU");
        public final static Property Hao = new Property(9, String.class, "hao", false, "HAO");
        public final static Property LibraryUrl = new Property(10, String.class, "libraryUrl", false, "LIBRARY_URL");
        public final static Property TestPlanUrl = new Property(11, String.class, "testPlanUrl", false, "TEST_PLAN_URL");
        public final static Property NewTermDate = new Property(12, String.class, "newTermDate", false, "NEW_TERM_DATE");
    }

    private DaoSession daoSession;


    public ConfigureDao(DaoConfig config) {
        super(config);
    }
    
    public ConfigureDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CONFIGURE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"APP_REMEMBER_CODE\" TEXT," + // 1: appRememberCode
                "\"TOKEN\" TEXT," + // 2: token
                "\"CITY\" TEXT," + // 3: city
                "\"TMP\" TEXT," + // 4: tmp
                "\"CONTENT\" TEXT," + // 5: content
                "\"USER_ID\" TEXT," + // 6: userId
                "\"STUDENT_KH\" TEXT," + // 7: studentKH
                "\"LOU\" TEXT," + // 8: lou
                "\"HAO\" TEXT," + // 9: hao
                "\"LIBRARY_URL\" TEXT," + // 10: libraryUrl
                "\"TEST_PLAN_URL\" TEXT," + // 11: testPlanUrl
                "\"NEW_TERM_DATE\" TEXT);"); // 12: newTermDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CONFIGURE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Configure entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String appRememberCode = entity.getAppRememberCode();
        if (appRememberCode != null) {
            stmt.bindString(2, appRememberCode);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(3, token);
        }
 
        String city = entity.getCity();
        if (city != null) {
            stmt.bindString(4, city);
        }
 
        String tmp = entity.getTmp();
        if (tmp != null) {
            stmt.bindString(5, tmp);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(6, content);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(7, userId);
        }
 
        String studentKH = entity.getStudentKH();
        if (studentKH != null) {
            stmt.bindString(8, studentKH);
        }
 
        String lou = entity.getLou();
        if (lou != null) {
            stmt.bindString(9, lou);
        }
 
        String hao = entity.getHao();
        if (hao != null) {
            stmt.bindString(10, hao);
        }
 
        String libraryUrl = entity.getLibraryUrl();
        if (libraryUrl != null) {
            stmt.bindString(11, libraryUrl);
        }
 
        String testPlanUrl = entity.getTestPlanUrl();
        if (testPlanUrl != null) {
            stmt.bindString(12, testPlanUrl);
        }
 
        String newTermDate = entity.getNewTermDate();
        if (newTermDate != null) {
            stmt.bindString(13, newTermDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Configure entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String appRememberCode = entity.getAppRememberCode();
        if (appRememberCode != null) {
            stmt.bindString(2, appRememberCode);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(3, token);
        }
 
        String city = entity.getCity();
        if (city != null) {
            stmt.bindString(4, city);
        }
 
        String tmp = entity.getTmp();
        if (tmp != null) {
            stmt.bindString(5, tmp);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(6, content);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(7, userId);
        }
 
        String studentKH = entity.getStudentKH();
        if (studentKH != null) {
            stmt.bindString(8, studentKH);
        }
 
        String lou = entity.getLou();
        if (lou != null) {
            stmt.bindString(9, lou);
        }
 
        String hao = entity.getHao();
        if (hao != null) {
            stmt.bindString(10, hao);
        }
 
        String libraryUrl = entity.getLibraryUrl();
        if (libraryUrl != null) {
            stmt.bindString(11, libraryUrl);
        }
 
        String testPlanUrl = entity.getTestPlanUrl();
        if (testPlanUrl != null) {
            stmt.bindString(12, testPlanUrl);
        }
 
        String newTermDate = entity.getNewTermDate();
        if (newTermDate != null) {
            stmt.bindString(13, newTermDate);
        }
    }

    @Override
    protected final void attachEntity(Configure entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Configure readEntity(Cursor cursor, int offset) {
        Configure entity = new Configure( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // appRememberCode
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // token
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // city
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // tmp
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // content
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // userId
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // studentKH
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // lou
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // hao
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // libraryUrl
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // testPlanUrl
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12) // newTermDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Configure entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAppRememberCode(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setToken(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCity(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTmp(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setContent(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUserId(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setStudentKH(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setLou(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setHao(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setLibraryUrl(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setTestPlanUrl(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setNewTermDate(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Configure entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Configure entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Configure entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getUserDao().getAllColumns());
            builder.append(" FROM CONFIGURE T");
            builder.append(" LEFT JOIN USER T0 ON T.\"USER_ID\"=T0.\"USER_ID\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Configure loadCurrentDeep(Cursor cursor, boolean lock) {
        Configure entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        User user = loadCurrentOther(daoSession.getUserDao(), cursor, offset);
        entity.setUser(user);

        return entity;    
    }

    public Configure loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Configure> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Configure> list = new ArrayList<Configure>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Configure> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Configure> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}