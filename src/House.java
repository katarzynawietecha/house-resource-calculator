public class House {
    double water = 500;
    double oil = 350;

    House (double houseWater, double houseOil) {
        water = houseWater;
        oil = houseOil;
    }

    void takeShower () {
        water -= 48;
    }

    void takeBath () {
       water -= 86;
    }

    void makeDinner () {
        water -= 4;
        oil -= 0.1;
    }

    void boilWater () {
        water -= 0.5;
        oil -= 0.05;
    }

    void watchTv (int hours) {
        oil -= hours * 0.06;
    }

    void addResource(double newWater, double newOil) {
       water += newWater;
       oil += newOil;
    }

    String getResourchesInfo () {
        return "Dostępna woda: " + water + " litrów, dostępna ropa: " + oil + "  litrów.";
    }
}