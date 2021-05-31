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

// typedef: nodes.info.NodeInfoXpackSecurityAuthcToken
public final class NodeInfoXpackSecurityAuthcToken implements ToJsonp {
	private final String enabled;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoXpackSecurityAuthcToken(Builder builder) {

		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");

	}

	/**
	 * API name: {@code enabled}
	 */
	public String enabled() {
		return this.enabled;
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

		generator.writeKey("enabled");
		generator.write(this.enabled);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackSecurityAuthcToken}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoXpackSecurityAuthcToken> {
		private String enabled;

		/**
		 * API name: {@code enabled}
		 */
		public Builder enabled(String value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoXpackSecurityAuthcToken}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackSecurityAuthcToken build() {

			return new NodeInfoXpackSecurityAuthcToken(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for NodeInfoXpackSecurityAuthcToken
	 */
	public static final JsonpValueParser<NodeInfoXpackSecurityAuthcToken> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, NodeInfoXpackSecurityAuthcToken::setupNodeInfoXpackSecurityAuthcTokenParser);

	protected static void setupNodeInfoXpackSecurityAuthcTokenParser(
			DelegatingJsonpValueParser<NodeInfoXpackSecurityAuthcToken.Builder> op) {

		op.add(Builder::enabled, JsonpValueParser.stringParser(), "enabled");

	}

}
