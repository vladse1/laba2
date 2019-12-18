package laba2;

import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {
        name = "wsf";
        email = "wsf@mail.ru";
        gender = 's';
    }
    public Author(String n) {
        name = n;
        email = "mnbb@mail.ru";
        gender = 'a';
    }
    public Author(String n, String e){
        name = n;
        email = e;
        gender = 'u';
    }
    public Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;

    }
    public char getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "Avtor @ ("+this.name+", "+this.email+").";
    }
}
