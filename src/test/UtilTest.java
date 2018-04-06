import com.home.dto.EdgeDTO;

import java.util.List;

public class UtilTest {

    private UtilTest() {
    }

    public static List<EdgeDTO> createRoutes() {
        return List.of(new EdgeDTO("A", "B"),
                new EdgeDTO("A", "C"),   new EdgeDTO("B", "C"),
                new EdgeDTO("B", "D"), new EdgeDTO("B", "E"),
                new EdgeDTO("D", "F"), new EdgeDTO("E", "F"),
                new EdgeDTO("C", "G"));
    }
}
