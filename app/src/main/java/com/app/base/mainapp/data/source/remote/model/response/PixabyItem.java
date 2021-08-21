package com.app.base.mainapp.data.source.remote.model.response;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.Keep;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@Keep
@DatabaseTable(tableName = "Pixaby")
public class PixabyItem implements Parcelable{

    public static final String ID_FIELD = "id";
    public static final String PREVIEW_URL = "previewURL";
    public static final String LARGE_IMAGE_URL = "largeImageURL";
    public static final String IMAGE_USER = "user";


    @DatabaseField(generatedId = true,columnName = ID_FIELD)
    private int id;

    @DatabaseField(columnName = PREVIEW_URL)
    private String previewUrl;

    @DatabaseField(columnName = LARGE_IMAGE_URL)
    private String largeImageUrl;


    @DatabaseField(columnName = IMAGE_USER)
    private String imageUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getImageUser() {
        return imageUser;
    }

    public void setImageUser(String imageUser) {
        this.imageUser = imageUser;
    }

    public PixabyItem() {}


    protected PixabyItem(Parcel in) {
        id = in.readInt();
        previewUrl = in.readString();
        largeImageUrl = in.readString();
        imageUser = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(previewUrl);
        dest.writeString(largeImageUrl);
        dest.writeString(imageUser);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PixabyItem> CREATOR = new Creator<PixabyItem>() {
        @Override
        public PixabyItem createFromParcel(Parcel in) {
            return new PixabyItem(in);
        }

        @Override
        public PixabyItem[] newArray(int size) {
            return new PixabyItem[size];
        }
    };
}