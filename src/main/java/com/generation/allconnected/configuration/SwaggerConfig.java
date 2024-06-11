package com.generation.allconnected.configuration;

import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;

@Configuration
public class SwaggerConfig {
	
	@Bean
	OpenAPI springBlogPessoalOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("All Connected")
						.description("Projeto final desenvolvido na Generation Brasil")
						.version("v0.0.1")
						.license(new License()
								.name("All Connected ")
								.url("https://github.com/allconnectedgeneration"))
						.contact(new Contact()
								.name("Anderson Alves, Julia Melo, Leticia Silva, Luana Nascimento, Osvaldo Neto, Paloma Ferrari, Thamires Martins.")
								.url("https://linktr.ee/allconnectedbrazil")
								.email("allconnectedbrazil@gmail.com")))
				.externalDocs(new ExternalDocumentation()
						.description("Github")
						.url("https://github.com/allconnectedgeneration"));
	}
	
	@Bean
	OpenApiCustomizer customerGlobalHeaderOpenApiCustomiser() {
		
		return openApi -> {
			openApi.getPaths().values().forEach(pathItem -> pathItem.readOperations()
					.forEach(operation -> {
						
						ApiResponses apiResponses = operation.getResponses();
						
						apiResponses.addApiResponse("200", createApiResponse("Sucesso!"));
						apiResponses.addApiResponse("201", createApiResponse("Objeto Persistido!"));
						apiResponses.addApiResponse("204", createApiResponse("Objeto Excluido!"));
						apiResponses.addApiResponse("400", createApiResponse("Erro na Requisicao!"));
						apiResponses.addApiResponse("401", createApiResponse("Acesso nao autorizado!"));
						apiResponses.addApiResponse("403", createApiResponse("Acesso Proibido!"));
						apiResponses.addApiResponse("404", createApiResponse("Objeto nao Encontrado!"));
						apiResponses.addApiResponse("500", createApiResponse("Erro na Aplicacao!"));
					}));
		};
		}
		
		private ApiResponse createApiResponse(String message) {
			return new ApiResponse().description(message);
		}

}
