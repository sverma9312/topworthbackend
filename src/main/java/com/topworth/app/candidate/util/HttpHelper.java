//package com.topworth.app.candidate.util;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.client.reactive.ReactorClientHttpConnector;
//import org.springframework.web.reactive.function.client.ClientResponse;
//import org.springframework.web.reactive.function.client.WebClient;
//import org.springframework.web.reactive.function.client.WebClient.Builder;
//import org.springframework.web.reactive.function.client.WebClient.RequestBodySpec;
//import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;
//
//public class HttpHelper {
//	
//	public <T> ClientResponse httpRequestWithAuth(final HttpMethod method, final String url, final T body) {
//		boolean authRetryDone = false;
//		while (true) {
//			System.out.println("http request initiated: " +method+" "+url);
//
//			final WebClient webClient = createWebClient();
//			RequestHeadersSpec<?> requestSpec = webClient.method(method).uri(url);
//
//			if (body != null) {
//				requestSpec = ((RequestBodySpec) requestSpec).bodyValue(body);
//			}
//
//			final ClientResponse clientResponse = requestSpec.exchange().block();
//			return clientResponse;
//		}
//	}
//	
//	public WebClient createWebClient() {
//		final Builder webClientBuilder = WebClient.builder()
//				.clientConnector(new ReactorClientHttpConnector(httpClient));
//		return webClientBuilder.build();
//	}
//	
//}
