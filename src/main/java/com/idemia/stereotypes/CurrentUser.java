
package com.idemia.stereotypes;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.security.core.annotation.AuthenticationPrincipal;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AuthenticationPrincipal
public @interface CurrentUser {}
