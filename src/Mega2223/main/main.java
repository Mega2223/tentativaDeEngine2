package Mega2223.main;
import Mega2223.util.*;

import java.util.List;

@SuppressWarnings("unused")
public class main {
    public static Boolean debugMode = true;
    public static int debugModePriority = 0;
    public static board Board = new board();
    public static int Turn = 0;

    public static final int DEBUGMODE_EVERYTHING = 0;
    public static final int DEBUGMODE_EVERYTHING_BUT_ENTITIES = 1;
    public static final int DEBUGMODE_ONLY_RELEVANT = 2;
    public static final int DEBUGMODE_ONLY_PRIORITY = 3;


}