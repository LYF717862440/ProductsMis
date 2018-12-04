package com.liangyaofeng.entity;


public class Color {

  private long cid;
  private String cname;


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }


  @Override
  public String toString() {
    return "Color{" +
            "cid=" + cid +
            ", cname='" + cname + '\'' +
            '}';
  }
}
