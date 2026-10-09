
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//----------------------------------------------------------------------
//
// File generated at: 2026/10/8 -- 17:54:56
// Seed: {1791,474894,951164}
//
//----------------------------------------------------------------------



package aed.polinomios;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.tree.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Stream;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterLab2 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    TestData.setIndividualTimeout(10) ;
    TestData.setGlobalTimeout(60) ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(404,TestData.getGlobalTimeout()) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(4,0,2) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_001 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_001") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_001")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(1,2),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(1,2),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_001")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_002 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_002") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_002")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(2,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(2,1),new Monomio(8,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_002")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_003 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_003") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_003")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(3,1),new Monomio(7,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_003")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_004 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_004") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_004")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(5,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(8,1),new Monomio(9,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_004")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_005 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_005") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_005")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(7,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_005")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_006 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_006") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_006")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(1,3),new Monomio(3,2),new Monomio(2,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(3,3),new Monomio(2,2),new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(4,3),new Monomio(5,2),new Monomio(5,1),new Monomio(10,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_006")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_007 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_007") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_007")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(3,2),new Monomio(1,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(3,2),new Monomio(1,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_007")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_008 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_008") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_008")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(4,3),new Monomio(3,2),new Monomio(4,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(4,3),new Monomio(3,2),new Monomio(8,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_008")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_009 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_009") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_009")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(4,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(4,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_009")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_010 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_010") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_010")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(1,3),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(1,3),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_010")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_011 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_011") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_011")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(7,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_011")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_012 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_012") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_012")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(4,3),new Monomio(1,2),new Monomio(3,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(4,3),new Monomio(1,2),new Monomio(3,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_012")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_013 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_013") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_013")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(2,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_013")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_014 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_014") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_014")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(1,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(2,1),new Monomio(6,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_014")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_015 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_015") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_015")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(2,2),new Monomio(2,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(2,2),new Monomio(7,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_015")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_016 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_016") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_016")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(3,3),new Monomio(1,2),new Monomio(2,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(3,3),new Monomio(1,2),new Monomio(3,1),new Monomio(6,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_016")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_017 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_017") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_017")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(2,3),new Monomio(4,2),new Monomio(1,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(2,3),new Monomio(4,2),new Monomio(1,1),new Monomio(8,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_017")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_018 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_018") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_018")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(4,2),new Monomio(4,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(4,2),new Monomio(4,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_018")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_019 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_019") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_019")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(3,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_019")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_020 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_020") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_020")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(5,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(7,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_020")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_021 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_021") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_021")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(2,2),new Monomio(2,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(2,2),new Monomio(6,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_021")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_022 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_022") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_022")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(2,2),new Monomio(4,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(4,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(3,2),new Monomio(8,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_022")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_023 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_023") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_023")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(4,2),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(4,2),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_023")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_024 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_024") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_024")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(5,2),new Monomio(5,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(5,2),new Monomio(6,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_024")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_025 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_025") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_025")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(1,2),new Monomio(4,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(5,2),new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(4,3),new Monomio(6,2),new Monomio(7,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_025")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_026 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_026") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_026")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(2,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(5,2),new Monomio(3,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(5,3),new Monomio(5,2),new Monomio(5,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_026")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_027 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_027") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_027")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(5,3),new Monomio(1,2),new Monomio(3,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(5,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(5,3),new Monomio(6,2),new Monomio(8,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_027")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_028 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_028") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_028")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(5,3),new Monomio(5,2),new Monomio(1,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(5,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(5,3),new Monomio(6,2),new Monomio(6,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_028")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_029 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_029") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_029")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(5,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(5,1),new Monomio(8,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_029")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_030 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_030") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_030")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(5,2),new Monomio(5,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(5,2),new Monomio(9,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_030")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_031 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_031") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_031")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(2,2),new Monomio(2,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(2,2),new Monomio(6,1),new Monomio(6,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_031")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_032 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_032") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_032")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(3,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_032")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_033 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_033") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_033")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(1,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(1,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_033")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_034 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_034") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_034")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(4,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(4,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,2),new Monomio(8,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_034")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_035 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_035") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_035")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(4,2),new Monomio(4,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(4,2),new Monomio(4,1),new Monomio(7,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_035")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_036 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_036") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_036")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(6,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_036")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_037 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_037") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_037")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(8,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_037")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_038 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_038") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_038")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(10,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_038")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_039 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_039") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_039")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(1,2) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(1,2),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_039")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_040 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_040") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_040")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(10,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_040")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_041 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_041") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_041")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(1,2),new Monomio(1,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(1,2),new Monomio(6,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_041")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_042 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_042") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_042")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(1,2),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(6,2),new Monomio(2,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_042")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_043 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_043") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_043")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(7,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_043")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_044 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_044") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_044")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(3,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(3,3),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(3,3),new Monomio(5,2),new Monomio(3,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_044")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_045 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_045") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_045")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(4,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(1,2) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(6,2),new Monomio(4,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_045")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_046 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_046") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_046")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(1,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(4,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,3),new Monomio(5,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_046")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_047 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_047") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_047")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(5,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(9,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_047")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_048 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_048") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_048")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(1,3),new Monomio(5,2),new Monomio(4,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(5,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(1,3),new Monomio(9,2),new Monomio(9,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_048")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_049 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_049") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_049")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(2,3),new Monomio(4,2),new Monomio(2,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(2,3),new Monomio(4,2),new Monomio(6,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_049")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("suma")
  public void test_suma_050 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_suma_050") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_suma_050")) ;
