public class UggRock {

    private String UggRockSize;
    private String UggRockType;

    public String getUggRockSize() {
        return UggRockSize;
    }

    public String getUggRockType() {
        return UggRockType;
    }

    public String getUggRockInfo() {
        return UggRockSize.toString() + ", "  + UggRockType.toString();
    }

    public short rockValue() {
        return
    }

    public UggRock(String UggRockSize, String UggRockType) {
        this.UggRockSize = UggRockSize;
        this.UggRockType = UggRockType;
    }
}
