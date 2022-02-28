package com.bazzarworld.ecommerce.controller;

import com.bazzarworld.ecommerce.model.Product;
import com.bazzarworld.ecommerce.model.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class Data implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);

        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
//
//        //! read-only config
//        config.getExposureConfiguration()
//                .forDomainType(Product.class)
//                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions)
//                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
//
//        config.getExposureConfiguration()
//                .forDomainType(ProductCategory.class)
//                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions)
//                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
    }
}
