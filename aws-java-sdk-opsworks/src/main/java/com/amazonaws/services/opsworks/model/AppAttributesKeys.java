/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

/**
 * App Attributes Keys
 */
public enum AppAttributesKeys {
    
    DocumentRoot("DocumentRoot"),
    RailsEnv("RailsEnv"),
    AutoBundleOnDeploy("AutoBundleOnDeploy"),
    AwsFlowRubySettings("AwsFlowRubySettings");

    private String value;

    private AppAttributesKeys(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return AppAttributesKeys corresponding to the value
     */
    public static AppAttributesKeys fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("DocumentRoot".equals(value)) {
            return AppAttributesKeys.DocumentRoot;
        } else if ("RailsEnv".equals(value)) {
            return AppAttributesKeys.RailsEnv;
        } else if ("AutoBundleOnDeploy".equals(value)) {
            return AppAttributesKeys.AutoBundleOnDeploy;
        } else if ("AwsFlowRubySettings".equals(value)) {
            return AppAttributesKeys.AwsFlowRubySettings;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    