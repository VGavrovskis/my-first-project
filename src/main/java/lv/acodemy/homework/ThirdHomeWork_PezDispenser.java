package lv.acodemy.homework;

public class ThirdHomeWork_PezDispenser {

        private String color;
        private String pezName;
        private String seriesName;
        private int candyCount;
        private final int MAX_CANDIES = 12;

    public ThirdHomeWork_PezDispenser(String color, String pezName, String seriesName) {
        this.color = color;
        this.pezName = pezName;
        this.seriesName = seriesName;
        this.candyCount = MAX_CANDIES;
    }

    public String getColor() {
        return color;
    }

    public String getPezName() {
        return pezName;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public int getCandyCount() {
        return candyCount;
    }

    public void eatCandy() {
        if (candyCount <= 0) {
            System.out.println("EMPTY");
        } else {
            System.out.println("eat 1 candy");
            candyCount --;
        }
    }
    public void eatCandies(int candyCount ) {
        if (candyCount > MAX_CANDIES) {
            System.out.println("You can't eat so many candies, you can eat only " + MAX_CANDIES);
        } else {
            System.out.println("You eat " + candyCount + " candies" + ", left " + (MAX_CANDIES - candyCount) + " candies.");
        }
    }
    public void setCandyCount() {
        System.out.println("Now is " + candyCount + " candies!" + "\nI will add " + (MAX_CANDIES - candyCount) + " candies." + "\nI've added " + (MAX_CANDIES - candyCount) + " amount of candies and it is full now." );
        }
        //TODO: You have now this amount of candies:
        //TODO: I will add: ...
        //TODO: I've added %s amount of candies and it is full now
    public void fill() {
        if (candyCount >= MAX_CANDIES) {
            System.out.println("FULL");
        }
        candyCount++;
        System.out.println("You add 1 candy " + ", now is " + candyCount);
        //TODO: Add one candy
    }
    public void fill(int candyCount) {
        if (candyCount > MAX_CANDIES){
            System.out.println("FULL");
        } else {
            System.out.println("You add " + candyCount + " candies" + ", now is " + (MAX_CANDIES - candyCount) + " candies.");
            //TODO:
        }
        }
    }


