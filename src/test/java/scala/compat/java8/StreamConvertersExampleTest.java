/*
 * Copyright (C) 2016 Typesafe Inc. <http://www.typesafe.com>
 */

import org.junit.Test;

import scala.collection.mutable.ArrayBuffer;
import scala.compat.java8.ScalaStreaming;


public class StreamConvertersExampleTest {
  @Test
  public void MakeAndUseArrayBuffer() {
    ArrayBuffer<String> ab = new ArrayBuffer<String>();
    ab.$plus$eq("salmon");
    ab.$plus$eq("herring");
    assert( ScalaStreaming.from(ab).mapToInt(x -> x.length()).sum() == 13 );
  }
}

