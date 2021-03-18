/*
 * Copyright (c) 2008-2018 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.haulmont.addon.cubajm;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;
import com.haulmont.cuba.core.config.defaults.DefaultString;

/**
 * JavaMelody configuration parameters interface.
 */
@Source(type = SourceType.APP)
public interface JavaMelodyConfig extends Config {

    /**
     * @return login of a user that is authorized to open monitoring dashboard
     */
    @Property("cubajm.authorizedUserLogin")
    @DefaultString("admin")
    String getAuthorizedUserLogin();

    /**
     * @return password of a user that is authorized to open monitoring dashboard
     */
    @Property("cubajm.authorizedUserPassword")
    @DefaultString("admin")
    String getAuthorizedUserPassword();

    /**
     * @return the URL postfix to access to the monitoring dashboard. By default, it equals "/monitoring"
     */
    @Property("cubajm.monitoringUrl")
    @DefaultString("/monitoring")
    String getMonitoringUrl();

    /**
     * @return the URL centralized monitoring server.
     */
    @Property("cubajm.monitoringServerUrl")
    String getJavaMelodyServerAddress();

}