if (ok_sofar)
  ok_sofar = new Suma(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(3,3),new Monomio(4,2),new Monomio(4,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(3,3),new Monomio(4,2),new Monomio(4,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_suma_050")) ;
    ResultsHandler.add_result(new String("suma"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_051 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_051") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_051")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_051")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_052 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_052") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_052")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(5,2),new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-1,4),new Monomio(-5,2),new Monomio(-3,1),new Monomio(-5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_052")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_053 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_053") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_053")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_053")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_054 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_054") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_054")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-2,2),new Monomio(-2,1),new Monomio(-5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_054")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_055 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_055") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_055")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(1,2),new Monomio(1,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-5,3),new Monomio(-1,2),new Monomio(-1,1),new Monomio(-2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_055")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_056 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_056") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_056")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-3,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_056")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_057 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_057") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_057")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_057")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_058 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_058") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_058")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_058")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_059 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_059") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_059")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(5,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-2,2),new Monomio(-4,1),new Monomio(-3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_059")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_060 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_060") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_060")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(-2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_060")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_061 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_061") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_061")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(5,2),new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-5,3),new Monomio(-5,2),new Monomio(-1,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_061")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_062 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_062") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_062")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(1,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(-2,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_062")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_063 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_063") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_063")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(3,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(3,1),new Monomio(-3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_063")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_064 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_064") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_064")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(-5,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_064")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_065 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_065") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_065")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(1,2),new Monomio(3,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(4,3),new Monomio(3,2),new Monomio(1,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-5,4),new Monomio(-3,3),new Monomio(-2,2),new Monomio(2,1),new Monomio(-1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_065")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_066 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_066") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_066")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(3,2),new Monomio(2,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(3,2),new Monomio(1,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_066")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_067 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_067") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_067")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(3,2) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-3,4),new Monomio(-3,2),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_067")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_068 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_068") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_068")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(3,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(3,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_068")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_069 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_069") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_069")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(5,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(2,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-1,2),new Monomio(3,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_069")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_070 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_070") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_070")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(1,2),new Monomio(1,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(-3,2),new Monomio(1,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_070")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_071 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_071") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_071")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(2,2),new Monomio(5,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(2,2),new Monomio(2,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_071")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_072 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_072") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_072")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(3,2),new Monomio(1,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(3,2),new Monomio(1,1),new Monomio(-1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_072")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_073 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_073") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_073")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(3,2),new Monomio(1,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(3,2),new Monomio(-1,1),new Monomio(-5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_073")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_074 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_074") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_074")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(2,3),new Monomio(2,2),new Monomio(4,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(2,3),new Monomio(2,2),new Monomio(4,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_074")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_075 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_075") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_075")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(5,3),new Monomio(1,2),new Monomio(2,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(5,3),new Monomio(1,2),new Monomio(2,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_075")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_076 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_076") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_076")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(2,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-4,2),new Monomio(-2,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_076")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_077 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_077") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_077")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(2,3),new Monomio(3,2),new Monomio(4,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-3,4),new Monomio(-2,3),new Monomio(-3,2),new Monomio(-1,1),new Monomio(-5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_077")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_078 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_078") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_078")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(1,3),new Monomio(5,2),new Monomio(3,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-2,4),new Monomio(-1,3),new Monomio(-5,2),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_078")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_079 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_079") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_079")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(1,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-1,3),new Monomio(3,2),new Monomio(-1,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_079")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_080 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_080") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_080")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(5,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(2,2),new Monomio(1,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-1,3),new Monomio(1,2),new Monomio(4,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_080")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_081 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_081") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_081")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(2,2),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(2,2),new Monomio(-3,1),new Monomio(-3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_081")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_082 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_082") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_082")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(2,2),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(3,2),new Monomio(2,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-1,2),new Monomio(-2,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_082")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_083 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_083") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_083")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(5,2),new Monomio(2,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(3,2),new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-1,3),new Monomio(2,2),new Monomio(-1,1),new Monomio(-5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_083")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_084 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_084") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_084")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(3,3),new Monomio(1,2),new Monomio(1,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(3,3),new Monomio(1,2),new Monomio(-3,1),new Monomio(-2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_084")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_085 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_085") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_085")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(4,3),new Monomio(1,2),new Monomio(2,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(4,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(4,3),new Monomio(-2,1),new Monomio(-3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_085")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_086 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_086") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_086")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-2,1),new Monomio(-1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_086")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_087 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_087") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_087")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(4,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-5,2),new Monomio(-1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_087")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_088 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_088") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_088")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_088")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_089 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_089") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_089")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(1,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(1,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_089")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_090 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_090") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_090")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(2,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(3,2),new Monomio(2,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-2,3),new Monomio(1,2),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_090")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_091 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_091") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_091")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(1,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(5,2),new Monomio(1,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(-5,2),new Monomio(-1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_091")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_092 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_092") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_092")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(1,2),new Monomio(4,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(2,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(-2,2),new Monomio(2,1),new Monomio(-1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_092")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_093 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_093") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_093")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(3,3),new Monomio(2,2),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(3,3),new Monomio(2,2),new Monomio(-2,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_093")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_094 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_094") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_094")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_094")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_095 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_095") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_095")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(3,2),new Monomio(2,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-2,3),new Monomio(-3,2),new Monomio(3,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_095")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_096 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_096") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_096")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(1,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(4,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(-3,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_096")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_097 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_097") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_097")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(5,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(-5,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_097")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_098 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_098") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_098")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(1,2),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(1,3),new Monomio(3,2),new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(-3,4),new Monomio(4,3),new Monomio(-2,2),new Monomio(-2,1),new Monomio(-2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_098")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_099 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_099") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_099")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(4,3),new Monomio(1,2),new Monomio(5,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(5,2),new Monomio(1,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(-1,3),new Monomio(-4,2),new Monomio(4,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_099")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("resta")
  public void test_resta_100 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_resta_100") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_resta_100")) ;
if (ok_sofar)
  ok_sofar = new Resta(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(5,3),new Monomio(4,2) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(1,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(5,3),new Monomio(-1,1),new Monomio(-5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_resta_100")) ;
    ResultsHandler.add_result(new String("resta"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_101 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_101") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_101")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_101")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_102 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_102") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_102")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(5,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_102")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_103 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_103") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_103")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_103")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_104 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_104") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_104")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(1,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_104")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_105 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_105") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_105")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_105")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_106 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_106") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_106")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(5,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_106")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_107 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_107") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_107")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(4,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(3,3),new Monomio(4,2),new Monomio(2,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,6),new Monomio(23,5),new Monomio(21,4),new Monomio(21,3),new Monomio(13,2),new Monomio(6,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_107")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_108 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_108") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_108")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(5,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(28,2),new Monomio(15,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_108")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_109 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_109") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_109")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(5,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(28,2),new Monomio(40,1),new Monomio(15,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_109")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_110 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_110") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_110")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(4,3),new Monomio(5,2),new Monomio(1,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(3,3),new Monomio(5,2),new Monomio(5,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,8),new Monomio(7,7),new Monomio(22,6),new Monomio(41,5),new Monomio(50,4),new Monomio(38,3),new Monomio(15,2),new Monomio(2,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_110")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_111 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_111") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_111")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(3,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(7,2),new Monomio(11,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_111")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_112 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_112") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_112")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(8,1),new Monomio(16,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_112")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_113 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_113") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_113")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(4,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,2),new Monomio(12,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_113")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_114 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_114") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_114")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(4,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(10,4),new Monomio(20,3),new Monomio(31,2),new Monomio(12,1),new Monomio(15,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_114")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_115 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_115") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_115")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(5,3),new Monomio(2,2),new Monomio(4,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(10,6),new Monomio(10,5),new Monomio(29,4),new Monomio(33,3),new Monomio(14,2),new Monomio(20,1),new Monomio(10,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_115")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_116 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_116") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_116")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(5,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,4),new Monomio(15,3),new Monomio(15,2),new Monomio(15,1),new Monomio(9,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_116")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_117 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_117") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_117")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(5,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(3,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(16,3),new Monomio(25,2),new Monomio(15,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_117")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_118 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_118") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_118")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(1,2),new Monomio(3,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(6,3),new Monomio(8,2),new Monomio(12,1),new Monomio(6,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_118")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_119 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_119") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_119")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(2,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(4,3),new Monomio(2,2),new Monomio(4,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,7),new Monomio(8,6),new Monomio(8,5),new Monomio(18,4),new Monomio(10,3),new Monomio(10,2),new Monomio(6,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_119")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_120 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_120") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_120")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(2,2),new Monomio(3,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(1,2),new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,6),new Monomio(8,5),new Monomio(13,4),new Monomio(19,3),new Monomio(9,2),new Monomio(7,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_120")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_121 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_121") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_121")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(3,2),new Monomio(3,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(6,2),new Monomio(6,1),new Monomio(6,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_121")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_122 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_122") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_122")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(2,3),new Monomio(4,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,7),new Monomio(4,6),new Monomio(20,4),new Monomio(16,3),new Monomio(16,1),new Monomio(16,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_122")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_123 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_123") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_123")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(4,2) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(1,2),new Monomio(4,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,6),new Monomio(14,5),new Monomio(12,4),new Monomio(24,3),new Monomio(16,2) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_123")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_124 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_124") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_124")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(4,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,2),new Monomio(12,1),new Monomio(15,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_124")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_125 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_125") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_125")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(12,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_125")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_126 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_126") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_126")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(12,3) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_126")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_127 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_127") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_127")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(5,2),new Monomio(5,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(15,3),new Monomio(15,2),new Monomio(15,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_127")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_128 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_128") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_128")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(15,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_128")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_129 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_129") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_129")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(5,2),new Monomio(5,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(15,4),new Monomio(25,3),new Monomio(25,2),new Monomio(13,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_129")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_130 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_130") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_130")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(1,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(5,2),new Monomio(4,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(12,5),new Monomio(19,4),new Monomio(33,3),new Monomio(24,2),new Monomio(16,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_130")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_131 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_131") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_131")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(4,2) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(9,4),new Monomio(27,3),new Monomio(20,2) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_131")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_132 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_132") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_132")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(5,2),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(3,2),new Monomio(3,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(12,6),new Monomio(29,5),new Monomio(24,4),new Monomio(26,3),new Monomio(11,2),new Monomio(6,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_132")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_133 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_133") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_133")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(4,3),new Monomio(4,2),new Monomio(2,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,5),new Monomio(19,4),new Monomio(24,3),new Monomio(22,2),new Monomio(11,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_133")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_134 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_134") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_134")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_134")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_135 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_135") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_135")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(12,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_135")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_136 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_136") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_136")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(2,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(20,2),new Monomio(10,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_136")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_137 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_137") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_137")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(2,2),new Monomio(3,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(3,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,5),new Monomio(14,4),new Monomio(17,3),new Monomio(16,2),new Monomio(15,1),new Monomio(6,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_137")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_138 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_138") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_138")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(10,1),new Monomio(15,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_138")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_139 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_139") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_139")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(1,2),new Monomio(3,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(20,3),new Monomio(5,2),new Monomio(15,1),new Monomio(10,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_139")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_140 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_140") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_140")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(5,2),new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(20,3),new Monomio(25,2),new Monomio(15,1),new Monomio(25,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_140")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_141 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_141") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_141")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(4,3),new Monomio(2,2),new Monomio(3,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(10,5),new Monomio(20,4),new Monomio(10,3),new Monomio(15,2) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_141")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_142 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_142") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_142")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(22,1),new Monomio(8,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_142")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_143 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_143") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_143")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(25,2),new Monomio(35,1),new Monomio(10,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_143")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_144 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_144") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_144")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(5,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(15,3),new Monomio(34,2),new Monomio(15,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_144")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_145 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_145") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_145")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(15,3),new Monomio(26,2),new Monomio(8,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_145")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_146 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_146") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_146")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(4,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(22,3),new Monomio(16,2),new Monomio(14,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_146")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_147 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_147") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_147")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(3,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(20,3),new Monomio(27,2),new Monomio(29,1),new Monomio(15,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_147")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_148 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_148") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_148")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(2,2),new Monomio(4,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(15,4),new Monomio(31,3),new Monomio(22,2),new Monomio(23,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_148")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_149 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_149") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_149")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(2,2),new Monomio(5,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(25,4),new Monomio(20,3),new Monomio(29,2),new Monomio(30,1),new Monomio(8,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_149")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("multiplica")
  public void test_multiplica_150 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_multiplica_150") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_multiplica_150")) ;
