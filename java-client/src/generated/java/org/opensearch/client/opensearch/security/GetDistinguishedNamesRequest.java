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

package org.opensearch.client.opensearch.security;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.opensearch._types.RequestBase;
import org.opensearch.client.transport.Endpoint;
import org.opensearch.client.transport.endpoints.SimpleEndpoint;
import org.opensearch.client.util.CopyableBuilder;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ToCopyableBuilder;

// typedef: security.get_distinguished_names.Request

/**
 * Retrieves all node distinguished names. Requires super admin or REST API permissions.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public final class GetDistinguishedNamesRequest extends RequestBase
    implements
        ToCopyableBuilder<GetDistinguishedNamesRequest.Builder, GetDistinguishedNamesRequest> {

    @Nullable
    private final Boolean showAll;

    // ---------------------------------------------------------------------------------------------

    private GetDistinguishedNamesRequest(Builder builder) {
        super(builder);
        this.showAll = builder.showAll;
    }

    public static GetDistinguishedNamesRequest of(
        Function<GetDistinguishedNamesRequest.Builder, ObjectBuilder<GetDistinguishedNamesRequest>> fn
    ) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Whether to include or exclude any static node's DN settings from the final result.
     * <p>
     * API name: {@code show_all}
     * </p>
     */
    @Nullable
    public final Boolean showAll() {
        return this.showAll;
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
     * Builder for {@link GetDistinguishedNamesRequest}.
     */
    public static class Builder extends RequestBase.AbstractBuilder<Builder>
        implements
            CopyableBuilder<Builder, GetDistinguishedNamesRequest> {
        @Nullable
        private Boolean showAll;

        public Builder() {}

        private Builder(GetDistinguishedNamesRequest o) {
            super(o);
            this.showAll = o.showAll;
        }

        private Builder(Builder o) {
            super(o);
            this.showAll = o.showAll;
        }

        @Override
        @Nonnull
        public Builder copy() {
            return new Builder(this);
        }

        @Override
        @Nonnull
        protected Builder self() {
            return this;
        }

        /**
         * Whether to include or exclude any static node's DN settings from the final result.
         * <p>
         * API name: {@code show_all}
         * </p>
         */
        @Nonnull
        public final Builder showAll(@Nullable Boolean value) {
            this.showAll = value;
            return this;
        }

        /**
         * Builds a {@link GetDistinguishedNamesRequest}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        @Override
        @Nonnull
        public GetDistinguishedNamesRequest build() {
            _checkSingleUse();

            return new GetDistinguishedNamesRequest(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    @Override
    protected void applyQueryParameters(@Nonnull Map<String, String> params) {
        super.applyQueryParameters(params);
        if (this.showAll != null) {
            params.put("show_all", String.valueOf(this.showAll));
        }
    }

    /**
     * Endpoint "{@code security.get_distinguished_names}".
     */
    public static final Endpoint<GetDistinguishedNamesRequest, GetDistinguishedNamesResponse, ErrorResponse> _ENDPOINT =
        new SimpleEndpoint<>(
            // Request method
            request -> "GET",
            // Request path
            request -> "/_plugins/_security/api/nodesdn",
            // Request parameters
            request -> {
                Map<String, String> params = new HashMap<>();
                request.applyQueryParameters(params);
                return params;
            },
            SimpleEndpoint.emptyMap(),
            false,
            GetDistinguishedNamesResponse._DESERIALIZER
        );

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(this.showAll);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        GetDistinguishedNamesRequest other = (GetDistinguishedNamesRequest) o;
        return Objects.equals(this.showAll, other.showAll);
    }
}
