package com.haanhgs.app.rxjavasimple.model.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainCurrent {

    @SerializedName("temp")
    @Expose
    private Double temp;

    @SerializedName("temp_min")
    @Expose
    private Double tempMin;

    @SerializedName("temp_max")
    @Expose
    private Double tempMax;

    public Double getTempC(){
        return temp - 273.15;
    }

    public Double getMinC(){
        return tempMin - 273.15;
    }

    public Double getMaxC(){
        return tempMax - 273.15;
    }

    public Double getTempF(){
        return getTempC() * 1.8 + 32;
    }

    public Double getMinF(){
        return getMinC() * 1.8 + 32;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

//    @SerializedName("pressure")
//    @Expose
//    private Double pressure;

//    @SerializedName("humidity")
//    @Expose
//    private Integer humidity;

//    @SerializedName("sea_level")
//    @Expose
//    private Double seaLevel;
//
//    @SerializedName("grnd_level")
//    @Expose
//    private Double grndLevel;

//    public void setTempMax(Double tempMax) {
//        this.tempMax = tempMax;
//    }
//
//    public Double getPressure() {
//        return pressure;
//    }
//
//    public void setPressure(Double pressure) {
//        this.pressure = pressure;
//    }
//
//    public Integer getHumidity() {
//        return humidity;
//    }
//
//    public void setHumidity(Integer humidity) {
//        this.humidity = humidity;
//    }
//
//
//    public Double getSeaLevel() {
//        return seaLevel;
//    }
//
//    public void setSeaLevel(Double seaLevel) {
//        this.seaLevel = seaLevel;
//    }
//
//    public Double getGrndLevel() {
//        return grndLevel;
//    }
//
//    public void setGrndLevel(Double grndLevel) {
//        this.grndLevel = grndLevel;
//    }

}
