package study.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import study.logic.JavaSort;

public class SortServiceTest {

  private SortService sv = new SortService(new JavaSort<String>());

  @Test
  void test(){
    List<String> list =  sv.doSort(List.of("3" , "2" , "1"));

    assertEquals(List.of("1" , "2" , "3" ) , list);
    
  }
}
