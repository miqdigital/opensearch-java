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

package org.opensearch.client.opensearch._types.analysis;

import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: _types.analysis.PhoneAnalyzerBase

@Generated("org.opensearch.client.codegen.CodeGenerator")
public abstract class PhoneAnalyzerBase implements PlainJsonSerializable {

    @Nullable
    private final String phoneRegion;

    // ---------------------------------------------------------------------------------------------

    protected PhoneAnalyzerBase(AbstractBuilder<?> builder) {
        this.phoneRegion = builder.phoneRegion;
    }

    /**
     * Optional ISO 3166 country code, defaults to &quot;ZZ&quot; (unknown region).
     * <p>
     * API name: {@code phone-region}
     * </p>
     */
    @Nullable
    public final String phoneRegion() {
        return this.phoneRegion;
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
        if (this.phoneRegion != null) {
            generator.writeKey("phone-region");
            generator.write(this.phoneRegion);
        }
    }

    // ---------------------------------------------------------------------------------------------

    public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> extends ObjectBuilderBase {
        @Nullable
        private String phoneRegion;

        protected AbstractBuilder() {}

        protected AbstractBuilder(PhoneAnalyzerBase o) {
            this.phoneRegion = o.phoneRegion;
        }

        protected AbstractBuilder(AbstractBuilder<BuilderT> o) {
            this.phoneRegion = o.phoneRegion;
        }

        @Nonnull
        protected abstract BuilderT self();

        /**
         * Optional ISO 3166 country code, defaults to &quot;ZZ&quot; (unknown region).
         * <p>
         * API name: {@code phone-region}
         * </p>
         */
        @Nonnull
        public final BuilderT phoneRegion(@Nullable String value) {
            this.phoneRegion = value;
            return self();
        }
    }

    // ---------------------------------------------------------------------------------------------

    protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupPhoneAnalyzerBaseDeserializer(ObjectDeserializer<BuilderT> op) {
        op.add(AbstractBuilder::phoneRegion, JsonpDeserializer.stringDeserializer(), "phone-region");
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(this.phoneRegion);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        PhoneAnalyzerBase other = (PhoneAnalyzerBase) o;
        return Objects.equals(this.phoneRegion, other.phoneRegion);
    }
}
