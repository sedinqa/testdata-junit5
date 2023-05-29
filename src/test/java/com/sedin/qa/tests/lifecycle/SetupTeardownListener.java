package com.sedin.qa.tests.lifecycle;

import com.sedin.qa.testdata.global.GlobalDataManager;
import org.junit.platform.launcher.LauncherSession;
import org.junit.platform.launcher.LauncherSessionListener;

public class SetupTeardownListener implements LauncherSessionListener {
    @Override
    public void launcherSessionOpened(LauncherSession session) {
        GlobalDataManager.get().setup();
        LauncherSessionListener.super.launcherSessionOpened(session);
    }

    @Override
    public void launcherSessionClosed(LauncherSession session) {
        GlobalDataManager.get().teardown();
        LauncherSessionListener.super.launcherSessionClosed(session);
    }
}
