/*
 * Copyright (c) 2018 Pantheon Technologies s.r.o. All Rights Reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v10.html
 */
package io.lighty.modules.northbound.restconf.community.impl.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommunityRestConfTest extends CommunityRestConfTestBase {

    @Test
    public void simpleRestconfTest() {
        Assert.assertNotNull(getLightyController());
        Assert.assertNotNull(getCommunityRestConf());
    }

}