if (ok_sofar)
  ok_sofar = new Multiplica(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(5,2),new Monomio(5,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(5,2),new Monomio(5,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_multiplica_150")) ;
    ResultsHandler.add_result(new String("multiplica"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_151 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_151") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_151")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_151")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_152 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_152") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_152")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))).doCall().checkResult(-1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_152")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_153 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_153") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_153")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))).doCall().checkResult(0) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_153")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_154 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_154") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_154")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(2,0) }))).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_154")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_155 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_155") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_155")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(4,0) }))).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_155")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_156 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_156") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_156")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(2,1),new Monomio(2,0) }))).doCall().checkResult(2) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_156")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_157 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_157") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_157")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(2,1) }))).doCall().checkResult(3) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_157")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_158 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_158") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_158")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(4,2),new Monomio(1,1),new Monomio(4,0) }))).doCall().checkResult(3) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_158")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_159 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_159") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_159")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(5,2) }))).doCall().checkResult(3) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_159")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_160 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_160") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_160")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(5,2),new Monomio(2,1),new Monomio(3,0) }))).doCall().checkResult(3) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_160")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_161 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_161") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_161")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(2,3),new Monomio(3,2),new Monomio(1,0) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_161")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_162 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_162") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_162")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(4,3),new Monomio(5,2),new Monomio(1,1) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_162")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_163 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_163") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_163")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(5,3),new Monomio(1,2),new Monomio(1,0) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_163")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_164 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_164") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_164")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(5,3),new Monomio(4,2),new Monomio(2,1) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_164")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_165 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_165") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_165")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) }))).doCall().checkResult(0) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_165")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_166 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_166") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_166")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(4,0) }))).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_166")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_167 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_167") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_167")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_167")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_168 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_168") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_168")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(2,0) }))).doCall().checkResult(2) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_168")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_169 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_169") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_169")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(2,1),new Monomio(3,0) }))).doCall().checkResult(2) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_169")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_170 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_170") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_170")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(1,3),new Monomio(5,2),new Monomio(2,0) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_170")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_171 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_171") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_171")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(1,3),new Monomio(5,2),new Monomio(5,0) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_171")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_172 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_172") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_172")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(4,3),new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_172")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_173 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_173") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_173")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(4,3),new Monomio(4,2),new Monomio(3,1),new Monomio(1,0) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_173")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_174 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_174") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_174")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(5,3),new Monomio(3,2),new Monomio(4,1),new Monomio(5,0) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_174")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_175 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_175") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_175")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))).doCall().checkResult(0) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_175")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_176 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_176") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_176")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(3,0) }))).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_176")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_177 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_177") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_177")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(2) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_177")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_178 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_178") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_178")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(5,1),new Monomio(5,0) }))).doCall().checkResult(2) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_178")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_179 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_179") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_179")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(5,2),new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(3) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_179")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_180 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_180") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_180")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(5,2),new Monomio(3,1),new Monomio(3,0) }))).doCall().checkResult(3) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_180")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_181 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_181") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_181")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(1,3),new Monomio(3,2),new Monomio(4,1) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_181")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_182 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_182") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_182")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(5,3),new Monomio(5,2),new Monomio(2,1),new Monomio(4,0) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_182")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_183 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_183") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_183")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1) }))).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_183")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_184 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_184") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_184")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(2,0) }))).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_184")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_185 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_185") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_185")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(3,0) }))).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_185")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_186 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_186") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_186")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(4,0) }))).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_186")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_187 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_187") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_187")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(5,0) }))).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_187")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_188 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_188") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_188")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(3,1),new Monomio(1,0) }))).doCall().checkResult(2) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_188")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_189 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_189") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_189")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(2) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_189")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_190 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_190") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_190")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(1,2),new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(3) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_190")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_191 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_191") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_191")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(1,2),new Monomio(4,1),new Monomio(2,0) }))).doCall().checkResult(3) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_191")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_192 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_192") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_192")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(2,2),new Monomio(4,1),new Monomio(5,0) }))).doCall().checkResult(3) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_192")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_193 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_193") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_193")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(3,3),new Monomio(3,2) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_193")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_194 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_194") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_194")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(4,3),new Monomio(2,2),new Monomio(4,1),new Monomio(1,0) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_194")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_195 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_195") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_195")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(5,3),new Monomio(4,2),new Monomio(4,1),new Monomio(1,0) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_195")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_196 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_196") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_196")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))).doCall().checkResult(0) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_196")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_197 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_197") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_197")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(1,0) }))).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_197")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_198 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_198") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_198")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(2,0) }))).doCall().checkResult(1) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_198")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_199 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_199") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_199")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(3,0) }))).doCall().checkResult(2) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_199")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_200 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_200") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_200")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(3,3),new Monomio(5,2),new Monomio(4,1),new Monomio(3,0) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_200")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("grado")
  public void test_grado_201 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_grado_201") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_grado_201")) ;
