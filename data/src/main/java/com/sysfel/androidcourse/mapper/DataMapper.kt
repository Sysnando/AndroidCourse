package com.sysfel.androidcourse.mapper

interface DataMapper<in From, out To> {
    fun map(input: From): To
}