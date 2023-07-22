public class Main {
    public static void main(String[] args) {

        Cow cow  = new Cow(100,7,"female","Cow");
        Cow cow2 = new Cow(100,7,"female","Cow2");
        Horse horse =  new Horse(130,21,"male","Horse");
        Horse horse2 =  new Horse(130,21,"male","Horse2");
        Horse horse3 =  new Horse(130,21,"male","Horse3");
        Horse horse4 =  new Horse(130,21,"male","Horse4");
        Horse horse5 =  new Horse(130,21,"male","Horse5");
        Sheep sheep =  new Sheep(50,7,"male","Sheep");
        Sheep sheep2 =  new Sheep(50,7,"male","Sheep2");
       Sheep sheep3=  new Sheep(50,7,"male","Sheep3");



        Farm farm = new Farm("Ala-Too","Sagynov N",new Cow[]{cow,cow2},
                new Horse[]{horse,horse2,horse3,horse4,horse5},
                new Sheep[]{sheep,sheep2,sheep3});
        System.out.println(farm);

        Farm2 farm2 = new Farm2("Jailoo","Bolotov N",new Cow[]{cow},
                new Horse[]{horse},
                new Sheep[]{sheep});
        System.out.println(farm2);

    }
}