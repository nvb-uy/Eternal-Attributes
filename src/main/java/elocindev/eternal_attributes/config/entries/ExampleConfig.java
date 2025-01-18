package elocindev.eternal_attributes.config.entries;

import elocindev.eternal_attributes.EternalAttributes;
import elocindev.necronomicon.api.config.v1.NecConfigAPI;
import elocindev.necronomicon.config.NecConfig;

public class ExampleConfig {
    @NecConfig public static ExampleConfig INSTANCE;


    public static String getFile() {
        return NecConfigAPI.getFile(EternalAttributes.MODID+".json5");
    }

    public String myString = "example";
    public int myNumber = 1;
    public boolean myBoolean = true;
    public double myDouble = 1.0;
}
