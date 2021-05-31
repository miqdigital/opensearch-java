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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoXpackLicenseType
public final class NodeInfoXpackLicenseType implements ToJsonp {
	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoXpackLicenseType(Builder builder) {

		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackLicenseType}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoXpackLicenseType> {
		private String type;

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoXpackLicenseType}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackLicenseType build() {

			return new NodeInfoXpackLicenseType(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for NodeInfoXpackLicenseType
	 */
	public static final JsonpValueParser<NodeInfoXpackLicenseType> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, NodeInfoXpackLicenseType::setupNodeInfoXpackLicenseTypeParser);

	protected static void setupNodeInfoXpackLicenseTypeParser(
			DelegatingJsonpValueParser<NodeInfoXpackLicenseType.Builder> op) {

		op.add(Builder::type, JsonpValueParser.stringParser(), "type");

	}

}
