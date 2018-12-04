package com.liangyaofeng.entity;


public class Products {

  private long id;
  private String name;
  private long cid;
  private long bid;
  private long iid;
  private long mid;
  private long tid;
  private long hid;
  private double marketPrice;
  private double myprice;
  private String picture;

  public Products(){}

  public Products(long cid){
    this.cid=cid;
  }

  public Products(long cid,long bid){
    this.bid=bid;
    this.cid=cid;
  }

  public Products(long cid,long bid,long iid){
    this.bid=bid;
    this.cid=cid;
    this.iid=iid;
  }

  public Products(long cid,long bid,long iid,long mid){
    this.bid=bid;
    this.cid=cid;
    this.iid=iid;
    this.mid=mid;
  }

  public Products(long cid,long bid,long iid,long mid,long tid){
    this.bid=bid;
    this.cid=cid;
    this.iid=iid;
    this.mid=mid;
    this.tid=tid;
  }


  public Products(long cid,long bid,long iid,long mid,long tid,long hid){
    this.bid=bid;
    this.cid=cid;
    this.iid=iid;
    this.mid=mid;
    this.tid=tid;
    this.hid=hid;
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public long getBid() {
    return bid;
  }

  public void setBid(long bid) {
    this.bid = bid;
  }


  public long getIid() {
    return iid;
  }

  public void setIid(long iid) {
    this.iid = iid;
  }


  public long getMid() {
    return mid;
  }

  public void setMid(long mid) {
    this.mid = mid;
  }


  public long getTid() {
    return tid;
  }

  public void setTid(long tid) {
    this.tid = tid;
  }


  public long getHid() {
    return hid;
  }

  public void setHid(long hid) {
    this.hid = hid;
  }


  public double getMarketPrice() {
    return marketPrice;
  }

  public void setMarketPrice(double marketPrice) {
    this.marketPrice = marketPrice;
  }


  public double getMyprice() {
    return myprice;
  }

  public void setMyprice(double myprice) {
    this.myprice = myprice;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  @Override
  public String toString() {
    return "Products{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", cid=" + cid +
            ", bid=" + bid +
            ", iid=" + iid +
            ", mid=" + mid +
            ", tid=" + tid +
            ", hid=" + hid +
            ", marketPrice=" + marketPrice +
            ", myprice=" + myprice +
            ", picture='" + picture + '\'' +
            '}';
  }
}
