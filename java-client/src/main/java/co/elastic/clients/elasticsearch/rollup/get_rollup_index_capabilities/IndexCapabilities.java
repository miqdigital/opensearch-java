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

package co.elastic.clients.elasticsearch.rollup.get_rollup_index_capabilities;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.get_rollup_index_capabilities.IndexCapabilities
public final class IndexCapabilities implements ToJsonp {
	private final List<RollupJobSummary> rollupJobs;

	// ---------------------------------------------------------------------------------------------

	protected IndexCapabilities(Builder builder) {

		this.rollupJobs = Objects.requireNonNull(builder.rollupJobs, "rollup_jobs");

	}

	/**
	 * API name: {@code rollup_jobs}
	 */
	public List<RollupJobSummary> rollupJobs() {
		return this.rollupJobs;
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

		generator.writeKey("rollup_jobs");
		generator.writeStartArray();
		for (RollupJobSummary item0 : this.rollupJobs) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexCapabilities}.
	 */
	public static class Builder implements ObjectBuilder<IndexCapabilities> {
		private List<RollupJobSummary> rollupJobs;

		/**
		 * API name: {@code rollup_jobs}
		 */
		public Builder rollupJobs(List<RollupJobSummary> value) {
			this.rollupJobs = value;
			return this;
		}

		/**
		 * API name: {@code rollup_jobs}
		 */
		public Builder rollupJobs(RollupJobSummary... value) {
			this.rollupJobs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #rollupJobs(List)}, creating the list if needed.
		 */
		public Builder addRollupJobs(RollupJobSummary value) {
			if (this.rollupJobs == null) {
				this.rollupJobs = new ArrayList<>();
			}
			this.rollupJobs.add(value);
			return this;
		}

		/**
		 * Set {@link #rollupJobs(List)} to a singleton list.
		 */
		public Builder rollupJobs(Function<RollupJobSummary.Builder, ObjectBuilder<RollupJobSummary>> fn) {
			return this.rollupJobs(fn.apply(new RollupJobSummary.Builder()).build());
		}

		/**
		 * Add a value to {@link #rollupJobs(List)}, creating the list if needed.
		 */
		public Builder addRollupJobs(Function<RollupJobSummary.Builder, ObjectBuilder<RollupJobSummary>> fn) {
			return this.addRollupJobs(fn.apply(new RollupJobSummary.Builder()).build());
		}

		/**
		 * Builds a {@link IndexCapabilities}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexCapabilities build() {

			return new IndexCapabilities(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for IndexCapabilities
	 */
	public static final JsonpValueParser<IndexCapabilities> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, IndexCapabilities::setupIndexCapabilitiesParser);

	protected static void setupIndexCapabilitiesParser(DelegatingJsonpValueParser<IndexCapabilities.Builder> op) {

		op.add(Builder::rollupJobs, JsonpValueParser.arrayParser(RollupJobSummary.JSONP_PARSER), "rollup_jobs");

	}

}
