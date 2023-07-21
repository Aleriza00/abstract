import java.util.Arrays;

public class Farm2 {
    private String addres;
    private String ownerName;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;

    public Farm2(String addres, String ownerName, Cow[] cows, Horse[] horses, Sheep[] sheep) {
        this.addres = addres;
        this.ownerName = ownerName;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "Farm2{" +
                "addres='" + addres + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", cows=" + Arrays.toString(cows) +'\''+
                ", horses=" + Arrays.toString(horses) +'\''+
                ", sheep=" + Arrays.toString(sheep) +'\''+
                '}';
    }
}

