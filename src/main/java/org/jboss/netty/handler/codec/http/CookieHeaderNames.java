/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.jboss.netty.handler.codec.http;

public final class CookieHeaderNames {
    static final String PATH = "Path";

    static final String EXPIRES = "Expires";

    static final String MAX_AGE = "Max-Age";

    static final String DOMAIN = "Domain";

    static final String SECURE = "Secure";

    static final String HTTPONLY = "HTTPOnly";

    static final String COMMENT = "Comment";

    static final String COMMENTURL = "CommentURL";

    static final String DISCARD = "Discard";

    static final String PORT = "Port";

    static final String VERSION = "Version";

    static final String SAMESITE = "SameSite";

    /**
     * Possible values for the SameSite attribute.
     * See <a href="https://tools.ietf.org/html/draft-ietf-httpbis-rfc6265bis-05">changes to RFC6265bis</a>
     */
    public enum SameSite {
        Lax,
        Strict,
        None;

        /**
         * Return the enum value corresponding to the passed in same-site-flag, using a case insensitive comparison.
         *
         * @param name value for the SameSite Attribute
         * @return enum value for the provided name or null
         */
        static SameSite of(String name) {
            if (name != null) {
                for (SameSite each : SameSite.class.getEnumConstants()) {
                    if (each.name().equalsIgnoreCase(name)) {
                        return each;
                    }
                }
            }
            return null;
        }
    }

    private CookieHeaderNames() {
        // Unused.
    }
}
