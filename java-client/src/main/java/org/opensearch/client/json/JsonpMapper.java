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

package org.opensearch.client.json;

import jakarta.json.spi.JsonProvider;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;

/**
 * A {@code JsonpMapper} combines a JSON-P provider and object serialization/deserialization based on JSON-P events.
 */

// Note: we could have used JSON-B for object mapping, but this API lacks an important feature: it only works with
// bytes and character streams, and not JSON-P events. Since we process request and response as JSON-P streams, using
// JSON-B would require to serialize the incoming JSON events and pass them to JSON-B that would parse them again.
// Since this is very inefficient, this API allows for faster implementations that bypass this serialization/reparsing
// phase (e.g. JacksonJsonpMapper)

public interface JsonpMapper {
    /**
     * Return the JSON-P provider, to create JSON parsers and generators.
     */
    JsonProvider jsonProvider();

    /**
     * Deserialize an object, given its class.
     */
    <T> T deserialize(JsonParser parser, Class<T> clazz);

    /**
     * Serialize an object.
     */
    <T> void serialize(T value, JsonGenerator generator);

    /**
     * Should object parsers in the API client be lenient and silently ignore unknown fields?
     *
     * @return {@code true} by default.
     */
    default boolean ignoreUnknownFields() {
        return true;
    }

    /**
     * Get a named attribute associated to this mapper.
     */
    default <T> T attribute(String name) {
        return null;
    }

    /**
     * Get a named attribute associated to this mapper, with a default value.
     */
    default <T> T attribute(String name, T defaultValue) {
        T v = attribute(name);
        return v != null ? v : defaultValue;
    }

    /**
     * Create a new mapper with a named attribute that delegates to this one.
     *
     * @implNote The default implementation will be removed in a future release, and inheritors will be required to implement it themselves.
     *           See {@link org.opensearch.client.json.jsonb.JsonbJsonpMapper#withAttribute(String, Object)} and {@link org.opensearch.client.json.jackson.JacksonJsonpMapper#withAttribute(String, Object)} for examples.
     */
    default <T> JsonpMapper withAttribute(String name, T value) {
        // noinspection deprecation
        return new AttributedJsonpMapper(this, name, value);
    }
}
