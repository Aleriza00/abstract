public class Main {
    public static void main(String[] args) {

        Cow cow  = new Cow(100,7,"female","Mo-mo");
        Cow cow2 = new Cow(100,7,"female","Rose");
        Horse horse =  new Horse(130,21,"male","Nick");
        Horse horse2 =  new Horse(130,21,"male","Rock2");
        Horse horse3 =  new Horse(130,21,"male","Rock3");
        Horse horse4 =  new Horse(130,21,"male","Rock4");
        Horse horse5 =  new Horse(130,21,"male","Rock5");
        Sheep sheep =  new Sheep(50,7,"male","Mesal");
        Sheep sheep2 =  new Sheep(50,7,"male","Nea");
       Sheep sheep3=  new Sheep(50,7,"male","Nea2");
        Cow [] cows = {cow,cow2};
        Horse[]horses ={horse,horse2,horse3,horse4,horse5};
        Sheep[] sheep1={sheep,sheep2,sheep3};


        Farm farm = new Farm("Ala-Too","Sagynov N",cows,horses,sheep1);
        System.out.println(farm);

        Farm2 farm2 = new Farm2("Jailoo","Bakytov N",cows,horses,sheep1);
        System.out.println(farm2);

    }
}