package com.apptanium.apps.mailserver;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by sgupta on 1/5/15.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(value = {MailServerApplicationTests.class,
                             SecurityUtilsTests.class
})
public class ApplicationTests {
}
