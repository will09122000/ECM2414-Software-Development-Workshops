import java.util.Random;

public class Ugg
{
    enum UggRockSize {
        BIGUN(5),
        QUITE_BIGUN(3),
        NOT_SO_BIGUN(1);

        int multiplierValue;

        UggRockSize(int multiplierValue) {
            this.multiplierValue = multiplierValue; 
        }

        int getMultiplierValue() {
            return multiplierValue;
        }
    }

    enum UggRockType {
        SPECKLY(7),
        OUCHY_BLACK(20),
        FLOATY(2),
        HOT_HOT_HOT(15);

        int multiplierValue;

        UggRockType(int multiplierValue) {
            this.multiplierValue = multiplierValue; 
        }        

        int getMultiplierValue() {
            return multiplierValue;
        }
    }

    static class UggRock {
        private UggRockSize rockSize;
        private UggRockType rockType;
        
        int rockValue() {
            return rockSize.getMultiplierValue() * rockType.getMultiplierValue();    
        }
        
        public UggRockSize returnUggRockSize(){
        	return rockSize;
        }
        
        public UggRockType returnUggRockType(){
        	return rockType;
        }
        
        public String toString() {
            return rockSize.toString() + ", " + rockType.toString();
        }

        UggRock(UggRockSize rockSize, UggRockType rockType) {
            this.rockSize = rockSize;
            this.rockType = rockType;
        }
    }
   
    static Random randomNumGen = new Random();

    static UggRock drawRock() {
        double randSize = randomNumGen.nextDouble();
        double randType = randomNumGen.nextDouble();
        UggRockSize rockSize;
        UggRockType rockType;

        if (randType < 0.25) {
            rockType = UggRockType.SPECKLY;
        } else if (randType < 0.5) {
            rockType = UggRockType.OUCHY_BLACK;
        } else if (randType < 0.75){
            rockType = UggRockType.FLOATY;
        } else {
            rockType = UggRockType.HOT_HOT_HOT;
        }
        
        if (randSize < 6.0/9.0) {
            rockSize = UggRockSize.NOT_SO_BIGUN;
        } else if (randSize < 8.0/9.0) {
            rockSize = UggRockSize.QUITE_BIGUN;
        } else {
            rockSize = UggRockSize.BIGUN;
        }

        return new UggRock(rockSize, rockType);
    }
}
