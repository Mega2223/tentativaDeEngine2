package Mega2223.engine2.exampleUsage;
import Mega2223.engine2.util.*;

@SuppressWarnings("unused")
//this is no use, I'll try to remove this as fast as I can
public class main {
    //TODO: remove run methods to make this thing implementable in other projects
    //btw, TODO: javadoc (and documentation, obiously)
    //and also, TODO: put evertything of this class that you can on the Board class or other implementable classesj
    public static Boolean debugMode = true;
    public static int debugModePriority = 3;
    public static board Board = new board();
    public static int Turn = 0; //turn count
    public static double turnRate = 0.5; //turns per second

    public static final int DEBUGMODE_EVERYTHING = 0;
    public static final int DEBUGMODE_EVERYTHING_BUT_ENTITIES = 1;
    public static final int DEBUGMODE_ONLY_RELEVANT = 2;
    public static final int DEBUGMODE_ONLY_PRIORITY = 3;


}
