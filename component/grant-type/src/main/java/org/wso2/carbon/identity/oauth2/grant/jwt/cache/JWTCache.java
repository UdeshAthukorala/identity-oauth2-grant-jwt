/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License
 */

package org.wso2.carbon.identity.oauth2.grant.jwt.cache;

import org.wso2.carbon.identity.application.authentication.framework.cache.AuthenticationBaseCache;
import org.wso2.carbon.utils.CarbonUtils;

public class JWTCache extends AuthenticationBaseCache<String, JWTCacheEntry> {
    private static final JWTCache instance = new JWTCache("JWTCache");

    private JWTCache(String cacheName) {
        super(cacheName);
    }

    public static JWTCache getInstance() {
        CarbonUtils.checkSecurity();
        return instance;
    }

    public void addToCache(String key, JWTCacheEntry entry) {
        super.addToCache(key, entry);
    }

    public JWTCacheEntry getValueFromCache(String key) {
        return super.getValueFromCache(key);
    }

    public void clearCacheEntry(String key) {
        super.clearCacheEntry(key);
    }
}