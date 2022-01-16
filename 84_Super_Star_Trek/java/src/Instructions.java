import java.io.PrintStream;

// REM INSTRUCTIONS FOR "SUPER STARTREK"  MAR 5, 1978
public class Instructions {

    public void instruct(PrintStream out) {
        out.println();
        out.println("          *************************************");
        out.println("          *                                   *");
        out.println("          *                                   *");
        out.println("          *      * * SUPER STAR TREK * *      *");
        out.println("          *                                   *");
        out.println("          *                                   *");
        out.println("          *************************************");
        out.println();

        var msg = "DO YOU NEED INSTRUCTIONS (Y/N) ? ";
        out.print(msg);
        if (Input.isNo(Input.inputString(Input.YES_NO_CHECKER, msg))) {
            return;
        }

        out.println("      INSTRUCTIONS FOR 'SUPER STAR TREK'");
        out.println();
        out.println("1. WHEN YOU SEE \"COMMAND\" PRINTED, ENTER ONE OF THE LEGAL");
        out.println("     COMMANDS (NAV,SRS,LRS,PHA,TOR,SHE,DAM,COM, OR XXX).");
        out.println("2. IF YOU SHOULD TYPE IN AN ILLEGAL COMMAND, YOU'LL GET A SHORT");
        out.println("     LIST OF THE LEGAL COMMANDS PRINTED OUT.");
        out.println("3. SOME COMMANDS REQUIRE YOU TO ENTER DATA (FOR EXAMPLE, THE");
        out.println("     'NAV' COMMAND COMES BACK WITH 'COURSE (1-9) ?'.)  IF YOU");
        out.println("     TYPE IN ILLEGAL DATA (LIKE NEGATIVE NUMBERS), THAN COMMAND");
        out.println("     WILL BE ABORTED");
        out.println();
        out.println("     THE GALAXY IS DIVIDED INTO AN 8 X 8 QUADRANT GRID,");
        out.println("AND EACH QUADRANT IS FURTHER DIVIDED INTO AN 8 X 8 SECTOR GRID.");
        out.println();
        out.println("     YOU WILL BE ASSIGNED A STARTING POINT SOMEWHERE IN THE");
        out.println("GALAXY TO BEGIN A TOUR OF DUTY AS COMMANDER OF THE STARSHIP");
        out.println("ENTERPRISE; YOUR MISSION: TO SEEK AND DESTROY THE FLEET OF");
        out.println("KLINGON WARSHIPS WHICH ARE MENACING THE UNITED FEDERATION OF");
        out.println("PLANETS.");
        out.println();
        out.println("     YOU HAVE THE FOLLOWING COMMANDS AVAILABLE TO YOU AS CAPTAIN");
        out.println("OF THE STARSHIP ENTERPRISE:");
        out.println();
        out.println("\"NAV\" COMMAND = WARP ENGINE CONTROL --");
        out.println("     COURSE IS IN A CIRCULAR NUMERICAL      4  3  2");
        out.println("     VECTOR ARRANGEMENT AS SHOWN             . . .");
        out.println("     INTEGER AND REAL VALUES MAY BE           ...");
        out.println("     USED.  (THUS COURSE 1.5 IS HALF-     5 ---*--- 1");
        out.println("     WAY BETWEEN 1 AND 2                      ...");
        out.println("                                             . . .");
        out.println("     VALUES MAY APPROACH 9.0, WHICH         6  7  8");
        out.println("     ITSELF IS EQUIVALENT TO 1.0");
        out.println("                                            COURSE");
        out.println("     ONE WARP FACTOR IS THE SIZE OF ");
        out.println("     ONE QUADTANT.  THEREFORE, TO GET");
        out.println("     FROM QUADRANT 6,5 TO 5,5, YOU WOULD");
        out.println("     USE COURSE 3, WARP FACTOR 1.");
        out.println();
        out.println("\"SRS\" COMMAND = SHORT RANGE SENSOR SCAN");
        out.println("     SHOWS YOU A SCAN OF YOUR PRESENT QUADRANT.");
        out.println();
        out.println("     SYMBOLOGY ON YOUR SENSOR SCREEN IS AS FOLLOWS:");
        out.println("        <*> = YOUR STARSHIP'S POSITION");
        out.println("        +K+ = KLINGON BATTLE CRUISER");
        out.println("        >!< = FEDERATION STARBASE (REFUEL/REPAIR/RE-ARM HERE!)");
        out.println("         *  = STAR");
        out.println();
        out.println("     A CONDENSED 'STATUS REPORT' WILL ALSO BE PRESENTED.");
        out.println();
        out.println("\"LRS\" COMMAND = LONG RANGE SENSOR SCAN");
        out.println("     SHOWS CONDITIONS IN SPACE FOR ONE QUADRANT ON EACH SIDE");
        out.println("     OF THE ENTERPRISE (WHICH IS IN THE MIDDLE OF THE SCAN)");
        out.println("     THE SCAN IS CODED IN THE FORM ###, WHERE TH UNITS DIGIT");
        out.println("     IS THE NUMBER OF STARS, THE TENS DIGIT IS THE NUMBER OF");
        out.println("     STARBASES, AND THE HUNDRESDS DIGIT IS THE NUMBER OF");
        out.println("     KLINGONS.");
        out.println();
        out.println("     EXAMPLE - 207 = 2 KLINGONS, NO STARBASES, & 7 STARS.");
        out.println();
        out.println("\"PHA\" COMMAND = PHASER CONTROL.");
        out.println("     ALLOWS YOU TO DESTROY THE KLINGON BATTLE CRUISERS BY ");
        out.println("     ZAPPING THEM WITH SUITABLY LARGE UNITS OF ENERGY TO");
        out.println("     DEPLETE THEIR SHIELD POWER.  (REMEMBER, KLINGONS HAVE");
        out.println("     PHASERS TOO!)");
        out.println();
        out.println("\"TOR\" COMMAND = PHOTON TORPEDO CONTROL");
        out.println("     TORPEDO COURSE IS THE SAME AS USED IN WARP ENGINE CONTROL");
        out.println("     IF YOU HIT THE KLINGON VESSEL, HE IS DESTROYED AND");
        out.println("     CANNOT FIRE BACK AT YOU.  IF YOU MISS, YOU ARE SUBJECT TO");
        out.println("     HIS PHASER FIRE.  IN EITHER CASE, YOU ARE ALSO SUBJECT TO ");
        out.println("     THE PHASER FIRE OF ALL OTHER KLINGONS IN THE QUADRANT.");
        out.println();
        out.println("     THE LIBRARY-COMPUTER (\"COM\" COMMAND) HAS AN OPTION TO ");
        out.println("     COMPUTE TORPEDO TRAJECTORY FOR YOU (OPTION 2)");
        out.println();
        out.println("\"SHE\" COMMAND = SHIELD CONTROL");
        out.println("     DEFINES THE NUMBER OF ENERGY UNITS TO BE ASSIGNED TO THE");
        out.println("     SHIELDS.  ENERGY IS TAKEN FROM TOTAL SHIP'S ENERGY.  NOTE");
        out.println("     THAN THE STATUS DISPLAY TOTAL ENERGY INCLUDES SHIELD ENERGY");
        out.println();
        out.println("\"DAM\" COMMAND = DAMAGE CONTROL REPORT");
        out.println("     GIVES THE STATE OF REPAIR OF ALL DEVICES.  WHERE A NEGATIVE");
        out.println("     'STATE OF REPAIR' SHOWS THAT THE DEVICE IS TEMPORARILY");
        out.println("     DAMAGED.");
        out.println();
        out.println("\"COM\" COMMAND = LIBRARY-COMPUTER");
        out.println("     THE LIBRARY-COMPUTER CONTAINS SIX OPTIONS:");
        out.println("     OPTION 0 = CUMULATIVE GALACTIC RECORD");
        out.println("        THIS OPTION SHOWES COMPUTER MEMORY OF THE RESULTS OF ALL");
        out.println("        PREVIOUS SHORT AND LONG RANGE SENSOR SCANS");
        out.println("     OPTION 1 = STATUS REPORT");
        out.println("        THIS OPTION SHOWS THE NUMBER OF KLINGONS, STARDATES,");
        out.println("        AND STARBASES REMAINING IN THE GAME.");
        out.println("     OPTION 2 = PHOTON TORPEDO DATA");
        out.println("        WHICH GIVES DIRECTIONS AND DISTANCE FROM THE ENTERPRISE");
        out.println("        TO ALL KLINGONS IN YOUR QUADRANT");
        out.println("     OPTION 3 = STARBASE NAV DATA");
        out.println("        THIS OPTION GIVES DIRECTION AND DISTANCE TO ANY ");
        out.println("        STARBASE WITHIN YOUR QUADRANT");
        out.println("     OPTION 4 = DIRECTION/DISTANCE CALCULATOR");
        out.println("        THIS OPTION ALLOWS YOU TO ENTER COORDINATES FOR");
        out.println("        DIRECTION/DISTANCE CALCULATIONS");
        out.println("     OPTION 5 = GALACTIC /REGION NAME/ MAP");
        out.println("        THIS OPTION PRINTS THE NAMES OF THE SIXTEEN MAJOR ");
        out.println("        GALACTIC REGIONS REFERRED TO IN THE GAME.");
    }
}
