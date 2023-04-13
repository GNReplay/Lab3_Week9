package hcmute.edu.vn.lab3_week9;

public class Upload {
    String mName;
    String mImageUrl;

    public Upload() {
    }


    public Upload(String name, String ImageUrl) {
        if(name.trim().equals("")){
            name = "No name";
        }
        mName = name;
        mImageUrl = ImageUrl;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String Name) {
        mName = Name;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String ImageUrl) {
        mImageUrl = ImageUrl;
    }
}
