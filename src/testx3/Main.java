package testx3;

/**
 * Created by raimon on 2017-08-15.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import testx3.DijkstraAlgorithm;
import testx3.Edge;
import testx3.Graph;
import testx3.Vertex;

public class Main {

    private List<Vertex> nodes;
    private ArrayList<Edge> edges;
    private ArrayList<Edge> origEdges;

    public void init() {
        nodes = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();

        Vertex location = new Vertex("Node_0", "KingdomEnd");
        nodes.add(location);
        location = new Vertex("Node_1", "RolkDrift");
        nodes.add(location);
        location = new Vertex("Node_2", "QueenSpace");
        nodes.add(location);
        location = new Vertex("Node_3", "MenelausFrontier");
        nodes.add(location);
        location = new Vertex("Node_4", "CeoBuckzoid");
        nodes.add(location);
        location = new Vertex("Node_5", "TeladiGain");
        nodes.add(location);
        location = new Vertex("Node_6", "FamilyWhi");
        nodes.add(location);
        location = new Vertex("Node_7", "KuiperBelt");
        nodes.add(location);
        location = new Vertex("Node_8", "Uranus2");
        nodes.add(location);
        location = new Vertex("Node_9", "Titan");
        nodes.add(location);
        location = new Vertex("Node_10", "TheVault");
        nodes.add(location);
        location = new Vertex("Node_11", "Unknown1");
        nodes.add(location);
        location = new Vertex("Node_12", "Xenon534");
        nodes.add(location);
        location = new Vertex("Node_13", "Xenon596");
        nodes.add(location);
        location = new Vertex("Node_14", "ThreeWorlds");
        nodes.add(location);
        location = new Vertex("Node_15", "PowerCircle");
        nodes.add(location);
        location = new Vertex("Node_16", "AntigoneMemorial");
        nodes.add(location);
        location = new Vertex("Node_17", "RolkFate");
        nodes.add(location);
        location = new Vertex("Node_18", "ProfitShare");
        nodes.add(location);
        location = new Vertex("Node_19", "Seizewell");
        nodes.add(location);
        location = new Vertex("Node_20", "FamilyZein");
        nodes.add(location);
        location = new Vertex("Node_21", "OortCloud");
        nodes.add(location);
        location = new Vertex("Node_22", "Pluto");
        nodes.add(location);
        location = new Vertex("Node_23", "Neptune");
        nodes.add(location);
        location = new Vertex("Node_24", "Uranus");
        nodes.add(location);
        location = new Vertex("Node_25", "Saturn");
        nodes.add(location);
        location = new Vertex("Node_26", "Mercury");
        nodes.add(location);
        location = new Vertex("Node_27", "ShareholderFortune");
        nodes.add(location);
        location = new Vertex("Node_28", "Saturn4");
        nodes.add(location);
        location = new Vertex("Node_29", "Saturn3");
        nodes.add(location);
        location = new Vertex("Node_30", "GetsuFune");
        nodes.add(location);
        location = new Vertex("Node_31", "MenelausParadise");
        nodes.add(location);
        location = new Vertex("Node_32", "Xenon597");
        nodes.add(location);
        location = new Vertex("Node_33", "GuidingStar");
        nodes.add(location);
        location = new Vertex("Node_34", "CloudbaseNW");
        nodes.add(location);
        location = new Vertex("Node_35", "HerronNebula");
        nodes.add(location);
        location = new Vertex("Node_36", "TheHole");
        nodes.add(location);
        location = new Vertex("Node_37", "AtreusClouds");
        nodes.add(location);
        location = new Vertex("Node_38", "SpaceweedDrift");
        nodes.add(location);
        location = new Vertex("Node_39", "GreaterProfit");
        nodes.add(location);
        location = new Vertex("Node_40", "ThurukPride");
        nodes.add(location);
        location = new Vertex("Node_41", "FamilyPride");
        nodes.add(location);
        location = new Vertex("Node_42", "RhonkarMight");
        nodes.add(location);
        location = new Vertex("Node_43", "PatriarchRetreat");
        nodes.add(location);
        location = new Vertex("Node_44", "Uranus3");
        nodes.add(location);
        location = new Vertex("Node_45", "Jupiter");
        nodes.add(location);
        location = new Vertex("Node_46", "Venus");
        nodes.add(location);
        location = new Vertex("Node_47", "TheMoon");
        nodes.add(location);
        location = new Vertex("Node_48", "HomeOpportunity");
        nodes.add(location);
        location = new Vertex("Node_49", "Jupiter4");
        nodes.add(location);
        location = new Vertex("Node_50", "Jupiter1");
        nodes.add(location);
        location = new Vertex("Node_51", "BluishSnout");
        nodes.add(location);
        location = new Vertex("Node_52", "SpiresElusion");
        nodes.add(location);
        location = new Vertex("Node_53", "CEOWellspring");
        nodes.add(location);
        location = new Vertex("Node_54", "CathedralXaar");
        nodes.add(location);
        location = new Vertex("Node_55", "RingoMoon");
        nodes.add(location);
        location = new Vertex("Node_56", "ArgonPrime");
        nodes.add(location);
        location = new Vertex("Node_57", "TheWall");
        nodes.add(location);
        location = new Vertex("Node_58", "FarnhamLegend");
        nodes.add(location);
        location = new Vertex("Node_59", "BalaGiJoy");
        nodes.add(location);
        location = new Vertex("Node_60", "BlueProfit");
        nodes.add(location);
        location = new Vertex("Node_61", "RhonkarFire");
        nodes.add(location);
        location = new Vertex("Node_62", "RhonkarClouds");
        nodes.add(location);
        location = new Vertex("Node_63", "TharkaSun");
        nodes.add(location);
        location = new Vertex("Node_64", "ChoDefeat");
        nodes.add(location);
        location = new Vertex("Node_65", "AsteroidBelt");
        nodes.add(location);
        location = new Vertex("Node_66", "Mars");
        nodes.add(location);
        location = new Vertex("Node_67", "Earth");
        nodes.add(location);
        location = new Vertex("Node_68", "FamilyTkr");
        nodes.add(location);
        location = new Vertex("Node_69", "TkrDeprivation");
        nodes.add(location);
        location = new Vertex("Node_70", "GhinnEscape");
        nodes.add(location);
        location = new Vertex("Node_71", "HilaJoy");
        nodes.add(location);
        location = new Vertex("Node_72", "OceanFantasy");
        nodes.add(location);
        location = new Vertex("Node_73", "TwistedSkies");
        nodes.add(location);
        location = new Vertex("Node_74", "RedLight");
        nodes.add(location);
        location = new Vertex("Node_75", "HomeLight");
        nodes.add(location);
        location = new Vertex("Node_76", "PresidentEnd");
        nodes.add(location);
        location = new Vertex("Node_77", "ElenaFortune");
        nodes.add(location);
        location = new Vertex("Node_78", "OlmanckTreaty");
        nodes.add(location);
        location = new Vertex("Node_79", "CeoSprite");
        nodes.add(location);
        location = new Vertex("Node_80", "FamilyRhonkar");
        nodes.add(location);
        location = new Vertex("Node_81", "Unknown2");
        nodes.add(location);
        location = new Vertex("Node_82", "Unknown3");
        nodes.add(location);
        location = new Vertex("Node_83", "PatriarchKeep");
        nodes.add(location);
        location = new Vertex("Node_84", "TwoGrand");
        nodes.add(location);
        location = new Vertex("Node_85", "HereticEnd");
        nodes.add(location);
        location = new Vertex("Node_86", "HarmonyPerpetuity");
        nodes.add(location);
        location = new Vertex("Node_87", "FamilyNjy");
        nodes.add(location);
        location = new Vertex("Node_88", "CloudbaseSW");
        nodes.add(location);
        location = new Vertex("Node_89", "OreBelt");
        nodes.add(location);
        location = new Vertex("Node_90", "CloudbaseSE");
        nodes.add(location);
        location = new Vertex("Node_91", "SplitFire");
        nodes.add(location);
        location = new Vertex("Node_92", "BrennanTriumph");
        nodes.add(location);
        location = new Vertex("Node_93", "CompanyPride");
        nodes.add(location);
        location = new Vertex("Node_94", "ThurukBeard");
        nodes.add(location);
        location = new Vertex("Node_95", "Unknown4");
        nodes.add(location);
        location = new Vertex("Node_96", "Unknown5");
        nodes.add(location);
        location = new Vertex("Node_97", "ProfitCenterAlpha");
        nodes.add(location);
        location = new Vertex("Node_98", "PTNIHQ");
        nodes.add(location);
        location = new Vertex("Node_99", "Unknown6");
        nodes.add(location);
        location = new Vertex("Node_100", "CircleLabour");
        nodes.add(location);
        location = new Vertex("Node_101", "7,30007");
        nodes.add(location);
        location = new Vertex("Node_102", "Xenon472");
        nodes.add(location);
        location = new Vertex("Node_103", "ThynAbyss");
        nodes.add(location);
        location = new Vertex("Node_104", "AlbionDelta");
        nodes.add(location);
        location = new Vertex("Node_105", "ZyarthDominion");
        nodes.add(location);
        location = new Vertex("Node_106", "ZyarthStand");
        nodes.add(location);
        location = new Vertex("Node_107", "Xenon695");
        nodes.add(location);
        location = new Vertex("Node_108", "EmperorMines");
        nodes.add(location);
        location = new Vertex("Node_109", "ParanidPrime");
        nodes.add(location);
        location = new Vertex("Node_110", "PriestRings");
        nodes.add(location);
        location = new Vertex("Node_111", "PriestPity");
        nodes.add(location);
        location = new Vertex("Node_112", "DannaChance");
        nodes.add(location);
        location = new Vertex("Node_113", "NopileosMemorial");
        nodes.add(location);
        location = new Vertex("Node_114", "HatikvahFaith");
        nodes.add(location);
        location = new Vertex("Node_115", "AladnaHill");
        nodes.add(location);
        location = new Vertex("Node_116", "AkeelaBeacon");
        nodes.add(location);
        location = new Vertex("Node_117", "ScalePlateGreen");
        nodes.add(location);
        location = new Vertex("Node_118", "NyanaHideout");
        nodes.add(location);
        location = new Vertex("Node_119", "OmicronLyrae");
        nodes.add(location);
        location = new Vertex("Node_120", "TreasureChest");
        nodes.add(location);
        location = new Vertex("Node_121", "BlackHoleSun");
        nodes.add(location);
        location = new Vertex("Node_122", "AlbionAlpha");
        nodes.add(location);
        location = new Vertex("Node_123", "AlbionBeta");
        nodes.add(location);
        location = new Vertex("Node_124", "AlbionGamma");
        nodes.add(location);
        location = new Vertex("Node_125", "Xenon598");
        nodes.add(location);
        location = new Vertex("Node_126", "Xenon627");
        nodes.add(location);
        location = new Vertex("Node_127", "XenonCore023");
        nodes.add(location);
        location = new Vertex("Node_128", "SavageSpur");
        nodes.add(location);
        location = new Vertex("Node_129", "EmpireEdge");
        nodes.add(location);
        location = new Vertex("Node_130", "DukeDomain");
        nodes.add(location);
        location = new Vertex("Node_131", "EmperorRidge");
        nodes.add(location);
        location = new Vertex("Node_132", "FreedomReach");
        nodes.add(location);
        location = new Vertex("Node_133", "Xenon101");
        nodes.add(location);
        location = new Vertex("Node_134", "LightOfHeart");
        nodes.add(location);
        location = new Vertex("Node_135", "LegendHome");
        nodes.add(location);
        location = new Vertex("Node_136", "Unknown10");
        nodes.add(location);
        location = new Vertex("Node_137", "EighteenBillion");
        nodes.add(location);
        location = new Vertex("Node_138", "Xenon347");
        nodes.add(location);
        location = new Vertex("Node_139", "Unknown11");
        nodes.add(location);
        location = new Vertex("Node_140", "NathanVoyage");
        nodes.add(location);
        location = new Vertex("Node_141", "Wastelands");
        nodes.add(location);
        location = new Vertex("Node_142", "Unknown12");
        nodes.add(location);
        location = new Vertex("Node_143", "Unknown13");
        nodes.add(location);
        location = new Vertex("Node_144", "GrandExchange");
        nodes.add(location);
        location = new Vertex("Node_145", "TearsGreed");
        nodes.add(location);
        location = new Vertex("Node_146", "OcracokeStorm");
        nodes.add(location);
        location = new Vertex("Node_147", "PreacherVoid");
        nodes.add(location);
        location = new Vertex("Node_148", "PontifexRealm");
        nodes.add(location);
        location = new Vertex("Node_149", "LightWater");
        nodes.add(location);
        location = new Vertex("Node_150", "Montalaar");
        nodes.add(location);
        location = new Vertex("Node_151", "Avarice");
        nodes.add(location);
        location = new Vertex("Node_152", "NewIncome");
        nodes.add(location);
        location = new Vertex("Node_153", "IanamusZura");
        nodes.add(location);
        location = new Vertex("Node_154", "HomePerpetuity");
        nodes.add(location);
        location = new Vertex("Node_XENON_155", "HUB_XENON");
        nodes.add(location);
        location = new Vertex("Node_156", "ArgonM148");
        nodes.add(location);
        location = new Vertex("Node_157", "Interworlds");
        nodes.add(location);
        location = new Vertex("Node_158", "MerchantHaven");
        nodes.add(location);
        location = new Vertex("Node_159", "7,30003");
        nodes.add(location);
        location = new Vertex("Node_160", "DukeVision");
        nodes.add(location);
        location = new Vertex("Node_161", "EmperorWisdom");
        nodes.add(location);
        location = new Vertex("Node_162", "TrinitySanctum");
        nodes.add(location);
        location = new Vertex("Node_163", "PreacherRefuge");
        nodes.add(location);
        location = new Vertex("Node_164", "ShoreInfinity");
        nodes.add(location);
        location = new Vertex("Node_165", "LuckyPlanets");
        nodes.add(location);
        location = new Vertex("Node_166", "RolkLegacy");
        nodes.add(location);
        location = new Vertex("Node_167", "GreatTrench");
        nodes.add(location);
        location = new Vertex("Node_168", "CeoDoubt");
        nodes.add(location);
        location = new Vertex("Node_169", "AcquisitionRepository");
        nodes.add(location);
        location = new Vertex("Node_170", "TerranUnknown2");
        nodes.add(location);
        location = new Vertex("Node_171", "GaianStar");
        nodes.add(location);
        location = new Vertex("Node_172", "MercenaryRift");
        nodes.add(location);
        location = new Vertex("Node_173", "Maelstrom");
        nodes.add(location);
        location = new Vertex("Node_174", "WeaverTempest");
        nodes.add(location);
        location = new Vertex("Node_175", "BadDebt");
        nodes.add(location);
        location = new Vertex("Node_176", "GunneCrusade");
        nodes.add(location);
        location = new Vertex("Node_177", "LoomanckstratLegacy");
        nodes.add(location);
        location = new Vertex("Node_178", "SpaceweedGrove");
        nodes.add(location);
        location = new Vertex("Node_179", "Aldrin");
        nodes.add(location);
        location = new Vertex("Node_180", "Aldrin2");
        nodes.add(location);
        location = new Vertex("Node_181", "TerranUnknown1");
        nodes.add(location);
        location = new Vertex("Node_182", "TerranUnknown3");
        nodes.add(location);
        location = new Vertex("Node_183", "XenonSector");
        nodes.add(location);
        location = new Vertex("Node_184", "LostOrder");
        nodes.add(location);
        location = new Vertex("Node_185", "Unknown20");
        nodes.add(location);
        location = new Vertex("Node_186", "RhyDesire");
        nodes.add(location);
        location = new Vertex("Node_187", "MinistryFinance");
        nodes.add(location);
        location = new Vertex("Node_188", "RhonkarTrial");
        nodes.add(location);
        location = new Vertex("Node_189", "Unknown21");
        nodes.add(location);
        location = new Vertex("Node_190", "ClarityEnd");
        nodes.add(location);
        location = new Vertex("Node_191", "ThirdRedemption");
        nodes.add(location);
        location = new Vertex("Node_192", "PerditionEnd");
        nodes.add(location);
        location = new Vertex("Node_193", "MitonRefuge");
        nodes.add(location);
        location = new Vertex("Node_194", "Unknown22");
        nodes.add(location);
        location = new Vertex("Node_195", "FamilyRhy");
        nodes.add(location);
        location = new Vertex("Node_196", "WretchedSky");
        nodes.add(location);
        location = new Vertex("Node_197", "Shallows");
        nodes.add(location);
        location = new Vertex("Node_198", "DesecratedSkies");
        nodes.add(location);
        location = new Vertex("Node_199", "MookyeRevenge");
        nodes.add(location);
        location = new Vertex("Node_200", "PerpetualSin");
        nodes.add(location);
        location = new Vertex("Node_201", "BrightProfit");
        nodes.add(location);
        location = new Vertex("Node_202", "DepthsSilence");
        nodes.add(location);
        location = new Vertex("Node_203", "DarkWater");
        nodes.add(location);
        location = new Vertex("Node_204", "ReservoirTranquility");
        nodes.add(location);
        location = new Vertex("Node_205", "BarrenShores");
        nodes.add(location);
        location = new Vertex("Node_206", "PriestRefuge");
        nodes.add(location);
        location = new Vertex("Node_207", "CardinalDomain");
        nodes.add(location);
        location = new Vertex("Node_208", "SacredRelic");
        nodes.add(location);
        location = new Vertex("Node_209", "SanctityCorruption");
        nodes.add(location);
        location = new Vertex("Node_210", "CompanyStrength");
        nodes.add(location);
        location = new Vertex("Node_211", "ShiningCurrents");
        nodes.add(location);
        location = new Vertex("Node_212", "CreatReef");
        nodes.add(location);
        location = new Vertex("Node_213", "SpringBelief");
        nodes.add(location);
        location = new Vertex("Node_214", "FriarRetreat");
        nodes.add(location);
        location = new Vertex("Node_215", "PontifexSeclusion");
        nodes.add(location);
        location = new Vertex("Node_216", "DukeCitadel");
        nodes.add(location);
        location = new Vertex("Node_217", "QueenRetribution");
        nodes.add(location);
        location = new Vertex("Node_218", "HollowInfinity");
        nodes.add(location);
        location = new Vertex("Node_219", "MistsElysium");
        nodes.add(location);
        location = new Vertex("Node_220", "Unknown30");
        nodes.add(location);
        location = new Vertex("Node_221", "EmperorPride");
        nodes.add(location);
        location = new Vertex("Node_222", "UnholyDescent");
        nodes.add(location);
        location = new Vertex("Node_223", "ConsecratedFire");
        nodes.add(location);
        location = new Vertex("Node_224", "HeavenAssertion");
        nodes.add(location);
        location = new Vertex("Node_225", "PatriarchCollusion");
        nodes.add(location);
        location = new Vertex("Node_226", "ContortedDominion");
        nodes.add(location);
        location = new Vertex("Node_227", "FadedDreams");
        nodes.add(location);
        location = new Vertex("Node_228", "QueenHarbour");
        nodes.add(location);
        location = new Vertex("Node_229", "MenelausOasis");
        nodes.add(location);
        location = new Vertex("Node_230", "VestibuleCreation");
        nodes.add(location);
        location = new Vertex("Node_231", "UnseenDomain");
        nodes.add(location);
        location = new Vertex("Node_232", "Unknown31");
        nodes.add(location);
        location = new Vertex("Node_233", "Unknown32");
        nodes.add(location);
        location = new Vertex("Node_234", "ThynExcavation");
        nodes.add(location);
        location = new Vertex("Node_235", "VeilDelusion");
        nodes.add(location);
        location = new Vertex("Node_236", "Unknown33");
        nodes.add(location);
        location = new Vertex("Node_237", "MinesFortune");
        nodes.add(location);

        addLane("", 0, 1);
        addLane("", 0, 14);
        addLane("", 1, 2);
        addLane("", 2, 3);
        addLane("", 3, 4);
        addLane("", 3, 17);
        addLane("", 4, 5);
        addLane("", 4, 18);
        addLane("", 5, 6);
        addLane("", 5, 19);
        addLane("", 6, 20);
        addLane("", 6, 27);
        addLane("", 7, 22, false);
        addLane("", 8, 24, false);
        addLane("", 9, 25, false);
        addLane("", 10, 27);
        addLane("", 11, 12);
        addLane("", 12, 30);
        addLane("", 13, 32);
        addLane("", 14, 15);
        addLane("", 14, 34);
        addLane("", 15, 16);
        addLane("", 15, 35);
        addLane("", 16, 36);
        addLane("", 17, 37);
        addLane("", 18, 38);
        addLane("", 18, 19);
        addLane("", 19, 39);
        addLane("", 20, 40);
        addLane("", 21, 22, false);
        addLane("", 21, 81, false);
        addLane("", 22, 23, false);
        addLane("", 23, 24, false);
        addLane("", 24, 25, false);
        addLane("", 24, 44, false);
        addLane("", 25, 45, false);
        addLane("", 25, 28, false);
        addLane("", 26, 46, false);
        addLane("", 27, 237);
        addLane("", 237, 48);
        addLane("", 28, 29, false);
        addLane("", 30, 31);
        addLane("", 31, 51);
        addLane("", 31, 32);
        addLane("", 33, 53);
        addLane("", 34, 35);
        addLane("", 34, 55);
        addLane("", 35, 36);
        addLane("", 35, 56);
        addLane("", 36, 37);
        addLane("", 36, 57);
        //addLane("", 37, 38);
        addLane("", 37, 58);
        addLane("", 38, 39);
        addLane("", 39, 60);
        addLane("", 40, 61);
        addLane("", 40, 41);
        addLane("", 41, 62);
        addLane("", 42, 43);
        addLane("", 43, 64);
        addLane("", 45, 65, false);
        addLane("", 45, 49, false);
        addLane("", 46, 47, false);
        addLane("", 46, 66, false);
        addLane("", 47, 67, false);
        addLane("", 48, 68);
        addLane("", 49, 50, false);
        addLane("", 51, 52);
        addLane("", 51, 72);
        addLane("", 52, 53);
        addLane("", 53, 54);

        addLane("", 55, 56);
        addLane("", 55, 74);
        addLane("", 56, 57);
        addLane("", 56, 75);
        addLane("", 57, 76);
        addLane("", 58, 59);
        addLane("", 58, 77);
        addLane("", 59, 78);
        addLane("", 60, 79);
        addLane("", 61, 80);
        addLane("", 61, 62);
        addLane("", 62, 63);
        addLane("", 63, 64);
        addLane("", 64, 83);
        addLane("", 65, 66, false);
        addLane("", 65, 85);
        addLane("", 68, 69);
        addLane("", 69, 70);
        addLane("", 70, 71);
        addLane("", 70, 87);
        addLane("", 71, 72);
        addLane("", 73, 106);
        addLane("", 74, 88);
        addLane("", 74, 75);
        addLane("", 75, 89);
        addLane("", 75, 76);
        addLane("", 76, 90);
        addLane("", 76, 77);
        addLane("", 77, 91);
        addLane("", 78, 92);
        addLane("", 79, 93);
        addLane("", 80, 94);
        addLane("", 81, 82, false);
        addLane("", 82, 96, false);
        addLane("", 83, 84);
        addLane("", 84, 97);
        addLane("", 85, 100);
        addLane("", 86, 101);
        addLane("", 87, 103);
        addLane("", 88, 89);
        addLane("", 88, 108);
        addLane("", 89, 90);
        addLane("", 91, 92);
        addLane("", 91, 111);
        addLane("", 92, 112);
        addLane("", 93, 94);
        addLane("", 94, 114);
        addLane("", 95, 96, false);
        addLane("", 97, 98);
        addLane("", 98, 99);
        addLane("", 98, 117);
        addLane("", 100, 119);
        addLane("", 101, 120);
        addLane("", 102, 121);
        addLane("", 102, 103);
        addLane("", 104, 123, false);
        addLane("", 105, 106);
        addLane("", 105, 125);
        addLane("", 107, 127);
        addLane("", 108, 109);
        addLane("", 109, 110);
        addLane("", 109, 129);
        addLane("", 110, 111);
        addLane("", 110, 130);
        addLane("", 111, 131);
        addLane("", 112, 132);
        addLane("", 112, 113);
        addLane("", 113, 133);
        addLane("", 113, 114);
        addLane("", 114, 115);
        addLane("", 114, 190);
        addLane("", 115, 116);
        addLane("", 115, 134);
        addLane("", 116, 135);
        addLane("", 117, 138);
        addLane("", 117, 118);
        addLane("", 118, 119);
        addLane("", 119, 120);
        addLane("", 120, 121);
        //addLane("", 121, 122);
        addLane("", 121, 140);
        addLane("", 122, 123, false);
        addLane("", 123, 124, false);
        addLane("", 124, 143);
        addLane("", 125, 144);
        addLane("", 125, 126);
        addLane("", 126, 127);
        addLane("", 127, 183);
        addLane("", 128, 129);
        addLane("", 128, 146);
        addLane("", 129, 130);
        addLane("", 129, 147);
        addLane("", 130, 131);
        addLane("", 131, 148);
        addLane("", 134, 150);
        addLane("", 135, 136);
        addLane("", 137, 138);
        addLane("", 137, 153);
        addLane("", 139, 156);
        addLane("", 139, 140);
        addLane("", 140, 141);
        addLane("", 141, 142);
        addLane("", 141, 157);
        addLane("", 142, 143);
        addLane("", 143, 144);
        addLane("", 144, 145);
        addLane("", 144, 158);
        addLane("", 145, 201);
        addLane("", 146, 159);
        addLane("", 147, 160);
        addLane("", 148, 162);
        addLane("", 149, 164);
        addLane("", 150, 166);
        addLane("", 150, 151);
        addLane("", 151, 152);
        addLane("", 152, 168);
        addLane("", 152, 153);
        addLane("", 153, 154);
        addLane("", 154, 169);
        addLane("", 157, 208);
        addLane("", 158, 173);
        addLane("", 159, 174);
        addLane("", 160, 161);
        addLane("", 161, 162);
        addLane("", 162, 163);
        addLane("", 162, 175);
        addLane("", 163, 164);
        addLane("", 164, 165);
        addLane("", 165, 166);
        addLane("", 166, 167);
        addLane("", 166, 176);
        addLane("", 167, 168);
        addLane("", 168, 177);
        addLane("", 169, 178);
        addLane("", 170, 181);
        addLane("", 171, 172);
        addLane("", 172, 173);
        addLane("", 172, 184);
        addLane("", 175, 187);
        addLane("", 176, 191);
        addLane("", 177, 193);
        addLane("", 177, 178);
        addLane("", 179, 180, false);
        addLane("", 180, 181);
        addLane("", 181, 182);
        addLane("", 182, 183);
        addLane("", 183, 194);
        addLane("", 185, 186);
        addLane("", 186, 187);
        addLane("", 186, 195);
        addLane("", 188, 197);
        addLane("", 189, 190);
        addLane("", 190, 191);
        addLane("", 191, 192);
        addLane("", 192, 198);
        addLane("", 193, 199);
        addLane("", 195, 196);
        addLane("", 195, 204);
        addLane("", 196, 205);
        addLane("", 196, 197);
        addLane("", 198, 199);
        addLane("", 198, 206);
        addLane("", 199, 207);
        addLane("", 200, 216);
        addLane("", 201, 210);
        addLane("", 202, 203);
        addLane("", 203, 204);
        addLane("", 203, 211);
        addLane("", 204, 212);
        addLane("", 204, 205);
        addLane("", 205, 206);
        addLane("", 206, 207);
        addLane("", 206, 213);
        addLane("", 207, 214);
        addLane("", 207, 208);
        //addLane("", 208, 209);
        addLane("", 208, 215);
        addLane("", 209, 217);
        addLane("", 209, 210);
        addLane("", 211, 212);
        addLane("", 212, 219);
        addLane("", 213, 214);
        addLane("", 213, 222);
        addLane("", 214, 223);
        addLane("", 214, 215);
        addLane("", 215, 224);
        addLane("", 215, 216);
        addLane("", 217, 218);
        addLane("", 217, 228);
        addLane("", 219, 230);
        addLane("", 219, 220);
        addLane("", 221, 231);
        addLane("", 221, 222);
        addLane("", 222, 223);
        addLane("", 224, 233);
        addLane("", 224, 225);
        addLane("", 225, 226);
        addLane("", 226, 227);
        addLane("", 226, 234);
        addLane("", 227, 228);
        addLane("", 227, 235);
        addLane("", 228, 229);
        addLane("", 229, 236);
        addLane("", 231, 232);
        addLane("", 23, 170, false);
    }

    int minimum[];

    public void testExcute(int iterations) {

        int iter = iterations;

        init();

        origEdges = (ArrayList<Edge>) edges.clone();

        int totalEdges = edges.size();

        String result[] = new String[5];
        minimum = new int[5];

        Arrays.fill(minimum, 2000000000);
        Arrays.fill(result, "");

        File varTmpDir = new File("x3results.txt");
        boolean exists = varTmpDir.exists();
        File varTmpDir2 = new File("x3end.txt");
        boolean exists2 = varTmpDir2.exists();

        ArrayList<Triple> indices = new ArrayList<>();
        ArrayList<Triple> indicesMixed = new ArrayList<>();

        if (!exists) {
            try {
                PrintWriter out = new PrintWriter("x3results.txt");

                for (int i = 0; i < totalEdges - 2; i += 2) {
                    for (int j = i + 2; j < totalEdges - 1; j += 2) {
                        for (int k = totalEdges - 2; k >= j + 2; k -= 2) {
                            if (edges.get(i).canLink && edges.get(j).canLink && edges.get(k).canLink) {
                                indices.add(new Triple(i, j, k));
                            }
                        }
                    }
                }

                System.out.println("Finished creating Triples.");

                Random rand = new Random();

                while (!indices.isEmpty()) {
                    int r = rand.nextInt(indices.size());
                    indicesMixed.add(indices.get(r));
                    indices.remove(r);
                    if (indices.size() % 1000 == 0) {
                        System.out.println(indices.size());
                    }
                }
                indicesToFile(indicesMixed, out);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("FILE EXISTS");
            try {
                FileReader f = new FileReader("x3results.txt");
                BufferedReader bf = new BufferedReader(f);
                String aline;
                int sts = 0;
                while ((aline = bf.readLine()) != null) {
                    String iString = "";
                    String jString = "";
                    String kString = "";
                    int i;
                    int j;
                    int k;
                    int strIterator = 0;
                    while (aline.charAt(strIterator) != ':') {
                        iString += aline.charAt(strIterator);
                        strIterator++;
                    }
                    strIterator++;
                    while (aline.charAt(strIterator) != ':') {
                        jString += aline.charAt(strIterator);
                        strIterator++;
                    }
                    strIterator++;
                    while (aline.charAt(strIterator) != ':') {
                        kString += aline.charAt(strIterator);
                        strIterator++;
                    }

                    i = Integer.parseInt(iString);
                    j = Integer.parseInt(jString);
                    k = Integer.parseInt(kString);

                    indicesMixed.add(new Triple(i, j, k));

                    sts++;
                }
                bf.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            FileReader f = new FileReader("x3results.txt");
            BufferedReader bf = new BufferedReader(f);
            String aline;
            while ((aline = bf.readLine()) != null) {
                System.out.println(aline);
            }
            bf.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Total indices: " + indicesMixed.size());

        try {
            if (!exists2) {
                PrintWriter out = new PrintWriter("x3end.txt");
                out.print("-1\n-1\n-1\n-1\n-1\n-1\n-1\n-1\n-1\n-1\n");
                out.close();
            } else {
                FileReader f = new FileReader("x3end.txt");
                BufferedReader bf = new BufferedReader(f);
                String[] data = new String[10];
                String aline;
                int id = 0;
                while ((aline = bf.readLine()) != null) {
                    data[id] = aline;
                    id++;
                }
                bf.close();
                for (int i = 0; i < 5; i++) {
                    int n = Integer.parseInt(data[i]);
                    if (n >= 0) {
                        minimum[i] = n;
                        result[i] = data[i + 5];
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        for (Triple t : indicesMixed) {
            edges = (ArrayList<Edge>) origEdges.clone();

            int i = t.i;
            int j = t.j;
            int k = t.k;

            String s = edges.get(i).getSource().getName() + ":" + edges.get(i).getDestination().getName() + ", " + edges.get(j).getSource().getName() + ":" + edges.get(j).getDestination().getName() + ", " + edges.get(k).getSource().getName() + ":" + edges.get(k).getDestination().getName();
            System.out.println("\n" + s);

            edges.add(new Edge("", nodes.get(155), edges.get(i).getSource(), 1));
            edges.add(new Edge("", nodes.get(155), edges.get(i).getDestination(), 1));
            edges.add(new Edge("", edges.get(i).getDestination(), nodes.get(155), 1));
            edges.add(new Edge("", edges.get(i).getSource(), nodes.get(155), 1));

            edges.add(new Edge("", nodes.get(155), edges.get(j).getSource(), 1));
            edges.add(new Edge("", nodes.get(155), edges.get(j).getDestination(), 1));
            edges.add(new Edge("", edges.get(j).getDestination(), nodes.get(155), 1));
            edges.add(new Edge("", edges.get(j).getSource(), nodes.get(155), 1));

            edges.add(new Edge("", nodes.get(155), edges.get(k).getSource(), 1));
            edges.add(new Edge("", nodes.get(155), edges.get(k).getDestination(), 1));
            edges.add(new Edge("", edges.get(k).getDestination(), nodes.get(155), 1));
            edges.add(new Edge("", edges.get(k).getSource(), nodes.get(155), 1));

            edges.remove(k);
            edges.remove(k);
            edges.remove(j);
            edges.remove(j);
            edges.remove(i);
            edges.remove(i);

            Graph graph = new Graph(nodes, edges);

            int ttWeight = getTotalWeight(graph);

            for (int index = 0; index < minimum.length; index++) {
                if (ttWeight < minimum[index]) {
                    for (int index2 = minimum.length - 1; index2 > index; index2--) {
                        result[index2] = result[index2 - 1];
                        minimum[index2] = minimum[index2 - 1];
                    }
                    minimum[index] = ttWeight;
                    result[index] = s + " => " + ttWeight;
                    break;
                }
            }

            System.out.println(iter + ": (i = " + (i / 2 + 1) + "/" + ((totalEdges / 2) - 2) + ", j = " + (j / 2 + 1) + "/" + ((totalEdges / 2) - 1) + ", k = " + (k / 2 + 1) + "/" + ((totalEdges / 2)) + ") => " + ttWeight);

            iter--;

            if (iter == 0) {
                try {
                    PrintWriter out = new PrintWriter("x3end.txt");
                    for (int y = 0; y < 5; y++) {
                        out.print(minimum[y] + "\n");
                    }
                    for (int y = 0; y < 5; y++) {
                        out.print(result[y] + "\n");
                    }
                    out.close();
                    out = new PrintWriter("x3results.txt");
                    indicesToFile(indicesMixed, out);
                    for (int index = 0; index < minimum.length; index++) {
                        System.out.println(result[index]);
                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        for (int index = 0; index < minimum.length; index++) {
            System.out.println(result[index]);
        }

    }

    public void indicesToFile(ArrayList<Triple> t, PrintWriter p) {
        for (Triple triple : t) {
            p.print(triple.i + ":" + triple.j + ":" + triple.k +":\n");
        }
        p.close();
    }

    public int getTotalWeight(Graph g) {
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(g);
        LinkedList<Vertex> path;
        int ret = 0;
        for (int i = 0; i < nodes.size() - 1; i++) {
            for (int j = i + 1; j < nodes.size(); j++) {
                dijkstra.execute(nodes.get(i));
                path = dijkstra.getPath(nodes.get(j));
                ret += path.size() - 1;

                if (ret > minimum[minimum.length - 1]) {
                    return 2000000000;
                }

            }
        }
        return ret;
    }

    private void addLane(String laneId, int sourceLocNo, int destLocNo) {
        //System.out.println(nodes.get(sourceLocNo).getName() + " -> " + nodes.get(destLocNo).getName());
        Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), 1);
        Edge lane2 = new Edge(laneId,nodes.get(destLocNo), nodes.get(sourceLocNo), 1);
        edges.add(lane);
        edges.add(lane2);
    }

    private void addLane(String laneId, int sourceLocNo, int destLocNo, boolean isGate) {
        //System.out.println("    -> (!!!) " + nodes.get(sourceLocNo).getName() + " -> " + nodes.get(destLocNo).getName());
        Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), 1) {{canLink = isGate;}};
        Edge lane2 = new Edge(laneId,nodes.get(destLocNo), nodes.get(sourceLocNo), 1){{canLink = isGate;}};
        edges.add(lane);
        edges.add(lane2);
    }
}