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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.IndicesResponseBase
public abstract class IndicesResponseBase extends AcknowledgedResponseBase {
	@Nullable
	private final ShardStatistics _shards;

	// ---------------------------------------------------------------------------------------------

	protected IndicesResponseBase(AbstractBuilder<?> builder) {
		super(builder);
		this._shards = builder._shards;

	}

	/**
	 * API name: {@code _shards}
	 */
	@Nullable
	public ShardStatistics _shards() {
		return this._shards;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this._shards != null) {

			generator.writeKey("_shards");
			this._shards.toJsonp(generator, mapper);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AcknowledgedResponseBase.AbstractBuilder<BuilderT> {
		@Nullable
		private ShardStatistics _shards;

		/**
		 * API name: {@code _shards}
		 */
		public BuilderT _shards(@Nullable ShardStatistics value) {
			this._shards = value;
			return self();
		}

		/**
		 * API name: {@code _shards}
		 */
		public BuilderT _shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this._shards(fn.apply(new ShardStatistics.Builder()).build());
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupIndicesResponseBaseParser(
			DelegatingJsonpValueParser<BuilderT> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseParser(op);
		op.add(AbstractBuilder::_shards, ShardStatistics.JSONP_PARSER, "_shards");

	}

}
