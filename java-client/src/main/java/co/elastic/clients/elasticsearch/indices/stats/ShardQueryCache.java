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

package co.elastic.clients.elasticsearch.indices.stats;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.stats.ShardQueryCache
public final class ShardQueryCache implements ToJsonp {
	private final Number cacheCount;

	private final Number cacheSize;

	private final Number evictions;

	private final Number hitCount;

	private final Number memorySizeInBytes;

	private final Number missCount;

	private final Number totalCount;

	// ---------------------------------------------------------------------------------------------

	protected ShardQueryCache(Builder builder) {

		this.cacheCount = Objects.requireNonNull(builder.cacheCount, "cache_count");
		this.cacheSize = Objects.requireNonNull(builder.cacheSize, "cache_size");
		this.evictions = Objects.requireNonNull(builder.evictions, "evictions");
		this.hitCount = Objects.requireNonNull(builder.hitCount, "hit_count");
		this.memorySizeInBytes = Objects.requireNonNull(builder.memorySizeInBytes, "memory_size_in_bytes");
		this.missCount = Objects.requireNonNull(builder.missCount, "miss_count");
		this.totalCount = Objects.requireNonNull(builder.totalCount, "total_count");

	}

	/**
	 * API name: {@code cache_count}
	 */
	public Number cacheCount() {
		return this.cacheCount;
	}

	/**
	 * API name: {@code cache_size}
	 */
	public Number cacheSize() {
		return this.cacheSize;
	}

	/**
	 * API name: {@code evictions}
	 */
	public Number evictions() {
		return this.evictions;
	}

	/**
	 * API name: {@code hit_count}
	 */
	public Number hitCount() {
		return this.hitCount;
	}

	/**
	 * API name: {@code memory_size_in_bytes}
	 */
	public Number memorySizeInBytes() {
		return this.memorySizeInBytes;
	}

	/**
	 * API name: {@code miss_count}
	 */
	public Number missCount() {
		return this.missCount;
	}

	/**
	 * API name: {@code total_count}
	 */
	public Number totalCount() {
		return this.totalCount;
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

		generator.writeKey("cache_count");
		generator.write(this.cacheCount.doubleValue());

		generator.writeKey("cache_size");
		generator.write(this.cacheSize.doubleValue());

		generator.writeKey("evictions");
		generator.write(this.evictions.doubleValue());

		generator.writeKey("hit_count");
		generator.write(this.hitCount.doubleValue());

		generator.writeKey("memory_size_in_bytes");
		generator.write(this.memorySizeInBytes.doubleValue());

		generator.writeKey("miss_count");
		generator.write(this.missCount.doubleValue());

		generator.writeKey("total_count");
		generator.write(this.totalCount.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardQueryCache}.
	 */
	public static class Builder implements ObjectBuilder<ShardQueryCache> {
		private Number cacheCount;

		private Number cacheSize;

		private Number evictions;

		private Number hitCount;

		private Number memorySizeInBytes;

		private Number missCount;

		private Number totalCount;

		/**
		 * API name: {@code cache_count}
		 */
		public Builder cacheCount(Number value) {
			this.cacheCount = value;
			return this;
		}

		/**
		 * API name: {@code cache_size}
		 */
		public Builder cacheSize(Number value) {
			this.cacheSize = value;
			return this;
		}

		/**
		 * API name: {@code evictions}
		 */
		public Builder evictions(Number value) {
			this.evictions = value;
			return this;
		}

		/**
		 * API name: {@code hit_count}
		 */
		public Builder hitCount(Number value) {
			this.hitCount = value;
			return this;
		}

		/**
		 * API name: {@code memory_size_in_bytes}
		 */
		public Builder memorySizeInBytes(Number value) {
			this.memorySizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code miss_count}
		 */
		public Builder missCount(Number value) {
			this.missCount = value;
			return this;
		}

		/**
		 * API name: {@code total_count}
		 */
		public Builder totalCount(Number value) {
			this.totalCount = value;
			return this;
		}

		/**
		 * Builds a {@link ShardQueryCache}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardQueryCache build() {

			return new ShardQueryCache(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ShardQueryCache
	 */
	public static final JsonpValueParser<ShardQueryCache> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ShardQueryCache::setupShardQueryCacheParser);

	protected static void setupShardQueryCacheParser(DelegatingJsonpValueParser<ShardQueryCache.Builder> op) {

		op.add(Builder::cacheCount, JsonpValueParser.numberParser(), "cache_count");
		op.add(Builder::cacheSize, JsonpValueParser.numberParser(), "cache_size");
		op.add(Builder::evictions, JsonpValueParser.numberParser(), "evictions");
		op.add(Builder::hitCount, JsonpValueParser.numberParser(), "hit_count");
		op.add(Builder::memorySizeInBytes, JsonpValueParser.numberParser(), "memory_size_in_bytes");
		op.add(Builder::missCount, JsonpValueParser.numberParser(), "miss_count");
		op.add(Builder::totalCount, JsonpValueParser.numberParser(), "total_count");

	}

}
