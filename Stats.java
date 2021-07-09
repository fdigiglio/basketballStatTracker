public class Stats{

    private double threeBall;
    private double threeBallAttempts;
    private double offDribbleThree;
    private double offDribbleThreeAttempts;
    private double midRange;
    private double midRangeAttempts;
    private double offDribleMid;
    private double offDribleMidAttempts;
    private double floaters;
    private double floatersAttempts;
    private double freeThrow;
    private double freeThrowAttempts;

    public Stats(double pThreeBall, double pOffDribleThree, double pMidRange, double pOffDribleMid, double pFloaters, double pFreeThrows, double pThreeBallAttempts, double pOffDribleThreeAttempts, double pMidRangeAttempts, double pOffDribleMidAttempts, double pFloatersAttempts, double pFreeThrowsAttempts){
        this.threeBall = pThreeBall;
        this.offDribbleThree = pThreeBall;
        this.midRange = pMidRange;
        this.offDribleMid = pOffDribleMid;
        this.floaters = pFloaters;
        this.freeThrow = pFreeThrows;

        this.threeBallAttempts = pThreeBallAttempts;
        this.offDribbleThreeAttempts = pOffDribleThreeAttempts;
        this.midRangeAttempts = pMidRangeAttempts;
        this.offDribleMidAttempts = pOffDribleMidAttempts;
        this.floatersAttempts = pFloatersAttempts;
        this.freeThrowAttempts = pFreeThrowsAttempts;



    }

    public double getThreeBallPercentage(){
        return this.threeBall / this.threeBallAttempts;
    }

    public double getThreeBallOffDribblePercentage(){
        return this.offDribbleThree / this.offDribbleThreeAttempts;
    }

    public double getMidRangePercentage(){
        return this.midRange / this.midRangeAttempts;
    }

    public double getMidRangeOffDribblePercentage(){
        return this.offDribleMid / this.offDribleMidAttempts;
    }

    public double getFloaterPercentage(){
        return this.floaters / this.floatersAttempts;
    }

    public double getFreeThrowPercentage(){
        return this.freeThrow / this.freeThrowAttempts;
    }

    public String getThreePointComparison(){
        
        if(getThreeBallPercentage() > 0.90){
            return "Joe Harris";
        } else if(getThreeBallPercentage() > 0.85){
            return "Steph Curry";
        } else if(getThreeBallPercentage() > 0.80){
            return "Duncan Robinson";
        } else if(getThreeBallPercentage() > 0.75){
            return "Davis Bertans";
        } else if(getThreeBallPercentage() > 0.70){
            return "Nikola Jokic";
        } else if(getThreeBallPercentage() > 0.65){
            return "Bogdan Bogdanovic";
        } else if(getThreeBallPercentage() > 0.60){
            return "Kevin Durant";
        } else if(getThreeBallPercentage() > 0.55){
            return "Paul George";
        } else if(getThreeBallPercentage() > 0.50){
            return "Nikola Vucevic";
        } else if(getThreeBallPercentage() > 0.45){
            return "Carmelo Anthony";
        } else if(getThreeBallPercentage() > 0.40){
            return "Robert Covington";
        } else if(getThreeBallPercentage() > 0.35){
            return "Myles Turner";
        } else if(getThreeBallPercentage() > 0.30){
            return "Jimmy Butler";
        } else {
            return "Ben Simmons";
        }
         
    }

    public String getThreePointOffDribleComparison(){
        
        if(getThreeBallOffDribblePercentage() > 0.90){
            return "Stephen Curry";
        } else if(getThreeBallOffDribblePercentage() > 0.85){
            return "Luka Doncic";
        } else if(getThreeBallOffDribblePercentage() > 0.80){
            return "Kevin Durant";
        } else if(getThreeBallOffDribblePercentage() > 0.75){
            return "Damian Lillard";
        } else if(getThreeBallOffDribblePercentage() > 0.70){
            return "Kyrie Irving";
        } else if(getThreeBallOffDribblePercentage() > 0.65){
            return "Jayson Tatum";
        } else if(getThreeBallOffDribblePercentage() > 0.60){
            return "Donovan Mitchell";
        } else if(getThreeBallOffDribblePercentage() > 0.55){
            return "Tobias Harris";
        } else if(getThreeBallOffDribblePercentage() > 0.50){
            return "Alec Burks";
        } else if(getThreeBallOffDribblePercentage() > 0.45){
            return "Tyler Herro";
        } else if(getThreeBallOffDribblePercentage() > 0.40){
            return "Markelle Fultz";
        } else if(getThreeBallOffDribblePercentage() > 0.35){
            return "Giannis Antetokounmpo";
        } else if(getThreeBallOffDribblePercentage() > 0.30){
            return "Draymond Green";
        } else {
            return "Ben Simmons";
        }
         
    }

    public String getMidRangeOffDribbleComparison(){
        
        if(getMidRangeOffDribblePercentage() > 0.90){
            return "DeMar DeRozan";
        } else if(getMidRangeOffDribblePercentage() > 0.85){
            return "Kevin Durant";
        } else if(getMidRangeOffDribblePercentage() > 0.80){
            return "Chris Paul";
        } else if(getMidRangeOffDribblePercentage() > 0.75){
            return "Devin Booker";
        } else if(getMidRangeOffDribblePercentage() > 0.70){
            return "Kawhi Leonard";
        } else if(getMidRangeOffDribblePercentage() > 0.65){
            return "Khris Middleton";
        } else if(getMidRangeOffDribblePercentage() > 0.60){
            return "Darius Garland";
        } else if(getMidRangeOffDribblePercentage() > 0.55){
            return "Ja Morant";
        } else if(getMidRangeOffDribblePercentage() > 0.50){
            return "Pascal Siakam";
        } else if(getMidRangeOffDribblePercentage() > 0.45){
            return "Russel Westbrook";
        } else if(getMidRangeOffDribblePercentage() > 0.40){
            return "Andrew Wiggins";
        } else if(getMidRangeOffDribblePercentage() > 0.35){
            return "RJ Barrett";
        } else if(getMidRangeOffDribblePercentage() > 0.30){
            return "Kelly Olynyk";
        } else {
            return "Ben Simmons";
        }
         
    }

    public String getFloaterComparison(){
        
        if(getFloaterPercentage() > 0.90){
            return "Trae Young";
        } else if(getFloaterPercentage() > 0.85){
            return "Stephen Curry";
        } else if(getFloaterPercentage() > 0.80){
            return "Tony Parker";
        } else if(getFloaterPercentage() > 0.75){
            return "Derrick Rose";
        } else if(getFloaterPercentage() > 0.70){
            return "Joe Johnson";
        } else if(getFloaterPercentage() > 0.65){
            return "Steve Nash";
        } else {
            return "Ben Simmons";
        }
         
    }

    public String getFreeThrowComparison(){
        
        if(getFreeThrowPercentage() > 0.90){
            return "Damian Lillard";
        } else if(getFreeThrowPercentage() > 0.85){
            return "Stephen Curry";
        } else if(getFreeThrowPercentage() > 0.80){
            return "Shai Gilgeous-Alexander";
        } else if(getFreeThrowPercentage() > 0.75){
            return "Jaylen Brown";
        } else if(getFreeThrowPercentage() > 0.70){
            return "Andrew Wiggins";
        } else if(getFreeThrowPercentage() > 0.65){
            return "LeBron James";
        } else if(getFreeThrowPercentage() > 0.60){
            return "Rudy Gobert";
        } else if(getFreeThrowPercentage() > 0.55){
            return "Dwight Howard";
        } else if(getFreeThrowPercentage() > 0.50){
            return "Hassan Whiteside";
        } else if(getFreeThrowPercentage() > 0.45){
            return "Steven Adams";
        } else if(getFreeThrowPercentage() > 0.40){
            return "Bismack Biyombo";
        } else if(getFreeThrowPercentage() > 0.35){
            return "Giannis Antetokounmpo";
        } else if(getFreeThrowPercentage() > 0.30){
            return "Shaq O'Neal";
        } else {
            return "Ben Simmons";
        }
         
    }

    public String getMidRangeComparison(){
        
        if(getMidRangePercentage() > 0.90){
            return "Kevin Durant";
        } else if(getMidRangePercentage() > 0.85){
            return "Kyrie Irving";
        } else if(getMidRangePercentage() > 0.80){
            return "Paul George";
        } else if(getMidRangePercentage() > 0.75){
            return "DeMar DeRozan";
        } else if(getMidRangePercentage() > 0.70){
            return "Gordon Hayward";
        } else if(getMidRangePercentage() > 0.65){
            return "Julius Randle";
        } else if(getMidRangePercentage() > 0.60){
            return "Jerami Grant";
        } else if(getMidRangePercentage() > 0.55){
            return "LeBron James";
        } else if(getMidRangePercentage() > 0.50){
            return "Russel Westbrook";
        } else if(getMidRangePercentage() > 0.45){
            return "John Wall";
        } else if(getMidRangePercentage() > 0.40){
            return "Markelle Fultz";
        } else if(getMidRangePercentage() > 0.35){
            return "Victor Oladipo";
        } else if(getMidRangePercentage() > 0.30){
            return "Giannis Antetokounmpo";
        } else {
            return "Ben Simmons";
        }
         
    }

    public void getStats(){
        System.out.println("Three Pointer: " + (getThreeBallPercentage() * 100) + "%\nComparison: " + getThreePointComparison() + "\n");
        System.out.println("Three Pointer Off Dribble: " + (getThreeBallOffDribblePercentage() * 100) + "%\nComparison: " + getThreePointOffDribleComparison() + "\n");
        System.out.println("Mid Range: " + (getMidRangePercentage() * 100) + "%\nComparison: " + getMidRangeComparison() + "\n");
        System.out.println("Mid Range Off Dribble: " + (getMidRangeOffDribblePercentage() * 100) + "%\nComparison: " + getMidRangeOffDribbleComparison() + "\n");
        System.out.println("Floater: " + (getFloaterPercentage() * 100) + "%\nComparison: " + getFloaterComparison() + "\n");
        System.out.println("Free Throw: " + (getFreeThrowPercentage() * 100) + "%\nComparison: " + getFreeThrowComparison());
        System.out.println("======================================================================================================");

    }

    public String returnStats(){
        String tp = "Three Pointer: " + (getThreeBallPercentage() * 100) + "%\nComparison: " + getThreePointComparison() + "\n";
        String tpOd = "Three Pointer Off Dribble: " + (getThreeBallOffDribblePercentage() * 100) + "%\nComparison: " + getThreePointOffDribleComparison() + "\n";
        String mr = "Mid Range: " + (getMidRangePercentage() * 100) + "%\nComparison: " + getMidRangeComparison() + "\n";
        String mrOD = "Mid Range Off Dribble: " + (getMidRangeOffDribblePercentage() * 100) + "%\nComparison: " + getMidRangeOffDribbleComparison() + "\n";
        String f = "Floater: " + (getFloaterPercentage() * 100) + "%\nComparison: " + getFloaterComparison() + "\n";
        String ft = "Free Throw: " + (getFreeThrowPercentage() * 100) + "%\nComparison: " + getFreeThrowComparison();
        String dash = "======================================================================================================";

        return tp + "\n" + tpOd + "\n"  + mr + "\n"  + mrOD + "\n"  + f + "\n"  + ft + "\n"  + dash;

    }

}