package com.app.base.mainapp.data.source.local;

import android.content.Context;

import com.app.base.mainapp.data.source.remote.model.response.PixabyItem;
import com.app.base.mainapp.utils.Constants;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;


public class DatabaseManager {

    private static DatabaseManager mInstance;
    private static DatabaseHelper mHelper;
    private static List<Class<?>> tables;


    public static DatabaseManager getInstance(Context context) {
        if (context != null)
            if (null == mInstance) {
                mInstance = new DatabaseManager(context.getApplicationContext());
            }

        return mInstance;
    }

    public boolean isPixabyItemExisiOnDB() {
        boolean isPixabyItemExisit = false;
        List<PixabyItem> pixabyItemList = getAllPixaby();
        if ( pixabyItemList!= null && !pixabyItemList.isEmpty()) {

            isPixabyItemExisit = true;

        }
        return isPixabyItemExisit;
    }

    @Inject
    DatabaseManager(Context context) {
        tables = new ArrayList<Class<?>>();
        tables.add(PixabyItem.class);
        mHelper = new DatabaseHelper(context, tables);

    }

    public DatabaseHelper getDatabaseHelper() {
        return mHelper;
    }

    public void close() {
        try {
            mInstance = null;
            mHelper.close();
        } catch (Exception ex) {
        }
    }



    public List<PixabyItem> getAllPixaby() {
        try {
            return mHelper.getDao(PixabyItem.class).callBatchTasks(new Callable<List<PixabyItem>>() {
                public List<PixabyItem> call() throws Exception {
                    return mHelper.getDao(PixabyItem.class).queryBuilder().orderBy(Constants.ID_FIELD, true).query();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
    public boolean savePixabyItem(List<PixabyItem> pixabyItem) {
        try {
            return mHelper.getDao(PixabyItem.class).create(pixabyItem) == pixabyItem.size();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public <T> T createOrUpdate(Class<T> type, T data) throws SQLException {
        Dao.CreateOrUpdateStatus createOrUpdateStatus = mHelper.getDao(type).createOrUpdate(data);
        return data;
    }




}
