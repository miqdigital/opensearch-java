/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.cluster;

import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.opensearch._types.Time;
import org.opensearch.client.opensearch.cluster.reroute.ClusterRerouteMetric;
import org.opensearch.client.opensearch.cluster.reroute.Command;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.endpoints.SimpleEndpoint;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.CopyableBuilder;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import org.opensearch.client.util.ToCopyableBuilder;

// typedef: cluster.reroute.Request

/**
 * Allows to manually change the allocation of individual shards in the cluster.
 */
@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class RerouteRequest extends RequestBase
    implements
        PlainJsonSerializable,
        ToCopyableBuilder<RerouteRequest.Builder, RerouteRequest> {

    @Nullable
    private final Time clusterManagerTimeout;

    @Nonnull
    private final List<Command> commands;

    @Nullable
    private final Boolean dryRun;

    @Nullable
    private final Boolean explain;

    @Deprecated
    @Nullable
    private final Time masterTimeout;

    @Nonnull
    private final List<ClusterRerouteMetric> metric;

    @Nullable
    private final Boolean retryFailed;

    @Nullable
    private final Time timeout;

    // ---------------------------------------------------------------------------------------------

    private RerouteRequest(Builder builder) {
        this.clusterManagerTimeout = builder.clusterManagerTimeout;
        this.commands = ApiTypeHelper.unmodifiable(builder.commands);
        this.dryRun = builder.dryRun;
        this.explain = builder.explain;
        this.masterTimeout = builder.masterTimeout;
        this.metric = ApiTypeHelper.unmodifiable(builder.metric);
        this.retryFailed = builder.retryFailed;
        this.timeout = builder.timeout;
    }

    public static RerouteRequest of(Function<RerouteRequest.Builder, ObjectBuilder<RerouteRequest>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Operation timeout for connection to cluster-manager node.
     * <p>
     * API name: {@code cluster_manager_timeout}
     * </p>
     */
    @Nullable
    public final Time clusterManagerTimeout() {
        return this.clusterManagerTimeout;
    }

    /**
     * Defines the commands to perform.
     * <p>
     * API name: {@code commands}
     * </p>
     */
    @Nonnull
    public final List<Command> commands() {
        return this.commands;
    }

    /**
     * If <code>true</code>, then the request simulates the operation only and returns the resulting state.
     * <p>
     * API name: {@code dry_run}
     * </p>
     */
    @Nullable
    public final Boolean dryRun() {
        return this.dryRun;
    }

    /**
     * If <code>true</code>, then the response contains an explanation of why the commands can or cannot be executed.
     * <p>
     * API name: {@code explain}
     * </p>
     */
    @Nullable
    public final Boolean explain() {
        return this.explain;
    }

    /**
     * Period to wait for a connection to the cluster-manager node. If no response is received before the timeout expires, the request fails
     * and returns an error.
     * <p>
     * API name: {@code master_timeout}
     * </p>
     */
    @Deprecated
    @Nullable
    public final Time masterTimeout() {
        return this.masterTimeout;
    }

    /**
     * Limits the information returned to the specified metrics.
     * <p>
     * API name: {@code metric}
     * </p>
     */
    @Nonnull
    public final List<ClusterRerouteMetric> metric() {
        return this.metric;
    }

    /**
     * If <code>true</code>, then retries allocation of shards that are blocked due to too many subsequent allocation failures.
     * <p>
     * API name: {@code retry_failed}
     * </p>
     */
    @Nullable
    public final Boolean retryFailed() {
        return this.retryFailed;
    }

    /**
     * Period to wait for a response. If no response is received before the timeout expires, the request fails and returns an error.
     * <p>
     * API name: {@code timeout}
     * </p>
     */
    @Nullable
    public final Time timeout() {
        return this.timeout;
    }

    /**
     * Serialize this object to JSON.
     */
    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeStartObject();
        serializeInternal(generator, mapper);
        generator.writeEnd();
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
        if (ApiTypeHelper.isDefined(this.commands)) {
            generator.writeKey("commands");
            generator.writeStartArray();
            for (Command item0 : this.commands) {
                item0.serialize(generator, mapper);
            }
            generator.writeEnd();
        }
    }
    // ---------------------------------------------------------------------------------------------

    @Override
    @Nonnull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Nonnull
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for {@link RerouteRequest}.
     */
    public static class Builder extends ObjectBuilderBase implements CopyableBuilder<Builder, RerouteRequest> {
        @Nullable
        private Time clusterManagerTimeout;
        @Nullable
        private List<Command> commands;
        @Nullable
        private Boolean dryRun;
        @Nullable
        private Boolean explain;
        @Nullable
        private Time masterTimeout;
        @Nullable
        private List<ClusterRerouteMetric> metric;
        @Nullable
        private Boolean retryFailed;
        @Nullable
        private Time timeout;

        public Builder() {}

        private Builder(RerouteRequest o) {
            this.clusterManagerTimeout = o.clusterManagerTimeout;
            this.commands = _listCopy(o.commands);
            this.dryRun = o.dryRun;
            this.explain = o.explain;
            this.masterTimeout = o.masterTimeout;
            this.metric = _listCopy(o.metric);
            this.retryFailed = o.retryFailed;
            this.timeout = o.timeout;
        }

        private Builder(Builder o) {
            this.clusterManagerTimeout = o.clusterManagerTimeout;
            this.commands = _listCopy(o.commands);
            this.dryRun = o.dryRun;
            this.explain = o.explain;
            this.masterTimeout = o.masterTimeout;
            this.metric = _listCopy(o.metric);
            this.retryFailed = o.retryFailed;
            this.timeout = o.timeout;
        }

        @Override
        @Nonnull
        public Builder copy() {
            return new Builder(this);
        }

        /**
         * Operation timeout for connection to cluster-manager node.
         * <p>
         * API name: {@code cluster_manager_timeout}
         * </p>
         */
        @Nonnull
        public final Builder clusterManagerTimeout(@Nullable Time value) {
            this.clusterManagerTimeout = value;
            return this;
        }

        /**
         * Operation timeout for connection to cluster-manager node.
         * <p>
         * API name: {@code cluster_manager_timeout}
         * </p>
         */
        @Nonnull
        public final Builder clusterManagerTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
            return clusterManagerTimeout(fn.apply(new Time.Builder()).build());
        }

        /**
         * Defines the commands to perform.
         * <p>
         * API name: {@code commands}
         * </p>
         *
         * <p>
         * Adds all elements of <code>list</code> to <code>commands</code>.
         * </p>
         */
        @Nonnull
        public final Builder commands(List<Command> list) {
            this.commands = _listAddAll(this.commands, list);
            return this;
        }

        /**
         * Defines the commands to perform.
         * <p>
         * API name: {@code commands}
         * </p>
         *
         * <p>
         * Adds one or more values to <code>commands</code>.
         * </p>
         */
        @Nonnull
        public final Builder commands(Command value, Command... values) {
            this.commands = _listAdd(this.commands, value, values);
            return this;
        }

        /**
         * Defines the commands to perform.
         * <p>
         * API name: {@code commands}
         * </p>
         *
         * <p>
         * Adds a value to <code>commands</code> using a builder lambda.
         * </p>
         */
        @Nonnull
        public final Builder commands(Function<Command.Builder, ObjectBuilder<Command>> fn) {
            return commands(fn.apply(new Command.Builder()).build());
        }

        /**
         * If <code>true</code>, then the request simulates the operation only and returns the resulting state.
         * <p>
         * API name: {@code dry_run}
         * </p>
         */
        @Nonnull
        public final Builder dryRun(@Nullable Boolean value) {
            this.dryRun = value;
            return this;
        }

        /**
         * If <code>true</code>, then the response contains an explanation of why the commands can or cannot be executed.
         * <p>
         * API name: {@code explain}
         * </p>
         */
        @Nonnull
        public final Builder explain(@Nullable Boolean value) {
            this.explain = value;
            return this;
        }

        /**
         * Period to wait for a connection to the cluster-manager node. If no response is received before the timeout expires, the request
         * fails and returns an error.
         * <p>
         * API name: {@code master_timeout}
         * </p>
         */
        @Deprecated
        @Nonnull
        public final Builder masterTimeout(@Nullable Time value) {
            this.masterTimeout = value;
            return this;
        }

        /**
         * Period to wait for a connection to the cluster-manager node. If no response is received before the timeout expires, the request
         * fails and returns an error.
         * <p>
         * API name: {@code master_timeout}
         * </p>
         */
        @Deprecated
        @Nonnull
        public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
            return masterTimeout(fn.apply(new Time.Builder()).build());
        }

        /**
         * Limits the information returned to the specified metrics.
         * <p>
         * API name: {@code metric}
         * </p>
         *
         * <p>
         * Adds all elements of <code>list</code> to <code>metric</code>.
         * </p>
         */
        @Nonnull
        public final Builder metric(List<ClusterRerouteMetric> list) {
            this.metric = _listAddAll(this.metric, list);
            return this;
        }

        /**
         * Limits the information returned to the specified metrics.
         * <p>
         * API name: {@code metric}
         * </p>
         *
         * <p>
         * Adds one or more values to <code>metric</code>.
         * </p>
         */
        @Nonnull
        public final Builder metric(ClusterRerouteMetric value, ClusterRerouteMetric... values) {
            this.metric = _listAdd(this.metric, value, values);
            return this;
        }

        /**
         * If <code>true</code>, then retries allocation of shards that are blocked due to too many subsequent allocation failures.
         * <p>
         * API name: {@code retry_failed}
         * </p>
         */
        @Nonnull
        public final Builder retryFailed(@Nullable Boolean value) {
            this.retryFailed = value;
            return this;
        }

        /**
         * Period to wait for a response. If no response is received before the timeout expires, the request fails and returns an error.
         * <p>
         * API name: {@code timeout}
         * </p>
         */
        @Nonnull
        public final Builder timeout(@Nullable Time value) {
            this.timeout = value;
            return this;
        }

        /**
         * Period to wait for a response. If no response is received before the timeout expires, the request fails and returns an error.
         * <p>
         * API name: {@code timeout}
         * </p>
         */
        @Nonnull
        public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
            return timeout(fn.apply(new Time.Builder()).build());
        }

        /**
         * Builds a {@link RerouteRequest}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        @Override
        @Nonnull
        public RerouteRequest build() {
            _checkSingleUse();

            return new RerouteRequest(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link RerouteRequest}
     */
    public static final JsonpDeserializer<RerouteRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        RerouteRequest::setupRerouteRequestDeserializer
    );

    protected static void setupRerouteRequestDeserializer(ObjectDeserializer<RerouteRequest.Builder> op) {
        op.add(Builder::commands, JsonpDeserializer.arrayDeserializer(Command._DESERIALIZER), "commands");
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Endpoint "{@code cluster.reroute}".
     */
    public static final Endpoint<RerouteRequest, RerouteResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
        // Request method
        request -> "POST",
        // Request path
        request -> "/_cluster/reroute",
        // Request parameters
        request -> {
            Map<String, String> params = new HashMap<>();
            if (request.clusterManagerTimeout != null) {
                params.put("cluster_manager_timeout", request.clusterManagerTimeout._toJsonString());
            }
            if (request.dryRun != null) {
                params.put("dry_run", String.valueOf(request.dryRun));
            }
            if (request.explain != null) {
                params.put("explain", String.valueOf(request.explain));
            }
            if (request.masterTimeout != null) {
                params.put("master_timeout", request.masterTimeout._toJsonString());
            }
            if (ApiTypeHelper.isDefined(request.metric)) {
                params.put("metric", request.metric.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
            }
            if (request.retryFailed != null) {
                params.put("retry_failed", String.valueOf(request.retryFailed));
            }
            if (request.timeout != null) {
                params.put("timeout", request.timeout._toJsonString());
            }
            return params;
        },
        SimpleEndpoint.emptyMap(),
        true,
        RerouteResponse._DESERIALIZER
    );

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(this.clusterManagerTimeout);
        result = 31 * result + Objects.hashCode(this.commands);
        result = 31 * result + Objects.hashCode(this.dryRun);
        result = 31 * result + Objects.hashCode(this.explain);
        result = 31 * result + Objects.hashCode(this.masterTimeout);
        result = 31 * result + Objects.hashCode(this.metric);
        result = 31 * result + Objects.hashCode(this.retryFailed);
        result = 31 * result + Objects.hashCode(this.timeout);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        RerouteRequest other = (RerouteRequest) o;
        return Objects.equals(this.clusterManagerTimeout, other.clusterManagerTimeout)
            && Objects.equals(this.commands, other.commands)
            && Objects.equals(this.dryRun, other.dryRun)
            && Objects.equals(this.explain, other.explain)
            && Objects.equals(this.masterTimeout, other.masterTimeout)
            && Objects.equals(this.metric, other.metric)
            && Objects.equals(this.retryFailed, other.retryFailed)
            && Objects.equals(this.timeout, other.timeout);
    }
}