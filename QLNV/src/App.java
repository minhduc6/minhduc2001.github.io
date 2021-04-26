import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<BoiBan> listBBan = new ArrayList<>();
        ArrayList<Bep> listBep = new ArrayList<>();
        Bep bep1 = new Bep("1", "A", 18, 1000L, 5000L);
        Bep bep2 = new Bep("2", "D", 18, 2000L, 5000L);
        Bep bep3 = new Bep("3", "C", 18, 500L, 5000L);
        listBep.add(bep1);
        listBep.add(bep2);
        listBep.add(bep3);
        BoiBan bb1 = new BoiBan("14", "E", 18, 10000L, 5000L);
        BoiBan bb2 = new BoiBan("15", "D", 18, 2000L, 5000L);
        BoiBan bb3 = new BoiBan("16", "K", 18, 500L, 5000L);
        listBBan.add(bb1);
        listBBan.add(bb2);
        listBBan.add(bb3);
        System.out.println("Danh sách Bếp :");
        listBep.forEach(System.out::println);
        System.out.println("Danh sách Bồi Bàn :");
        listBBan.forEach(System.out::println);

        System.out.println("Danh sách Bếp theo Tên:");
        Collections.sort(listBep, (o1, o2) -> Bep.comparatorName(o1, o2));
        listBep.forEach(System.out::println);


        System.out.println("Danh Sách bếp Theo Lương :");
        Collections.sort(listBep, (o1, o2) -> Bep.comparatorSalary(o1, o2));
        listBep.forEach(System.out::println);


        System.out.println("Danh sách Bồi Bàn theo Tên:");
        Collections.sort(listBBan, (g1, g2) -> BoiBan.comparatorName(g1, g2));
        listBBan.forEach(System.out::println);


        System.out.println("Danh Sách Bồi Bàn Theo Lương :");
        Collections.sort(listBBan, (o1, o2) -> BoiBan.comparatorSalary(o1, o2));
        listBBan.forEach(System.out::println);
        
    }
}
