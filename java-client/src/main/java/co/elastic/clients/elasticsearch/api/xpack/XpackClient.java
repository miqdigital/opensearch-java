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

package co.elastic.clients.elasticsearch.api.xpack;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.xpack.InfoRequest;
import co.elastic.clients.elasticsearch.xpack.InfoResponse;
import co.elastic.clients.elasticsearch.xpack.UsageRequest;
import co.elastic.clients.elasticsearch.xpack.UsageResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the xpack namespace.
 */
public class XpackClient extends ApiClient<XpackClient> {

	public XpackClient(Transport transport) {
		super(transport, null);
	}

	public XpackClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: xpack.info

	/**
	 * Retrieves information about the installed X-Pack features.
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/info-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public InfoResponse info(InfoRequest request) throws IOException {
		return this.transport.performRequest(request, InfoRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves information about the installed X-Pack features.
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/info-api.html">Documentation
	 *      on elastic.co</a>
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final InfoResponse info(Function<InfoRequest.Builder, ObjectBuilder<InfoRequest>> fn) throws IOException {
		return info(fn.apply(new InfoRequest.Builder()).build());
	}

	// ----- Endpoint: xpack.usage

	/**
	 * Retrieves usage information about the installed X-Pack features.
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/usage-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UsageResponse usage(UsageRequest request) throws IOException {
		return this.transport.performRequest(request, UsageRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves usage information about the installed X-Pack features.
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/usage-api.html">Documentation
	 *      on elastic.co</a>
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final UsageResponse usage(Function<UsageRequest.Builder, ObjectBuilder<UsageRequest>> fn)
			throws IOException {
		return usage(fn.apply(new UsageRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #XpackClient} with specific request options.
	 */
	@Override
	public XpackClient withRequestOptions(@Nullable RequestOptions options) {
		return new XpackClient(transport, options);
	}

	/**
	 * Creates a new {@link #XpackClient} with specific request options, inheriting
	 * existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public XpackClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
