// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/task2.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class task2 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=4;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,task2.createAutomaton()));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,task2.class,"main",$line);
    }
  }
  public static IAutomaton createAutomaton() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=11;
      Object Q=$fix(GCollections.asSet("initial","cpar","apar","cimpar","aimpar","timpar"));
      $line=19;
      Object \u03A3=$fix(GCollections.asSet('c','a','h','t'));
      $line=20;
      Object q=$fix("initial");
      $line=21;
      Object F=$fix(GCollections.asSet("cpar","apar","initial"));
      $line=27;
      $result=$invokeConstructor(GDeterministicAutomaton.class,new Object[]{Q,\u03A3,q,F,new GMethod(task2.class,"\u03B4")});
      if (true) break $try;
      $line=29;
      $rethrow(new RuntimeException("The function \"createAutomaton()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,task2.class,"createAutomaton",$line);
    }
    return $cast(IAutomaton.class,$result);
  }
  public static Object \u03B4(Object state, Object character) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=35;
      if (($opEqualY(state,"initial")&&$opEqualY(character,'c'))) {
        $line=35;
        $result="cpar";
        if (true) break $try;
      }
      else {
        $line=36;
        if (($opEqualY(state,"initial")&&!$opEqualY(character,'c'))) {
          $line=36;
          $result="initial";
          if (true) break $try;
        }
        else {
          $line=38;
          if (($opEqualY(state,"cpar")&&$opEqualY(character,'a'))) {
            $line=38;
            $result="apar";
            if (true) break $try;
          }
          else {
            $line=39;
            if (($opEqualY(state,"cpar")&&$opEqualY(character,'c'))) {
              $line=39;
              $result="cpar";
              if (true) break $try;
            }
            else {
              $line=40;
              if ((($opEqualY(state,"cpar")&&!$opEqualY(character,'a'))&&!$opEqualY(character,'c'))) {
                $line=40;
                $result="initial";
                if (true) break $try;
              }
              else {
                $line=42;
                if (($opEqualY(state,"apar")&&$opEqualY(character,'t'))) {
                  $line=42;
                  $result="timpar";
                  if (true) break $try;
                }
                else {
                  $line=43;
                  if (($opEqualY(state,"apar")&&$opEqualY(character,'c'))) {
                    $line=43;
                    $result="cpar";
                    if (true) break $try;
                  }
                  else {
                    $line=44;
                    if ((($opEqualY(state,"apar")&&!$opEqualY(character,'t'))&&!$opEqualY(character,'c'))) {
                      $line=44;
                      $result="initial";
                      if (true) break $try;
                    }
                    else {
                      $line=47;
                      if (($opEqualY(state,"timpar")&&$opEqualY(character,'c'))) {
                        $line=47;
                        $result="cimpar";
                        if (true) break $try;
                      }
                      else {
                        $line=48;
                        if (($opEqualY(state,"timpar")&&!$opEqualY(character,'c'))) {
                          $line=48;
                          $result="timpar";
                          if (true) break $try;
                        }
                        else {
                          $line=50;
                          if (($opEqualY(state,"cimpar")&&$opEqualY(character,'a'))) {
                            $line=50;
                            $result="aimpar";
                            if (true) break $try;
                          }
                          else {
                            $line=51;
                            if (($opEqualY(state,"cimpar")&&$opEqualY(character,'c'))) {
                              $line=51;
                              $result="cimpar";
                              if (true) break $try;
                            }
                            else {
                              $line=52;
                              if ((($opEqualY(state,"cimpar")&&!$opEqualY(character,'a'))&&!$opEqualY(character,'c'))) {
                                $line=52;
                                $result="timpar";
                                if (true) break $try;
                              }
                              else {
                                $line=54;
                                if (($opEqualY(state,"aimpar")&&$opEqualY(character,'t'))) {
                                  $line=54;
                                  $result="initial";
                                  if (true) break $try;
                                }
                                else {
                                  $line=55;
                                  if (($opEqualY(state,"aimpar")&&$opEqualY(character,'c'))) {
                                    $line=55;
                                    $result="cimpar";
                                    if (true) break $try;
                                  }
                                  else {
                                    $line=56;
                                    if ((($opEqualY(state,"aimpar")&&!$opEqualY(character,'t'))&&!$opEqualY(character,'c'))) {
                                      $line=56;
                                      $result="timpar";
                                      if (true) break $try;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=62;
      $rethrow(new RuntimeException("The function \"\u03B4(state:Object,character:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,task2.class,"\u03B4",$line);
    }
    return $result;
  }
}
