public class Player
{
     private String name;
     private Position position;
     private int num;

     public Player() {
     }

     public Player(String name, Position position, int num) {
          this.name = name;
          this.position = position;
          this.num = num;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Position getPosition() {
          return position;
     }

     public void setPosition(Position position) {
          this.position = position;
     }

     public int getNum() {
          return num;
     }

     public void setNum(int num) {
          this.num = num;
     }

     @Override
     public String toString() {
          return  num + " - " + name + " - " + position ;
     }


     

     
      
     

     

     
}