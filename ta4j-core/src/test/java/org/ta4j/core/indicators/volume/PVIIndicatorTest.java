/*
  The MIT License (MIT)

  Copyright (c) 2014-2017 Marc de Verdelhan & respective authors (see AUTHORS)

  Permission is hereby granted, free of charge, to any person obtaining a copy of
  this software and associated documentation files (the "Software"), to deal in
  the Software without restriction, including without limitation the rights to
  use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
  the Software, and to permit persons to whom the Software is furnished to do so,
  subject to the following conditions:

  The above copyright notice and this permission notice shall be included in all
  copies or substantial portions of the Software.

  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
  FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
  COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
  IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
  CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.ta4j.core.indicators.volume;

import org.junit.Test;
import org.ta4j.core.Bar;
import org.ta4j.core.TimeSeries;
import org.ta4j.core.mocks.MockBar;
import org.ta4j.core.mocks.MockTimeSeries;

import java.util.ArrayList;
import java.util.List;

import static org.ta4j.core.TATestsUtils.assertDecimalEquals;

public class PVIIndicatorTest {

    @Test
    public void getValue() {

        List<Bar> bars = new ArrayList<Bar>();
        bars.add(new MockBar(1355.69, 2739.55));
        bars.add(new MockBar(1325.51, 3119.46));
        bars.add(new MockBar(1335.02, 3466.88));
        bars.add(new MockBar(1313.72, 2577.12));
        bars.add(new MockBar(1319.99, 2480.45));
        bars.add(new MockBar(1331.85, 2329.79));
        bars.add(new MockBar(1329.04, 2793.07));
        bars.add(new MockBar(1362.16, 3378.78));
        bars.add(new MockBar(1365.51, 2417.59));
        bars.add(new MockBar(1374.02, 1442.81));
        TimeSeries series = new MockTimeSeries(bars);

        PVIIndicator pvi = new PVIIndicator(series);
        assertDecimalEquals(pvi.getValue(0), 1000);
        assertDecimalEquals(pvi.getValue(1), 977.7383);
        assertDecimalEquals(pvi.getValue(2), 984.7532);
        assertDecimalEquals(pvi.getValue(3), 984.7532);
        assertDecimalEquals(pvi.getValue(4), 984.7532);
        assertDecimalEquals(pvi.getValue(5), 984.7532);
        assertDecimalEquals(pvi.getValue(6), 982.6755);
        assertDecimalEquals(pvi.getValue(7), 1007.164);
        assertDecimalEquals(pvi.getValue(8), 1007.164);
        assertDecimalEquals(pvi.getValue(9), 1007.164);
    }
}
