import java.util.HashMap;

public class DBMS {
    // key / value : Row 객체의 name / Row
    private HashMap<String, Row> db = new HashMap<>();

    public DBMS() {
        db.put("jiyongyoon", new Row("JiYongYoon", "1900-01-01", "jyyoon@abc"));
        db.put("ganakim", new Row("GanaKim", "2000-05-05", "gana@abc"));
        db.put("daralee", new Row("DaraLee", "1977-07-07", "dara@abc"));
    }

    public Row query(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return db.get(name.toLowerCase());
    }
}
