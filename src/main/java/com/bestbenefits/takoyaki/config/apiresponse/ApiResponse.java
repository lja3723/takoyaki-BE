package com.bestbenefits.takoyaki.config.apiresponse;

public record ApiResponse<D>(boolean success, D data, int status) { }