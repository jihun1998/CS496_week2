package com.example.servertest4;

public class Phonenum {
    private String name;
    private String num;
    private String mail;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNum(){
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getMail(){
        return mail;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    @Override
    public String toString(){
        return "Phonenum [name="+name+", num="+name+", mail="+mail+"]";
    }

}
