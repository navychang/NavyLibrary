package navychang.www.netlibrary.entity;

import java.io.Serializable;

/**
 * Created by navychang on 16/10/2.
 */
public class ShopBean implements Serializable{

    private int jlbId;
    private int resourceIntegral;
    private double shipment;
    private String vipdiscount;
    private String isdelete;
    private String code;
    private String url;
    private String title;
    private int ownIntegral;
    private int resourceMoney;
    private int shopId;
    private String name;
    private int ownMoney;


    public int getJlbId() {
        return jlbId;
    }

    public void setJlbId(int jlbId) {
        this.jlbId = jlbId;
    }

    public int getResourceIntegral() {
        return resourceIntegral;
    }

    public void setResourceIntegral(int resourceIntegral) {
        this.resourceIntegral = resourceIntegral;
    }

    public double getShipment() {
        return shipment;
    }

    public void setShipment(double shipment) {
        this.shipment = shipment;
    }

    public String getVipdiscount() {
        return vipdiscount;
    }

    public void setVipdiscount(String vipdiscount) {
        this.vipdiscount = vipdiscount;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getOwnIntegral() {
        return ownIntegral;
    }

    public void setOwnIntegral(int ownIntegral) {
        this.ownIntegral = ownIntegral;
    }

    public int getResourceMoney() {
        return resourceMoney;
    }

    public void setResourceMoney(int resourceMoney) {
        this.resourceMoney = resourceMoney;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOwnMoney() {
        return ownMoney;
    }

    public void setOwnMoney(int ownMoney) {
        this.ownMoney = ownMoney;
    }
}
