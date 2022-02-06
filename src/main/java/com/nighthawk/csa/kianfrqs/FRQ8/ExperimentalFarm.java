package com.nighthawk.csa.kianfrqs.FRQ8;

public class ExperimentalFarm {
    public static Plot[][] farmPlots = new Plot[4][3];

    public ExperimentalFarm()
    {
        String[][] cropArr = {
                {"corn", "corn", "peas"},
                {"peas", "corn", "corn"},
                {"wheat", "corn", "rice"},
                {"corn", "corn", "peas"}
        };
        int[][] yieldArr = {
                {20, 30, 10},
                {30, 40, 62},
                {10, 50, 30},
                {55, 30, 30}
        };
        for(int i = 0; i<farmPlots.length; i++) {
            for(int j = 0; j<farmPlots[i].length; j++) {
                farmPlots[i][j] = new Plot(cropArr[i][j], yieldArr[i][j]);
            }
        }
    }

    /** Returns the plot with the highest yield for a given crop type, as described in part (a). */
    public Plot getHighestYield(String c)
    {
        int row = 0;
        int col = 0;
        int highestYield = 0;
        int rows = farmPlots.length-1;
        int cols = farmPlots[rows].length-1;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols; j++) {
                String crop = farmPlots[i][j].getCropType();
                int yield = farmPlots[i][j].getCropYield();
                if (crop.equals(c)) {
                    if (yield > highestYield) {
                        highestYield = yield;
                        row = i;
                        col = j;
                    }
                }
            }
        }
        System.out.println("This is the highest yield from the variable: " + highestYield);
        System.out.println("The highest is yield for " + c + " is " + farmPlots[row][col].getCropYield());
        return farmPlots[row][col];

    }

    /** Returns true if all plots in a given column in the two-dimensional array farmPlots
     * contain the same type of crop, or false otherwise, as described in part (b).
     */

    public boolean sameCrop(int col)
    {
        boolean same = false;
        for (int i = 1; i < farmPlots.length; i++) {
            if ((farmPlots[i][col].getCropType()).equals(farmPlots[i-1][col].getCropType())) {
                same = true;
            }
        }
        return same;
    }
    public static void main(String[] args) {
        ExperimentalFarm f = new ExperimentalFarm();
        System.out.println("The highest yield for corn is: " + f.getHighestYield("corn"));
        System.out.println("The crop type is the same for all of column 1: " + f.sameCrop(1));
    }
}
