package com.sugarya.preface.kt

class Bean {
    private val name: String
    private val age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }

}