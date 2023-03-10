import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("JiyongYoon");
        nameList.add("JiyongYoon");
        nameList.add("Dorosh");

        /*
        DBMS dbms = new DBMS();
        Cache cache = new Cache();

        for (String name : nameList) {
            Row row = cache.get(name.toLowerCase());
            if (row == null) {
                row = dbms.query(name);
                if (row != null) {
                    cache.put(row);
                    System.out.println("[log] save to cache");
                }
            } else {
                System.out.println("[log] get from cache");
            }

            if (row != null) {
                Message message = new Message(row);

                System.out.println(message.makeName());
                System.out.println(message.makeBirthday());
                System.out.println(message.makeEmail());
            } else {
                System.out.println(name + " is not exists.");
            }
        }
         */

        Facade facade = new Facade();
        facade.run(nameList);
    }
}
