import com.home.dto.EdgeDTO;
import com.home.search.BreadthFirstSearch;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BreadthFirstSearchTest {

    private BreadthFirstSearch breadthSearch = new BreadthFirstSearch();

    @Test
    public void shouldAssertRouteExistence() {
        //given-when
        boolean isRouteExists = breadthSearch.isPathExists("WRO", "MAD", UtilTest.createRoutes());

        //then
        Assert.assertTrue(isRouteExists);
    }

    @Test
    public void shouldAssertRouteAbsence() {
        //given-when
        boolean isRouteExists = breadthSearch.isPathExists("WRO", "MAD",
                List.of(new EdgeDTO("WRO", "GRO"), new EdgeDTO("WAW", "WRO"), new EdgeDTO("GRO", "WAW"),
                        new EdgeDTO("WRO", "BCN")));

        //then
        Assert.assertFalse(isRouteExists);
    }
}
