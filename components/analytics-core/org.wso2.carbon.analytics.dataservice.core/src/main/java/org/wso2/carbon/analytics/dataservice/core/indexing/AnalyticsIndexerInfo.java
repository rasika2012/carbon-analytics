/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.carbon.analytics.dataservice.core.indexing;

import org.apache.lucene.analysis.Analyzer;
import org.wso2.carbon.analytics.dataservice.core.AnalyticsDataService;
import org.wso2.carbon.analytics.datasource.core.fs.AnalyticsFileSystem;
import org.wso2.carbon.analytics.datasource.core.rs.AnalyticsRecordStore;

/**
 * Properties related to {@link AnalyticsDataIndexer}.
 */
public class AnalyticsIndexerInfo {

    private Analyzer luceneAnalyzer;
    
    private AnalyticsFileSystem analyticsFileSystem;
    
    private AnalyticsRecordStore analyticsRecordStore;

    private AnalyticsDataService analyticsDataService;
    
    private AnalyticsIndexedTableStore indexedTableStore;

    private int shardCount;

    private int shardIndexRecordBatchSize;
    
    private String indexStoreLocation;

    public Analyzer getLuceneAnalyzer() {
        return luceneAnalyzer;
    }

    public void setLuceneAnalyzer(Analyzer luceneAnalyzer) {
        this.luceneAnalyzer = luceneAnalyzer;
    }

    public AnalyticsFileSystem getAnalyticsFileSystem() {
        return analyticsFileSystem;
    }

    public void setAnalyticsFileSystem(AnalyticsFileSystem analyticsFileSystem) {
        this.analyticsFileSystem = analyticsFileSystem;
    }

    public AnalyticsRecordStore getAnalyticsRecordStore() {
        return analyticsRecordStore;
    }

    public void setAnalyticsRecordStore(AnalyticsRecordStore analyticsRecordStore) {
        this.analyticsRecordStore = analyticsRecordStore;
    }

    public AnalyticsDataService getAnalyticsDataService() {
        return analyticsDataService;
    }

    public void setAnalyticsDataService(AnalyticsDataService analyticsDataService) {
        this.analyticsDataService = analyticsDataService;
    }

    public AnalyticsIndexedTableStore getIndexedTableStore() {
        return indexedTableStore;
    }

    public void setIndexedTableStore(AnalyticsIndexedTableStore indexedTableStore) {
        this.indexedTableStore = indexedTableStore;
    }

    public int getShardCount() {
        return shardCount;
    }

    public void setShardCount(int shardCount) {
        this.shardCount = shardCount;
    }

    public int getShardIndexRecordBatchSize() {
        return shardIndexRecordBatchSize;
    }

    public void setShardIndexRecordBatchSize(int shardIndexRecordBatchSize) {
        this.shardIndexRecordBatchSize = shardIndexRecordBatchSize;
    }

    public String getIndexStoreLocation() {
        return indexStoreLocation;
    }

    public void setIndexStoreLocation(String indexStoreLocation) {
        this.indexStoreLocation = indexStoreLocation;
    }
    
}