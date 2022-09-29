public class Rooms {

    //atributter
    private String name;
    private Rooms north;
    private Rooms east;
    private Rooms south;
    private Rooms west;


    //konstruktør
    public Rooms(String name) {this.name = name;}
        //todo laves setter og gettere der kan bruges i adventure klassen.

        public void setName(String name) {
        this.name = name;

        }
        public void setNorth(Rooms North){
        this.north = north;
        }
        public void setEast(Rooms east){this.east = east;}
        public void setWest(Rooms west){this.west = west;}
        public void setSouth(Rooms south){this.south = south;}


    //crontrolls

    private Rooms currentRoom;//skal sættet til det rum vi er i

    public Rooms(){

        Rooms room1 = new Rooms("room 1");
        Rooms room2 = new Rooms("room 2");
        Rooms room3 = new Rooms("room 3");
        Rooms room4 = new Rooms("room 4");
        Rooms room5 = new Rooms("room 5");
        Rooms room6 = new Rooms("room 6");
        Rooms room7 = new Rooms("room 7");
        Rooms room8 = new Rooms("room 8");
        Rooms room9 = new Rooms("room 9");

        room1.setName("room1");
        currentRoom = room1;
        room1.setEast(room2);
        room1.setSouth(room4);

        room2.setEast(room3);
        room2.setWest(room1);

        room3.setSouth(room6);
        room3.setWest(room2);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);


        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);

        room9.setNorth(room6);
        room9.setWest(room8);


        //todo lav metode for going(north,east,south og west)






    }




}
