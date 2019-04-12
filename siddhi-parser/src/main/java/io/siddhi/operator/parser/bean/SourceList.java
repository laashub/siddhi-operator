/*
 * Copyright (c) 2019, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.siddhi.operator.parser.bean;

import java.util.ArrayList;
import java.util.List;

public class SourceList {

    private List<SourceDeploymentConfig> sourceDeploymentConfigs = new ArrayList<>();

    public List<SourceDeploymentConfig> getSourceDeploymentConfigs() {
        return sourceDeploymentConfigs;
    }

    public void addSourceDeploymentConfig(SourceDeploymentConfig sourceDeploymentConfig) {
        this.sourceDeploymentConfigs.add(sourceDeploymentConfig);
    }

}