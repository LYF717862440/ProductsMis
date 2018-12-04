package com.liangyaofeng.entity;


public class Icetype {

  private long tid;
  private String tname;


  public long getTid() {
    return tid;
  }

  public void setTid(long tid) {
    this.tid = tid;
  }


  public String getTname() {
    return tname;
  }

  public void setTname(String tname) {
    this.tname = tname;
  }


  @Override
  public String toString() {
    return "Icetype{" +
            "tid=" + tid +
            ", tname='" + tname + '\'' +
            '}';
  }
}
