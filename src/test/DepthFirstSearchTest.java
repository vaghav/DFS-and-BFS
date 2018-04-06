import com.home.dto.Edge;
import com.home.search.DepthFirstSearch;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class DepthFirstSearchTest {

    private DepthFirstSearch<String> depthFirstSearch = new DepthFirstSearch<>();

    @Test
    public void shouldAssertRouteExistence() {
        //given-when
        boolean isRouteExists = depthFirstSearch.isPathExists("A", "F", UtilTest.createRoutes());

        //then
        Assert.assertTrue(isRouteExists);
    }

    @Test
    public void shouldAssertRouteAbsence() {
        //given-when
        boolean isRouteExists = depthFirstSearch.isPathExists("WRO", "MAD",
                List.of(new Edge("WRO", "GRO"), new Edge("WAW", "WRO"),
                new Edge("GRO", "WAW"), new Edge("WRO", "BCN")));

        //then
        Assert.assertFalse(isRouteExists);
    }
}
