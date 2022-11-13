package overcome;

public abstract class Participant {

    String name;
    Integer jumpHeight;

    Integer runDistance;

    public Participant(Integer jumpHeight, Integer runDistance, String name){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public String getName() {
        return name;
    }

    public Integer getRunDistance() {
        return runDistance;
    }

    public Integer getJumpHeight(){ return jumpHeight; }

    public String toString(){
        return "Учасник " + name + " може стрибнути на " + jumpHeight + "м"
                + " та пробігти " + runDistance + "м";
    }
}
