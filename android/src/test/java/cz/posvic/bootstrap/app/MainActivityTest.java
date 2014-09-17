package cz.posvic.bootstrap.app;

import android.view.MenuItem;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowToast;
import org.robolectric.tester.android.view.TestMenuItem;

import org.mozilla.mozstumbler.client.MainActivity;
import org.mozilla.mozstumbler.R;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

	private MainActivity activity;

	@Before
	public void setUp() throws Exception {
		activity = Robolectric.buildActivity(MainActivity.class).create().start().resume().get();
	}

	@Test
	public void activityShouldNotBeNull() {
		//assertNotNull(activity);
	}

	@Test
	public void clickOnMenuShouldShowToast() {
        /*
		MenuItem item = new TestMenuItem() {
			public int getItemId() {
				return R.id.about_version;
			}
		};

		activity.onOptionsItemSelected(item);

		assertThat(ShadowToast.getTextOfLatestToast(), equalTo("Menu item clicked"));
        */
	}
}
