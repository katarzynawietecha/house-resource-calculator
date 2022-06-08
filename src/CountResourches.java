public class CountResourches {
    public static void main(String[] args) {
        House house1 = new House (450, 225);

        house1.takeShower();
        System.out.println(house1.getResourchesInfo());

        house1.takeBath();
        System.out.println(house1.getResourchesInfo());

        house1.makeDinner();
        System.out.println(house1.getResourchesInfo());

        house1.boilWater();
        System.out.println(house1.getResourchesInfo());

        house1.watchTv(2);
        System.out.println(house1.getResourchesInfo());

        house1.addResource(10, 0);
        System.out.println(house1.getResourchesInfo());
    }
}
