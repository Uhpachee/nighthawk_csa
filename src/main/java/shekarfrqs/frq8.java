package shekarfrqs;


public class frq8 {
    private String cropType;
    private int cropYield;

    public frq8(String crop, int yield) {
        this.cropType = crop;
        this.cropYield = yield;
    }

    public String getCropType() {
        return cropType;
    }

    public int getCropYield() {
        return cropYield;
    }

}


class ExperimentFarm {

    private frq8[][] farmPlots;

    public ExperimentFarm(frq8[][] p) {
        this.farmPlots = p;
    }

    /** Returns the plot with the highest yield for a given crop type, as described in part (a). */

    public frq8 getHighestYield(String c) {
        int cropCount = 0;
        int highestI = 0;
        int highestJ = 0;
        int highestYield = -1;
        for (int i = 0; i < farmPlots.length; i++) {
            for (int j = 0; j < farmPlots[0].length; j++) {
                if (farmPlots[i][j].getCropType() == c) {
                    cropCount += 1;
                    if (farmPlots[i][j].getCropYield() > highestYield) {
                        highestI = i;
                        highestJ = j;
                        highestYield = farmPlots[i][j].getCropYield();
                    }
                }
            }
        }
        if (cropCount > 0) {
            return farmPlots[highestI][highestJ];
        } else {
            return null;
        }
    }

    /** Returns true if all plots in a given column in the two-dimensional array farmPlots
     * contain the same type of crop, or false otherwise, as described in part (b).
     */

    public boolean sameCrop(int col) {
        String crop = farmPlots[0][col].getCropType();
        for (int row = 1; row < farmPlots.length; row++) {
            if (farmPlots[row][col].getCropType() != crop) {
                return false;
            }
        }
        return true;
    }
}