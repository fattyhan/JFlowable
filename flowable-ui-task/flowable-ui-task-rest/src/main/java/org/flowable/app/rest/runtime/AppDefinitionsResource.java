/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.flowable.app.rest.runtime;

import org.flowable.app.model.common.ResultListDataRepresentation;
import org.flowable.app.model.runtime.AppDefinitionRepresentation;
import org.flowable.app.service.runtime.FlowableAppDefinitionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for managing the app definitions.
 */
@RestController
public class AppDefinitionsResource {

    private final Logger logger = LoggerFactory.getLogger(AppDefinitionsResource.class);

    @Autowired
    protected FlowableAppDefinitionService appDefinitionService;

    @RequestMapping(value = "/rest/runtime/app-definitions", method = RequestMethod.GET)
    public ResultListDataRepresentation getAppDefinitions() {
        return appDefinitionService.getAppDefinitions();
    }

    @RequestMapping(value = "/rest/runtime/app-definitions/{deploymentKey}", method = RequestMethod.GET)
    public AppDefinitionRepresentation getAppDefinition(@PathVariable("deploymentKey") String deploymentKey) {
        return appDefinitionService.getAppDefinition(deploymentKey);
    }

}