if (ok_sofar)
  ok_sofar = new Grado(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(5,3),new Monomio(4,2),new Monomio(1,1),new Monomio(4,0) }))).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_grado_201")) ;
    ResultsHandler.add_result(new String("grado"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_202 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_202") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_202")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_202")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_203 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_203") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_203")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_203")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_204 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_204") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_204")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_204")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_205 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_205") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_205")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_205")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_206 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_206") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_206")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(1,2),new Monomio(3,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(2,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_206")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_207 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_207") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_207")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(3,2),new Monomio(1,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(6,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_207")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_208 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_208") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_208")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(1,2),new Monomio(4,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(2,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_208")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_209 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_209") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_209")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(1,3),new Monomio(4,2),new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(3,2),new Monomio(8,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_209")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_210 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_210") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_210")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(3,3),new Monomio(4,2),new Monomio(4,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(9,2),new Monomio(8,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_210")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_211 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_211") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_211")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(4,3),new Monomio(3,2),new Monomio(4,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(12,2),new Monomio(6,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_211")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_212 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_212") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_212")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_212")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_213 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_213") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_213")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_213")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_214 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_214") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_214")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_214")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_215 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_215") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_215")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_215")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_216 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_216") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_216")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(3,2),new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,2),new Monomio(6,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_216")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_217 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_217") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_217")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(4,2),new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,2),new Monomio(8,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_217")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_218 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_218") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_218")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(4,2),new Monomio(5,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,2),new Monomio(8,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_218")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_219 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_219") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_219")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(5,2),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,2),new Monomio(10,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_219")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_220 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_220") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_220")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(1,2),new Monomio(5,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(8,3),new Monomio(2,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_220")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_221 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_221") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_221")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(2,3),new Monomio(4,2),new Monomio(5,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(8,3),new Monomio(6,2),new Monomio(8,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_221")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_222 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_222") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_222")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(5,3),new Monomio(5,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(8,3),new Monomio(15,2),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_222")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_223 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_223") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_223")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_223")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_224 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_224") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_224")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_224")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_225 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_225") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_225")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_225")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_226 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_226") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_226")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_226")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_227 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_227") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_227")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_227")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_228 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_228") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_228")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_228")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_229 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_229") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_229")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_229")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_230 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_230") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_230")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(4,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_230")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_231 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_231") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_231")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(4,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_231")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_232 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_232") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_232")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_232")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_233 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_233") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_233")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(5,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(6,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_233")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_234 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_234") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_234")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(1,2),new Monomio(1,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(9,2),new Monomio(2,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_234")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_235 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_235") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_235")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(4,2) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(9,2),new Monomio(8,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_235")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_236 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_236") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_236")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(1,3),new Monomio(2,2),new Monomio(3,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(12,3),new Monomio(3,2),new Monomio(4,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_236")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_237 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_237") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_237")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(5,2),new Monomio(5,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(12,3),new Monomio(10,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_237")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_238 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_238") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_238")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_238")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_239 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_239") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_239")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_239")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_240 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_240") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_240")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_240")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_241 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_241") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_241")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(3,2),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(12,2),new Monomio(6,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_241")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_242 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_242") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_242")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(4,2),new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(16,3),new Monomio(8,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_242")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_243 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_243") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_243")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_243")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_244 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_244") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_244")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_244")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_245 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_245") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_245")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_245")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_246 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_246") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_246")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_246")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_247 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_247") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_247")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(10,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_247")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_248 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_248") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_248")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(10,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_248")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_249 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_249") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_249")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(3,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(10,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_249")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_250 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_250") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_250")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(5,2),new Monomio(4,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(15,2),new Monomio(10,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_250")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("derivada")
  public void test_derivada_251 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_derivada_251") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_derivada_251")) ;
