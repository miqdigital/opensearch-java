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

package co.elastic.clients.elasticsearch.transform.get_transform_stats;

import co.elastic.clients.elasticsearch._types.NodeAttributes;
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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.TransformStats
public final class TransformStats implements ToJsonp {
	private final Checkpointing checkpointing;

	private final String id;

	@Nullable
	private final NodeAttributes node;

	@Nullable
	private final String reason;

	private final String state;

	private final TransformIndexerStats stats;

	// ---------------------------------------------------------------------------------------------

	protected TransformStats(Builder builder) {

		this.checkpointing = Objects.requireNonNull(builder.checkpointing, "checkpointing");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.node = builder.node;
		this.reason = builder.reason;
		this.state = Objects.requireNonNull(builder.state, "state");
		this.stats = Objects.requireNonNull(builder.stats, "stats");

	}

	/**
	 * API name: {@code checkpointing}
	 */
	public Checkpointing checkpointing() {
		return this.checkpointing;
	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code node}
	 */
	@Nullable
	public NodeAttributes node() {
		return this.node;
	}

	/**
	 * API name: {@code reason}
	 */
	@Nullable
	public String reason() {
		return this.reason;
	}

	/**
	 * API name: {@code state}
	 */
	public String state() {
		return this.state;
	}

	/**
	 * API name: {@code stats}
	 */
	public TransformIndexerStats stats() {
		return this.stats;
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

		generator.writeKey("checkpointing");
		this.checkpointing.toJsonp(generator, mapper);

		generator.writeKey("id");
		generator.write(this.id);

		if (this.node != null) {

			generator.writeKey("node");
			this.node.toJsonp(generator, mapper);

		}
		if (this.reason != null) {

			generator.writeKey("reason");
			generator.write(this.reason);

		}

		generator.writeKey("state");
		generator.write(this.state);

		generator.writeKey("stats");
		this.stats.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformStats}.
	 */
	public static class Builder implements ObjectBuilder<TransformStats> {
		private Checkpointing checkpointing;

		private String id;

		@Nullable
		private NodeAttributes node;

		@Nullable
		private String reason;

		private String state;

		private TransformIndexerStats stats;

		/**
		 * API name: {@code checkpointing}
		 */
		public Builder checkpointing(Checkpointing value) {
			this.checkpointing = value;
			return this;
		}

		/**
		 * API name: {@code checkpointing}
		 */
		public Builder checkpointing(Function<Checkpointing.Builder, ObjectBuilder<Checkpointing>> fn) {
			return this.checkpointing(fn.apply(new Checkpointing.Builder()).build());
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(@Nullable NodeAttributes value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(Function<NodeAttributes.Builder, ObjectBuilder<NodeAttributes>> fn) {
			return this.node(fn.apply(new NodeAttributes.Builder()).build());
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(String value) {
			this.state = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(TransformIndexerStats value) {
			this.stats = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(Function<TransformIndexerStats.Builder, ObjectBuilder<TransformIndexerStats>> fn) {
			return this.stats(fn.apply(new TransformIndexerStats.Builder()).build());
		}

		/**
		 * Builds a {@link TransformStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformStats build() {

			return new TransformStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for TransformStats
	 */
	public static final JsonpValueParser<TransformStats> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, TransformStats::setupTransformStatsParser);

	protected static void setupTransformStatsParser(DelegatingJsonpValueParser<TransformStats.Builder> op) {

		op.add(Builder::checkpointing, Checkpointing.JSONP_PARSER, "checkpointing");
		op.add(Builder::id, JsonpValueParser.stringParser(), "id");
		op.add(Builder::node, NodeAttributes.JSONP_PARSER, "node");
		op.add(Builder::reason, JsonpValueParser.stringParser(), "reason");
		op.add(Builder::state, JsonpValueParser.stringParser(), "state");
		op.add(Builder::stats, TransformIndexerStats.JSONP_PARSER, "stats");

	}

}
