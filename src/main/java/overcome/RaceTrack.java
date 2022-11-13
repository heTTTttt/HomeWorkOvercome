package overcome;

public class RaceTrack implements Obstacle {
    Integer distance;

    String name;
    public RaceTrack(Integer raceTrack, String name){
        this.distance = raceTrack;
        this.name = name;
    }

    @Override
    public boolean overcome(Participant participant) {
        /*if(distance <= participant.getRunDistance()){
            return true;
        }
        return false;
         */
        return distance <= participant.getRunDistance();
    }

    public String getObstacleName() {
        return name;
    }
}
