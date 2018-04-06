import com.home.dto.Edge;

import java.util.List;

public class UtilTest {

    private UtilTest() {
    }

    public static List<Edge> createRoutes() {
        return List.of(new Edge("A", "B"),
                new Edge("A", "C"),   new Edge("B", "C"),
                new Edge("B", "D"), new Edge("B", "E"),
                new Edge("D", "F"), new Edge("E", "F"),
                new Edge("C", "G"));
    }
}
