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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.SecurityRolesFile
public final class SecurityRolesFile implements ToJsonp {
	private final Boolean dls;

	private final Boolean fls;

	private final Number size;

	// ---------------------------------------------------------------------------------------------

	protected SecurityRolesFile(Builder builder) {

		this.dls = Objects.requireNonNull(builder.dls, "dls");
		this.fls = Objects.requireNonNull(builder.fls, "fls");
		this.size = Objects.requireNonNull(builder.size, "size");

	}

	/**
	 * API name: {@code dls}
	 */
	public Boolean dls() {
		return this.dls;
	}

	/**
	 * API name: {@code fls}
	 */
	public Boolean fls() {
		return this.fls;
	}

	/**
	 * API name: {@code size}
	 */
	public Number size() {
		return this.size;
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

		generator.writeKey("dls");
		generator.write(this.dls);

		generator.writeKey("fls");
		generator.write(this.fls);

		generator.writeKey("size");
		generator.write(this.size.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SecurityRolesFile}.
	 */
	public static class Builder implements ObjectBuilder<SecurityRolesFile> {
		private Boolean dls;

		private Boolean fls;

		private Number size;

		/**
		 * API name: {@code dls}
		 */
		public Builder dls(Boolean value) {
			this.dls = value;
			return this;
		}

		/**
		 * API name: {@code fls}
		 */
		public Builder fls(Boolean value) {
			this.fls = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link SecurityRolesFile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SecurityRolesFile build() {

			return new SecurityRolesFile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for SecurityRolesFile
	 */
	public static final JsonpValueParser<SecurityRolesFile> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, SecurityRolesFile::setupSecurityRolesFileParser);

	protected static void setupSecurityRolesFileParser(DelegatingJsonpValueParser<SecurityRolesFile.Builder> op) {

		op.add(Builder::dls, JsonpValueParser.booleanParser(), "dls");
		op.add(Builder::fls, JsonpValueParser.booleanParser(), "fls");
		op.add(Builder::size, JsonpValueParser.numberParser(), "size");

	}

}
