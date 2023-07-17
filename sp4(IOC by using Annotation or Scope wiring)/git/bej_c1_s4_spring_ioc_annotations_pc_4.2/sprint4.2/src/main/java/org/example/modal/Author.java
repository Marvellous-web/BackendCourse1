package org.example.modal;

public class Author {

    String auth_id,auth_name;

    public Author(String auth_id, String auth_name) {
        this.auth_id = auth_id;
        this.auth_name = auth_name;
    }

    public Author() {
    }

    @Override
    public String toString() {
        return "Author{" +
                "auth_id='" + auth_id + '\'' +
                ", auth_name='" + auth_name + '\'' +
                '}';
    }

    public String getAuth_id() {
        return auth_id;
    }

    public void setAuth_id(String auth_id) {
        this.auth_id = auth_id;
    }

    public String getAuth_name() {
        return auth_name;
    }

    public void setAuth_name(String auth_name) {
        this.auth_name = auth_name;
    }
}
