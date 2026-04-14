import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testCargo_SafeAssignment() {
        TrainConsistManagementApp.GoodsBogie g =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

        g.assignCargo("Petroleum");

        assertTrue(g.isCargoAssigned());
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        TrainConsistManagementApp.GoodsBogie g =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        g.assignCargo("Petroleum");

        assertFalse(g.isCargoAssigned());
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        TrainConsistManagementApp.GoodsBogie g =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        g.assignCargo("Petroleum");

        assertNull(g.cargo);
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        TrainConsistManagementApp.GoodsBogie g1 =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        TrainConsistManagementApp.GoodsBogie g2 =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

        g1.assignCargo("Petroleum");
        g2.assignCargo("Coal");

        assertTrue(g2.isCargoAssigned());
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        TrainConsistManagementApp.GoodsBogie g =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        g.assignCargo("Petroleum");

        assertFalse(g.isCargoAssigned());
    }
}