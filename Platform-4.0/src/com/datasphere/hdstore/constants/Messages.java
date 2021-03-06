package com.datasphere.hdstore.constants;

public final class Messages
{
    public static final String MSG_DBG_BACKGROUND_TASK_STARTED = "Started background task '%s' for HDStore '%s'";
    public static final String MSG_DBG_BACKGROUND_TASK_STOPPING = "Terminating background task '%s' for HDStore '%s'";
    public static final String MSG_DBG_BACKGROUND_TASK_STOPPED = "Background task '%s' for HDStore '%s' already terminated";
    public static final String MSG_DBG_DEFAULT_PROVIDER = "HDStore '%s' using default storage provider, '%s'";
    public static final String MSG_DBG_ELASTICSEARCH_INDICES = "Elasticsearch indices: '%s'";
    public static final String MSG_DBG_ELASTICSEARCH_QUERY = "Elasticsearch query:   '%s'";
    public static final String MSG_DBG_ELASTICSEARCH_TYPES = "Elasticsearch types:   '%s'";
    public static final String MSG_DBG_EXECUTION_TIME = "Execution time: %d.%03d seconds";
    public static final String MSG_DBG_INSERT_SUCCESS = "Inserted %d HDs successfully into HDStore '%s' in %d ms";
    public static final String MSG_DBG_INSERT_HD = "Inserting HD into HDStore '%s' - '%s'";
    public static final String MSG_DBG_MAPPING_CREATED = "Context type '%s' created mapping in HDStore '%s'";
    public static final String MSG_DBG_MAPPING_DEFINED = "Context type '%s' has mapping '%s'";
    public static final String MSG_DBG_NEW_CHECKPOINT = "Starting new checkpoint #%d for HDStore '%s'";
    public static final String MSG_DBG_NEXT_HD = "Returning HD '%s'";
    public static final String MSG_DBG_SCHEMA_CREATED = "Created a schema for HDStore '%s' from '%s'";
    public static final String MSG_DBG_TRANSFORMED_LIKE_TO_REGEX = "Transformed match filter from LIKE '%s' to regular expression '%s'";
    public static final String MSG_DBG_HDSTORE_FLUSH_DONE = "Flushed HDStore '%s' to memory";
    public static final String MSG_DBG_HDSTORE_FSYNC_DONE = "Flushed HDStore '%s' to disk";
    public static final String MSG_DBG_HD_ADDED_TO_CHECKPOINT = "HD %d in checkpoint #%d is '%s'";
    public static final String MSG_DBG_HD_COUNT = "HDStore '%s' contains %d HDs";
    public static final String MSG_DBG_HD_QUERY = "HDStore  query:   '%s'";
    public static final String MSG_ERR_CHECKPOINT_MALFORMED = "Malformed checkpoint for HDStore '%s': %s";
    public static final String MSG_ERR_CLUSTER_CONNECT_FAILURE = "Cannot connect to '%s'";
    public static final String MSG_ERR_CLUSTER_NAME_MISMATCH = "Cluster name '%s' for server '%s' does not match primary cluster name '%s'";
    public static final String MSG_ERR_CLUSTER_NAME_MISSING = "Do not have a cluster name for server '%s'";
    public static final String MSG_ERR_GET_INSTANCE_NAME_MISSING = "Provider '%s' does not implement 'public static String getInstanceName(String providerName, Map<String, Object> properties)'";
    public static final String MSG_ERR_HASH_FAILURE = "Cannot create hash using algorithm '%s'";
    public static final String MSG_ERR_INSERT_FAILURE = "Failed to insert %d HDs - %s";
    public static final String MSG_ERR_MAP_CREATION_FAILED = "Unable to create a source map";
    public static final String MSG_ERR_SCHEMA_CREATE_FAIL = "Cannot create a schema for HDStore '%s' from '%s'";
    public static final String MSG_ERR_SCHEMA_CREATE_FAILED = "JsonSchema not created";
    public static final String MSG_ERR_SCHEMA_INVALID = "HDStore '%s' schema is invalid: '%s'";
    public static final String MSG_ERR_SCHEMA_MISSING = "HDStore '%s' schema is missing";
    public static final String MSG_ERR_SCHEMA_RESOURCE_FAILED = "Schema resource, '%s', not loaded";
    public static final String MSG_EXC_DATA_TYPE_CREATE_FAIL = "Unable to create data type '%s' in HDStore '%s'";
    public static final String MSG_EXC_INVALID_ARGUMENT = "Invalid argument";
    public static final String MSG_EXC_INVALID_REPLICAS = "Cannot create HDStore '%s'. Property 'elasticsearch.replicas' must be greater than or equal to zero";
    public static final String MSG_EXC_INVALID_SHARDS = "Cannot create HDStore '%s'. Property 'elasticsearch.shards' must be greater than zero";
    public static final String MSG_EXC_INVALID_STORE_TYPE = "Cannot create HDStore '%s'. Property 'elasticsearch.storage_type' must be one of 'any', 'disk', or 'memory'";
    public static final String MSG_EXC_NODE_NOT_MISSING = "JSON contains '%s' node, which is not allowed";
    public static final String MSG_EXC_NODE_NOT_PRESENT = "JSON does not contain '%s' node, which is required";
    public static final String MSG_EXC_PROVIDER_MISSING = "Unable to instantiate instance of '%s' for provider '%s'";
    public static final String MSG_EXC_TYPE_UNSUPPORTED = "Unsupported context data type, '%s'";
    public static final String MSG_EXC_UNEXPECTED_DATE_FORMAT = "Cannot map date format '%s'";
    public static final String MSG_EXC_UNEXPECTED_DATE_TYPE = "Cannot map data type '%s'";
    public static final String MSG_EXC_UNEXPECTED_TYPE = "Unexpected object type: '%s'";
    public static final String MSG_EXC_UNMAPPED_METADATA_ITEM = "Invalid metadata item name, '%s'";
    public static final String MSG_EXC_UNMAPPED_TYPE = "Unable to map HD data type '%s'";
    public static final String MSG_EXC_HDSTORE_CREATE_FAIL = "Unable to create HDStore '%s'";
    public static final String MSG_EXC_HDSTORE_DROP_FAILED = "Failed to drop HDStore '%s'";
    public static final String MSG_INF_CHECKPOINT_WRITTEN = "Wrote checkpoint #%d with %d paths for HDStore '%s' for %d HDs";
    public static final String MSG_INF_CLUSTER_CONNECTED = "Connected to cluster '%s'";
    public static final String MSG_INF_CLUSTER_TOPOLOGY = "Cluster '%s' has nodes '%s'";
    public static final String MSG_INF_CONNECTING_LOCAL = "Connecting local client";
    public static final String MSG_INF_CONNECTING_NODE = "Connecting node '%s' to cluster '%s'";
    public static final String MSG_INF_CONNECTING_TRANSPORT = "Connecting transport client to '%s'";
    public static final String MSG_INF_DEFAULT_PROVIDER_STARTED = "Default storage provider, '%s', started";
    public static final String MSG_INF_DEFAULT_PROVIDER_STARTING = "Starting default storage provider";
    public static final String MSG_INF_DISCOVERED_HDSTORE = "Discovered HDStore '%s'";
    public static final String MSG_INF_HDSTORE_DROPPED = "Successfully dropped HDStore '%s'";
    public static final String MSG_INF_SHUTTING_DOWN_NODE = "Shutting down local node in cluster '%s'";
    public static final String MSG_INF_VALID_CHECKPOINT = "Read a valid checkpoint for HDStore '%s'";
    public static final String MSG_INF_HDSTORE_EXISTS = "HDStore '%s' already exists";
    public static final String MSG_LOG_INVALID_QUERY_CONTENT = "Query : %s";
    public static final String MSG_LOG_INVALID_QUERY_ERROR = "Error %2d: %s : %s";
    public static final String MSG_WRN_CHECKPOINT_DELETE_FAILED = "Failed to remove checkpoint for HDStore '%s'";
    public static final String MSG_INF_CHECKPOINT_MISSING = "Checkpoint not available for HDStore '%s'";
    public static final String MSG_WRN_CONTEXT_TYPE_EXISTS = "Context type '%s' already exists in HDStore '%s'";
    public static final String MSG_WRN_CONTEXT_TYPE_MISSING = "Context type '%s' does not exist in HDStore '%s'";
    public static final String MSG_WRN_INVALID_JSON_CONTENT = "Cannot parse JSON value '%s'";
    public static final String MSG_WRN_MAPPING_EXCEPTION = "Caught mapping exception - %s";
    public static final String MSG_WRN_PURGED_HDS = "Purged %d HDs past checkpoint #%d in HDStore '%s'";
    public static final String MSG_WRN_HDSTORE_MISSING = "HDStore '%s' does not exist";
}
