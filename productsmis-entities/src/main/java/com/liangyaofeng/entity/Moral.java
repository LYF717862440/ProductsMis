package com.liangyaofeng.entity;


public class Moral {

  private long mid;
  private String mname;


  public long getMid() {
    return mid;
  }

  public void setMid(long mid) {
    this.mid = mid;
  }


  public String getMname() {
    return mname;
  }

  public void setMname(String mname) {
    this.mname = mname;
  }


  @Override
  public String toString() {
    return "Moral{" +
            "mid=" + mid +
            ", mname='" + mname + '\'' +
            '}';
  }
}