if (ok_sofar)
  ok_sofar = new Derivada(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(3,3),new Monomio(4,2),new Monomio(5,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(20,3),new Monomio(9,2),new Monomio(8,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_derivada_251")) ;
    ResultsHandler.add_result(new String("derivada"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_252 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_252") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_252")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_252")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_253 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_253") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_253")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_253")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_254 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_254") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_254")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(1,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_254")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_255 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_255") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_255")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_255")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_256 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_256") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_256")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_256")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_257 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_257") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_257")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(1,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_257")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_258 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_258") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_258")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(4,2),new Monomio(1,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_258")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_259 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_259") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_259")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_259")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_260 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_260") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_260")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(2,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(1,2),new Monomio(1,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(25,6),new Monomio(10,5),new Monomio(11,4),new Monomio(42,3),new Monomio(9,2),new Monomio(8,1),new Monomio(16,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_260")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_261 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_261") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_261")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(2,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(20,1),new Monomio(27,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_261")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_262 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_262") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_262")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(3,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(2,2),new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(25,6),new Monomio(20,5),new Monomio(24,4),new Monomio(73,3),new Monomio(30,2),new Monomio(26,1),new Monomio(40,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_262")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_263 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_263") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_263")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(13,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_263")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_264 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_264") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_264")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(4,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_264")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_265 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_265") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_265")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(5,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(18,1),new Monomio(19,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_265")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_266 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_266") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_266")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(1,2),new Monomio(1,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(125,3),new Monomio(25,2),new Monomio(5,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_266")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_267 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_267") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_267")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(1,2),new Monomio(3,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(4,3),new Monomio(1,2),new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(27,12),new Monomio(108,11),new Monomio(171,10),new Monomio(190,9),new Monomio(345,8),new Monomio(528,7),new Monomio(437,6),new Monomio(374,5),new Monomio(548,4),new Monomio(424,3),new Monomio(152,2),new Monomio(176,1),new Monomio(166,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_267")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_268 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_268") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_268")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(1,2),new Monomio(4,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(4,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(27,6),new Monomio(108,5),new Monomio(234,4),new Monomio(304,3),new Monomio(271,2),new Monomio(148,1),new Monomio(51,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_268")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_269 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_269") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_269")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(2,2),new Monomio(5,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(2,2),new Monomio(2,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(27,9),new Monomio(54,8),new Monomio(90,7),new Monomio(179,6),new Monomio(192,5),new Monomio(200,4),new Monomio(228,3),new Monomio(132,2),new Monomio(88,1),new Monomio(63,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_269")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_270 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_270") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_270")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(5,2) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(125,6),new Monomio(275,4),new Monomio(160,2),new Monomio(28,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_270")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_271 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_271") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_271")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(5,2),new Monomio(3,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(86,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_271")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_272 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_272") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_272")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(2,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(8,2),new Monomio(4,1),new Monomio(6,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_272")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_273 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_273") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_273")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(3,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(1,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(18,4),new Monomio(12,3),new Monomio(11,2),new Monomio(3,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_273")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_274 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_274") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_274")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(4,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(50,4),new Monomio(40,3),new Monomio(28,2),new Monomio(8,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_274")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_275 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_275") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_275")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(5,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(18,8),new Monomio(63,4),new Monomio(53,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_275")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_276 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_276") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_276")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(5,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(12,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_276")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_277 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_277") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_277")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(5,3),new Monomio(4,2),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1250,8),new Monomio(2000,7),new Monomio(5825,6),new Monomio(5870,5),new Monomio(8652,4),new Monomio(5416,3),new Monomio(4944,2),new Monomio(1568,1),new Monomio(901,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_277")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_278 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_278") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_278")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_278")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_279 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_279") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_279")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(3,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_279")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_280 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_280") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_280")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(3,2),new Monomio(2,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_280")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_281 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_281") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_281")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(4,3),new Monomio(2,2),new Monomio(1,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_281")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_282 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_282") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_282")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_282")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_283 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_283") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_283")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(4,3),new Monomio(4,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(9,4),new Monomio(12,3),new Monomio(12,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_283")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_284 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_284") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_284")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(2,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(2,2),new Monomio(5,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,6),new Monomio(12,5),new Monomio(42,4),new Monomio(68,3),new Monomio(91,2),new Monomio(40,1),new Monomio(8,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_284")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_285 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_285") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_285")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(2,2),new Monomio(5,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(5,3),new Monomio(1,2),new Monomio(5,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(375,12),new Monomio(1125,11),new Monomio(1350,10),new Monomio(1950,9),new Monomio(2795,8),new Monomio(2170,7),new Monomio(1963,6),new Monomio(1830,5),new Monomio(876,4),new Monomio(575,3),new Monomio(293,2),new Monomio(90,1),new Monomio(11,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_285")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_286 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_286") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_286")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(5,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(213,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_286")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_287 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_287") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_287")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(1,2),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1875,8),new Monomio(3000,7),new Monomio(9300,6),new Monomio(9480,5),new Monomio(14923,4),new Monomio(9500,3),new Monomio(9354,2),new Monomio(3020,1),new Monomio(1905,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_287")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_288 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_288") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_288")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(2,3),new Monomio(2,2),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(3,2),new Monomio(4,1) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(768,12),new Monomio(2304,11),new Monomio(5664,10),new Monomio(8336,9),new Monomio(10323,8),new Monomio(8808,7),new Monomio(6326,6),new Monomio(2952,5),new Monomio(1138,4),new Monomio(176,3),new Monomio(32,2),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_288")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_289 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_289") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_289")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(2,3),new Monomio(4,2),new Monomio(2,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_289")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_290 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_290") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_290")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_290")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_291 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_291") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_291")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(22,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_291")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_292 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_292") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_292")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(1,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(5,3),new Monomio(2,2),new Monomio(1,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(32,12),new Monomio(240,11),new Monomio(696,10),new Monomio(1028,9),new Monomio(1080,8),new Monomio(1356,7),new Monomio(1484,6),new Monomio(972,5),new Monomio(746,4),new Monomio(693,3),new Monomio(254,2),new Monomio(109,1),new Monomio(111,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_292")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_293 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_293") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_293")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(3,2),new Monomio(2,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(256,6),new Monomio(576,5),new Monomio(1440,4),new Monomio(1620,3),new Monomio(1895,2),new Monomio(996,1),new Monomio(589,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_293")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_294 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_294") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_294")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(4,2),new Monomio(2,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(32,6),new Monomio(160,4),new Monomio(268,2),new Monomio(150,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_294")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_295 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_295") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_295")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(4,2),new Monomio(4,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(1,2),new Monomio(1,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(256,9),new Monomio(192,8),new Monomio(240,7),new Monomio(548,6),new Monomio(284,5),new Monomio(264,4),new Monomio(332,3),new Monomio(96,2),new Monomio(68,1),new Monomio(56,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_295")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_296 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_296") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_296")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(9,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_296")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_297 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_297") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_297")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(4,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(2,1),new Monomio(1,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(80,4),new Monomio(80,3),new Monomio(76,2),new Monomio(28,1),new Monomio(13,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_297")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_298 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_298") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_298")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(5,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(5,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(55,1),new Monomio(152,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_298")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_299 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_299") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_299")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(5,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(4,1),new Monomio(2,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(20,6),new Monomio(80,4),new Monomio(50,3),new Monomio(80,2),new Monomio(100,1),new Monomio(33,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_299")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_300 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_300") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_300")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(5,2),new Monomio(4,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(4,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(40,3),new Monomio(260,2),new Monomio(568,1),new Monomio(420,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_300")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("componer")
  public void test_componer_301 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_componer_301") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_componer_301")) ;
if (ok_sofar)
  ok_sofar = new Componer(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(3,3),new Monomio(2,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(3,0) }))).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(80,4),new Monomio(504,3),new Monomio(1188,2),new Monomio(1246,1),new Monomio(495,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_componer_301")) ;
    ResultsHandler.add_result(new String("componer"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_302 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_302") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_302")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_302")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_303 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_303") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_303")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_303")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_304 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_304") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_304")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(1,2),new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_304")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_305 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_305") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_305")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(2,1),new Monomio(1,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_305")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_306 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_306") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_306")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(2,1),new Monomio(2,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_306")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_307 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_307") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_307")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(5,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(4,2),new Monomio(3,1),new Monomio(1,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_307")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_308 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_308") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_308")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(5,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_308")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_309 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_309") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_309")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(5,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(3,2) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_309")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_310 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_310") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_310")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(2,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_310")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_311 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_311") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_311")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(3,3),new Monomio(3,2),new Monomio(3,1),new Monomio(5,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_311")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_312 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_312") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_312")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(1,1),new Monomio(3,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_312")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_313 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_313") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_313")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(3,2),new Monomio(2,1) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_313")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_314 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_314") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_314")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(5,2),new Monomio(5,1) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_314")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_315 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_315") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_315")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(3,3),new Monomio(4,2),new Monomio(1,1),new Monomio(2,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_315")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_316 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_316") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_316")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(2,3),new Monomio(2,1),new Monomio(2,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_316")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_317 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_317") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_317")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_317")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_318 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_318") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_318")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(3,2),new Monomio(5,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_318")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_319 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_319") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_319")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(2,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(2,3),new Monomio(3,2),new Monomio(5,1),new Monomio(2,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_319")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_320 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_320") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_320")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(3,2),new Monomio(2,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_320")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_321 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_321") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_321")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(3,2),new Monomio(4,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(2,2),new Monomio(4,1),new Monomio(5,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_321")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_322 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_322") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_322")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(5,2),new Monomio(5,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(5,1),new Monomio(5,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_322")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_323 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_323") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_323")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(3,3),new Monomio(2,2),new Monomio(5,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_323")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_324 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_324") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_324")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(2,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_324")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_325 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_325") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_325")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(2,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,1) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_325")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_326 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_326") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_326")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(1,2),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_326")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_327 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_327") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_327")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(3,2),new Monomio(3,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_327")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_328 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_328") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_328")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(3,2),new Monomio(4,1),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(3,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_328")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_329 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_329") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_329")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(4,3),new Monomio(3,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(5,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_329")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_330 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_330") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_330")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(5,3),new Monomio(3,2),new Monomio(2,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_330")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_331 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_331") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_331")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(5,3),new Monomio(3,2),new Monomio(2,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(2,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_331")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_332 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_332") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_332")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(5,3),new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(1,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_332")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_333 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_333") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_333")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(4,1),new Monomio(1,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_333")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_334 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_334") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_334")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(4,2),new Monomio(4,1),new Monomio(2,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_334")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_335 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_335") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_335")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(4,1),new Monomio(2,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_335")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_336 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_336") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_336")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(4,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_336")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_337 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_337") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_337")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(5,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_337")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_338 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_338") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_338")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_338")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_339 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_339") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_339")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(1,3),new Monomio(5,2) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_339")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_340 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_340") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_340")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(3,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_340")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_341 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_341") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_341")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(3,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_341")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_342 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_342") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_342")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_342")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_343 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_343") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_343")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(3,3),new Monomio(5,1),new Monomio(1,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_343")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_344 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_344") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_344")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(4,1),new Monomio(3,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_344")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_345 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_345") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_345")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(2,1),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,3),new Monomio(1,2),new Monomio(3,1),new Monomio(4,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_345")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_346 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_346") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_346")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(3,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_346")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_347 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_347") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_347")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(4,1),new Monomio(5,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(1,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_347")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_348 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_348") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_348")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(5,1),new Monomio(1,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(2,1) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_348")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_349 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_349") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_349")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(1,2),new Monomio(3,1) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(3,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_349")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_350 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_350") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_350")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(4,2),new Monomio(2,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_350")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_351 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_351") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_351")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(2,2),new Monomio(5,1),new Monomio(3,0) })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,2),new Monomio(1,1),new Monomio(1,0) }))).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_351")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_352 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_352") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_352")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  })),new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_352")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("equals")
  public void test_equals_353 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_equals_353") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_equals_353")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,2),new Monomio(1,1) })),2).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_equals_353")) ;
    ResultsHandler.add_result(new String("equals"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_354 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_354") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_354")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_354")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_355 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_355") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_355")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 0")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_355")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_356 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_356") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_356")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("0")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] {  }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_356")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_357 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_357") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_357")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("1x^0 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_357")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_358 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_358") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_358")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 1x^1 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_358")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_359 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_359") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_359")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("x+ 4x^0 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_359")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_360 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_360") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_360")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("1x+ 5x^0")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_360")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_361 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_361") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_361")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("x^3+ 2x^2 +x^1+5 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(2,2),new Monomio(1,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_361")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_362 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_362") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_362")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("x^3+2x^2 + 4x^1 + 5x^0")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(2,2),new Monomio(4,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_362")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_363 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_363") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_363")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" x^3+3x^1 + 3 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(3,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_363")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_364 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_364") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_364")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("x^3 +5x ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,3),new Monomio(5,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_364")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_365 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_365") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_365")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("x^4+ 3x^3 + 4x^2+ 5x+ 4")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(1,4),new Monomio(3,3),new Monomio(4,2),new Monomio(5,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_365")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_366 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_366") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_366")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 2x^0 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_366")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_367 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_367") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_367")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("2")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_367")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_368 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_368") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_368")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("2x^0 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_368")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_369 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_369") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_369")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 2x + 1 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_369")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_370 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_370") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_370")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("2x^1 + 3x^0 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_370")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_371 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_371") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_371")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("2x^3 +4x^2+ 2x^1+ 1x^0 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(4,2),new Monomio(2,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_371")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_372 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_372") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_372")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("2x^3 + 4x^2+5x^1 + 3x^0 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,3),new Monomio(4,2),new Monomio(5,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_372")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_373 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_373") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_373")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("2x^4 + 1x^3+ 2x^2 +3x +1")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(2,4),new Monomio(1,3),new Monomio(2,2),new Monomio(3,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_373")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_374 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_374") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_374")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 3x^0 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_374")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_375 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_375") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_375")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("3 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_375")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_376 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_376") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_376")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("3x^0")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_376")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_377 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_377") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_377")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("3x^1+2x^0 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_377")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_378 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_378") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_378")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 3x^1+ 4")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_378")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_379 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_379") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_379")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("3x^1 + 4")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_379")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_380 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_380") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_380")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("3x+ 5x^0")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_380")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_381 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_381") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_381")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("3x^2 +1x +1 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(1,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_381")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_382 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_382") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_382")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 3x^2 + 4x +5 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(4,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_382")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_383 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_383") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_383")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 3x^2+ 5x")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,2),new Monomio(5,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_383")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_384 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_384") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_384")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("3x^3 + x^2 +5x^1+5")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(1,2),new Monomio(5,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_384")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_385 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_385") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_385")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 3x^3 +3x^2+2")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,3),new Monomio(3,2),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_385")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_386 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_386") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_386")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 3x^4+ x^3+3x^2 +3x+4 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(1,3),new Monomio(3,2),new Monomio(3,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_386")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_387 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_387") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_387")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 3x^4+ 2x^3 +5x^2 + 4x^1 + 2x^0 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(3,4),new Monomio(2,3),new Monomio(5,2),new Monomio(4,1),new Monomio(2,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_387")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_388 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_388") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_388")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("4 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_388")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_389 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_389") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_389")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("4x^0")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_389")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_390 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_390") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_390")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("4x + 1x^0")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_390")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_391 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_391") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_391")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("4x + 4 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_391")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_392 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_392") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_392")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("4x+ 4x^0")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,1),new Monomio(4,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_392")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_393 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_393") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_393")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("4x^2+ 1x^1 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(1,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_393")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_394 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_394") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_394")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("4x^2+5x + 5 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,2),new Monomio(5,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_394")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_395 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_395") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_395")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 4x^4 + 2x^3 + 5x^2+2x+ 3")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(4,4),new Monomio(2,3),new Monomio(5,2),new Monomio(2,1),new Monomio(3,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_395")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_396 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_396") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_396")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 5x^0")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_396")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_397 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_397") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_397")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 5x^0 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_397")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_398 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_398") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_398")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 5x^1 +1")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,1),new Monomio(1,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_398")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_399 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_399") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_399")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 5x^2+4x^1")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,2),new Monomio(4,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_399")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_400 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_400") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_400")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("5x^3 + 4x^2 + 5x ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(4,2),new Monomio(5,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_400")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_401 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_401") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_401")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 5x^3 +5x^2+ 5")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,3),new Monomio(5,2),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_401")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_402 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_402") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_402")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String(" 5x^4 +1x^3 + x^2 + 2x^1 ")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(1,3),new Monomio(1,2),new Monomio(2,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_402")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_403 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_403") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_403")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("5x^4 + 2x^3+x^2+ 1x^1")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(2,3),new Monomio(1,2),new Monomio(1,1) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_403")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  @Tag("constructor")
  public void test_constructor_404 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_constructor_404") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_constructor_404")) ;
