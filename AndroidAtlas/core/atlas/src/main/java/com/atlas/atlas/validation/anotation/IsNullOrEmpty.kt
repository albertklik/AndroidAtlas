package com.atlas.atlas.validation.anotation

@Retention
@Target(AnnotationTarget.FIELD)
annotation class IsNullOrEmpty(val errorMsg: String = "")