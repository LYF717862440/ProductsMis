package com.liangyaofeng.entity;


public class Inlay {

  private long iid;
  private String iname;


  public long getIid() {
    return iid;
  }

  public void setIid(long iid) {
    this.iid = iid;
  }


  public String getIname() {
    return iname;
  }

  public void setIname(String iname) {
    this.iname = iname;
  }


  @Override
  public String toString() {
    return "Inlay{" +
            "iid=" + iid +
            ", iname='" + iname + '\'' +
            '}';
  }
}
