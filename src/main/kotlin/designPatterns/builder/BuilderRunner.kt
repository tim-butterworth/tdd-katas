package designPatterns.builder

import designPatterns.builder.notRequiredProperties.KotlinBuilderNonRequired
import designPatterns.builder.requiredProperties.KotlinBuilderAllRequired

fun main(args: Array<String>) {
    val allRequired = KotlinBuilderAllRequired("name", 100)

    println("allRequired -> $allRequired")

    val allDefault = KotlinBuilderNonRequired()
    val nameSet = KotlinBuilderNonRequired("not the default name")
    val ageSet = KotlinBuilderNonRequired(age = 100)
    val bothSetOutOfOrder = KotlinBuilderNonRequired(
            age = 100,
            name = "new name"
    )

    val kotlinBuilderNonRequired = KotlinBuilderNonRequired(age = 12, name = "some string", another = "string")
    println(kotlinBuilderNonRequired.age)

    println("allDefault -> $allDefault")
    println("nameSet -> $nameSet")
    println("ageSet -> $ageSet")
    println("bothSetOutOfOrder -> $bothSetOutOfOrder")

    val kotlinBuilderAllRequired = KotlinBuilderAllRequired(
            name = "some name"
    )
}