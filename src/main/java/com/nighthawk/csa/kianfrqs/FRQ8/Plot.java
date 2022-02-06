package com.nighthawk.csa.kianfrqs.FRQ8;


public class Plot {
    private String cropType;
    private int cropYield;

    public Plot(String crop, int yield)
    {
        this.cropType = crop;
        this.cropYield = yield;
    }

    public String getCropType()
    {
        return cropType;
    }

    public int getCropYield()
    {
        return cropYield;
    }
}
