package org.apache.ibatis.type;

import org.junit.jupiter.api.Test;

/**
 * @ClassName TypeReferenceTest
 * @Author chenyuxin
 * @Date 2022/6/6 22:08
 * @Email cyx0402@yeah.net
 * @Version v1
 **/
class TypeReferenceTest {

  @Test
  void getSuperclassTypeParameter() {
    new IntegerTypeReference();
  }
  public static class IntegerTypeReference extends TypeReference<Integer> {
  }
}
