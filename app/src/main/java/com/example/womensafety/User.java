package com.example.womensafety;

public class User {

    public String mFull_name;
    public String mAge;
    public String mEmail_id;
    public String mMobile_number;
    public String mAddress;
    public String mPassword;
    public String mUVC;
    public String mGender;

    public User(String Full_name, String Age, String Email_id, String Mobile_number, String Address, String password, String UVC,String gender) {
        mFull_name = Full_name;
        mAge = Age;
        mEmail_id = Email_id;
        mMobile_number = Mobile_number;
        mAddress = Address;
        mPassword = password;
        mUVC = UVC;
        mGender=gender;
    }

    public String getFull_name() {
        return mFull_name;
    }

    public void setFull_name(String mFull_name) {
        this.mFull_name = mFull_name;
    }

    public String getAge() {
        return mAge;
    }

    public void setAge(String mAge) {
        this.mAge = mAge;
    }

    public String getEmail_id() {
        return mEmail_id;
    }

    public void setEmail_id(String mEmail_id) {
        this.mEmail_id = mEmail_id;
    }

    public String getMobile_number() {
        return mMobile_number;
    }

    public void setMobile_number(String mMobile_number) {
        this.mMobile_number = mMobile_number;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public String getUVC() {
        return mUVC;
    }

    public void setUVC(String mUVC) {
        this.mUVC = mUVC;
    }
}
