public class House {

    private int houseNumber;
    private boolean hasWalls;
    private boolean hasCeiling;
    private boolean hasGarage;
    private boolean hasRoof;
    private boolean hasWindows;
    private boolean hasDoors;

    public static class HouseBuilder{

        private int houseNumber;
        private boolean hasWalls;
        private boolean hasCeiling;
        private boolean hasGarage;
        private boolean hasRoof;
        private boolean hasWindows;
        private boolean hasDoors;

        public HouseBuilder(int houseNumber){
            this.houseNumber = houseNumber;
        }

        public HouseBuilder buildWalls(){
            this.hasWalls = true;
            return this;
        }

        public HouseBuilder buildCeling(){
            this.hasCeiling = true;
            return this;
        }

        public HouseBuilder buildGarage(){
            this.hasGarage = true;
            return this;
        }

        public HouseBuilder buildRoof(){
            this.hasRoof = true;
            return this;
        }

        public HouseBuilder buildWindows(){
            this.hasWindows = true;
            return this;
        }

        public HouseBuilder buildDoors(){
            this.hasDoors = true;
            return this;
        }

        public House build(){
            House house = new House();
            house.houseNumber = this.houseNumber;
            house.hasWalls = this.hasWalls;
            house.hasCeiling = this.hasCeiling;
            house.hasDoors = this.hasDoors;
            house.hasRoof = this.hasRoof;
            house.hasGarage = this.hasGarage;
            house.hasWindows = this.hasWindows;

            return house;
        }
    }


    private House(){}

    public int getNumber(){
        return houseNumber;
    }


    public String houseDetails(){

        return "House has " + (hasWalls ? "walls " : "") + (hasCeiling ? "ceiling " : "") + (hasDoors ? "doors " : "") + (hasRoof ? "roof " : "")
        + (hasGarage ? "garage " : "") + (hasWindows ? "windows" : "");
    }


    public String toString(){
        return "" + houseNumber;
    }

}
