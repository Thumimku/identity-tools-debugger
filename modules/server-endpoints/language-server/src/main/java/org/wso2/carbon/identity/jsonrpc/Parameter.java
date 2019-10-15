/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
 * under the License.
 */

package org.wso2.carbon.identity.jsonrpc;

/**
 * Parameter in the JSON RPC Request
 */
public class Parameter {

    /**
     * The parameter name
     */
    private String name;

    /**
     * The value of the paramweter
     */
    private String value;

    /**
     * Default constructor for un-marshallers
     */
    public Parameter() {

    }

    /**
     * Constructor taking name and value
     * @param name
     * @param value
     */
    public Parameter(String name, String value) {

        this.name = name;
        this.value = value;
    }
}
