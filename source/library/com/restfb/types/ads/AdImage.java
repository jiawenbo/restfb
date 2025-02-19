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
package com.restfb.types.ads;

import com.restfb.Facebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents the <a href="https://developers.facebook.com/docs/marketing-api/reference/ad-image">Ad Image type</a>
 */
public class AdImage extends BaseAdsObject {

  @Getter
  @Setter
  @Facebook
  private String hash;

  @Getter
  @Setter
  @Facebook
  private String url;

  @Getter
  @Setter
  @Facebook
  private String width;

  @Getter
  @Setter
  @Facebook
  private String height;

  @Getter
  @Setter
  @Facebook
  private String original_width;

  @Getter
  @Setter
  @Facebook
  private String original_height;

  private final List<AdCreative> creatives = new ArrayList<AdCreative>();

  public boolean addCreative(AdCreative creative) {
    return creatives.add(creative);
  }

  public boolean removeCreative(AdCreative creative) {
    return creatives.remove(creative);
  }

  public List<AdCreative> getCreatives() {
    return Collections.unmodifiableList(creatives);
  }

}
