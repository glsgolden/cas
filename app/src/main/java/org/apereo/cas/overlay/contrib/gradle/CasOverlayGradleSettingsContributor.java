package org.apereo.cas.overlay.contrib.gradle;

import io.spring.initializr.generator.project.contributor.SingleResourceProjectContributor;

public class CasOverlayGradleSettingsContributor extends SingleResourceProjectContributor {
    public CasOverlayGradleSettingsContributor() {
        super("./settings.gradle", "classpath:overlay/settings.gradle");
    }
}
