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

package org.opensearch.client.opensearch._types.aggregations;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.CopyableBuilder;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ToCopyableBuilder;

// typedef: _types.aggregations.CompositeHistogramAggregationSource

@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class CompositeHistogramAggregationSource extends CompositeValuesSource
    implements
        ToCopyableBuilder<CompositeHistogramAggregationSource.Builder, CompositeHistogramAggregationSource> {

    private final double interval;

    // ---------------------------------------------------------------------------------------------

    private CompositeHistogramAggregationSource(Builder builder) {
        super(builder);
        this.interval = ApiTypeHelper.requireNonNull(builder.interval, this, "interval");
    }

    public static CompositeHistogramAggregationSource of(
        Function<CompositeHistogramAggregationSource.Builder, ObjectBuilder<CompositeHistogramAggregationSource>> fn
    ) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code interval}
     */
    public final double interval() {
        return this.interval;
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
        super.serializeInternal(generator, mapper);
        generator.writeKey("interval");
        generator.write(this.interval);
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
     * Builder for {@link CompositeHistogramAggregationSource}.
     */
    public static class Builder extends CompositeValuesSource.AbstractBuilder<Builder>
        implements
            CopyableBuilder<Builder, CompositeHistogramAggregationSource> {
        private Double interval;

        public Builder() {}

        private Builder(CompositeHistogramAggregationSource o) {
            super(o);
            this.interval = o.interval;
        }

        private Builder(Builder o) {
            super(o);
            this.interval = o.interval;
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
         * Required - API name: {@code interval}
         */
        @Nonnull
        public final Builder interval(double value) {
            this.interval = value;
            return this;
        }

        /**
         * Builds a {@link CompositeHistogramAggregationSource}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        @Override
        @Nonnull
        public CompositeHistogramAggregationSource build() {
            _checkSingleUse();

            return new CompositeHistogramAggregationSource(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link CompositeHistogramAggregationSource}
     */
    public static final JsonpDeserializer<CompositeHistogramAggregationSource> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        CompositeHistogramAggregationSource::setupCompositeHistogramAggregationSourceDeserializer
    );

    protected static void setupCompositeHistogramAggregationSourceDeserializer(
        ObjectDeserializer<CompositeHistogramAggregationSource.Builder> op
    ) {
        setupCompositeValuesSourceDeserializer(op);
        op.add(Builder::interval, JsonpDeserializer.doubleDeserializer(), "interval");
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(this.interval);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        CompositeHistogramAggregationSource other = (CompositeHistogramAggregationSource) o;
        return this.interval == other.interval;
    }
}
