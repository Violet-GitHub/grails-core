/*
 * Copyright 2004-2005 Graeme Rocher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.groovy.grails.web.mapping;

/**
 * A mapping data for response codes (numbers)
 *
 * @author mike
 * @since 1.0-RC1
 */
public class ResponseCodeMappingData implements UrlMappingData{
    private final int responseCode;
    private final String responseCodeAsString;

    public ResponseCodeMappingData(String responseCode) {
        this.responseCode = Integer.parseInt(responseCode);
        this.responseCodeAsString = responseCode;
    }

    public String[] getTokens() {
        return new String[] {responseCodeAsString};
    }

    public String[] getLogicalUrls() {
        return new String[] {responseCodeAsString};
    }

    public String getUrlPattern() {
        return responseCodeAsString;
    }

    public boolean isOptional(int index) {
        return false;
    }

    @Override
    public UrlMappingData createRelative(String path) {
        throw new UnsupportedOperationException("You cannot create relative UrlMappings for response codes");
    }

    public int getResponseCode() {
        return responseCode;
    }
}
