package com.liangyaofeng.entity;


public class Hangtype {

  private long hid;
  private String hname;


  public long getHid() {
    return hid;
  }

  public void setHid(long hid) {
    this.hid = hid;
  }


  public String getHname() {
    return hname;
  }

  public void setHname(String hname) {
    this.hname = hname;
  }


  @Override
  public String toString() {
    return "Hangtype{" +
            "hid=" + hid +
            ", hname='" + hname + '\'' +
            '}';
  }
}
