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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.get_settings.Response
public final class GetSettingsResponse implements ToJsonp {
	private final Map<String, JsonValue> persistent;

	private final Map<String, JsonValue> transient_;

	@Nullable
	private final Map<String, JsonValue> defaults;

	// ---------------------------------------------------------------------------------------------

	protected GetSettingsResponse(Builder builder) {

		this.persistent = Objects.requireNonNull(builder.persistent, "persistent");
		this.transient_ = Objects.requireNonNull(builder.transient_, "transient");
		this.defaults = builder.defaults;

	}

	/**
	 * API name: {@code persistent}
	 */
	public Map<String, JsonValue> persistent() {
		return this.persistent;
	}

	/**
	 * API name: {@code transient}
	 */
	public Map<String, JsonValue> transient_() {
		return this.transient_;
	}

	/**
	 * API name: {@code defaults}
	 */
	@Nullable
	public Map<String, JsonValue> defaults() {
		return this.defaults;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("persistent");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this.persistent.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("transient");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this.transient_.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		if (this.defaults != null) {

			generator.writeKey("defaults");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.defaults.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSettingsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetSettingsResponse> {
		private Map<String, JsonValue> persistent;

		private Map<String, JsonValue> transient_;

		@Nullable
		private Map<String, JsonValue> defaults;

		/**
		 * API name: {@code persistent}
		 */
		public Builder persistent(Map<String, JsonValue> value) {
			this.persistent = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #persistent(Map)}, creating the map if needed.
		 */
		public Builder putPersistent(String key, JsonValue value) {
			if (this.persistent == null) {
				this.persistent = new HashMap<>();
			}
			this.persistent.put(key, value);
			return this;
		}

		/**
		 * API name: {@code transient}
		 */
		public Builder transient_(Map<String, JsonValue> value) {
			this.transient_ = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #transient_(Map)}, creating the map if needed.
		 */
		public Builder putTransient_(String key, JsonValue value) {
			if (this.transient_ == null) {
				this.transient_ = new HashMap<>();
			}
			this.transient_.put(key, value);
			return this;
		}

		/**
		 * API name: {@code defaults}
		 */
		public Builder defaults(@Nullable Map<String, JsonValue> value) {
			this.defaults = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #defaults(Map)}, creating the map if needed.
		 */
		public Builder putDefaults(String key, JsonValue value) {
			if (this.defaults == null) {
				this.defaults = new HashMap<>();
			}
			this.defaults.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link GetSettingsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSettingsResponse build() {

			return new GetSettingsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for GetSettingsResponse
	 */
	public static final JsonpValueParser<GetSettingsResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, GetSettingsResponse::setupGetSettingsResponseParser);

	protected static void setupGetSettingsResponseParser(DelegatingJsonpValueParser<GetSettingsResponse.Builder> op) {

		op.add(Builder::persistent, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "persistent");
		op.add(Builder::transient_, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "transient");
		op.add(Builder::defaults, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "defaults");

	}

}
