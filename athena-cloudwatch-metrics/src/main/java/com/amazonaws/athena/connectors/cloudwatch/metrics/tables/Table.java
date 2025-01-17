/*-
 * #%L
 * athena-cloudwatch-metrics
 * %%
 * Copyright (C) 2019 Amazon Web Services
 * %%
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
 * #L%
 */
package com.amazonaws.athena.connectors.cloudwatch.metrics.tables;

import org.apache.arrow.vector.types.pojo.Schema;

import java.util.Set;

/**
 * Defines some commonly required field names used by all tables and consumers of tables in this connector.
 */
public abstract class Table
{
    //The name of the metric name field.
    public static final String METRIC_NAME_FIELD = "metric_name";
    //The name of the namespace field.
    public static final String NAMESPACE_FIELD = "namespace";
    //The name of the dimensions field which houses a list of Cloudwatch Metrics Dimensions.
    public static final String DIMENSIONS_FIELD = "dimensions";
    //The name of the convenience Dimension name field which gives easy access to 1 dimension name.
    public static final String DIMENSION_NAME_FIELD = "dim_name";
    //The name of the convenience Dimension value field which gives easy access to 1 dimension value.
    public static final String DIMENSION_VALUE_FIELD = "dim_value";
    //The name of the timestamp field, denoting the time period a particular metric sample was for.
    public static final String TIMESTAMP_FIELD = "timestamp";
    //The name of the metric value field which holds the value of a metric sample.
    public static final String VALUE_FIELD = "value";
    //The name of the statistic field (e.g. AVERAGE, p90).
    public static final String STATISTIC_FIELD = "statistic";
    //The name of the period field (e.g. 60 seconds).
    public static final String PERIOD_FIELD = "period";
    // Name of the metrics Dimension
    public static final String DIM_NAME_1 = "dim_name_1";
    public static final String DIM_NAME_2 = "dim_name_2";
    public static final String DIM_NAME_3 = "dim_name_3";
    public static final String DIM_NAME_4 = "dim_name_4";
    public static final String DIM_NAME_5 = "dim_name_5";
    public static final String DIM_NAME_6 = "dim_name_6";
    public static final String DIM_NAME_7 = "dim_name_7";
    public static final String DIM_NAME_8 = "dim_name_8";
    public static final String DIM_NAME_9 = "dim_name_9";
    public static final String DIM_NAME_10 = "dim_name_10";
    // Value of metric Dimension
    public static final String DIM_VALUE_1 = "dim_value_1";
    public static final String DIM_VALUE_2 = "dim_value_2";
    public static final String DIM_VALUE_3 = "dim_value_3";
    public static final String DIM_VALUE_4 = "dim_value_4";
    public static final String DIM_VALUE_5 = "dim_value_5";
    public static final String DIM_VALUE_6 = "dim_value_6";
    public static final String DIM_VALUE_7 = "dim_value_7";
    public static final String DIM_VALUE_8 = "dim_value_8";
    public static final String DIM_VALUE_9 = "dim_value_9";
    public static final String DIM_VALUE_10 = "dim_value_10";



    public abstract String getName();
    public abstract Schema getSchema();
    public abstract Set<String> getPartitionColumns();
}
