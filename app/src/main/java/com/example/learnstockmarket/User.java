package com.example.learnstockmarket;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int boid;
    @ColumnInfo(name="stock name")
    public String stockname;
    @ColumnInfo(name="quantity")
    public String quantity;
    @ColumnInfo(name="buying price")
    public String buyingpric;
    @ColumnInfo(name="selling price")
    public String sellingpric;
    /*@ColumnInfo(name="type")
    public String type;*/
    @ColumnInfo(name="profit/loss")
    public String profitloss;

    public User(int boid, String stockname, String quantity, String buyingpric, String sellingpric, String profitloss) {
        this.boid = boid;
        this.stockname = stockname;
        this.quantity = quantity;
        this.buyingpric = buyingpric;
        this.sellingpric = sellingpric;
        //this.type = type;
        this.profitloss = profitloss;
    }

    public int getBoid() {
        return boid;
    }

    public void setBoid(int boid) {
        this.boid = boid;
    }

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getBuyingpric() {
        return buyingpric;
    }

    public void setBuyingpric(String buyingpric) {
        this.buyingpric = buyingpric;
    }

    public String getSellingpric() {
        return sellingpric;
    }

    public void setSellingpric(String sellingpric) {
        this.sellingpric = sellingpric;
    }

    /*public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }*/

    public String getProfitloss() {
        return profitloss;
    }

    public void setProfitloss(String profitloss) {
        this.profitloss = profitloss;
    }
}
