package overcome;

public class Wall implements Obstacle{

    String name;
    Integer height;

    public Wall(Integer wall, String name){
        this.height = wall;
        this.name = name;
    }
    @Override
    public boolean overcome(Participant participant) {
        /*if(height <= participant.getJumpHeight()){
            return true;
        }
        return false;
         */
        return height <= participant.getJumpHeight();
    }

    public String getObstacleName() {
        return name;
    }
}
