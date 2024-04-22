package p5_storage.infrastructure;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import p5_storage.domain.BankAccount;
import p5_storage.domain.BankAccountRepository;
import p5_storage.domain.events.DomainEvent;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class SQLiteBankAccountRepository implements BankAccountRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final ObjectMapper objectMapper;

    public SQLiteBankAccountRepository(NamedParameterJdbcTemplate jdbcTemplate, ObjectMapper objectMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.objectMapper = objectMapper;
    }

    @Override public BankAccount findById(int id) {
        // TODO: Implement
        return null;
    }

    @Override public void save(BankAccount bankAccount) {
        // TIP: this is how you can make SQL select
        // The query below is just an example
        // It shows how to run a query with a parameter (:input)
        // And get the result (max_id)
        // It returns null if nothing was found
        Integer id = jdbcTemplate.queryForObject("""
                        SELECT max(id) AS max_id
                        FROM events
                        WHERE id > :input
                        """,
                Map.of("input", 42),
                (rs, rowNum) -> rs.getInt("max_id"));

        // TIP: this is how you can make SQL update
        jdbcTemplate.update("""
                INSERT INTO events ()
                            VALUES ()
                """, Map.of());

        // TODO: Implement
    }

    @Override public List<DomainEvent> events(int id) {
        // TODO: Implement
        return null;
    }

    // TIP: this method takes any object and returns JSON string
    // To make if work (without additional magic) your object has to have public getter and setters or be a record
    private String toJSON(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    // TIP: this method takes any object and returns JSON string
    // To make if work (without additional magic) your object has to have public getter and setters or be a record
    // Usage: MyObject result = (MyObject) fromJSON(jsonString, "packages.to.my.MyObject");
    private Object fromJSON(String data, String type) {
        try {
            // Expectation: every event in the table keeps its type
            return objectMapper.readValue(data, Class.forName(type));
        } catch (JsonProcessingException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
