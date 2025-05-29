package streamsapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsAndCollections {

  static List<String> getNames() {
    return Arrays.asList(
        // Gaming & Competitive
        "PixelPhantom", "NoScopeNinja", "ClutchKing", "FragStorm", "ReloadRanger",
        "GameOverlord", "VictoryFrenzy", "EpicEliminator", "StealthVortex", "ShadowStriker",
        "TurboTakedown", "LagHunter", "AimAssassin", "HitboxHero", "QuestCrusher",
        "BossBattler", "CritCraze", "RespawnReaper", "LootLegend", "GameGladiator",

        // Tech & Coding
        "CodeCrafter", "BinaryBard", "DebugDruid", "SyntaxSlayer", "ByteMage",
        "StackOverflown", "DevDomino", "ConsoleKnight", "HackHive", "AlgoPirate",
        "GitGuardian", "CompileLord", "JavaJuggernaut", "PythonPunk", "CloudNinja",
        "RAMRaider", "CodeRocket", "APIVortex", "ScriptSmith", "KernelKraken",

        // Futuristic & Sci-Fi
        "NeonNova", "CyberDrift", "GalaxyPulse", "SynthSpecter", "QuantumBlade",
        "AstroRift", "DataEcho", "HyperLancer", "Starcode", "IonWarp",
        "ExoCipher", "VortexWarden", "PlasmaKnight", "PixelNebula", "MechaMancer",
        "CircuitGhost", "RetroBot", "StellarSpectra", "GlitchOrbit", "NexusUnit",

        // Edgy & Cool
        "BlazeStorm", "IceVenom", "DarkPulse", "VenomShock", "InfernoCore",
        "VoidWalker", "BloodByte", "RebelPhase", "CrypticSoul", "FrostBurn",
        "RazorFang", "PulseWraith", "PhantomVibe", "GrimFlux", "ArcBlade",
        "ToxicNova", "MidnightEcho", "DeathCode", "BlackJester", "StaticChaos",

        // Creative & Chill
        "ChillPixel", "SketchSprint", "LoFiCoder", "StreamMuse", "DreamForge",
        "ZenFrame", "CozyCircuit", "MagicCanvas", "MellowHack", "NovaNotes",
        "ArtLoop", "VibeCaster", "SmoothBit", "ChillCoder", "MuseRunner",
        "EchoVerse", "Moonbyte", "ChillNova", "DreamScripter", "BeatBuffer",

        // Nature-Inspired
        "OakByte", "RiverFlow", "StormWhisper", "FrostFang", "WildWisp",
        "EmberLeaf", "ShadowSprout", "SkyBreeze", "MysticPine", "LunarBlossom",
        "ThunderTide", "CloudWhale", "Firefern", "StormEcho", "QuartzFox",
        "GlacierWing", "DuskRaven", "SunBloom", "ForestHack", "DriftLeaf",

        // Java-specific
        "JavaWhiz", "JavaBytes", "JustInJava", "StreamOfJava", "JavaNexus",
        "CodeInJava", "JavaUnleashed", "JavaInfinite", "JavaCrafter", "HelloJava",
        "JavaDecoded", "JavaEdge", "PureJava", "TheJavaZone", "JavaLoopLive",
        "JavaSage", "CoffeeWithJava", "JavaTinker", "JavaWhirl", "TheJavaGuy",
        "JavaFuel", "DeepJava");
  }

  public static void main(String[] args) {

    Consumer<String> print = name -> System.out.println(name);

    // Pick a random name,
    var names = getNames();
    Collections.shuffle(names);
    System.out.println("Random name: " + names.get(0));
    System.out.println();

    // Sort the names in the list, limit it to 15 names and print them
    System.out.println("Sort the names in the list, limit it to 15 names and print them");
    names = getNames();
    names.stream().sorted().limit(15).forEach(print);
    System.out.println();

    // Filter the names by checking if the name contains Java, sort and print them
    System.out.println("Filter the names by checking if the name contains Java, sort and print them");
    names = getNames();
    names.stream().filter(name -> name.toLowerCase().contains("java")).sorted().forEach(print);
    System.out.println();

    // Filter the names by checking if the name contains Java, sort, convert them to
    // upper case and print them
    Function<String, String> toUpper = name -> name.toUpperCase();
    System.out
        .println("Filter the names by checking if the name contains Java, sort, convert to upper case and print them");
    names = getNames();
    names
        .stream()
        .filter(name -> name.toLowerCase().contains("java"))
        .map(name -> name.toUpperCase()) // transforms the elements in the stream
        .sorted()
        //.collect(Collectors.toList());
        //.toList();
        .forEach(print);
    System.out.println();
    System.out.println();

    names = getNames();
    System.out.println("Groouping alphabetically...");
    Map<Character, List<String>> groups = names.stream().collect(Collectors.groupingBy(name -> Character.toUpperCase(name.charAt(0))));
    groups.entrySet().stream().forEach(entrySet -> {
      System.out.println("Key = " + entrySet.getKey() + " Contains: " + entrySet.getValue().size() + " elements.");
      entrySet.getValue().stream().sorted().forEach(key -> System.out.print(key +" "));
      System.out.println();
      System.out.println("-------------------------------------------------------");
    });

  }
}
