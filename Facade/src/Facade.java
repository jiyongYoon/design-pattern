import java.util.ArrayList;

public class Facade {
    DBMS dbms = new DBMS();
    Cache cache = new Cache();

    public void run(ArrayList<String> nameList) {
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
    }
}
