package InitService;

import org.flywaydb.core.Flyway;

public class DBInitiation {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:h2:./tickets", null, null)
                .load();
        flyway.migrate();
    }
}