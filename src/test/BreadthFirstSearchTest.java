import com.home.dto.Edge;
import com.home.search.BreadthFirstSearch;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BreadthFirstSearchTest {

    private BreadthFirstSearch<String> breadthSearch = new BreadthFirstSearch<>();

    @Test
    public void shouldAssertRouteExistence() {
        //given-when
        boolean isRouteExists = breadthSearch.isPathExists("A", "F", UtilTest.createRoutes());

        //then
        Assert.assertTrue(isRouteExists);
    }

    @Test
    public void shouldAssertRouteAbsence() {
        //given-when
        boolean isRouteExists = breadthSearch.isPathExists("WRO", "MAD",
                List.of(new Edge("WRO", "GRO"), new Edge("WAW", "WRO"), new Edge("GRO", "WAW"),
                        new Edge("WRO", "BCN")));

        //then
        Assert.assertFalse(isRouteExists);
    }
}
