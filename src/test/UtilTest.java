import com.home.dto.EdgeDTO;

import java.util.List;

public class UtilTest {

    private UtilTest() {
    }

    public static List<EdgeDTO> createRoutes() {
        return List.of(new EdgeDTO("WRO", "GRO"),
                new EdgeDTO("WAW", "WRO"),
                new EdgeDTO("GRO", "WAW"), new EdgeDTO("WRO", "BCN"),
                new EdgeDTO("BCN", "SVO"), new EdgeDTO("WRO", "SVO"),
                new EdgeDTO("WAW", "SVO"), new EdgeDTO("WRO", "LIS"),
                new EdgeDTO("WRO", "SVO"), new EdgeDTO("SVO", "WAW"),
                new EdgeDTO("BCN", "QAT"), new EdgeDTO("QAT", "FRN"),
                new EdgeDTO("FRN", "CCV"), new EdgeDTO("CCV", "SSS"),
                new EdgeDTO("WAW", "MAD"), new EdgeDTO("MAD", "BCN"));
    }
}
