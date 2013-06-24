package org.robolectric.shadows;

import android.os.SystemClock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.TestRunners;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(TestRunners.WithDefaults.class)
public class SystemClockTest {
  @Test
  public void shouldAllowForFakingOfTime() throws Exception {
    Robolectric.getUiThreadScheduler().advanceTo(500);
    assertThat(SystemClock.uptimeMillis()).isEqualTo(500);
    Robolectric.getUiThreadScheduler().advanceTo(1000);
    assertThat(SystemClock.uptimeMillis()).isEqualTo(1000);
  }
}
