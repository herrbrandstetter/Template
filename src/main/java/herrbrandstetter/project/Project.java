package herrbrandstetter.project;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Project.MOD_ID)
public class Project {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "project";

    public Project() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
