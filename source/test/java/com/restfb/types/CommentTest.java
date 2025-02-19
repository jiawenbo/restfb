/**
 * Copyright (c) 2010-2015 Mark Allen, Norbert Bartels.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.restfb.types;

import static org.junit.Assert.*;

import com.restfb.AbstractJsonMapperTests;

import org.junit.Test;

public class CommentTest extends AbstractJsonMapperTests {

  @Test
  public void checkV2_2_NoHide() {
    Comment exampleComment =
        createJsonMapper().toJavaObject(jsonFromClasspath("v2_2/comment_noCanHide"), Comment.class);
    assertFalse(exampleComment.isCanHide());
    assertTrue(exampleComment.getIsHidden());
  }

  @Test
  public void checkV2_2_canHide() {
    Comment exampleComment = createJsonMapper().toJavaObject(jsonFromClasspath("v2_2/comment_canHide"), Comment.class);
    assertTrue(exampleComment.isCanHide());
    assertFalse(exampleComment.getIsHidden());
  }

  @Test
  public void checkV2_2_object() {
    Comment exampleComment = createJsonMapper().toJavaObject(jsonFromClasspath("v2_2/comment_object"), Comment.class);
    assertNotNull(exampleComment.getObject());
    assertEquals("1559830900918160", exampleComment.getObject().getId());
    assertEquals("picture time", exampleComment.getObject().getName());
  }

  @Test
  public void checkV2_2_issue286() {
    Comment exampleComment = createJsonMapper().toJavaObject(jsonFromClasspath("v2_2/comment-issue286"), Comment.class);
    assertNotNull(exampleComment.getObject());
    assertEquals("520586098107541", exampleComment.getObject().getId());
    assertEquals("new comment", exampleComment.getMessage());
  }
}
