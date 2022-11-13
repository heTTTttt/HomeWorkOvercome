package overcome;

public class Main {

    public static void main(String[] args) {
        Obstacle[] obstacles = new Obstacle[6];
        obstacles[0] = new Wall(1, "Wall 1m");
        obstacles[1] = new RaceTrack(300, "RaceTrack 300m");
        obstacles[2] = new Wall(2, "Wall 2m");
        obstacles[3] = new RaceTrack(600, "RaceTrack 600m");
        obstacles[4] = new Wall(3, "Wall 3m");
        obstacles[5] = new RaceTrack(900, "RaceTrack 900m");
        Participant[] participants = new Participant[3];
        participants[0] = new Cat(3, 600, "Tisha");
        participants[1] = new Human(2, 900, "Dr.Jekyll or Mr.Hide");
        participants[2] = new Robot(300, 250_000, "Steel Giant");

        System.out.println("Учасник може стрибнути на " + participants[0].getJumpHeight() + "m");
        System.out.println("Учасник може пробігти " + participants[0].getRunDistance() + "m");
        System.out.println(participants[0]);
        System.out.println(participants[1]);
        System.out.println(participants[2]);
        System.out.println("-----------------------------------------");

        for(Participant participant : participants){

            for (Obstacle obstacle : obstacles){
                if (obstacle.overcome(participant)) {
                    System.out.println("Гравець "+ participant.getName() + " перешкоду " + obstacle.getObstacleName() + " здолав ");
                }else{
                    System.out.println("Гравець " + participant.getName() + " вибуває після перешкоди " + obstacle.getObstacleName());
                    break;
                }
            }
        }
    }
}
