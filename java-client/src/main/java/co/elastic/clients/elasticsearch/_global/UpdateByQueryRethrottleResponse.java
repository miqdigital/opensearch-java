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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.elasticsearch._global.update_by_query_rethrottle.UpdateByQueryRethrottleNode;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.update_by_query_rethrottle.Response
public final class UpdateByQueryRethrottleResponse implements ToJsonp {
	private final Map<String, UpdateByQueryRethrottleNode> nodes;

	// ---------------------------------------------------------------------------------------------

	protected UpdateByQueryRethrottleResponse(Builder builder) {

		this.nodes = Objects.requireNonNull(builder.nodes, "nodes");

	}

	/**
	 * API name: {@code nodes}
	 */
	public Map<String, UpdateByQueryRethrottleNode> nodes() {
		return this.nodes;
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

		generator.writeKey("nodes");
		generator.writeStartObject();
		for (Map.Entry<String, UpdateByQueryRethrottleNode> item0 : this.nodes.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateByQueryRethrottleResponse}.
	 */
	public static class Builder implements ObjectBuilder<UpdateByQueryRethrottleResponse> {
		private Map<String, UpdateByQueryRethrottleNode> nodes;

		/**
		 * API name: {@code nodes}
		 */
		public Builder nodes(Map<String, UpdateByQueryRethrottleNode> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, UpdateByQueryRethrottleNode value) {
			if (this.nodes == null) {
				this.nodes = new HashMap<>();
			}
			this.nodes.put(key, value);
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key,
				Function<UpdateByQueryRethrottleNode.Builder, ObjectBuilder<UpdateByQueryRethrottleNode>> fn) {
			return this
					.nodes(Collections.singletonMap(key, fn.apply(new UpdateByQueryRethrottleNode.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key,
				Function<UpdateByQueryRethrottleNode.Builder, ObjectBuilder<UpdateByQueryRethrottleNode>> fn) {
			return this.putNodes(key, fn.apply(new UpdateByQueryRethrottleNode.Builder()).build());
		}

		/**
		 * Builds a {@link UpdateByQueryRethrottleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateByQueryRethrottleResponse build() {

			return new UpdateByQueryRethrottleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for UpdateByQueryRethrottleResponse
	 */
	public static final JsonpValueParser<UpdateByQueryRethrottleResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, UpdateByQueryRethrottleResponse::setupUpdateByQueryRethrottleResponseParser);

	protected static void setupUpdateByQueryRethrottleResponseParser(
			DelegatingJsonpValueParser<UpdateByQueryRethrottleResponse.Builder> op) {

		op.add(Builder::nodes, JsonpValueParser.stringMapParser(UpdateByQueryRethrottleNode.JSONP_PARSER), "nodes");

	}

}
