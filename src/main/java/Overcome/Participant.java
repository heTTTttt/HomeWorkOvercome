package Overcome;

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
}
