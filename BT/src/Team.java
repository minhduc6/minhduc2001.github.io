
import java.util.ArrayList;
import java.util.Random;


public class Team {

     


     ArrayList<Player> allPlay = new ArrayList<>();
     ArrayList<Player> buildTeam1 = new ArrayList<>();

     public ArrayList<Player> gArrayList()
     {

          Player p1 = new Player("MarcAndré ter Stegen", Position.GK, 1);
          Player p2 = new Player("Sergiño Dest ", Position.DF, 2);
          Player p3 = new Player("Gerard Piqué ", Position.DF, 3);
          Player p4 = new Player("Ronald Araújo ", Position.DF, 4);
          Player p5 = new Player("Sergio Busquets ", Position.MF, 5);
          Player p6 = new Player("Antoine Griezmann ", Position.FW, 6);
          Player p7 = new Player("Miralem Pjanić", Position.MF, 7);
          Player p8 = new Player("Martin Braithwaite ", Position.FW, 8);
          Player p9 = new Player("Lionel Messi  ", Position.FW, 9);
          Player p10 = new Player("Ousmane Dembélé  ", Position.FW, 10);
          Player p11 = new Player("Riqui Puig", Position.MF, 11);
          Player p12 = new Player("Neto", Position.GK, 12);
          Player p13 = new Player("Clément Lenglet", Position.DF, 13);
          Player p14 = new Player("Pedri", Position.MF, 14);
          Player p15 = new Player("Francisco Trincão", Position.FW, 15);
          Player p16 = new Player("Jordi Alba", Position.DF, 16);
          Player p17 = new Player("Matheus Fernandes ", Position.MF, 17);
          Player p18 = new Player("Sergi Roberto", Position.DF, 18);
          Player p19 = new Player("Frenkie de Jong ", Position.MF, 19);
          Player p20 = new Player("Ansu Fati   ", Position.FW, 20);
          Player p21 = new Player("Samuel Umtiti ", Position.DF, 21);
          Player p22 = new Player("Junior Firpo  ", Position.DF, 22);
          allPlay.add(p1);
          allPlay.add(p2);
          allPlay.add(p3);
          allPlay.add(p4);
          allPlay.add(p5);
          allPlay.add(p6);
          allPlay.add(p7);
          allPlay.add(p8);
          allPlay.add(p9);
          allPlay.add(p10);
          allPlay.add(p11);
          allPlay.add(p12);
          allPlay.add(p13);
          allPlay.add(p14);
          allPlay.add(p15);
          allPlay.add(p16);
          allPlay.add(p17);
          allPlay.add(p18);
          allPlay.add(p19);
          allPlay.add(p20);
          allPlay.add(p21);
          allPlay.add(p22);
          return allPlay;
     }

     public ArrayList<Player> buidTeam(int x,int y,int z)
     {

          Random random = new Random();
          int sizeKeeper = 0;
          int sizeDF = 0;
          int sizeMF = 0;
          int sizeFW = 0;

          while (sizeKeeper < 1) {
               int randomGK = random.nextInt(22);
               if (allPlay.get(randomGK).getPosition().equals(Position.GK)) {
                    buildTeam1.add(allPlay.get(randomGK));
                    sizeKeeper++;
               }
          }

          while (sizeDF < x) {
               int randomDF = random.nextInt(22);
               if (allPlay.get(randomDF).getPosition().equals(Position.DF)
                         && !buildTeam1.contains(allPlay.get(randomDF))){
                    buildTeam1.add(allPlay.get(randomDF));
                    sizeDF++;
               }
          }

          while (sizeMF < y) {
               int randomMF = random.nextInt(22);
               if (allPlay.get(randomMF).getPosition().equals(Position.MF)
                         && !buildTeam1.contains(allPlay.get(randomMF))) {
                    buildTeam1.add(allPlay.get(randomMF));
                    sizeMF++;
               }
          }

          while (sizeFW < z) {
               int randomFW = random.nextInt(22);
               if (allPlay.get(randomFW).getPosition().equals(Position.FW)
                         && !buildTeam1.contains(allPlay.get(randomFW))) {
                    buildTeam1.add(allPlay.get(randomFW));
                    sizeFW++;
               }
          }

         
          return buildTeam1;
     }
     
     public void showALl()
     {
          for (Player player : allPlay) {

               System.out.println(player.toString());
          }
     }

     public void showBuild()
     {
          for (Player player1 : buildTeam1) {
               System.out.println(player1.toString());
          }
     }


     
}
