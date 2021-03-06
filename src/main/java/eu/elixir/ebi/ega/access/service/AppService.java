/*
 * Copyright 2016 ELIXIR EBI
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
package eu.elixir.ebi.ega.access.service;

import eu.elixir.ebi.ega.access.dto.File;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 *
 * @author asenf
 */
public interface AppService {
    
    @PreAuthorize("#oauth2.hasScope('fuse')")
    public Iterable<String> getPublicKeyOrgs();

    @PreAuthorize("#oauth2.hasScope('fuse')")
    public Iterable<String> getDatasets();

    @PreAuthorize("#oauth2.hasScope('fuse')")
    public Iterable<String> getDatasetsByOrg(String org);
    
    @PreAuthorize("#oauth2.hasScope('fuse')")
    public Iterable<File> getDatasetFiles(String datasetId);
    
    @PreAuthorize("#oauth2.hasScope('fuse')")
    public Iterable<String> getDacDatasets(String dacId);

    @PreAuthorize("#oauth2.hasScope('elixir')")
    public Iterable<String> getElixirDatasets(String userId);
}
