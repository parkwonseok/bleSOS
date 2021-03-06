package org.techtown.blecommunication;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UserInfo {


    int _id;
    int fire_id;
    String name;
    String gender;
    String birth;
    String contact;
    String disease;
    String created_at;
    String updated_at;

    public UserInfo(int _id, int fire_id, String name, String gender, String birth, String contact,String disease){
        Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();
        this._id = _id;
        this.fire_id = fire_id;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.contact = contact;
        this.disease = disease;
        this.created_at = (new SimpleDateFormat("yyyyMMddHHmmss").format(date));
        this.updated_at = (new SimpleDateFormat("yyyyMMddHHmmss").format(date));
    }

    public UserInfo(int fire_id, String name, String gender, String birth, String contact,String disease){
        Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();
        this.fire_id = fire_id;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.contact = contact;
        this.disease = disease;
        this.created_at = (new SimpleDateFormat("yyyyMMddHHmmss").format(date));
        this.updated_at = (new SimpleDateFormat("yyyyMMddHHmmss").format(date));
    }


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getFire_id() {
        return fire_id;
    }

    public void setFire_id(int fire_id) {
        this.fire_id = fire_id;
    }
}
