import com.home.dto.EdgeDTO;
import com.home.search.DepthFirstSearch;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class DepthFirstSearchTest {

    private DepthFirstSearch depthFirstSearch = new DepthFirstSearch();

    @Test
    public void shouldAssertRouteExistence() {
        //given-when
        boolean isRouteExists = depthFirstSearch.isPathExists("WRO", "MAD", UtilTest.createRoutes());

        //then
        Assert.assertTrue(isRouteExists);
    }

    @Test
    public void shouldAssertRouteAbsence() {
        //given-when
        boolean isRouteExists = depthFirstSearch.isPathExists("WRO", "MAD",
                List.of(new EdgeDTO("WRO", "GRO"), new EdgeDTO("WAW", "WRO"),
                new EdgeDTO("GRO", "WAW"), new EdgeDTO("WRO", "BCN")));

        //then
        Assert.assertFalse(isRouteExists);
    }
}
