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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoSettingsTransport
public final class NodeInfoSettingsTransport implements ToJsonp {
	private final JsonValue type;

	@Nullable
	private final String type_default;

	@Nullable
	private final NodeInfoSettingsTransportFeatures features;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoSettingsTransport(Builder builder) {

		this.type = Objects.requireNonNull(builder.type, "type");
		this.type_default = builder.type_default;
		this.features = builder.features;

	}

	/**
	 * API name: {@code type}
	 */
	public JsonValue type() {
		return this.type;
	}

	/**
	 * API name: {@code type.default}
	 */
	@Nullable
	public String type_default() {
		return this.type_default;
	}

	/**
	 * API name: {@code features}
	 */
	@Nullable
	public NodeInfoSettingsTransportFeatures features() {
		return this.features;
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

		generator.writeKey("type");
		generator.write(this.type);

		if (this.type_default != null) {

			generator.writeKey("type.default");
			generator.write(this.type_default);

		}
		if (this.features != null) {

			generator.writeKey("features");
			this.features.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsTransport}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoSettingsTransport> {
		private JsonValue type;

		@Nullable
		private String type_default;

		@Nullable
		private NodeInfoSettingsTransportFeatures features;

		/**
		 * API name: {@code type}
		 */
		public Builder type(JsonValue value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code type.default}
		 */
		public Builder type_default(@Nullable String value) {
			this.type_default = value;
			return this;
		}

		/**
		 * API name: {@code features}
		 */
		public Builder features(@Nullable NodeInfoSettingsTransportFeatures value) {
			this.features = value;
			return this;
		}

		/**
		 * API name: {@code features}
		 */
		public Builder features(
				Function<NodeInfoSettingsTransportFeatures.Builder, ObjectBuilder<NodeInfoSettingsTransportFeatures>> fn) {
			return this.features(fn.apply(new NodeInfoSettingsTransportFeatures.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoSettingsTransport}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsTransport build() {

			return new NodeInfoSettingsTransport(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for NodeInfoSettingsTransport
	 */
	public static final JsonpValueParser<NodeInfoSettingsTransport> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, NodeInfoSettingsTransport::setupNodeInfoSettingsTransportParser);

	protected static void setupNodeInfoSettingsTransportParser(
			DelegatingJsonpValueParser<NodeInfoSettingsTransport.Builder> op) {

		op.add(Builder::type, JsonpValueParser.jsonValueParser(), "type");
		op.add(Builder::type_default, JsonpValueParser.stringParser(), "type.default");
		op.add(Builder::features, NodeInfoSettingsTransportFeatures.JSONP_PARSER, "features");

	}

}