if (ok_sofar)
  ok_sofar = new Constructor(new String("5x^4+ 3x^3 +2x^2+ 2x^1+ 5x^0")).doCall().checkResult(new Polinomio(new NodePositionList<Monomio>(new Monomio[] { new Monomio(5,4),new Monomio(3,3),new Monomio(2,2),new Monomio(2,1),new Monomio(5,0) }))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_constructor_404")) ;
    ResultsHandler.add_result(new String("constructor"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab2";
}
static class PolinomioUtils {
  public static void resetPrinter() {
  }

  public static String printer(Object obj) {

    if (obj instanceof Polinomio) {
      Polinomio p = (Polinomio) obj;
      return "new Polinomio(\""+obj.toString()+"\")";
    } else if (obj instanceof Monomio) {
      Monomio m = (Monomio) obj;
      return "new Monomio("+m.left()+","+m.right()+")";
    } else {
      return TestUtils.printer(obj, x -> printer(x));
    }
  }

  public static boolean checkPolynomioReturn(TestCall<Polinomio,Polinomio> call, 
                                             TestResult<Polinomio,Polinomio> tr, 
                                             Polinomio expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return call.equalsExpected(tr.getValue().terms, expected.terms);
  }

  public static Polinomio copy(Polinomio p) {
    return new Polinomio(new NodePositionList<>(p.terms));
  }
}




























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";
    if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Position<?>) {
      return obj.toString();
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.left())+","+print.apply(p.right())+")";
    } else if (obj instanceof java.util.Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("}");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Tree<?>) {
      Tree<?> t = (Tree<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("\n");
      buf.append(t.toString());
      buf.append("\n");
      return buf.toString();
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof int[]) {
      int[] arr = (int[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        int aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if(obj instanceof char[]) {
      char[] arr = (char[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        char aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+(TestName==null?"":TestName)+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+(TestName==null?"":TestName)+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
          TestData.message("the call to "+msg+" raised the exception "+exc+
                             " although it should not have");
          break;
      default:
          TestData.message(" -- the exception "+exc+" was raised although it "+
                             "should not have been\n"+msg);
          break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }

    TestData.message(msg);
    terminateErrorPrint();
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
          return "after executing the call sequence ";
      case LAST:
          return "while executing the last statement of call sequence ";
      case DURING:
          return "while executing the call sequence ";
      case UNRELATED:
          return "";
      }
      return "";
    }
  }

  static <E> boolean checkNull(TestCall<E,Boolean> call,
                               TestResult<E,Boolean> result,
                               Boolean expected) {
    if (expected) return call.nonNull();
    else return call.isNull();
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  static <E> boolean attributeEquals(TestCall<?,?> call, String attributeName, E value, E expected) {
    if (expected == null) {
      if (value != null) {
        printError
          (ExecutionTime.AFTER,
           "after the call "+call.toString()+
           " the attribute "+attributeName+
           " has the value \n  "+TestUtils.print(value)+
           "\nwhich differs from the expected value null");
        return false;
      }
    } else {
      if (!expected.equals(value)) {
        printError
          (ExecutionTime.AFTER,
           "after the call "+call.toString()+
           " the attribute "+attributeName+
           " has the value \n  "+TestUtils.print(value)+
           "\nwhich differs from the expected value \n  "+TestUtils.print(expected));
        return false;
      }
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are basic arrays, are equal
  static <E,F> boolean eqArrays(TestCall<int[],int[]> call,
                                TestResult<int[],int[]> result,
                                int[] expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return eqArrays(call, result.getValue(), expected);
  }

  static boolean eqArrays(TestCall<int[],int[]> call, int[] value, int[] expected) {
    boolean ok_sofar = value.length == expected.length;

    if (ok_sofar) {
      for (int i=0; i<value.length && ok_sofar; i++) {
        ok_sofar = ok_sofar && (value[i] == expected[i]);
      }
    }

    if (!ok_sofar) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an array "+printArray(value)+
         " which differs from the expected array "+printArray(expected));
    }
    return ok_sofar;
  }

  // Checks that the result is a member of the iterable
  static <E,F> boolean memberElements(TestCall<E,F> call,
                                     TestResult<E,F> result,
                                     F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    boolean checkResult = memberElements(call,result.getValue(),expected);
    if (!checkResult)
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
    return checkResult;
  }

  static <E,F> boolean memberElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!memberElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value\n  "+TestUtils.print(value)+
         "\nwhich is not included among the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  public static <E,F>
    boolean memberElements(E value, F expectedP) {
    if (expectedP instanceof Iterable<?>) {
      Iterable<?> expected = (Iterable<?>) expectedP;

      HashSet<Object> s = new HashSet<Object>();
      for (Object e : expected) {
        s.add(e);
      }
      return s.contains(value);
    } else {
      System.out.println
        ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;

      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
      if (!s1.equals(s2))
        return false;
      else
        return true;
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }



  // Checks that results, which are iterables, return the same
  // elements, preserving the order.
  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElementsInOrder(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    E value,
                                    F expected) {

    if (!sameElementsInOrder(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElementsInOrder(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;

      Iterator<?> it1 = value.iterator();
      Iterator<?> it2 = expected.iterator();

      if (it1 == null) return false;

      while (it1.hasNext() && it2.hasNext()) {
        Object e2 = it2.next();
        Object e1 = null;
        try { e1 = it1.next(); }
        catch (Throwable exc) {
          return false;
        }
        if (e2 == null && e1 != null) return false;
        if (!e2.equals(e1)) return false;
      }

      if (it1.hasNext() != it2.hasNext())
        return false;
      return true;

    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {

    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }


  static <E> boolean wellSorted(TestCall<?,?> call,
                                PositionList<E> value,
                                PositionList<E> expected,
                                Function<Pair<E,E>,Boolean> isSame) {

    PositionList<E> expectedCopy = new NodePositionList<E>(expected);

    if (value.size() != expected.size()) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a list:\n  "+value+
         "\nwhich contains the wrong number of elements.\n"+
         "The correct list (modulo order of equal elements) is\n  "+
         expectedCopy);
      return false;
    }

    Position<E> valuePos = value.first();

    while (valuePos != null) {
      E valueE = valuePos.element();

      if (valueE == null) {
        if (value.size() != expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list:\n  "+value+
             "\nwhich contains a null element.\n"+
             "The correct list (modulo order of equal elements) is\n  "+
             expectedCopy);
          return false;
        }
      }

      Position<E> expectedPos = expected.first();
      boolean found = false;
      boolean equals = true;

      while (expectedPos != null && !found && equals) {
        E expectedE = expectedPos.element();
        if (valueE.equals(expectedE)) {
          found = true;
          expected.remove(expectedPos);
        } else if (!isSame.apply(new Pair<E,E>(valueE,expectedE)))
          equals = false;

        if (!found && equals) {
          expectedPos = expected.next(expectedPos);
        }
      }

      if (!found) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a list:\n  "+value+
           "\nwhich contains elements either incorrect elements or elements in the wrong order."+
           "\nThe correct list (modulo order of equal elements) is\n  "+
           expectedCopy);
        return false;
      }

      valuePos = value.next(valuePos);
    }
    return true;
  }


  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
        return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     java.util.Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterator with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
        return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean iterableCorrect(String callString, F[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,PositionList<F>> call,
     TestResult<Iterable<E>,PositionList<F>> result,
     Iterable<F> expected) {
    java.util.Iterator<E> it = null;
    java.util.Iterator<F> exp = expected.iterator();

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
                                return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean iterableCorrect(String callString, Iterable<F> original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    PositionList<F> e = extractElementsFromIterable(callString, original);
    if (l == null) return false;

    boolean correct = (e.size() == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      Position<F> cursorE = e.first();
      for (int j=0; j<e.size(); j++) {
        if (cursorE.element() == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && cursorE.element().equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
                                cursorE = e.next(cursorE);
      }
    }

    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(e));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;

      if (l.size() != original.length) {
          ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
          E elem = lPos.element();

          if (elem == null) ok_sofar = (original[i] == null);
          else ok_sofar = elem.equals(original[i]);

          lPos = l.next(lPos);
          ++i;
      }

      if (!ok_sofar) {
          printError
            (ExecutionTime.DURING,
               "the call "+callString+
               " has modified the input list "+TestUtils.print(original)+
             "; it has now the elements "+TestUtils.print(l));
          return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
          if (newer[i] == null) ok_sofar = (original[i] == null);
          else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
          printError
              (ExecutionTime.DURING,
               "the call "+callString+
               " has modified the input array "+TestUtils.print(original)+
               "; it has now the elements "+TestUtils.print(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> Iterable<E> returnIterable(Iterable<E> iterable) {
    return iterable;
  }

  static boolean redefinesToString(TestCall<?,?> call, Object obj, String result) {
    String objectToString =
      obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
    if (result.equals(objectToString)) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned the same result as the Object toString method.\n"+
           "The class should redefine the public toString() method.\n");
        return false;
    }
    return true;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  static String printArray(char[] arr) {
      if (arr == null) return "null";
      else {
          StringBuilder arrString = new StringBuilder("[");

          for (int i = 0; i < arr.length; i++) {
              arrString.append(arr[i]);
              if (i < arr.length-1)
                  arrString.append(", ");
          }
          arrString.append("]");
          return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static Object accessAttribute(String fieldName, Object obj) {
    try {
      Field field;
      field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(obj);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field "+fieldName+": ",
         exc);
      return null;
    }
  }

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;

    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
        (Integer) majorMethod.invoke(null);
      aedlibMinor =
        (Integer) minorMethod.invoke(null);
      aedlibPatchlevel =
        (Integer) patchlevelMethod.invoke(null);

      isOk =
        ((aedlibMajor > major)
         || ((aedlibMajor == major) &&
             ((aedlibMinor > minor)
              || ((aedlibMinor == minor) &&
                  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
        ("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
        "*** ERROR: aedlib is too old. Minimum version needed is "+
        major+"."+minor+"."+patchlevel+"; your version is "+
        aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
        ". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true;
  }

  @SuppressWarnings("unchecked")
  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
            if (!parameterTypes[i].isInstance(params[i]))
              equals = false;
          }
          if (equals) {
            cnstr.setAccessible(true);
            return cnstr.newInstance(params);
          }
        }
      }
    } catch (ClassNotFoundException exc) {
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }

  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }

  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      TestData.message("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }

  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    String callString = getCall().toString();
    if (!callString.equals("")) {
      if (isException())
        return callString + "  =>  " + getException();
      else
        {
          String valueString = TesterCode.printer(getValue());
          return callString + "  =>  " + format_value(valueString);
        }
    } else return callString;
  }

  private String format_value(String msg) {
    String[] lines = msg.split("\\r?\\n");
    if (lines.length == 1) return msg;
    else {
      StringBuffer resultString = new StringBuffer();
      for (String line : lines) {
        resultString.append("\n    ");
        resultString.append(line);
      }
      return resultString.toString();
    }
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());

    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));

    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }
    return true;
  }

  boolean noException(Supplier<String> msg) {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean isNull() {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n");
      return false;
    } else return true;
  }

  boolean isNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] newer, Object[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          if (newer[i] == null) ok_sofar = (original[i] == null);
          else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(int[] newer, int[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(char[] newer, char[] original) {
      boolean ok_sofar = true;

      if (newer.length != original.length) {
          ok_sofar = false;
      }

      for (int i=0; i<newer.length && ok_sofar; i++) {
          ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
          TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call to "+this+
               " has modified the input array "+TestUtils.printArray(original)+
               "; it has now the elements "+TestUtils.printArray(newer));
          return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);

    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }

    return value.equals(true);
  }

  boolean equalsExpected(Object value, Object expected) {
    if (value == null) {
      if (expected != null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "\nthe call to "+this+" returned null, "+
           "but should have returned "+TestUtils.print(expected));
        return false;
      }
      else return true;
    }

    if (!equalsWithArrays(expected,value)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
         "\n\nbut should have returned\n  "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      return equalsExpected(value, expected);
    }
  }

  private static boolean equalsWithArrays(Object expected, Object value) {
    if (expected == null) return value == null;
    if (value == null) return expected == null;
    if (expected.equals(value)) return true;
    if (expected instanceof Object[] && value instanceof Object[]) {
      Object[] obj_expected = (Object[]) expected;
      Object[] obj_value = (Object[]) value;
      return Arrays.deepEquals(obj_expected,obj_value);
    } else if (expected instanceof int[] && value instanceof int[]) {
      int[] obj_expected = (int[]) expected;
      int[] obj_value = (int[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof char[] && value instanceof char[]) {
      char[] obj_expected = (char[]) expected;
      char[] obj_value = (char[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof long[] && value instanceof long[]) {
      long[] obj_expected = (long[]) expected;
      long[] obj_value = (long[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof float[] && value instanceof float[]) {
      float[] obj_expected = (float[]) expected;
      float[] obj_value = (float[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof double[] && value instanceof double[]) {
      double[] obj_expected = (double[]) expected;
      double[] obj_value = (double[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof byte[] && value instanceof byte[]) {
      byte[] obj_expected = (byte[]) expected;
      byte[] obj_value = (byte[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof short[] && value instanceof short[]) {
      short[] obj_expected = (short[]) expected;
      short[] obj_value = (short[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof boolean[] && value instanceof boolean[]) {
      boolean[] obj_expected = (boolean[]) expected;
      boolean[] obj_value = (boolean[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}

static class Suma extends TestCall<Polinomio,Polinomio>
{
  Polinomio x_1;
  Polinomio x_1_orig;
  Polinomio x_2;
  Polinomio x_2_orig;
  String callString;
  
  public Suma (Polinomio x_1,Polinomio x_2)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = PolinomioUtils.copy(x_1) ;
    this.x_2 = x_2 ;
    if (x_2 == null)
      x_2_orig = null ;
    else
      x_2_orig = PolinomioUtils.copy(x_2) ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Polinomio.suma")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1_orig)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_2_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Polinomio call () 
  {
    return Polinomio.suma(x_1,x_2) ;
  }
  
  public boolean checkResult (Polinomio expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_2)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    if (!unchanged(x_2,x_2_orig))
      return false ;
    if (!PolinomioUtils.checkPolynomioReturn(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Resta extends TestCall<Polinomio,Polinomio>
{
  Polinomio x_1;
  Polinomio x_1_orig;
  Polinomio x_2;
  Polinomio x_2_orig;
  String callString;
  
  public Resta (Polinomio x_1,Polinomio x_2)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = PolinomioUtils.copy(x_1) ;
    this.x_2 = x_2 ;
    if (x_2 == null)
      x_2_orig = null ;
    else
      x_2_orig = PolinomioUtils.copy(x_2) ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Polinomio.resta")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1_orig)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_2_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Polinomio call () 
  {
    return Polinomio.resta(x_1,x_2) ;
  }
  
  public boolean checkResult (Polinomio expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_2)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    if (!unchanged(x_2,x_2_orig))
      return false ;
    if (!PolinomioUtils.checkPolynomioReturn(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Multiplica extends TestCall<Polinomio,Polinomio>
{
  Polinomio x_1;
  Polinomio x_1_orig;
  Polinomio x_2;
  Polinomio x_2_orig;
  String callString;
  
  public Multiplica (Polinomio x_1,Polinomio x_2)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = PolinomioUtils.copy(x_1) ;
    this.x_2 = x_2 ;
    if (x_2 == null)
      x_2_orig = null ;
    else
      x_2_orig = PolinomioUtils.copy(x_2) ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Polinomio.multiplica")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1_orig)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_2_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Polinomio call () 
  {
    return Polinomio.multiplica(x_1,x_2) ;
  }
  
  public boolean checkResult (Polinomio expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_2)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    if (!unchanged(x_2,x_2_orig))
      return false ;
    if (!PolinomioUtils.checkPolynomioReturn(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Derivada extends TestCall<Polinomio,Polinomio>
{
  Polinomio x_1;
  String callString;
  
  public Derivada (Polinomio x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".derivada")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Polinomio call () 
  {
    return x_1.derivada() ;
  }
  
  public boolean checkResult (Polinomio expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!PolinomioUtils.checkPolynomioReturn(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Constructor extends TestCall<Polinomio,Polinomio>
{
  String x_1;
  String callString;
  
  public Constructor (String x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("new Polinomio")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Polinomio call () 
  {
    return new Polinomio(x_1) ;
  }
  
  public boolean checkResult (Polinomio expected) 
  {
    if (!noException())
      return false ;
    if (!PolinomioUtils.checkPolynomioReturn(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Componer extends TestCall<Polinomio,Polinomio>
{
  Polinomio x_1;
  Polinomio x_1_orig;
  Polinomio x_2;
  Polinomio x_2_orig;
  String callString;
  
  public Componer (Polinomio x_1,Polinomio x_2)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = PolinomioUtils.copy(x_1) ;
    this.x_2 = x_2 ;
    if (x_2 == null)
      x_2_orig = null ;
    else
      x_2_orig = PolinomioUtils.copy(x_2) ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(new String("Polinomio.componer")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_1_orig)) ;
      output.append(new String(", ")) ;
      output.append(TesterCode.printer(x_2_orig)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Polinomio call () 
  {
    return Polinomio.componer(x_1,x_2) ;
  }
  
  public boolean checkResult (Polinomio expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_2)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    if (!unchanged(x_2,x_2_orig))
      return false ;
    if (!PolinomioUtils.checkPolynomioReturn(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Equals extends TestCall<Boolean,Boolean>
{
  Polinomio x_1;
  Object x_2;
  String callString;
  
  public Equals (Polinomio x_1,Object x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".equals")) ;
      output.append(new String("(")) ;
      output.append(TesterCode.printer(x_2)) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Boolean call () 
  {
    return x_1.equals(x_2) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Grado extends TestCall<Integer,Integer>
{
  Polinomio x_1;
  String callString;
  
  public Grado (Polinomio x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    if (callString == null)
    {
      StringBuilder output = new StringBuilder() ;
      output.append(TesterCode.printer(x_1)) ;
      output.append(new String(".grado")) ;
      output.append(new String("(")) ;
      output.append(new String(")")) ;
      callString = output.toString() ;
    }
    return callString ;
  }
  
  public Integer call () 
  {
    return x_1.grado() ;
  }
  
  public boolean checkResult (Integer expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}













static class BaseResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    if (results_sofar == null)
      results_sofar = new LinkedHashMap<String,Boolean>();
    if (runningTests == null)
      runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests "+runningTests+" are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName)) {
        System.out.println("succeeded");
      } else {
        System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok()) {
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      System.out.println(readFile("aed_success_message.txt"));
    } else {
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }

  private static String readFile(String filePath)
  {
    StringBuilder sb = new StringBuilder();
    Path path = Paths.get(filePath);

    if (Files.isReadable(path)) {
      try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8))
        {
          stream.forEach(s -> sb.append(s).append("\n"));
        }
      catch (IOException e) {};
    }

    return sb.toString();
  }

}




static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;
  static int individualTimeout = 10;
  static int globalTimeout = 60;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static int getIndividualTimeout() {
    return individualTimeout;
  }

  public static void setIndividualTimeout(int timeout) {
    individualTimeout = timeout;
  }

  public static int getGlobalTimeout() {
    return globalTimeout;
  }

  public static void setGlobalTimeout(int timeout) {
    globalTimeout = timeout;
  }

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
      }
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}

static class ResultsHandler extends BaseResultsHandler {
  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests ("+runningTests.size()+") are still running\n");
      return false;
    }

    int numSuccesses = 0;
    
    boolean ok_sofar = true;
    
    for (String key : results_sofar.keySet()) {
      if (!key.equals("constructor"))
        ok_sofar = ok_sofar && results_sofar.get(key);
    }

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return ok_sofar;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      if (!testName.equals("recursionCheck")) {
        System.out.print("Testing results for "+testName+": ");
        if (results_sofar.get(testName))
          System.out.println("succeeded");
        else
          System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok())
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
    else
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
  }
}

static class TesterCode
{
  
  public static void resetPrinter () 
  {
    PolinomioUtils.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return PolinomioUtils.printer(obj) ;
  }
  
}


}
